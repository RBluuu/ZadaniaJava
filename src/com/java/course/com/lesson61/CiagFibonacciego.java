package com.java.course.com.lesson61;

import java.util.Scanner;

public class CiagFibonacciego {
    public static void main(String[] args) {
        //poprawc zeby mozna bylo wpisywac w nieskonczonosc
        //powinienes obliczac kolejna poprawna liczbe ciagu fibonacciego na biezaca (dynamicznie)
        int[] liczbyFibonacciego = new int[6];
        liczbyFibonacciego[0] = 0;
        liczbyFibonacciego[1] = 1;

        for (int i = 2; i < liczbyFibonacciego.length; i++) {
            liczbyFibonacciego[i] = liczbyFibonacciego[i - 1] + liczbyFibonacciego[i - 2];
        }

        Scanner scanner = new Scanner(System.in);
        int liczba = 0;

        System.out.println("Wpisuj kolejne liczby ciągu Fibonacciego:");
        System.out.println("Wpisz: " + liczbyFibonacciego[liczba]);

        while (liczba < liczbyFibonacciego.length) {
            System.out.print("Liczba" + liczba + ": ");
            int wpisana = scanner.nextInt();
            if (wpisana == liczbyFibonacciego[liczba]) {
                System.out.println("OK;)");
                liczba++;
            } else {
                System.out.println("Zle! Poprawna liczba to: " + liczbyFibonacciego[liczba]);
                break;
            }
        }
        System.out.println("Koniec gry. Zgadłeś " + liczba + " liczb.");
    }
}