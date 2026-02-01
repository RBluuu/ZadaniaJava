package com.java.course.com.lesson47;

public class Uczen {
    private String nazwisko;

    public Uczen(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
