package com.java.course.com.lesson8.funkcje;

public class Main {
    public static void main(String[] args) {
        int liczba = 1;
        int liczba2 = 2;

        suma2Elementow(liczba, liczba2);
        suma2Elementow(60, 12);
        System.out.println();
        System.out.println("Hello Wolrd!!!");
        System.out.println("Hello Wolrd!!!");
        System.out.println("Hello Wolrd!!!");
        System.out.println("Hello Wolrd!!!");
        System.out.println("Hello Wolrd!!!");
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.println("Hello Wolrd!!!");
        }
        System.out.println();
        wypiszHelloWorldNaTablicy6Razy(); //wywolanie funkcji
        System.out.println();
        wypiszHelloWorldNRazy(2);
        System.out.println();
        wypiszHelloWorldNRazy(10);
        System.out.println();
        wypisz(3,"Czesc");
        wypisz(5,"Do widzenia");

        int[] tablica1 = {3, 2, 2, 4};
        double srednia  = sredniaKursantaZTestu(tablica1);
        System.out.println(srednia);
        if(srednia > 10){
            System.out.println("Dobry kursant");
        }else{
            System.out.println("Sredni kursant");
        }

        int wynikSumy = suma(20,43);
        System.out.println(wynikSumy);

        if(wynikSumy % 2 == 0){
            System.out.println("Suma jest parzysta");
        }

        System.out.println(czyParzysta(suma(43,13)));
    }
    //napisz funkcje ktora obliczy srednia kursanta z testow
    //gdzie wyniki testow sa podawane w tablcy intow

    public static boolean czyParzysta(int a){
        return a % 2 ==0;
    }

    public static int suma(int a, int b){
        return a + b;
    }
    public static double sredniaKursantaZTestu(int[] tablica) {
        int suma = 0;
        for ( int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        return (double)suma/tablica.length;
    }

    public static void wypiszHelloWorldNaTablicy6Razy(){
        for (int i = 0; i < 6; i++) {
            System.out.println("Hello Wolrd!!!");
        }
    }

    public static void wypiszHelloWorldNRazy(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Hello Wolrd!!!");
        }
    }

    public static void wypisz(int n, String wiadomosc){
        for (int i = 0; i < n; i++) {
            System.out.println(wiadomosc);
        }
    }

    //Napisz funkcje ktoa oblicy sume elemento z tablicy
    public static void obliczSumeElementowZTablicy(int[] tablica) {
        double suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        System.out.println(suma);
    }

    //napisz funkcje ktora doda do siebie 2 liczby i wyswielti wynik
    public static void suma2Elementow(int liczba, int liczba1) {
        int suma = 0;
        System.out.println(liczba + liczba1);
    }
}
