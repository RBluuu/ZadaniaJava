package com.java.course.com.lesson11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //sprawdz czy 2 napisy sa rozne
        String imie = "Radek";
        String imie2 = "Ola";
        System.out.println(!(imie.equals(imie2)));
        int[] tablica = {2, 3, 5, 7, 8, 10};
        dodawanie(tablica);
        System.out.println(Arrays.toString(tablica));
    }

    //napisz funkcje ktora doda do siebie elemetny z tablicy intow
    public static void dodawanie(int[] liczby){
        int suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            suma += liczby[i];
        }
        System.out.println(suma);
    }
}
