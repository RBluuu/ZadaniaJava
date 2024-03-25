package com.java.course.com.lesson9.pliki;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class KopiaPliku {
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("src/com/java/course/com/lesson6/files/ZadaniaZPlikow.java.txt");
        FileOutputStream d = new FileOutputStream("src/com/java/course/com/lesson9/pliki/imiona.txt");

        int i;
        while ((i = r.read()) != -1) {
            d.write((char)i);
        }
        System.out.println("Kopia zrobiona poprawnie.");
    }
}
