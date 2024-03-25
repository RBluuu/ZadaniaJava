package com.java.course.com.lesson5;

import java.util.Arrays;

import static java.util.Collections.binarySearch;

public class Main {
    public static void main(String[] args) {

        System.out.println("Imie");


        //stworz tablice intow i wypisz tylko parzyste elementy
        int[] liczby = {45, 22, 123, 432, 12, 3141, 2131, 32132};
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] % 2 == 0) {
                System.out.println(liczby[i]);
            }
        }

        //typy prymitywne vs typy referencyjne

        //typy prymitywne - po prostu wartosci
        //char
        //int
        //short
        //bolean


        int x = 10;
        int y = x;
        y = 5;
        System.out.println(x);
        System.out.println(y);
        System.out.println();
        //typy referencyjne
        //shallow copy- kopiowanie plytnie/przez referencje
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = original;
        copy[0] = 999;
        original[1] = 555;
        //deep copy - kopiowanie glebokie
        int[] deepCopy = Arrays.copyOf(original, original.length);
        deepCopy[1] = 777;
        System.out.println(Arrays.toString(original)); //alt + enter
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(deepCopy));


        //shift shift


        //Zadania
        //1 Stworz 5 elementowa tablice i wypelnij ja liczbami od 1 do 5
        int[] newBox = new int[5];
        {
            for (int i = 0; i < newBox.length; i++)
                newBox[i] = i + 1;
        }
        System.out.println(Arrays.toString(newBox));

        //2 Stworz 1000 elementowa tablice i wypelnij ja liczbami od 1 do 1000
        int[] newNumber = new int[1000];
        {
            for (int i = 0; i < newNumber.length; i++)
                newNumber[i] = i + 1;
        }
        System.out.println(Arrays.toString(newNumber));

        //3 Stworz 10 elementowa tablice i wypelnij ja liczbami od 10 do 1
        int[] liczby1 = new int[10];
        {
            for (int i = 0; i < liczby1.length; i++)
                liczby1[i] = 10 - i;
        }
        System.out.println(Arrays.toString(liczby1));

        //4 Stworz 10 elementowa tablice i wypelnij ja liczbami parzystymi od 2 do 20
        int[] parzyste = new int[10];
        for (int i = 0; i < parzyste.length; i++) {
            parzyste[i] = (i + 1) * 2;
        }
        System.out.println(Arrays.toString(parzyste));

        //5 Stworz dowolna tablice i wypisz jej elementy, ale tylko te pod parzystymi indeksami
        int[] dowlona = new int[20];
        for (int i = 0; i < dowlona.length; i++) {
            if (dowlona[i] % 2 == 0) ;
        }
        System.out.println(Arrays.toString(dowlona));

        //6 Stworz dwie tablice i wypisz tylko wspolne elementy
        int[] nowaTablica0 = new int[5];
        int[] nowaTablica1 = new int[5];
            for (int i = 0; i < nowaTablica0.length; i++) {
                for (int j = 0; j < nowaTablica1.length; j++) {
                    if ( nowaTablica0[i] == nowaTablica1[j]) {
                        System.out.println("Liczby = " + nowaTablica0[i]);
                    }
                }
            }


        //7 Stworz dwie tablice i wypisz tylko unikatowe elementy
        int[] nowaTablica3 = new int[5];
        {
            for (int i = 0; i < nowaTablica3.length; i++) {
                nowaTablica3[i] = i;
            }
        }
        System.out.println(Arrays.toString(nowaTablica3));

        int[] nowaTablica4 = new int[5];
        {
            for (int i = 0; i < nowaTablica4.length; i++) {
                nowaTablica4[i] = i;
            }
        }
        System.out.println(Arrays.toString(nowaTablica4));


        //8. Stwórz dwuwymiarową tablicę 3x3 i wypełnij ją liczbami od 1 do 9.
        int[][] nowaTablica2D1 = new int[3][3];
        for (int i = 0; i < nowaTablica2D1.length; i++) {
            for (int d = 0; d < nowaTablica2D1.length; d++) {
            }
        }
        System.out.println(Arrays.toString(nowaTablica2D1));


        //9. Stwórz tablicę 5x5 i wypełnij ją wzorem szachownicy, używając 0 i 1.
        int[][] nowaTablica2D2 = new int[5][5];


        ///////////////////10. Stwórz tablicę zawierającą 5 różnych imion, a następnie wypisz je w odwrotnej kolejności.
        String[] imiona = {"Radek", "Ola", "Rafał", "Iga", "Janusz"};
        {
            for (int i = 0; i < 4; i++) ;
        }
        System.out.println(Arrays.toString(imiona));


        //11. Stwórz 10-elementową tablicę liczb całkowitych i wypisz ich sumę.
        int[] calkowite = new int[5];
        int suma = 0;
        {
            for (int i = 0; i < calkowite.length; i++) {
                calkowite[i] = i;
                suma += i;
            }
        }
        System.out.println(Arrays.toString(calkowite));
        System.out.println("SUMA = " + suma);

        //12. Stwórz dwuwymiarową tablicę reprezentującą macierz 4x4 i wypisz jej przekątną.
        int[][] nowaTablica2D5 = new int[4][4];
        for (int i = 0; i < nowaTablica2D5.length; i++) {
            for (int j = 0; j < nowaTablica2D5.length; j++) {
                if ( i == j) {
                    System.out.println(nowaTablica2D5[i][j]);
                }
            }
        }


        //13. Stwórz tablicę i wypełnij ją losowymi liczbami, a następnie znajdź największą i najmniejszą wartość.
        int[] dowlona1 = new int[10];
        for (int i = 0; i < dowlona1.length; i++) {
            int z = (int) (Math.random() * 100);
            dowlona1[i] = z;
        }
        System.out.println(Arrays.toString(dowlona1));
        System.out.println("Minimalna liczba to = " + Arrays.stream(dowlona1).min());
        System.out.println("Maxymalna liczba to = " + Arrays.stream(dowlona1).max());


        /////////////15. Stwórz 10-elementową tablicę liczb całkowitych i wypisz liczbę wystąpień każdej liczby.
        int[] tablica10 = new int[10];
        for (int i = 0; i < tablica10.length; i++) {
            tablica10[i] = i + 1;
        }

        //18. Stwórz tablicę 10 liczb całkowitych i zamień miejscami pierwszy i ostatni element.
        int[] tablica11 = new int[10];
        for (int i = 0; i < tablica11.length; i++) {
            tablica11[i] = i + 1;
        }
        int tmp = tablica11[0];
        tablica11[0] = tablica11[9];
        tablica11[9] = tmp;
        System.out.println(Arrays.toString(tablica11));

        //19. Stwórz tablicę 10 liczb całkowitych i posortuj ją rosnąco. !!! nie korzystajac z klasy Arrays
        //sortowanie tablicy - babelkowe
        int[] tablica12 = new int[10];
        for (int i = 0; i < tablica12.length; i++) {
            tablica12[i] = i + 1;
        }
        System.out.println(Arrays.toString(tablica12));

        //20. Stworz tablice, wypelnij ja losowymi liczbami od 1 do 10 i sprawdz czy jest w niej jakas liczba 5 korzystajac z binarySearch
        int[] tablica13 = new int[5];
        for (int i = 0; i < tablica13.length; i++) {
            int z = (int) (Math.random() * 10);
            tablica13[i] = z;
            int binarySearch;
            System.out.println(binarySearch(tablica13) == 5);
            binarySearch = 5;
        }


        //21. Oblicz srednia arytmetyczna wszystkich liczb w tablicy
        int[] tablica14 = new int[10];
        int suma1 = 0;
        int srednia = 0;
        for (int i = 0; i < tablica14.length; i++) {
            suma1 += i;
            srednia = (suma1 / 10);
        }
        System.out.println("Średnia liczb = " + srednia);

        //22. Oblicz mediane wszystkich liczb w tablicy
        int[] tablica15 = new int[10];
        double suma2 = 0;
        for (int i = 0; i < tablica15.length; i++) {
            tablica15[i] = i + 1;
            suma2 = (tablica15[4] + tablica15[5]) / 2;
        }
        System.out.println(Arrays.toString(tablica15));
        System.out.println(Math.round(suma2));

        //23. czym sie rozni shallowCopy od deepCopy
        //shallowCopy - płytkie kopiowanie/przez referencje
        //deepCopy - głębokie kopiowanie

        //24. Wypisz ostatni element tablicy zakladajac ze nie znasz jej rozmiaru
        int[] tablica99 = new int[9];
        System.out.println(tablica99[tablica99.length - 1]);


        //25. Obroc tablice, czyli z tablicy {1,2,3,4,5} zrob tablice {5,4,3,2,1}
        int[] tablica20 = new int[5];
        for (int i = 0; i < tablica20.length; i++) {
            tablica20[i] = i + 1;
        }
        System.out.println(Arrays.toString(tablica20));

        int[] tablica21 = new int[5];
        int[] copy1 = tablica21;
        for (int i = 0; i < tablica21.length; i++) {
            copy1[i] = 5 - i;
        }
        System.out.println(Arrays.toString(tablica21));
    }

    private static int binarySearch(int[] tablica13) {
        int i = 5;
        return i;
    }
}


