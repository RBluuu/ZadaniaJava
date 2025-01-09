package com.java.course.com.lesson41.zadaniedyplom;

public class Ocena {
    private Przedmiot przedmiot;
    private double wartosc;

    public Ocena(Przedmiot przedmiot, double wartosc) {
        this.przedmiot = przedmiot;
        this.wartosc = wartosc;
    }

    public Przedmiot getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(Przedmiot przedmiot) {
        this.przedmiot = przedmiot;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    @Override
    public String toString() {
        return "Ocena{" +
                "przedmiot=" + przedmiot +
                ", wartosc=" + wartosc +
                '}';
    }
}
