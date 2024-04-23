package com.java.course.com.lesson21.ksiazka;

public class Ksiazka {

    static int iloscKsiazek = 0;
    String autor;
    int ilsocStron;
    String tytul;

    double cena;
    int rokWydania;

    public Ksiazka(String autor, int ilsocStron, String tytul, int rokWydania, double cena) {
        this.autor = autor;
        this.ilsocStron = ilsocStron;
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.cena = cena;
    }

    void otworz(int strona) {
        System.out.println("Otwieram na " + strona + " stronie");
    }

    void czytaj() {
        System.out.println("Czytam");
    }

    void zamknij() {
        System.out.println("Zamknalem");
    }

    static void obliczSredniaCeneKsiazekZRoku() {

    }

    static void znajdzWszystkieKsaizkiPoAutorze() {

    }

    void otworzSpisTresci() {

    }

    void wystawNaAllegro() {

    }

    static void pogrupujKsiazkiPoAutorze() {

    }


}
