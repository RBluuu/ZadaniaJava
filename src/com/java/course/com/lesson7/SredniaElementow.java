package com.java.course.com.lesson7;

import java.util.Arrays;

public class SredniaElementow {
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
        System.out.println((double) suma/tablica.length);


        int[] tablica1 = {10, 15, 20, 25};
        int suma1 = 0;
        for ( int i =0; i < tablica1.length; i++) {
            suma1 += tablica1[i];
        }

        System.out.println("Srednia tablicy1 = " + (double) suma1/ tablica1.length);


        int[] tablica2 = {8, 6, 30, 14, 20, 16, 7};
        int suma2 = 0;
        for ( int i = 0; i < tablica2.length; i++) {
            suma2 += tablica2[i];
        }
        System.out.println("Srednia tablicy2 = " + (double)suma2/tablica2.length);

        int[] tablica3 = {666, 66, 512, 99, 88, 100, 55};
        int suma3 = 0;
        for ( int i = 0; i < tablica3.length; i++) {
            suma3 = tablica3[i];
        }
        System.out.println("Srednia tablicy3 = " + (double)suma3/tablica3.length);

        int[] tablica4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int suma4 = 0;
        for ( int i = 0; i < tablica4.length; i++) {
            suma4 += tablica4[i];
        }
        System.out.println("Srednia tablicy4 = " + (double)suma4/tablica4.length);



        int[] tablica5 = {1, 2, 3, 4, 5, 6, 7, 8};
        int suma5 = 0;
        for (int i = 0; i < tablica5.length; i++) {
            suma5 += tablica5[i];
        }
        System.out.println("Srednia tablicy = " + (double)suma5/tablica5.length);

        int[] tablica6 = {33, 55, 3, 1, 22};
        int suma6 = 0;
        for (int i = 0; i < tablica6.length; i++) {
            suma6 += tablica6[i];
        }
        System.out.println("Srednia tablicy6 = " + (double)suma6/tablica6.length);

        int[] tablica7 = {3, 5, 6, 7, 8, 9};
        int suma7 = 0;
        for (int i = 0; i < tablica7.length; i++) {
            suma7 += tablica7[i];
        }
        System.out.println("Srednia tablicy7 = " + (double)suma7/tablica7.length);

        int[] tablica8 = {2, 3, 4, 4, 5, 6};
        int suma8 = 0;
        for (int i = 0; i < tablica8.length; i++) {
            suma8 += tablica8[i];
        }
        System.out.println("Srednia tablic8 = " + (double)suma8/tablica8.length);

        int[] tablica9 = {44, 22, 44, 55, 55, 66, 7, 1};
        int suma9 = 0;
        for (int i = 0; i < tablica9.length; i++) {
            suma9 += tablica9[i];
        }
        System.out.println("Srednia tablicy9 = " + (double)suma9/tablica9.length);

        int[] tablica10 = {44, 22, 44, 55, 55, 66, 22, 55, 7, 1};
        int suma10 = 0;
        for (int i = 0; i < tablica1.length; i++) {
            suma10 += tablica10[i];
        }
        System.out.println("Srednia tablicy10 = " + (double)suma10/tablica10.length);


        int[] tablica11 = {44, 22, 44, 55, 55, 66, 22, 55, 7, 1, 33, 55, 556};
        int suma11 = 0;
        for (int i = 0; i < tablica11.length; i++) {
            suma11 += tablica11[i];
        }
        System.out.println("Srednia tablicy11 = " + (double)suma11/tablica11.length);















    }
}
