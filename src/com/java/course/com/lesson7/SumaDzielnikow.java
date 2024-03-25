package com.java.course.com.lesson7;

public class SumaDzielnikow {
    public static void main(String[] args) {
        //Wypisz dzielniki dla jakiejs liczby

        int liczba = 10; //1,2,5,10

        //10 % 1 == 0
        //10 % 2 == 0
        //10 % 3 == 1
        //10 % 4 == 2
        //10 % 5 == 0

        int licznik = 0;
        for (int i = 1; i <= liczba; i++) {
            if (liczba % i == 0) {
                licznik++;
            }
        }
        System.out.println(licznik);


        //oblicz sume dzielnikow z tabliy
        int[] liczby = {10};
        int sumaLicznikow = 0;
        //1 + 2 + 5 + 10
        System.out.println();
        for (int i = 0; i < liczby.length; i++) {
            for (int j = 1; j <= liczby[i]; j++) {
                if (liczby[i] % j == 0) {
                    sumaLicznikow += j;
                }
            }
        }
        System.out.println();
        System.out.println(sumaLicznikow);



        int[] tablica2 = {55};
        int sumaTablicy2 = 0;
        for (int i = 0; i < tablica2.length; i++) {
            for (int j = 1; j <= tablica2[i]; j++) {
                if (tablica2[i] % j ==0) {
                    sumaTablicy2 += j;
                }
            }
        }
        System.out.println("Suma dzielnikow tablicy = " + sumaTablicy2);

        int[] tablica3 = {44};
        int suma3 = 0;
        for (int i = 0; i < tablica3.length; i++) {
            for ( int z = 1; z <= tablica3[i]; z++) {
                if ( tablica3[i] % z == 0) {
                    suma3 += z;
                }
            }
        }
        System.out.println("Suma dzielnikow tablicy3 = " + suma3);

        int[] tablica4 = {66};
        int suma4 = 0;
        for (int i = 0; i < tablica4.length; i++) {
            for (int k = 1; k <= tablica4[i]; k++) {
                if (tablica4[i] % k == 0) {
                    suma4 += k;
                }
            }
        }
        System.out.println("Suma dzielnikow tablicy4 = " + suma4);

        int[] tablica5 = {99};
        int suma5 = 0;
        for (int i = 0; i < tablica5.length; i++) {
            for (int d = 1; d <=tablica5[i]; d++) {
                if (tablica5[i] % d == 0) {
                    suma5 += d;
                }
            }
        }
        System.out.println("Suma dzielnikow tablicy = " + suma5);


        int[] tablica6 = {69};
        int suma6 = 0;
        for (int i = 0; i < tablica6.length; i++) {
            for (int z = 1; z <= tablica2[i]; z++) {
                if (tablica2[i] % z == 0) {
                    suma6 += z;
                }
            }
        }
        System.out.println("Suma dzielnikow tablicy = " + suma6);




    }
}
