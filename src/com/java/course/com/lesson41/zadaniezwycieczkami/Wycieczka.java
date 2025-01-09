package com.java.course.com.lesson41.zadaniezwycieczkami;

import java.util.ArrayList;
import java.util.List;

public class Wycieczka {
    /*
     * Stwórz klase klient i wycieczka, klient moze miec wiele wycieczek, wycieczka
     * moze miec wielu klientow. Wycieczka ma nazwe, kraj, cena i liste dodatkow
     * (kazdy jest dodatkowo platny) Znadz klienta który wydal najwiecej na dodatki
     * do wycieczki uwzgledniajac tez cene wycieczki Znadz klienta który wydal
     * najwiecej na dodatki do wycieczki nieuwzgledniajac tez ceny wycieczki
     */
    private String nazwaWycieczki;
    private String kraj;
    private double cena;
    private List<Dodatki> dodatki;
    private List<Klient> klient;

    public Wycieczka(String nazwaWycieczki, String kraj, double cena) {
        this.nazwaWycieczki = nazwaWycieczki;
        this.kraj = kraj;
        this.cena = cena;
        this.dodatki = new ArrayList<>();
        this.klient = new ArrayList<>();
    }

    public void dodajDodatek(Dodatki dodatek) {
        dodatki.add(dodatek);
    }

    public void dodajKlienta(Klient klienci) {
        if (!klient.contains(klienci)) {
            klient.add(klienci);
        }
    }

    public String getNazwaWycieczki() {
        return nazwaWycieczki;
    }

    public void setNazwaWycieczki(String nazwaWycieczki) {
        this.nazwaWycieczki = nazwaWycieczki;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public List<Dodatki> getDodatki() {
        return dodatki;
    }

    public void setDodatki(List<Dodatki> dodatki) {
        this.dodatki = dodatki;
    }

    public List<Klient> getKlient() {
        return klient;
    }

    public void setKlient(List<Klient> klient) {
        this.klient = klient;
    }

    @Override
    public String toString() {
        return "Wycieczka{" +
                "nazwa='" + nazwaWycieczki + '\'' +
                ", kraj='" + kraj + '\'' +
                ", cena=" + cena +
                ", dodatki=" + dodatki +
                '}';
    }
}
