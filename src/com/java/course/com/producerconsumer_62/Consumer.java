package com.java.course.com.producerconsumer_62;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
/*
- aktualnie producer  zczytuje wiadomosci od uzytkowniai wysyla je na serwer
- CONSUMER powinien otrzymac wiadomosc z SERVERA i ja wyswietlic
 */
public class Consumer {
    private static final String SERVER = "localhost";
    private static final int PORT = 9000;

    public static void main(String[] args) throws IOException {
        try (
        Socket connection = new Socket(SERVER, PORT);
        PrintWriter out = new PrintWriter(connection.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
       ) {


            out.println("CONSUMER");
            out.flush();

            System.out.println("Polaczono z Serverem, czekam na widomosc");
                String line;
                try {
                    while ((line = in.readLine()) != null) {
                        System.out.println("Otrzymano: " + line);
                    }
                } catch (IOException e) {
                    System.out.println("Rozłączono z serwerem.");
                }
            }
        }
}
