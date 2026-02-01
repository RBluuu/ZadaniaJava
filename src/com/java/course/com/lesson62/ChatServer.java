package com.java.course.com.lesson62;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {

        int port = 7865;
        try (
                ServerSocket serverSocket = new ServerSocket(port);
        ) {
            Socket connection = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            PrintWriter out = new PrintWriter(connection.getOutputStream(), true);
            String msg;
            while ((msg = in.readLine()) != null) {
                String formattedMessage = formatMessage(msg);
                System.out.println(formattedMessage);
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
}
