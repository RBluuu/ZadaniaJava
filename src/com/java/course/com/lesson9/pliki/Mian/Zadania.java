package com.java.course.com.lesson9.pliki.Mian;

import java.util.Arrays;

public class Zadania {
    public static void main(String[] args) {
        /*Zad 1 - Nie zrobione
        Za pomocją scannera, zapytaj użytkownika o 10 imion, a następnie
        -Znajdź najdłuższe oraz najkrótsze imie
        -wypisz ilość żeńskich imion
        -jaki % całości stanowią imiona męskie?

        Zad 2. - Nie zrobione
        Zapytaj użytkownika o liczby rozdzielone znamiek spacji " "
        np:
        Podaj liczby:
        10 20 30 40
        znajdz ich:
        sumę,min,max,srednia arytmetyczna, ilosc liczb pierwszych

        Zad 3
        Napisz metodę, która zwróci elementy wspólne dla dwóch tablic

        Zad 4 - zrobione
        Napisz metodę, która wypisze klepsydrę dla dowolnej liczby.
        UWAGA: dla parzystej liczby nie da sie napisac klepsydry

        *********
        *******
        *****
        ***
        *
        *
        *
        ***
        *****
        *******
        *********

        Zad 5 - zrobione
        Stworz pętle, która dla wszystkich liczb dwucyfrowych obliczy sumę cyfry dziesiątek i
        jedności, czyli np dla 91 -> 9 + 1 = 10

        Zad 6 - zrobione
        Napisz fukncję, która odwróci dowolną tablicę
        np dla. {1,2,3,4,5} -> {5,4,3,2,1}

        Zad 7 - nie zrobione
        Stworz plik "slownik" i wpisz do niego kilka wyrazów. Wrzuć kilka "kurde" "kurka"
        i "kurcze". Następnie wczytaj te słowa z pliku i wpisz je do nowego pliku "slownik_poprawiony"
        ALE zamien wszystkie brzydkie slowa na "***"

        Zad 8 - zrobione
        Napisz funkcję, która sprawdzi, czy podane słowo jest palindromem
        np. kajak -> kajak

        Zad 9 - czesciowo
        Napisz funkcję, która zmieni Stringa na napisanego przez Jadena Smitha.
        Jaden Smith, syn Willa Smitha, jest gwiazdą takich filmów jak Karate Kid (2010) i After Earth (2013). Jaden jest również znany ze swojej filozofii, którą przekazuje za pośrednictwem Twittera. Pisząc na Twitterze, jest znany z tego, że prawie zawsze pisze wielkie litery w każdym słowie. Dla uproszczenia każde słowo należy pisać wielką literą.
        Twoim zadaniem jest przekonwertowanie napisów tak, jak napisałby je Jaden Smith.
        Przykład:
        Nie Jaden-Cased: „Jak lustra mogą być prawdziwe, jeśli nasze oczy nie są prawdziwe”
        Jaden-Cased: „Jak Lustra Mogą Być Prawdziwe, Jeśli Nasze Oczy Nie Są Prawdziwe”

        Zad 10 - nie zrobione
        Stwórz tablicę intów  i wypisz tylko te elementy, które są kwadratami

        Zad 11. - czesciowo zrobione
        Mecz tenisa. Podana jest tablica z nazwiskami dwóch tenisistów w kolejności wygranych wymian.
        np. tablica ["Kowalski","Nowak","Nowak","Nowak", "Kowalski"]
        Oznacza, że wynik zmieniał się następująco

        Kowalski:15 Kowalski:15	Kowalski: 15 Kowalski:15 Kowalski: 30     ITD...
        Nowak: 0	Nowak: 15   Nowak: 30    Nowak: 40   Nowak: 40

        Napisz Funkcję
        Dla dowolnej tablicy, sprawdź kto wygrał seta np
        ["Kowalski","Nowak","Nowak","Nowak", "Kowalski", "Kowalski","Nowak","Kowalski","Kowalski","Kowalski"] -> "Kowalski"

        Zad 12. - nie zrobione
        Napisz funkcję, która
        Dla dowolego pliku, sprawdź czy zawarta w nim treść jest choinką tzn czy wygląda np. tak:

        *
        **
        ***
        *****

        Uwzględnij dowolną wysokość choinki. Należy sprawdzić, czy zgadza się ilość spacji i "*"

         */

        // Zad 3
        //Napisz metodę, która zwróci elementy wspólne dla dwóch tablic
        System.out.println("Zadanie 3:");
        int[] nowaTablica0 = new int[5];
        int[] nowaTablica1 = new int[5];
        for (int i = 0; i < nowaTablica0.length; i++) {
            for (int j = 0; j < nowaTablica1.length; j++) {
                if (nowaTablica0[i] == nowaTablica1[j]) {
                    System.out.println("Liczby = " + nowaTablica0[i]);
                }
            }
        }

        /*Zad 4
        Napisz metodę, która wypisze klepsydrę dla dowolnej liczby.
                UWAGA: dla parzystej liczby nie da sie napisac klepsydry

            *********
             *******
              *****
               ***
                *
                 *
        *
        ***
        *****
        *******
        *********
         */
        System.out.println("Zadanie 4:");

        int starCounter = 1;
        int spaceCounter = 1;
        for (int i = 0; i <= 9; i++) {
            for (int j = 7; j < spaceCounter; j++) {
                System.out.print(" ");
            }
            for (int j = 7; j > starCounter; j--) {
                if (j == 0) {
                    System.out.print("*");
                }
                spaceCounter += 1;
                starCounter += 1;
                {
                    if (starCounter == 0) {
                        starCounter -= 1;
                    }
                }
            }
        }
        System.out.println();
        int klepsydra = 7;
        for (int i = klepsydra; i > -1; i--) {
            for (int j = i; j > -1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i< klepsydra; i++) {
            for (int j = -1; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }




        //Zadanie 5 Stworz pętle, która dla wszystkich liczb dwucyfrowych obliczy sumę cyfry dziesiątek i
        //jedności, czyli np dla 91 -> 9 + 1 = 10
        System.out.println("Zadanie 5:");
        for (int i = 10; i < 99; i++) {
            System.out.print((i / 10 + i % 10) + " ");
        }

        //Zadanie 6 Napisz fukncję, która odwróci dowolną tablicę
        //np dla. {1,2,3,4,5} -> {5,4,3,2,1}
        System.out.println("Zadanie 6:");
        int[] tablica5 = {43,23,43,12,43,12,23};
        System.out.println("Oryginal " + Arrays.toString(tablica5));
        for (int i = 0; i < tablica5.length; i++) {
            tablica5[i] = i + 1;
        }
        System.out.println("Odwrocona");
        System.out.println(Arrays.toString(tablica5));

        int[] tablica6 = new int[5];
        int[] copy1 = tablica6;
        for (int i = 0; i < tablica6.length; i++) {
            copy1[i] = 5 - i;
        }
        System.out.println(Arrays.toString(tablica6));

        //Zad 8
        //Napisz funkcję, która sprawdzi, czy podane słowo jest palindromem
        //np. kajak -> kajak
        System.out.println("Zadanie 8:");
        System.out.println(slowoPalindrome("kajak"));



        /*Zad 9
        Napisz funkcję, która zmieni Stringa na napisanego przez Jadena Smitha.
                Jaden Smith, syn Willa Smitha, jest gwiazdą takich filmów jak Karate Kid (2010) i After Earth (2013). Jaden jest również znany ze swojej filozofii, którą przekazuje za pośrednictwem Twittera. Pisząc na Twitterze, jest znany z tego, że prawie zawsze pisze wielkie litery w każdym słowie. Dla uproszczenia każde słowo należy pisać wielką literą.
        Twoim zadaniem jest przekonwertowanie napisów tak, jak napisałby je Jaden Smith.
        Przykład:
        Nie Jaden-Cased: „Jak lustra mogą być prawdziwe, jeśli nasze oczy nie są prawdziwe”
        Jaden-Cased: „Jak Lustra Mogą Być Prawdziwe, Jeśli Nasze Oczy Nie Są Prawdziwe”
        */
        System.out.println("Zadanie 9:");
        String tekst = ("Jaden Smith, syn Willa Smitha, jest gwiazdą takich filmów jak Karate Kid (2010) i After Earth (2013).\n" +
                "Jaden jest również znany ze swojej filozofii, którą przekazuje za pośrednictwem Twittera.");
        StringBuffer newTekst = new StringBuffer(tekst);
        for (int i = 0; i < tekst.length(); i++) {
                newTekst.setCharAt(0, Character.toUpperCase(tekst.charAt(0)));
        }
        System.out.println(newTekst);
        //Nie wiem jak zrobic aby tylko pierwsza litera byla duza w kazdym wyrazie


        //Zad 10
        //Stwórz tablicę intów i wypisz tylko te elementy, które są kwadratami
        System.out.println("Zadanie 10:");
        int[] tablica1 = {43,12,43,45,5,4,2,12,31};
        for (int i = 0; i < tablica1.length; i++) {
            if (tablica1[i] == tablica1[i] * tablica1[i]) ;
        }
        System.out.println(Arrays.toString(tablica1));





        /*Zad 11.
        Mecz tenisa. Podana jest tablica z nazwiskami dwóch tenisistów w kolejności wygranych wymian.
                np. tablica ["Kowalski","Nowak","Nowak","Nowak", "Kowalski"]
        Oznacza, że wynik zmieniał się następująco

        Kowalski:15 Kowalski:15	Kowalski: 15 Kowalski:15 Kowalski: 30     ITD...
        Nowak: 0	Nowak: 15   Nowak: 30    Nowak: 40   Nowak: 40

        Napisz Funkcję
        Dla dowolnej tablicy, sprawdź kto wygrał seta np
        ["Kowalski","Nowak","Nowak","Nowak", "Kowalski", "Kowalski","Nowak","Kowalski","Kowalski","Kowalski"] -> "Kowalski"
         */
        System.out.println("Zadanie11: ");
        int[][] gra = {{10, 30}, {15, 30}, {15, 15}, {30, 10}, {30, 10}, {30, 10}};
        int wynik1 = 0;
        int wynik2 = 0;
        System.out.println("\t\tKowalskti " + "Nowak");
        for (wynik1 = 0; wynik1 < gra.length; wynik1++) {
            System.out.print("Runda" + (wynik1 + 1) + ": \t");
            for ( wynik2 = 0; wynik2 < gra[wynik1].length; wynik2++) {
                System.out.print(gra[wynik1][wynik2] + " \t\t");
            }
            System.out.println();
            wygrana(wynik1, wynik2);
        }
        //Nie wiem jak sprawdzic kto wygrywa seta

        System.out.println();
       /* Zad 12.
        Napisz funkcję, która
        Dla dowolego pliku, sprawdź czy zawarta w nim treść jest choinką tzn czy wygląda np. tak:

        *
        **
        ***
        *****

        Uwzględnij dowolną wysokość choinki. Należy sprawdzić, czy zgadza się ilość spacji i "*"
        */
        System.out.println("Zadanie 12:");
        int starCounter2 = 1;
        int spaceCounter2 = 5;
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < spaceCounter2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCounter2; j++) {
                System.out.print("*");
            }
            spaceCounter2 -= 1;
            starCounter2 += 2;
            System.out.println();
        }

        sprawdzam(spaceCounter2, spaceCounter2);
    }

    private static void sprawdzam(int choinka, int wysokosc) {
        int drzewo = choinka;
        int wyglad = wysokosc;
        if (drzewo == 1) {
            System.out.println("Zgadza sie");
        } else {
            System.out.println("Nie zgadza sie");
        }
        if (wyglad == 4) {
            System.out.println("Krzak");
        } else {
            System.out.println("Drzewo");
        }
    }
    /// nie wiem jak sprawdzic ilosc *


    private static boolean slowoPalindrome(String slowo) {
        int lewy = 0;
        int prawy = slowo.length() - 1;
        while (lewy < prawy) {
            if (slowo.charAt(lewy) != slowo.charAt(prawy)) {
                return false;
            }
            lewy++;
            prawy--;
        }
        return true;
    }

    private static void wygrana(int wynik1, int wynik2) {
        int Kowaliski = wynik1;
        int Nowak = wynik2;
        if ( Kowaliski == Nowak) {
            System.out.println("Remmis");
        } else if ( Kowaliski > Nowak) {
            System.out.println("Wygrywa Kowalski");
        } else if ( Kowaliski < Nowak) {
            System.out.println("Wygrywa Nowak");
        }
    }

}





