package com.java.course.com.lesson7;

public class Min {
    public static void main(String[] args) {
        int[] tablica = new int[5];
        tablica[0] = 123;
        tablica[1] = 234;
        tablica[2] = 2334;
        tablica[3] = 231;
        tablica[4] = 5;

        int min = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            int aktualnyElement = tablica[i];
            if (aktualnyElement < min) {
                min = aktualnyElement;
            }
        }
        System.out.println(min);



        int[] tablica1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int min1 = tablica1[0];
        for ( int i = 0; i < tablica1.length; i++) {
            if ( tablica1[i] < min1) {
                min1 = tablica1[i];
            }
        }
        System.out.println("Min tablicy1 = " + min1);



        int[] tablica2 = { 11111, 2222, 33333, 4, 235, 6, 2237, 8, 9};
        int min2 = tablica[0];
        for ( int i = 0; i < tablica2.length; i++) {
            if ( tablica2[i] < min2) {
                min2 = tablica2[i];
            }
        }
        System.out.println("Min tablicy2 = " + min2);


        int[] tablica3 = {3, 2, 19, 22, 1};
        int min3 = tablica3[0];
        for (int i = 0; i < tablica3.length; i++) {
            if (tablica3[i] < min3) {
                min3 = tablica3[i];
            }
        }
        System.out.println("Min tablicy3 = " + min3);

        int[] tablica4 = {1, 2, 4, 5, 6};
        int min4 = tablica4[0];
        for (int i = 0; i < tablica4.length; i++) {
            if (tablica4[i] < min4) {
                min4 = tablica4[i];
            }
        }
        System.out.println("Min tablicy4 = " + min4);

        int[] tablica5 = {2, 3, 4, 4, 5, 6};
        int min5 = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (tablica5[i] < min5) {
                min5 = tablica5[i];
            }
        }
        System.out.println("Min tablicy5 = " + min5);

        int[] tablica6 = {44, 22, 44, 55, 55, 66, 7, 1};
        int min6 = tablica6[0];
        for (int i = 0; i < tablica6.length; i++) {
            if (tablica6[i] < min6) {
                min6 = tablica6[i];
            }
        }
        System.out.println("Min tablicy6 = " + min6);

        int[] tablica7 = {44, 22, 44, 55, 55, 66, 7, 2};
        int min7 = tablica[0];
        for(int i = 0; i < tablica7.length; i++) {
            if (tablica7[i] < min7) {
                min7 = tablica7[i];
            }
        }
        System.out.println("Min tablicy7 = " + min7);

        int[] tablica8 = {44, 22, 44, 55, 55, 66, 7, 2, -1};
        int min8 = tablica8[0];
        for (int i = 0; i < tablica8.length; i++) {
            if (tablica8[i] < min8) {
                min8 = tablica8[i];
            }
        }
        System.out.println("Min tablicy8 = " + min8);









































    }
}
