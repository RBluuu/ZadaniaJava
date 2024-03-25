package com.java.course.com.lesson3;

public class ZadaniaCd {
    public static void main(String[] args) {
        //18.Napisz program ktory wypisze sume cyfry jednosci i dziesiatek wszystkich liczb od 10 do 99
        // /
        // %
        int x = 59;
        System.out.println(x / 10); //5
        System.out.println(x % 10); //9
        for (int i = 10; i <= 99; i++) {
            System.out.println(i / 10 + i % 10);
        }
        System.out.println();
        //wypiisz trojkat
        /*
         *
         ***
         *****
         */
        int starCounter = 1;
        int spaceCounter = 5;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < spaceCounter; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCounter; j++) {
                System.out.print("*");
            }
            spaceCounter -= 1;
            starCounter += 2;
            System.out.println();

        }
        //fibonacci wypisz 10 liczb ciagu ciag fibonacciego
        // 0 1 1 2 3 5 8 13 21 34
        int first = 0;
        int second = 1;
        for (int i = 0; i < 10; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
