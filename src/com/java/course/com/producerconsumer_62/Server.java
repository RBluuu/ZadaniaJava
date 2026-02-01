package com.java.course.com.producerconsumer_62;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class Server {
    private final int port;
    private ServerSocket serverSocket;
    private final BlockingQueue<String> messageQueue = new LinkedBlockingQueue<>();
    private final Set<ConsumerConnection> consumers = ConcurrentHashMap.newKeySet();

    public Server(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Server started on port " + port);

        new Thread(this::dispatchMessages).start();

        while (true) {
            Socket clientSocket = serverSocket.accept();
            new Thread(() -> handleClient(clientSocket)).start();
        }
    }

    private void handleClient(Socket socket) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String clientType = in.readLine();

            if ("PRODUCER".equalsIgnoreCase(clientType)) {
                System.out.println("Producer connected.");
                String msg;
                while ((msg = in.readLine()) != null) {
                    System.out.println("Received from producer: " + msg);
                    messageQueue.put(msg);
                }
            } else if ("CONSUMER".equalsIgnoreCase(clientType)) {
                System.out.println("Consumer connected.");
                ConsumerConnection consumer = new ConsumerConnection(socket, out);
                synchronized (consumers) {
                    consumers.add(consumer);
                    consumers.notifyAll();
                }
                consumer.waitUntilDisconnected();
            } else {
                System.out.println("Unknown client type.");
                socket.close();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void dispatchMessages() {
        System.out.println("START DISPATCHING");
        try {
            while (true) {
                consumers.removeIf(c -> !c.isAlive());

                synchronized (consumers) {
                    while (consumers.isEmpty()) {
                        System.out.println("EMPTY CONSUMERS");
                        consumers.wait();
                    }
                }

                String msg = messageQueue.take();
                System.out.println("Dispatching message: " + msg);
                System.out.println("CONSUMERS SIZE: " + consumers.size());
                for (ConsumerConnection consumer : consumers) {
                    consumer.send(msg);
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static class ConsumerConnection {
        private final Socket socket;
        private final PrintWriter out;

        ConsumerConnection(Socket socket, PrintWriter out) {
            this.socket = socket;
            this.out = out;
        }

        void send(String msg) {
            out.println(msg);
        }

        void waitUntilDisconnected() {
            new Thread(() -> {
                try {
                    socket.getInputStream().read();
                } catch (IOException ignored) {
                }
            }).start();
        }

        boolean isAlive() {
            return !socket.isClosed();
        }
    }

    public static void main(String[] args) throws IOException {
        new Server(9000).start();
    }
}
