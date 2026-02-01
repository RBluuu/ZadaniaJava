package com.java.course.com.lesson44and45;

import com.java.course.com.projektwycieczka.model.Trip;

import java.util.List;

public class Przewodnik {
    private List<String> listaJezykowObcych;
    private List<Trip> listaWycieczek;

    //Jeżeli mamy jeden do wiele, to tworzymy funkcje np. przypiszPrzewodnika w klasie Wycieczka
    //i dopiero tam ustawiamy obiekty asocjacji
    /*public Przewodnik(String imie, String nazwisko, String email, int numerTelefonu, int pensjaMinimalna, int liczbaPrzeparacowanychGodzin, List<String> listaJezykowObcych) {
        //super(imie, nazwisko, email, numerTelefonu, pensjaMinimalna, liczbaPrzeparacowanychGodzin);
        this.listaJezykowObcych = listaJezykowObcych;
        this.listaWycieczek = new ArrayList<>();
    }


     */

    public List<String> getListaJezykowObcych() {
        return listaJezykowObcych;
    }

    public void setListaJezykowObcych(List<String> listaJezykowObcych) {
        this.listaJezykowObcych = listaJezykowObcych;
    }

    public List<Trip> getListaWycieczek() {
        return listaWycieczek;
    }

    public void setListaWycieczek(List<Trip> listaWycieczek) {
        this.listaWycieczek = listaWycieczek;
    }

    @Override
    public String toString() {
        return "Przewodnik{" +
                "listaJezykowObcych=" + listaJezykowObcych +
                ", listaWycieczek=" + listaWycieczek +
                '}';
    }
}
