package com.java.course.com.lesson58.zadanianr1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Festiwal {
    private String nazwa;
    private String miasto;
    private LocalDate dataRozpoczecia;
    private List<Koncert> listaKoncertow = new ArrayList<>();

    public Festiwal(String nazwa, String miasto, LocalDate dataRozpoczecia) {
        this.nazwa = nazwa;
        this.miasto = miasto;
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public void addKoncert(Koncert koncert) {
        if (koncert == null) {
            throw new IllegalArgumentException();
        }
        listaKoncertow.add(koncert);
        koncert.setFestiwal(this);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public LocalDate getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(LocalDate dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public List<Koncert> getListaKoncertow() {
        return listaKoncertow;
    }

    public void setListaKoncertow(List<Koncert> listaKoncertow) {
        this.listaKoncertow = listaKoncertow;
    }

    @Override
    public String toString() {
        return "Festiwal{" +
                "nazwa='" + nazwa + '\'' +
                ", miasto='" + miasto + '\'' +
                ", dataRozpoczecia=" + dataRozpoczecia +
                ", listaKoncertow=" + listaKoncertow +
                '}';
    }
}
