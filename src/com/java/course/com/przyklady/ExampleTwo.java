package com.java.course.com.przyklady;

import java.util.ArrayList;
import java.util.List;

public class ExampleTwo {
    public static void main(String[] args) {
        /*
        Utwórz metodę printNumbers(int n), która:

przyjmuje jedną liczbę n,

za pomocą pętli for wypisuje liczby od 1 do n (każdą w nowej linii).
         */

        /*
        Utwórz metodę sumUpTo(int n), która:

przyjmuje liczbę n,

oblicza (za pomocą pętli for) sumę liczb od 1 do n,

zwraca obliczoną sumę.
         */

        /*
        Utwórz metodę multiplicationTable(int n), która:

przyjmuje liczbę n,

za pomocą pętli for wypisuje tabliczkę mnożenia dla tej liczby od 1 do 10.
         */

        /*
        Utwórz metodę isPrime(int n), która:

sprawdza, czy liczba n jest liczbą pierwszą,

zwraca true, jeśli jest pierwsza, lub false w przeciwnym wypadku,

używa pętli for.
         */

        /*
        Utwórz metodę reverseArray(int[] arr), która:

przyjmuje tablicę liczb całkowitych,

za pomocą pętli for odwraca kolejność elementów w tablicy,

nie tworzy drugiej tablicy.
         */

        System.out.println("Zadanie nr1");
        System.out.println(liczbaN(10));

        System.out.println();
        System.out.println("Zadanie nr2");
        System.out.println(sumaLiczb(5));
        System.out.println();

        System.out.println("Zadanie nr3");
        System.out.println(tabliczkaMnozenia(5));
        System.out.println();

        System.out.println("Zadanie nr4");
        System.out.println(liczbaPierwsza(8));
        System.out.println();

        System.out.println("Zadanie nr5");
        System.out.println();
        int[] a = {1, 2, 3, 4};
        reverseArray(a);

        /*
        Napisz metodę findMax(int[] arr), która:

zwraca największą liczbę z tablicy,

nie używa Arrays.sort() ani Collections.
         */

        /*
        Zadanie 2 – Zliczanie wystąpień znaku

Napisz metodę countChar(String text, char c), która:

zlicza, ile razy znak c występuje w napisie,

używa pętli for.
         */

        List<Integer> list = new ArrayList<>(List.of(1,3,5,15,55,19));
        System.out.println("Zadanie na max z listy");
        System.out.println(maxNumber(list));
        System.out.println();

        String text = "Programowanie poczatkowe";
        System.out.println(iloscWzstapien(text,'o'));


    }

    public static int maxNumber (List<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static int liczbaN(int liczbaUzytkownika) {
        for (int i = 0; i < liczbaUzytkownika; i++){
            System.out.println(i);
        }
        return liczbaUzytkownika;
    }

    public static int sumaLiczb(int liczbaUzytownika) {
        int suma = 0;
        for (int i = 1; i < liczbaUzytownika; i++) {
            suma += i;
        }
        return suma;
    }

    public static int tabliczkaMnozenia(int liczbaUzytownika) {
        for (int i = 1; i < 11; i++) {
            System.out.println(liczbaUzytownika + " x " + i + " = " + (liczbaUzytownika * i));
        }
        return liczbaUzytownika;
    }

    public static boolean liczbaPierwsza(int liczbaUzytownika) {
        if(liczbaUzytownika < 2 ) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(liczbaUzytownika); i++) {
            if(liczbaUzytownika % 1 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void reverseArray(int[] lista) {
        for (int i = 0; i < lista.length / 2; i++) {
            int temp = lista[i];
            lista[i] = lista[lista.length - 1 - i];
            lista[lista.length - 1 - i] = temp;
        }
    }

public static int iloscWzstapien(String text, char x) {
        int ilosc = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == x) {
                ilosc++;
            }
        }
        return ilosc;
}


}
