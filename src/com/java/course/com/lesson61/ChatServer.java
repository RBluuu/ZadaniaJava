package com.java.course.com.lesson61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {

        int port = 7865;
        try (
                ServerSocket serverSocket = new ServerSocket(port);
        ) {
            while (true) {
                Socket connection = serverSocket.accept();
                new Thread(new ClientHandler(connection)).start();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String formatMessage(String original) {
        int lastSpace = original.lastIndexOf(" ");
        if (lastSpace != -1 && original.length() >= lastSpace + 5) {
            String prefix = original.substring(0, lastSpace); // np. Janusz: Hello
            String time = original.substring(lastSpace + 1); // np. 10:55:23.341984
            String[] timeParts = time.split(":");
            if (timeParts.length >= 2) {
                return prefix + " " + timeParts[0] + ":" + timeParts[1]; // 10:55
            }
        }
        return original;
    }

    static class ClientHandler implements Runnable{
        private final Socket connection;

        ClientHandler(Socket connection) {
            this.connection = connection;
        }

        @Override
        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String msg;
                while ((msg = in.readLine()) != null) {
                    String formattedMessage = formatMessage(msg);
                    System.out.println(formattedMessage);
                }
            }catch (Exception e){}
        }
    }
}
