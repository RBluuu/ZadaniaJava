package com.java.course.com.lesson61;

import java.util.Scanner;

public class TablicaZadanieDomowe {
    public static void main(String[] args) {
        int[] liczby = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < liczby.length; i++) {
            System.out.print("Podaj liczbę [" + (i + 1) + "]: ");
            liczby[i] = scanner.nextInt();
        }

        int max = liczby[0];
        int min = liczby[0];
        int suma = 0;

        for (int liczba : liczby) {
            if (liczba > max) {
                max = liczba;
            }
            if (liczba < min) {
                min = liczba;
            }
            suma += liczba;
        }

        double srednia = (double) suma / liczby.length;

        System.out.println("Maksimum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + srednia);
    }
}
