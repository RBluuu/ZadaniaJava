package com.java.course.com.lesson53;

import java.util.Comparator;
import java.util.List;

public class Osoba {
    //modyfikatory dostępu
    //public
    //private
    //default/package-private
    private final String imie;
    private String nazwisko;
    private int wiek;

    //funkcje klasowe/obiektowe

    public  void przywitajSie(){
        System.out.println("Dzien dobry, mam na imie " + this.imie);
    }

    public static Osoba znajdzNajstarsza(List<Osoba> osoby){
        return osoby.stream()
                .max(Comparator.comparingInt(o -> o.getWiek()))
                .orElseThrow();
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }


    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
