package com.java.course.com.lesson44and45.zadanienr2;

public class Jablko {
    private Object nazwa;
    private Object ilosc;

    public Jablko(Object nazwa, Object ilosc) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
    }

    public Object getNazwa() {
        return nazwa;
    }

    public void setNazwa(Object nazwa) {
        this.nazwa = nazwa;
    }

    public Object getIlosc() {
        return ilosc;
    }

    public void setIlosc(Object ilosc) {
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return "Jablko{" +
                "nazwa=" + nazwa +
                ", ilosc=" + ilosc +
                '}';
    }
}
