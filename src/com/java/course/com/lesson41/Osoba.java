package com.java.course.com.lesson41;

import java.util.ArrayList;
import java.util.List;

public class Osoba {
    //Stworz klase Osoba, imie nazwisko, kolor oczu, kolor wlosow, pomysl co moze byc enumem.
    private String imie;
    private String nazwisko;
    private KolorOczu kolorOczu;
    private KolorWlosow kolorWlosow;

    public Osoba(String imie, String nazwisko, KolorOczu kolorOczu, KolorWlosow kolorWlosow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kolorOczu = kolorOczu;
        this.kolorWlosow = kolorWlosow;
    }

    //Napisz ktora zwraca liste osobo o kolorze oczu  podanym jako parametr
    public static List<Osoba> kolorOczu(List<Osoba> osoby, KolorOczu kolor) {
        List<Osoba> newList = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba.getKolorOczu() == kolor) {
                newList.add(osoba);
            }
        }
        return newList;
    }

    //Napisz metodę która liczy ile jest osób z kolorem wlosow podanym jako parametr
    public static int liczbaOsobOKolorzeOczu(List<Osoba> osoby, KolorOczu kolor) {
        int suma = 0;
        for (Osoba osoba : osoby) {
            if (osoba.getKolorOczu() == kolor) {
                suma++;
            }
        }
        return suma;
    }

    //Napisz metodę która zwraca Osobe o najdluzszym nazwisku z oczami podanymi jako parametr
    public static Osoba osobaZNajdluzszymNazwiskiemOKolorzeOczu(List<Osoba> osoby,KolorOczu kolor) {
        Osoba nowaOsoba = null;
        for (Osoba osoba : osoby) {
            if (nowaOsoba==null ||  osoba.getNazwisko().length() > nowaOsoba.getNazwisko().length()) {
                if (osoba.getKolorOczu() == kolor) {
                    nowaOsoba = osoba;
                }
            }
        }
        return nowaOsoba;
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

    public KolorOczu getKolorOczu() {
        return kolorOczu;
    }

    public void setKolorOczu(KolorOczu kolorOczu) {
        this.kolorOczu = kolorOczu;
    }

    public KolorWlosow getKolorWlosow() {
        return kolorWlosow;
    }

    public void setKolorWlosow(KolorWlosow kolorWlosow) {
        this.kolorWlosow = kolorWlosow;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie= " + imie + '\'' +
                ", nazwisko= '" + nazwisko + '\'' +
                ", kolorOczu= " + kolorOczu +
                ", kolorWlosow= " + kolorWlosow +
                '}';
    }
}
