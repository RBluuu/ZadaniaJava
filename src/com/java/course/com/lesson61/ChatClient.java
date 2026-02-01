package com.java.course.com.lesson61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalTime;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        String username = "Janusz";
        String host = "localhost"; //127.0.0.1
        int port = 7865;

        try(
                Socket connection = new Socket(host,port);
                PrintWriter out = new PrintWriter(connection.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                Scanner sc = new Scanner(System.in)){



                boolean text = true;
                while (text){
                    String odpowiedz = sc.nextLine();
                    String wiadomosc = String.format("%s: %s %s",username,odpowiedz, LocalTime.now());
                    if (odpowiedz.equals("quit")) {
                        text = false;
                    }
                    out.println(wiadomosc);
                }
            //wczytywac i wypisywac dopoki user nie wpisze "quit"

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/*
Napisz komunikacje Client-Server
Client powinien wysylac wiadomosci zczytane z konsoli o serwera
Server powinien je wyswietalc u siebie w formacie
Janusz: Witam serdecznie 10:43


Zadanie domowe:
-27 Linijka - Zamiast printowac na ekranie, musimy to wyslac na server
-Nastepnie chcemy wysweitlic te wiadomosc na serverze
- * Formatowac czas odpowiedzi 09:56:39.513176900 ---> 9:56


Petle

1. Wypelniaj tablice o rozmiarze 10 liczbami wpisanymi przez uzytkownika dopoki jej nie zapelni
- a nastepenie
- znajdz max,min,sum,avg

2. Wpisuj z tablicy kolejne liczby ciagu fibonacciego (0,1,1,2,3,5..) dopoki uzytkownik sie nie pomyli

Kolejne zajecia:
- przerobic server zeby mogl utrzymac kilka polaczen
 */

