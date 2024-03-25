package com.java.course.com.lesson9.pliki;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        FileWriter
        FileReader
        File
         */

        //try with resourec
        String path = "src\\com\\java\\course\\com\\lesson9\\pliki\\imiona.txt";
        try (FileWriter fw = new FileWriter(path)) {
            fw.write("Ilona\n");
            fw.write("Grzesiek" + System.lineSeparator());
            fw.write("Waldek" + System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Ooops cos poszlo nie tak... :(");
        }

        try (FileReader fileReader = new FileReader(path)) {
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            System.out.println("Ooops cos poszlo nie tak... :(");
        }

        //BufferedWriter
        //BufferedReader

        System.out.println();

        String animals = "src/com/java/course/com/lesson6/files/animals.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(animals))) {
            bw.write("zolw");
            bw.newLine();
            bw.write("kon");
            bw.newLine();
            bw.write("malpa");
        } catch (IOException e) {
            System.out.println("Ooops cos poszlo nie tak... :(");
        }

        try (BufferedReader bw = new BufferedReader(new FileReader(animals))) {
            String line;
            while ((line = bw.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ooops cos poszlo nie tak... :(");
        }

        File plik = new File("src\\com\\java\\course\\com\\lesson9\\pliki");

        System.out.println(plik.canRead());
        System.out.println(plik.isDirectory());
        System.out.println(plik.isFile());
        System.out.println(plik.isHidden());
        System.out.println(Arrays.toString(plik.listFiles()));
    }
}
//Zadania:
//1. Wypisz zawartosc pliku na konsoli -     zrobione
//2. Wypisz wszystkie pliki w danym folderze, uwzglednij podfoldery -     zrobione
//3. Napisz program ktory bedzie zapisywal informacje o wadze uzytkownika razem z data wykonania pomiaru do pliku
//3.1 Napisz program ktory obliczy jak zmienila sie waga uzytkownika (pierwszy pomiar - ostatni pomiar)
//3.2 Oblicz srednia wage uzytkownika na podstawie pomiarow
//4. Do gry kolko i krzyzyk dodaj historie zwyciezcow zapisywanych do pliku ***
//5. Napisz program, który czyta plik tekstowy i wyświetla wszystkie linie, które zawierają określone słowo kluczowe.   -   zrobione
//6. Utwórz program, który kopiuje zawartość jednego pliku do drugiego.  -   zrobione
//7. Wygeneruj 100 losowych liczb, zapisz je do pliku nastepnie odczytaj je i oblicz ich srednia, znadz max i min!!!  - zrobione
//10. Napisz program ktory usunie wszystkie pliki z _do_usuniecia w nazwie z danego folderu  - zrobione
//11. Stworz plik slownik.txt z jakimis slowami i napisz program ktory zamieny wszystkie brzydkie slowa na ***** i wpisze do pliku slownik_proprawiony.txt !!! - w polowie

/*Zad 1
        Za pomocją scannera, zapytaj użytkownika o 10 imion, a następnie
        -Znajdź najdłuższe oraz najkrótsze imie
        -wypisz ilość żeńskich imion
        -jaki % całości stanowią imiona męskie?

        Zad 2.
        Zapytaj użytkownika o liczby rozdzielone znamiek spacji " "
        np:
        Podaj liczby:
        10 20 30 40
        znajdz ich:
        sumę,min,max,srednia arytmetyczna, ilosc liczb pierwszych

        Zad 3
        Napisz metodę, która zwróci elementy wspólne dla dwóch tablic

        Zad 4
        Napisz metodę, która wypisze klepsydrę dla dowolnej liczby.
        UWAGA: dla parzystej liczby nie da sie napisac klepsydry

        *********
        *******
        *****
        ***
        *
        *
        *
        ***
        *****
        *******
        *********

        Zad 5
        Stworz pętle, która dla wszystkich liczb dwucyfrowych obliczy sumę cyfry dziesiątek i
        jedności, czyli np dla 91 -> 9 + 1 = 10

        Zad 6
        Napisz fukncję, która odwróci dowolną tablicę
        np dla. {1,2,3,4,5} -> {5,4,3,2,1}

        Zad 7
        Stworz plik "slownik" i wpisz do niego kilka wyrazów. Wrzuć kilka "kurde" "kurka"
        i "kurcze". Następnie wczytaj te słowa z pliku i wpisz je do nowego pliku "slownik_poprawiony"
        ALE zamien wszystkie brzydkie slowa na "***"

        Zad 8
        Napisz funkcję, która sprawdzi, czy podane słowo jest palindromem
        np. kajak -> kajak

        Zad 9
        Napisz funkcję, która zmieni Stringa na napisanego przez Jadena Smitha.
        Jaden Smith, syn Willa Smitha, jest gwiazdą takich filmów jak Karate Kid (2010) i After Earth (2013). Jaden jest również znany ze swojej filozofii, którą przekazuje za pośrednictwem Twittera. Pisząc na Twitterze, jest znany z tego, że prawie zawsze pisze wielkie litery w każdym słowie. Dla uproszczenia każde słowo należy pisać wielką literą.
        Twoim zadaniem jest przekonwertowanie napisów tak, jak napisałby je Jaden Smith.
        Przykład:
        Nie Jaden-Cased: „Jak lustra mogą być prawdziwe, jeśli nasze oczy nie są prawdziwe”
        Jaden-Cased: „Jak Lustra Mogą Być Prawdziwe, Jeśli Nasze Oczy Nie Są Prawdziwe”

        Zad 10
        Stwórz tablicę intów  i wypisz tylko te elementy, które są kwadratami

        Zad 11.
        Mecz tenisa. Podana jest tablica z nazwiskami dwóch tenisistów w kolejności wygranych wymian.
        np. tablica ["Kowalski","Nowak","Nowak","Nowak", "Kowalski"]
        Oznacza, że wynik zmieniał się następująco

        Kowalski:15 Kowalski:15	Kowalski: 15 Kowalski:15 Kowalski: 30     ITD...
        Nowak: 0	Nowak: 15   Nowak: 30    Nowak: 40   Nowak: 40

        Napisz Funkcję
        Dla dowolnej tablicy, sprawdź kto wygrał seta np
        ["Kowalski","Nowak","Nowak","Nowak", "Kowalski", "Kowalski","Nowak","Kowalski","Kowalski","Kowalski"] -> "Kowalski"

        Zad 12.
        Napisz funkcję, która
        Dla dowolego pliku, sprawdź czy zawarta w nim treść jest choinką tzn czy wygląda np. tak:

        *
        *
        ***
        *****

        Uwzględnij dowolną wysokość choinki. Należy sprawdzić, czy zgadza się ilość spacji i "*"

 */