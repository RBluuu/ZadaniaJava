package com.java.course.com.lesson60.programowaniesieciowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 7865;
        try(
                ServerSocket serverSocket = new ServerSocket(port);
        ) {
            System.out.println("Server dziala");
            Socket connection = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            PrintWriter out = new PrintWriter(connection.getOutputStream(), true);
            String msg = in.readLine();
            System.out.println("Odebrana wiadomość od klienta: " + msg);
            String response = "Hello from Server";
            out.println(response);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
