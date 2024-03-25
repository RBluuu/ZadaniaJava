package com.java.course.com.lesson6.files;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.io.FileWriter;

public class ZadaniaZPlikow {
    public static void main(String[] args) throws FileNotFoundException {

        //1. Wypisz zawartosc pliku na konsoli
        String path = "src/com/java/course/com/lesson6/files/ZadaniaZPlikow.java.txt";
        try (FileWriter konsola = new FileWriter(path)) {
            konsola.write("Radek\n");
            konsola.write("Marek\n");
            konsola.write("Mirek\n");
            konsola.write("Darek\n");
        } catch (Exception e) {
            System.out.println("Upsss cos poszlo nie tak");
        }

        try (FileReader konsola2 = new FileReader(path)) {
            int r;
            while ((r = konsola2.read()) != -1) {
                System.out.print((char) r);
            }
        } catch (IOException e) {
            System.out.println("Upsss cos poszlo nie tak");
        }

        //2. Wypisz wszystkie pliki w danym folderze, uwzglednij podfoldery
        String folderPath = "C:\\Users\\Radek\\IdeaProjects\\JavaPodstawy\\src\\com\\java\\course\\com\\lesson6\\files";
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("Folder = " + file.getName());
            } else if (file.isFile()) {
                System.out.println("Podfolder = " + file.getName());
            }
        }

        //3.Napisz program ktory bedzie zapisywal informacje o wadze uzytkownika razem z data wykonania pomiaru do pliku
//        /*String path2 = "src/com/java/course/com/lesson9//WagaUzytkowniak.java.text";
//        try (BufferedWriter pytanie = new BufferedWriter(new FileWriter(path2))) {
//            pytanie.write("Podaj swoja wage w kg:");
//            Scanner waga = new Scanner(System.in);
//            double wagaUzytkownika = waga.nextDouble();
//            pytanie.write("Twoja waga to = " + wagaUzytkownika);
//        } catch (IOException e) {
//            System.out.println("Upss cos poszlo nie tak... :)");
//        }
/*
        try (BufferedReader konsola2 = new BufferedReader( new FileReader(path2))) {
            String waga;
            while ((waga = konsola2.readLine()) != null) {
                System.out.print(waga);
            }
        } catch (IOException e) {
            System.out.println("Upsss cos poszlo nie tak");
        }

         */


        //5. Napisz program, który czyta plik tekstowy i wyświetla wszystkie linie, które zawierają określone słowo kluczowe.
        String path4 = "src/com/java/course/com/lesson6/files/SlowoKluczowe.java.txt";
        try (BufferedWriter konsola = new BufferedWriter(new FileWriter(path4))) {
            konsola.write("Codziennie czytam ksiażki.");
            konsola.newLine();
            konsola.write("Rano myje zeby.");
            konsola.newLine();
            konsola.write("Codziennie chodze do pracy.");
            konsola.newLine();
            konsola.write("Wieczor myje zeby.");
            konsola.newLine();
        } catch (Exception e) {
            System.out.println("Upsss cos poszlo nie tak");
        }
        String slowo = "Codziennie";
        try (BufferedReader konsola4 = new BufferedReader(new FileReader(path4))) {
            String line;
            while ((line = konsola4.readLine()) != null) {
                if (line.contains(slowo))
                    System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Upsss cos poszlo nie tak");
        }

        //6. Utwórz program, który kopiuje zawartość jednego pliku do drugiego.
        //Zrobione

        //7. Wygeneruj 100 losowych liczb, zapisz je do pliku nastepnie odczytaj je i oblicz ich srednia, znadz max i min !!!
        String path5 = "src/com/java/course/com/lesson9/pliki/LosoweLiczby.java.text";
        try (FileWriter losoweLiczby = new FileWriter(path5)) {
            for (int i = 0; i <= 100; i++) {
                int liczbaRandom = (int) (Math.random() * 100);
                losoweLiczby.write(liczbaRandom);
            }
        } catch (IOException e) {
            System.out.println("Cos poszlo nie tak. :(");
        }

        try (FileReader odczytLiczby = new FileReader(path5)) {
            int liczba;
            int suma = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            while ((liczba = odczytLiczby.read()) != -1) {
                System.out.print(liczba + " ");
                suma += liczba;
                if (liczba > max) {
                    max = liczba;
                }
                if (liczba < min) {
                    min = liczba;
                }
            }
            System.out.println();
            System.out.println("Srednia = " + (double) suma / 100);
            System.out.println("Max liczba to = " + max);
            System.out.println("Min liczba to = " + min);


        } catch (IOException e) {
            System.out.println("Cos poszlo nie tak. :(");
        }

        //10. Napisz program ktory usunie wszystkie pliki z _do_usuniecia w nazwie z danego folderu
        String pilkDoUsuniecia = "src/com/java/course/com/lesson9/_do_Usuniecia/_do_Usuniecia";
        try (FileWriter doUsuniecia = new FileWriter(pilkDoUsuniecia)) {
            doUsuniecia.write("Radek\n");
            doUsuniecia.write("Marek\n");
            doUsuniecia.write("Mirek\n");
            doUsuniecia.write("Darek\n");

        } catch (IOException e) {
            System.out.println("Cos poszlo nie tak... :(.");
        }
        try (FileReader konsola3 = new FileReader(path)) {
            int d;
            while ((d = konsola3.read()) != -1) {
                System.out.print((char) d);
            }
        } catch (IOException e) {
            System.out.println("Upsss cos poszlo nie tak");
        }

        try {
            File file = new File(pilkDoUsuniecia);
            if (file.delete()) {
                System.out.println(file.getName() + " Pliki zostały usuniete!!!");
            } else {
                System.out.println("Pliki nie zostały usuniete.");
            }
        } catch (Exception e) {
            System.out.println("Cos poszlo nie tak.");
        }

        //11. Stworz plik slownik.txt z jakimis slowami i napisz program ktory zamieny wszystkie brzydkie slowa na ***** 
        // i wpisze do pliku slownik_proprawiony.txt !!!
        String slownik = "src/com/java/course/com/lesson9/pliki/slownik.text";
        try (BufferedWriter konsola = new BufferedWriter(new FileWriter(slownik))) {
            konsola.write("Kurna");
            konsola.newLine();
            konsola.write("Kurde");
            konsola.newLine();
            konsola.write("Noga");
            konsola.newLine();
            konsola.write("Glowa");
        } catch (Exception e) {
            System.out.println("Upsss cos poszlo nie tak");
        }

        String slownikPoprawiony = "src/com/java/course/com/lesson9/pliki/slownik-poprawiony.text";
        try (BufferedWriter konsola3 = new BufferedWriter(new FileWriter(slownikPoprawiony))) {


        } catch (IOException e) {
            System.out.println("Upsss cos poszlo nie tak");
        }


        try (BufferedReader konsola2 = new BufferedReader(new FileReader(slownik))) {
            String slowo1 = "Kurna";
            String slowo2 = "Kurde";
            String line1;
            while ((line1 = konsola2.readLine()) != null) {
                if (line1.equals(slowo1)) {
                    System.out.println(line1.replace("Kurna","*****"));
                } else if ((line1 = konsola2.readLine()) != null) {
                    if (line1.equals(slowo2))
                        System.out.println(line1.replace("Kurde", "*****"));
                }
            }
            
        } catch (
                IOException e) {
            System.out.println("Upsss cos poszlo nie tak");
        }


        /*
        String slownikPoprawiony = "src/com/java/course/com/lesson9/pliki/slownik-poprawiony.text";
        try (BufferedWriter konsola2 = new BufferedWriter(new FileWriter(slownikPoprawiony)) {

        }
        } catch (IOException e) {
            System.out.println("Upsss cos poszlo nie tak");
        }
         */

    }
}