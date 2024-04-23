package com.java.course.com.lesson18;

import java.util.List;

public class Ksiazka {
    String tytul;
    String autor;
    int liczbaStron;
    int rokWydania;

    public Ksiazka(String tytul, String autor, int liczbaStron, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.rokWydania = rokWydania;
    }

    public void printInfo() {
        System.out.println(this.tytul);
        System.out.println(this.autor);
        System.out.println(this.liczbaStron);
        System.out.println(this.rokWydania);
    }

    public static int najstarszaKsiazka(List<Ksiazka> ksiazki) {
        int rok = Integer.MAX_VALUE;
        for (Ksiazka ksiazka : ksiazki) {
            if (ksiazka.rokWydania < rok) {
                rok = ksiazka.rokWydania;
            }
        }
        return rok;
    }



    public static double sredniaStro(List<Ksiazka> ksiazki) {
        double srednia = 0;
        for (Ksiazka ksiazka : ksiazki) {
            srednia += ksiazka.liczbaStron;
        }
        return srednia / ksiazki.size();
    }

}
