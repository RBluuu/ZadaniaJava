package com.java.course.com.lesson9.pliki;

import java.util.Scanner;

public class ZadaniaPrzedSprawdzianem {
    public static void main(String[] args) {
     /*   //Zadanie 1
        //Za pomocją scannera, zapytaj użytkownika o 10 imion, a następnie
        //-Znajdź najdłuższe oraz najkrótsze imie
        //-wypisz ilość żeńskich imion
        //-jaki % całości stanowią imiona męskie?
        // Radek, Ola, Marek, Lukasz, Michal, Darek, Iwona, Daria, Natalica, Irek
        System.out.println("Czesc! Podaj 10 imion");
        Scanner scanerImion = new Scanner(System.in);
        String imiona[] = scanerImion.nextLine().split(" ");
        int d;
        int o[] = new int[imiona.length];
        int najdluzszeImie = o[0];
        for (int i = 0; i < imiona.length; i++) {
            if (imiona[i].length() < najdluzszeImie) {
                najdluzszeImie = imiona[i].length();
            }
        }
        System.out.println("Najdluzsze imie to = " + najdluzszeImie)*/
        ;


        //Zadanie 2
        //Zapytaj użytkownika o liczby rozdzielone znamiek spacji " "
        //np:
        //Podaj liczby:
        //10 20 30 40 50 60 70
        //znajdz ich:
        //sumę,min,max,srednia arytmetyczna, ilosc liczb pierwszych
        System.out.println("Podaj liczby:");
        Scanner scanner = new Scanner(System.in);
        String liczby[] = scanner.nextLine().split(" ");
        int liczba = Integer.parseInt(liczby[0]);
        int suma = 0;
        int min = liczba;
        int max = liczba;
        int srednia = 0;
        for (int i = 0; i < liczby.length; i++) {
            liczba = Integer.parseInt(liczby[i]);
            suma += liczba;
            srednia = (suma / liczby.length);
            if (liczba > max) {
                max = liczba;
            }
            if (liczba < min) {
                min = liczba;
            }
        }

        System.out.println();
        System.out.println("Suma = " + suma);
        System.out.println("Srednia = " + srednia);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

    }
}

