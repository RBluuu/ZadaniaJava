package com.java.course.com.lesson5;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        //8. Echo. Popros uzytkownika o wpisywanie kolejnych linii tekstu do momentu az uzytkownik wpisze "exit"
        //wypisuj wszystkie wpisane linie tekstu na ekran//wypisuj wszystkie wpisane linie tekstu na ekran;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Podaj dowolną ilosc tekstu i na koncu napisz EXIT");
            String text = sc.nextLine();
            while (!text.equals("exit")) {
                text = sc.nextLine();
                System.out.println(text);
            }
        }
        System.out.println("dziekuje");

    }
}
