package com.java.course.com.przyklady;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        🧪 Zadanie 1: Operacje na liczbach
Poziom: łatwy
Treść:
Napisz program w Javie, który pobiera dwie liczby całkowite od użytkownika (można założyć, że są zadane w kodzie) i wypisuje:

ich sumę,

różnicę,

iloczyn,

iloraz (jako liczba zmiennoprzecinkowa).

Wymagania:

użycie zmiennych typu int i double,

poprawna konwersja przy dzieleniu.

🧪 Zadanie 2: Sprawdzenie parzystości liczby
Poziom: łatwy
Treść:
Napisz program, który sprawdza, czy podana liczba całkowita jest parzysta czy nieparzysta.

Wymagania:

użycie instrukcji warunkowej if,

wypisanie komunikatu: „Liczba X jest parzysta” lub „Liczba X jest nieparzysta”.

🧪 Zadanie 3: Liczby od 1 do N
Poziom: średni
Treść:
Napisz program, który wypisuje wszystkie liczby całkowite od 1 do N, gdzie N jest zadane w kodzie. Dla każdej liczby sprawdź, czy jest podzielna przez 3, i jeśli tak, dodaj napis „Fizz”.

Przykład wyjścia dla N = 5:

Kopiuj
Edytuj
1
2
3 Fizz
4
5
Wymagania:

użycie pętli for,

użycie operatora modulo i if.

🧪 Zadanie 4: Prosta funkcja maks()
Poziom: średni
Treść:
Napisz metodę statyczną maks, która przyjmuje dwa argumenty typu int i zwraca większy z nich. W metodzie main przetestuj działanie tej metody.

Wymagania:

użycie metody statycznej,

porównanie liczb w metodzie,

wypisanie wyniku w main.

🧪 Zadanie 5: Tablica i średnia
Poziom: średni–zaawansowany
Treść:
Napisz program, który posiada tablicę 5 liczb typu double. Oblicz średnią arytmetyczną tych liczb i wypisz wynik z dokładnością do dwóch miejsc po przecinku.

Wymagania:

użycie tablicy i pętli do obliczenia sumy,

użycie klasy String.format() lub System.out.printf() do formatowania wyniku.
         */
        System.out.println("Zadanie nr1");
        System.out.println("Podaj liczbe nr1: ");
        Scanner scanner = new Scanner(System.in);
        double liczba1 = scanner.nextDouble();
        System.out.println("Liczba nr1 - " + scanner);
        System.out.println("Podaj liczbe nr2: ");
        double liczba2 = scanner.nextDouble();
        System.out.println("Twoje liczby to: " + liczba1 + " i " + liczba2);
        System.out.println("Wynik dodawania liczb: " + sumaLiczb(liczba1,liczba2));
        System.out.println();
        System.out.println("Wynik odejmowania liczb: " + roznica(liczba1,liczba2));
        System.out.println();
        System.out.println("Wynik mnozenia liczb: " + iloczyn(liczba1,liczba2));
        System.out.println();
        System.out.println("Wynik dzielenia liczb: " + iloraz(liczba1,liczba2));
        System.out.println();
        System.out.println("Czy liczba jest parzysta:" + czyLiczbaJestParzystaCzyNie(10));
        System.out.println();
        System.out.println("Czy liczba jest parzysta:" + czyLiczbaJestParzystaCzyNie(9));
        System.out.println();
        System.out.println("Liczby calkowite podzielne przez 3 z Fizz: " );
        wszystkieLiczbyPodzielnePrzez3zFizz(9);
        System.out.println();
        System.out.println("Wieksza liczba: " + wiekszaLiczba(9,10));
        System.out.println();
        double[] lista = new double[5];
        lista[0] = 5;
        lista[1] = 10;
        lista[2] = 15;
        lista[3] = 25;
        lista[4] = 35;
        System.out.println("Srednia liczba z tablicy:" + sredniaLiczbaZTablicy(lista));




    }
    public static double sumaLiczb(double liczbaNR1, double liczbaNR2) {
        return liczbaNR1 + liczbaNR2;
    }

    public static double roznica(double liczbaNR1, double liczbaNR2) {
        return liczbaNR1 - liczbaNR2;
    }
    public static double iloczyn(double liczbaNR1, double liczbaNR2) {
        return liczbaNR1 * liczbaNR2;
    }

    public static double iloraz(double liczbaNR1, double liczbaNR2) {
        if (liczbaNR2 == 0) {
            System.out.println("nie dzielimy przez zero");
            return Double.NaN;
        }
        return liczbaNR1 / liczbaNR2;
    }

    public static boolean czyLiczbaJestParzystaCzyNie(double liczba) {
        if (liczba % 2 == 0) {
            System.out.println("Liczba jest parzysta");
            return true;
        } else {
            System.out.println("Liczba jest nieparzysta");
            return false;
        }
    }

    /*
    Napisz program, który wypisuje wszystkie liczby całkowite od 1 do N,
    gdzie N jest zadane w kodzie. Dla każdej liczby sprawdź,
    czy jest podzielna przez 3, i jeśli tak, dodaj napis „Fizz”.
     */
    public static void wszystkieLiczbyPodzielnePrzez3zFizz(int liczbyDoN){
        for (int i = 1; i <= liczbyDoN; i++) {
            if (i % 3 == 0 ) {
                System.out.println(i + " Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static int wiekszaLiczba(int liczbaNR1, int liczbaNR2) {
        if (liczbaNR1 > liczbaNR2) {
            return liczbaNR1;
        }else {
            return liczbaNR2;
        }
    }

    public static double sredniaLiczbaZTablicy(double[] liczby) {
        double suma = 0;
        for (int i =0; i < liczby.length; i++) {
            suma += liczby[i];
        }
        return suma / liczby.length;
    }
}
