package com.java.course.com.lesson41.zadaniezwycieczkami;

import java.util.ArrayList;
import java.util.List;

public class Klient {
    private String imie;
    private String nazwisko;
    //List<Rezerwacja>
    private List<Wycieczka> wycieczki;
    private List<Dodatki> dodatkiLista;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wycieczki = new ArrayList<>();
    }

    /*
   //Znadz klienta który wydal najwiecej na dodatki do wycieczki nieuwzgledniajac tez ceny wycieczki
    public static Klient najwieszkaKwotaNaDodatki(List<Klient> klienci) {
        Klient najlepszyKlient = null;
        double najwyzszaKwota = 0;
        for (Klient klient : klienci) {
            double sumaDodatkow = 0;
            // Zakładamy, że klient ma metodę getDodatki() zwracającą listę dodatków.
            // Każdy dodatek ma swoją cenę, np. metoda getCena().
            if (klient.dodatkiLista.) {
                for (Dodatek dodatek : klient.getDodatki()) {
                    sumaDodatkow += dodatek.getCena();
                }
            }
            if (sumaDodatkow > najwyzszaKwota) {
                najwyzszaKwota = sumaDodatkow;
                najlepszyKlient = klient;
            }
        }
        return najlepszyKlient;
    }
    */

    public void dodajWycieczke(Wycieczka wycieczka) {
        wycieczki.add(wycieczka);
    }

    public List<Wycieczka> getWycieczki() {
        return wycieczki;
    }

    public void setWycieczki(List<Wycieczka> wycieczki) {
        this.wycieczki = wycieczki;
    }

    public List<Dodatki> getDodatkiLista() {
        return dodatkiLista;
    }

    public void setDodatkiLista(List<Dodatki> dodatkiLista) {
        this.dodatkiLista = dodatkiLista;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
