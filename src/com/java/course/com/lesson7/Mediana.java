package com.java.course.com.lesson7;

import java.util.Arrays;

public class Mediana {
    public static void main(String[] args) {
        //1.Stworzyc tablice
        int[] tablica = new int[4];
        tablica[0] = 1;
        tablica[1] = 2;
        tablica[2] = 4;
        tablica[3] = 6;
        //tablica[4] = 7;
        //2. Sortowanie
        Arrays.sort(tablica);
        //3.Sprawdzic czy ilosc elementow jest parzysta czy nie
        if (tablica.length % 2 == 0) {
            System.out.println("PARZYSTA");
            int liczba1 = tablica[tablica.length / 2];
            int liczba2 = tablica[tablica.length / 2 - 1];
            System.out.println("Mediana: " + (liczba1 + liczba2) / 2);
        } else {
            System.out.println("NIEPARZYSTA");
            System.out.println("Mediana: " + tablica[tablica.length / 2]);
        }

        System.out.println();


        int[] tablica2 = new int[5];
        tablica2[0] = 1;
        tablica2[1] = 2;
        tablica2[2] = 3;
        tablica2[3] = 4;
        tablica2[4] = 5;
        Arrays.sort(tablica2);
        if (tablica2.length % 2 == 0) {
            System.out.println("Parzysta");
            int liczba2 = tablica2[tablica2.length / 2];
            int liczba3 = tablica2[tablica2.length / 2 - 1];
            System.out.println("Mediana tablicy2 = " + (liczba2 + liczba3) / 2);
        } else {
            System.out.println("Nieparzysta");
            System.out.println("Mediana tablicy = " + tablica2[tablica2.length / 2]);
        }






    }
}
