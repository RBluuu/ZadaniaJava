package com.java.course.com.lesson60.programowaniesieciowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        String host = "localhost"; //127.0.0.1
        int port = 7865;

        try(
                Socket connection = new Socket(host,port);
                PrintWriter out = new PrintWriter(connection.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        ){

            out.println("Hello from Client");
            String msg = in.readLine();
            System.out.println(msg);


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//0. Poznac protokol TCP - ok
//1. Nauczyc sie wymieniac poziomy z OSI Layer - ok
//2. Objerzec how internet works na yt 8 min - ok
//3. Wyswietlic informacje ze serwer wstal OK
//4. Serwer po otrzymaniu wiadomosci od Klienta powinien odpowiedzic jakas wiadomosc
//(wyslac wiadomsoc z serwera do klienta) OK

/*
1. Hello from Client  - wyswietlic w serverze
2. Hello from Server - wyswietlic w
 */