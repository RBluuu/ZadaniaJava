package com.java.course.com.lesson7;

import java.util.Arrays;

public class SumaElementow {
    public static void main(String[] args) {
        int[] tablica = new int[3];
        tablica[0] = 12;
        tablica[1] = 432;
        tablica[2] = 31;
        System.out.println(Arrays.toString(tablica));

        int suma = 0;

        System.out.println(suma);

        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        System.out.println(suma);


        int[] tablica2 = {2, 6, 7, 3, 4, 5, 6};
        int suma2 = 0;
        for ( int i = 0; i < tablica2.length; i++) {
            suma2 += tablica2[i];
        }
        System.out.println("Suma tablicy = " + suma2);

        int[] tablica3 = {3, 5, 7, 2, 1, 0, 2};
        int suma3 = 0;
        for ( int i = 0; i < tablica3.length; i++) {
            suma3 += tablica3[i];
        }
        System.out.println("Suma elementow w tablicy = " + suma3);

        int[] tablica4 = {3, 5, 7, 2, 1, 0, 5, 5, 6, 2};
        int suma4 = 0;
        for ( int i = 0; i < tablica4.length; i++) {
            suma4 += tablica4[i];
        }
        System.out.println("Suma elementow tablica4 = " + suma4);

        int[] tablica5 = {6, 7, 8, 9, 10};
        int suma5 = 0;
        for ( int i = 0; i< tablica5.length; i++) {
            suma5 += tablica5[i];
        }
        System.out.println("Suma tablicy = " + suma5);


        int[] tablica7 = { 1234, 23423, 123, 124123, 42134};
        int suma7 = 0;
        for ( int i = 0; i < tablica7.length; i++) {
            suma7 += tablica7[i];
        }
        System.out.println("Suma tablicy = " + suma7);

        int[] tablica8 = {234, 34234, 123, 1, 3, 5, 6};
        int suma8 = 0;
        for ( int i = 0; i < tablica8.length; i++) {
            suma8 += tablica8[i];
        }
        System.out.println("Suma tablicy8 = " + suma8);

        int[] tablica9 = {3, 5, 1, 2, 4, 5, 6};
        int suma6 = 0;
        for (int i = 0; i < tablica9.length; i++) {
            suma6 += tablica9[i];
        }
        System.out.println("Suma elementow tablicy9 = " + suma6);

        int[] tablica10 = {2, 3, 4, 5,};
        int suma10 = 0;
        for (int i = 0; i < tablica10.length; i++) {
            suma10 += tablica10[i];
        }
        System.out.println("Suma elementow tablicy10 = " + suma10);

        int[] tablica11 = {1, 2, 3, 4, 5, 6, 7};
        int suma11 = 0;
        for (int i = 0; i < tablica11.length; i++) {
            suma11 += tablica11[i];
        }
        System.out.println("Suma elementow tbalicy11 = " + suma11);

        int[] tablica12 = {1, 2, 3, 4, 5, 6, 7, 66};
        int suma12 = 0;
        for (int i = 0; i < tablica12.length; i++) {
            suma12 += tablica12[i];
        }
        System.out.println("Suma elementow = " + suma12);






























    }
}
