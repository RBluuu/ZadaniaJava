package com.java.course.com.lesson11;

import java.util.Arrays;

public class zadanie {
    public static void main(String[] args) {
        int maxDzielniki = 0;
        int liczbaZMaxDzielnikami = 0;
        for (int liczba = 10; liczba <= 99; liczba++) {
            int licznik = 0;
            for (int dzielnik = 2; dzielnik <= liczba / 2; dzielnik++) {
                if (liczba % dzielnik == 0) {
                    licznik++;
                }
            }
            if (licznik > maxDzielniki) {
                maxDzielniki = licznik;
                liczbaZMaxDzielnikami = liczba;
            }
        }
       System.out.printf("Liczba z max dzielnikami to %d a liczba jej dzielnikow to %d", liczbaZMaxDzielnikami, maxDzielniki + 2); //+2 dlatego ze nie uzwgledniamy 1 i 60
/*
        System.out.println();
        System.out.println("Zadanie 3:");
        int[] liczby = new int[90];
        int najwiecejdzielnikow = liczby[0];
        for (int i = 0; i <= 89; i++) {
            liczby[i] = i + 10;
            for (int d = 1; d <= liczby[i]; d++) {
                if ((liczby[i] % d) == 0) {
                    System.out.print(d + " ");
                }
                if (liczby[i] > najwiecejdzielnikow) {
                    najwiecejdzielnikow = liczby[i];
                }
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(liczby));
        System.out.println("Liczba z najwieksza iloscia dzielnikow to: " + najwiecejdzielnikow + " ");

        */


    }



}
