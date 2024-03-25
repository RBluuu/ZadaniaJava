package com.java.course.com.lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        System.out.println(numbers); //[I@3feba861 referencja
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 12;
        numbers[1] = 13;
        numbers[2] = 14;
        numbers[3] = 15;
        numbers[0] = 999;
        //numbers[4] = 15; //.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        System.out.println(Arrays.toString(numbers));
        //wypisz ostatni element tablicy
        System.out.println(numbers[numbers.length - 1]);
        System.out.println(numbers.length);

        String[] names = {"Kamila", "Karol", "Heniek", "Jula", "Maciek", "Malgorzata"};
        System.out.println(Arrays.toString(names));

        //z tablicy imion wypisz tylko zenskie imiona
        if (names[0].endsWith("a")) {
            System.out.println(names[0]);
        }
        if (names[1].endsWith("a")) {
            System.out.println(names[1]);
        }
        if (names[2].endsWith("a")) {
            System.out.println(names[2]);
        }
        System.out.println();

        //fori
        for (int i = 0; i < names.length; i++) {
            if (names[i].endsWith("a")) {
                System.out.println(names[i]);
            }
        }

        //foreach/enhanced for
        for (String name : names) {
            if (name.endsWith("a")) {
                System.out.println(name);
            }
        }

        //nazwa.for

        for (String name : names) {

        }

        //tablice 2D
        int[][] numbers2D = new int[3][6];
        numbers2D[0][1] = 123;
        numbers2D[2][2] = 44;
        System.out.println(numbers2D.length);
        System.out.println(numbers2D[0].length);
        System.out.println(numbers2D);
        System.out.println(Arrays.asList(numbers2D));
        System.out.println(Arrays.deepToString(numbers2D));
        System.out.println();

        int[][] numbers2D2 = {
                {1, 2, 3},
                {5, 43, 12, 32, 32, 12},
                {1}};

        System.out.println(numbers2D2[1][4]);
        System.out.println(numbers2D2[2][0]);


        //1. Napisz program z pętlą for, który wyświetla wszystkie liczby pierwsze mniejsze od 100.
        //1 3 5 7 13
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }

        //2. Stwórz program z pętlą while, który oblicza silnię liczby 10.
        int x = 1;
        int silna10 = 1;
        while (x <= 10) {
            silna10 *= x;
            x++;
            System.out.println(silna10);
        }


        //3.Użyj pętli do-while do napisania programu, który oblicza sumę kwadratów pierwszych 15 liczb naturalnych.
        System.out.println();
        int suma = 0;
        int a = 1;
        do {
            suma += a * a;
            System.out.println(a + " suma " + suma);
            a++;
        } while (a <= 15);


        //4.Poprawic tabliczke mnożenia
        //10.Napisz program, który wypisze tabliczkę mnożenia dla liczb od 1 do 10.
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10; k++) {
                System.out.print(i * k + " ");
            }
            System.out.println();
        }

        //5.Stworz 5 elementowa tablice i wypelnij ja liczbami od 1 do 5
        System.out.println();
        int[] numbers1 = new int[5];
        {
            for (int i = 0; i < numbers1.length; i++)
                numbers1[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers1));


        //6.Stworz 1000 elementowa tablice i wypelnij ja liczbami od 1 do 1000
        int[] numbers1000 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            numbers1000[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers1000));


        //7.Stworz 10 elementowa tablice i wypelnij ja liczbami od 10 do 1
        System.out.println();
        int[] numbers2 = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers2[i] = 10 - i;
        }
        System.out.print(Arrays.toString(numbers2));

        //8.Stworz 10 elementowa tablice i wypelnij ja liczbami parzystymi od 2 do 20
        System.out.println();
        int[] numbers9 = new int[10];
        for (int i = 0; i < numbers9.length; i++) {
            numbers9[i] = (i + 1) * 2;
        }
        System.out.print(Arrays.toString(numbers9));


        //9.Stworz dowolna tablice i wypisz jej elementy, ale tylko te pod parzystymi indeksami
        System.out.println();
        int[] numbers4 = new int[20];
        for (int i = 0; i < numbers4.length; i++) {
            if (i % 2 == 0) {
                System.out.print(numbers4[i] + " ");
            }
        }


        /*//tablica 2d.2

        for ( int i = 0; i <= noweLiczby2D.length; i++) {
            for (int b = 0; b <= noweLiczby2D.length[0]; b++) {
                noweLiczby2D[5][10] = i;
                noweLiczby2D[5][10] = b;
            }
        }
        System.out.println(Arrays.deepToString(noweLiczby2D));
        */
        int[][] noweLiczby2D = new int[5][10];

        for (int i = 0; i < noweLiczby2D.length; i++) {
            for (int j = 0; j < noweLiczby2D.length; j++) {

            }
        }

        for (int[] ints : noweLiczby2D) {
            for (int i : ints) {

            }
        }
    }
}