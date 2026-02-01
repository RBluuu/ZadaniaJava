package com.java.course.com.producerconsumer_62;

import java.io.*;
import java.net.Socket;
import java.time.LocalTime;
import java.util.Scanner;

public class Producer {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 9000;

        try(
                Socket connection = new Socket(host,port);
                PrintWriter out = new PrintWriter(connection.getOutputStream(), true);
                Scanner sc = new Scanner(System.in)){

            System.out.print("Podaj nazwę producenta: ");
            String username = sc.nextLine().trim();
            if (username.isEmpty()) {
                username = "Producer";
            }

            out.println("PRODUCER");
            out.flush();

            System.out.println("Połączono z serwerem jako PRODUCER (" + username + "). Wpisz wiadomość:");

            boolean text = true;
            while (text){
                String odpowiedz = sc.nextLine();
                String wiadomosc = String.format("%s: %s %s",username,odpowiedz, LocalTime.now());
                if (odpowiedz.equals("quit")) {
                    text = false;
                }
                out.println(wiadomosc);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
