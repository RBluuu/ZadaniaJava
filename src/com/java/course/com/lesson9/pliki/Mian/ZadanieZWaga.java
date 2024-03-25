package com.java.course.com.lesson9.pliki.Mian;

import java.io.*;
import java.util.Scanner;

public class ZadanieZWaga {
    public static void main(String[] args) {
        //3.Napisz program ktory bedzie zapisywal informacje o wadze uzytkownika razem z data wykonania pomiaru do pliku
        String path2 = "src/com/java/course/com/lesson9//WagaUzytkowniak.java.text";
        try (BufferedWriter pytanie = new BufferedWriter(new FileWriter(path2))) {
            pytanie.write("Podaj swoja wage w kg:");
            Scanner scanner = new Scanner(System.in);
            pytanie.write(scanner.nextInt());
            pytanie.write("Podaj date:");
            pytanie.write(scanner.nextInt());
            pytanie.write("Podaj swoja wage:");
            pytanie.write("Twoja waga to = " + scanner.nextInt());
            pytanie.write("Podaj date:" + scanner.nextInt());
            pytanie.write("Podaj wage 3 ważenia:");
            pytanie.write(scanner.nextInt());
        } catch (IOException e) {
            System.out.println("Upss cos poszlo nie tak... :)");
        }

        try (BufferedReader konsola2 = new BufferedReader( new FileReader(path2))) {
            String waga;
            int kg;
            while ((waga = konsola2.readLine()) != null) {
                System.out.print(waga);
            }
            if ((kg = konsola2.hashCode()) != -1) {
                System.out.println(kg);
            }
        } catch (IOException e) {
            System.out.println("Upsss cos poszlo nie tak");
        }
    }
}
