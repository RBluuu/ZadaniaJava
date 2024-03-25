package com.java.course.com.lesson6.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Teoria {
    public static void main(String[] args) {
        //Lekcja 6 - File,FileReader,FileWriter,BufferedReader,BufferedWriter

        //File - klasa reprezentująca plik lub katalog w systemie plików
        //https://docs.oracle.com/javase/7/docs/api/java/io/File.html
        //FileReader - klasa do odczytu plików tekstowych
        //https://docs.oracle.com/javase/7/docs/api/java/io/FileReader.html
        //FileWriter - klasa do zapisu plików tekstowych
        //https://docs.oracle.com/javase/7/docs/api/java/io/FileWriter.html
        //BufferedReader - klasa do odczytu plików tekstowych
        //https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html
        //BufferedWriter - klasa do zapisu plików tekstowych
        //https://docs.oracle.com/javase/7/docs/api/java/io/BufferedWriter.html


        //Klasa File pozwala na tworzenie, usuwanie, zmianę nazwy plików i katalogów
        //oraz na sprawdzanie czy plik lub katalog istnieje, czy jest plikiem czy katalogiem

        String sciezkaDoPliku = "src/lekcja6/plik.txt";
        File plik = new File(sciezkaDoPliku);
        //sprawdz czy plik istnieje
        System.out.println(plik.exists()); //Wypisze: false
        //sprawdz czy plik jest plikiem
        System.out.println(plik.isFile()); //Wypisze: false
        //sprawdz czy plik jest katalogiem
        System.out.println(plik.isDirectory()); //Wypisze: false
        //stworz plik
        try {
            System.out.println(plik.createNewFile()); //Wypisze: true
        } catch (Exception e) {
            e.printStackTrace();
        }
        //sprawdz czy plik istnieje
        System.out.println(plik.exists()); //Wypisze: true
        //sprawdz czy plik jest plikiem
        System.out.println(plik.isFile()); //Wypisze: true
        //sprawdz czy plik jest katalogiem
        System.out.println(plik.isDirectory()); //Wypisze: false
        //zmien nazwe pliku
        File plik2 = new File("src/lekcja6/plik2.txt");
        System.out.println(plik.renameTo(plik2)); //Wypisze: true

        //FileWriter - klasa do zapisu plików tekstowych, rowniez mozemy uzyc try with resources
        try (FileWriter fileWriter = new FileWriter(plik2)) {
            fileWriter.write("Cześć Jędrzej!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //FileReader - klasa do odczytu plików tekstowych, rowniez mozemy uzyc try with resources
        //metoda read() zwraca kod znaku, a nie znak wiec musimy rzutowac na char
        //oraz uzyc petli while do odczytania calego pliku
        try (FileReader fileReader = new FileReader(plik2)) {
            int znak;
            while ((znak = fileReader.read()) != -1) {
                System.out.print((char) znak);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Zadania:
        //1. Wypisz zawartosc pliku na konsoli
        //2. Wypisz wszystkie pliki w danym folderze, uwzglednij podfoldery
        //3. Napisz program ktory bedzie zapisywal informacje o wadze uzytkownika razem z data wykonania pomiaru do pliku
        //4. Do gry kolko i krzyzyk dodaj historie zwyciezcow zapisywanych do pliku*****
        //5. Napisz program, który czyta plik tekstowy i wyświetla wszystkie linie, które zawierają określone słowo kluczowe.
        //6. Utwórz program, który kopiuje zawartość jednego pliku do drugiego.
        //7. Wygeneruj 100 losowych liczb, zapisz je do pliku nastepnie odczytaj je i oblicz ich srednia, znadz max i mix
        //10. Napisz program ktory usunie wszystkie pliki z _do_usuniecia w nazwie z danego folderu
        //11. Stworz plik slownik.txt z jakimis slowami i napisz program ktory zamieny wszystkie brzydkie slowa na ***** i wpisze do pliku slownik_proprawiony.txt
    }
}

