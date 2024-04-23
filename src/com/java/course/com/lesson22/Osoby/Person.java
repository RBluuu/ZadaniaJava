package com.java.course.com.lesson22.Osoby;

public abstract class Person {
    protected int pensja;
    private String imie;
    private String nazwisko;

    public Person(int pensja, String imie, String nazwisko) {
        this.pensja = pensja;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przywitajSie() {
        System.out.println("Dzien Dobry");
    }

    public abstract void pozegnajSie();

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
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
}
