package com.java.course.com.lesson9.sprawdzenie;

public class Main {
    public static void main(String[] args) {
        //1. stworz dowolna tablice
        //2. znajdz maksymalny element
        int[] tablica = {1, 2, 5, 10};
        int max = tablica[0];
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
            if (tablica[i] > max) {
               max = tablica[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Suma = " + suma);
        System.out.println("Srednia = " +(double)suma/tablica.length);
    }
}
