package com.java.course.com.lesson8;

public class ZajeciaNiedziela {
    public static void main(String[] args) {
        //1.Oblicz srednia elementow z tablicy
        int[] tablica = {2, 3};
        int suma = 0;
        for ( int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        System.out.println("Srednia z tablicy = " + (double)suma/tablica.length);

        //2. znajdz najwiekszy najwiekszy ele
        int[] tablica1 = {342, 343, 5231, 51};
        int max = tablica1[0];
        for ( int i = 0; i < tablica.length; i++) {
            if ( tablica1[i] > max) {
                max = tablica1[i];
            }
        }
        System.out.println("Max z tablcy1 = " + max);

        //3. Policz ile jest elementow parzystych w tablicy
        int[] tablica2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int liczbaParzysta = 0;
        for (int i = 0; i < tablica2.length; i++) {
            if ( tablica2[i] % 2 == 0) {
                liczbaParzysta += 1;
            }
        }
        System.out.println(liczbaParzysta);

    }
}