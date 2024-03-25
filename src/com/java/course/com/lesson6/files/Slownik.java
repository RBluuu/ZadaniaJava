package com.java.course.com.lesson6.files;

import java.io.*;

public class Slownik {
    public static void main(String[] args) throws IOException {
        //11. Stworz plik slownik.txt z jakimis slowami i napisz program ktory zamieny wszystkie brzydkie slowa na ***** i wpisze do pliku slownik_proprawiony.txt
        //kurka, kurde, kurna, pies, kot

        String sciezka = "src\\com\\java\\course\\com\\java\\lesson6\\files\\slownik.txt";
        try (BufferedWriter slowa = new BufferedWriter(new FileWriter(sciezka))) {
            slowa.write("kurka");
            slowa.newLine();
            slowa.write("kurde");
            slowa.newLine();
            slowa.write("kurna");
            slowa.newLine();
            slowa.write("pies");
            slowa.newLine();
            slowa.write("kot");
        }

        try (BufferedReader slowa = new BufferedReader(new FileReader(sciezka));
             BufferedWriter poprawiony = new BufferedWriter(new FileWriter(sciezka))) {
            String line;
            while ((line = slowa.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
