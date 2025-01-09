package com.java.course.com.lesson41.zadaniedyplom;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dyplom {
    private String imie;
    private String nazwisko;
    private LocalDate dataWystawienia;
    private List<Ocena> oceny;

    public Dyplom(String imie, String nazwisko, LocalDate dataWystawienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataWystawienia = dataWystawienia;
        this.oceny = new ArrayList<>();
    }

    public void dodajOcene(Ocena ocena) {
        oceny.add(ocena);
    }

    public double srednia() {
        double suma = 0;
        double srednia = 0;
        for (Ocena ocena : this.oceny) {
            suma+= ocena.getWartosc();
            srednia = suma / this.oceny.size();
        }
        return srednia;
    }

    //znajdz dyplom z najwieksza srednia
    public static Dyplom znajdzDyplomZNajwiekszaSrednia(List<Dyplom> dyplomy) {
        Dyplom najlepszyDyplom = null;
        double najwyzszaSrednia = 0;
        for (Dyplom dyplom : dyplomy) {
            double srednia = dyplom.srednia();
            if (srednia > najwyzszaSrednia) {
                najwyzszaSrednia = srednia;
                najlepszyDyplom = dyplom;
            }
        }
        return najlepszyDyplom;
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

    public LocalDate getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(LocalDate dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    public List<Ocena> getOceny() {
        return oceny;
    }

    public void setOceny(List<Ocena> oceny) {
        this.oceny = oceny;
    }

    @Override
    public String toString() {
        return "Dyplom{" +
                "imie= " + imie + '\'' +
                ", nazwisko= " + nazwisko + '\'' +
                ", dataWystawienia= " + dataWystawienia +
                ", oceny= " + oceny +
                '}';
    }
}
