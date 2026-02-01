package com.java.course.com.lesson44and45.zadanienr2;

public class KoszJablek {
    private Object nazwa;
    private Jablko jablka;

    public KoszJablek(Object nazwa, Jablko jablka) {
        this.nazwa = nazwa;
        this.jablka = jablka;
    }

    public Object getNazwa() {
        return nazwa;
    }

    public void setNazwa(Object nazwa) {
        this.nazwa = nazwa;
    }

    public Jablko getJablka() {
        return jablka;
    }

    public void setJablka(Jablko jablka) {
        this.jablka = jablka;
    }

    @Override
    public String toString() {
        return "KoszJablek{" +
                "nazwa=" + nazwa +
                ", jablka=" + jablka +
                '}';
    }
}
