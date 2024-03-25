package com.java.course.com.lesson5;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //1. Tworzenie scannera
        //try with resources


        /*try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Podaj swoje imie:");
            String imie = sc.nextLine(); // nextLine czyta linijke wpisana przez uzytkownika
            System.out.println("Podaj swoj wiek:");
            int wiek = sc.nextInt();
            System.out.println("Podaj swoj wzrost");
            double wzrost = sc.nextDouble();
            System.out.println("Masz wzrostu = " + wzrost + "cm");
            if (wzrost >= 1.8) {
                System.out.println("Jestes wysoki");
            } else {
                System.out.println("Jestes niski");
            }

            //1.Zapytaj o wzrost
            //2. Pobierz wpisana informajce
            //3. Wyswietl wzrost uzytkownika
            //4. jezeli jest wyzszy niz 1.8 to napisz ze jest wysoki
            System.out.println("Czesc " + imie + " masz " + wiek + " lat!");

            if (wiek >= 18) {
                System.out.println("Jestes pelnoletni");
            } else {
                System.out.println("Jestes niepelnoletni");
            }
            sc.nextLine();
            sc.close();// zamyka scanner
        }*/

        //1. Gra w zgadywanie liczby - komputer losuje liczbę z zakresu 1-100, użytkownik ma za zadanie zgadnąć tę liczbę
        //   Jeżeli użytkownik poda za małą liczbę to program wypisuje "Za mała liczba", jeżeli za dużą to "Za duża liczba"
        //   Jeżeli użytkownik zgadnie liczbę to program wypisuje "Gratulacje! Zgadłeś liczbę!"
        //   Po zakończeniu gry program wypisuje "Dziękuję za grę!"
        //   Podpowiedź: do losowania liczby użyj klasy Random

        try (Scanner sc = new Scanner(System.in)) {
            int losowanaliczba = (int) (Math.random() * 100);
            System.out.println("Podaj swoje liczbe:");
            int liczba = sc.nextInt();
            while (liczba != losowanaliczba) {
                System.out.println();
                System.out.println("Wylosowana liczba to = " + losowanaliczba);
                if (liczba < losowanaliczba) {
                    System.out.println("Za mała liczba");
                } else if (liczba > losowanaliczba) {
                    System.out.println("Za duża liczba");
                } else {
                    System.out.println("Gratulacje! Zgadłeś liczbę!");
                }
                liczba = sc.nextInt();
            }
            System.out.println("Dziękuję za grę!");
            sc.close();
        }

        







        /*//8. Echo. Popros uzytkownika o wpisywanie kolejnych linii tekstu do momentu az uzytkownik wpisze "exit"
        //wypisuj wszystkie wpisane linie tekstu na ekran//wypisuj wszystkie wpisane linie tekstu na ekran
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Wprowadz dwolona ilosc tekstu i na koniec napisz - EXIT");
            String textUzytkownika = sc.next();
            int textUzytkownika1 = 0;
            for (int i = 0; i < textUzytkownika1; i++ ) {
                if (i == "exit") {
                    break;
                }
            }
        }
         */


    }
}
