package com.java.course.com.lesson58.zadanienr2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UdzialWKonkursie {
    private Kucharz kucharz; //final
    private KonkursKulinarny konkurs;//final
    private int miejsce;
    private String danie;
    private int liczbaPunktow;

    public UdzialWKonkursie(Kucharz kucharz, KonkursKulinarny konkurs, int miejsce, String danie, int liczbaPunktow) {
        this.kucharz = kucharz;
        this.konkurs = konkurs;
        this.miejsce = miejsce;
        this.danie = danie;
        this.liczbaPunktow = liczbaPunktow;
        kucharz.getListaKonkurow().add(this);
        konkurs.getUczesnicy().add(this);
    }

    public static List<UdzialWKonkursie> punktyWKonkursie(List<Kucharz> kucharze, int minPunktow) {
        return kucharze.stream()
                .flatMap(k -> k.getListaKonkurow().stream())
                .filter(u -> u.getLiczbaPunktow() > minPunktow)
                .collect(Collectors.toList());
    }

    public static List<UdzialWKonkursie> sortujPoPunktach(List<Kucharz> kucharze) {
        return kucharze.stream()
                .flatMap(k -> k.getListaKonkurow().stream())
                .sorted(Comparator.comparingInt(UdzialWKonkursie::getLiczbaPunktow))
                .collect(Collectors.toList());
    }

    public static List<UdzialWKonkursie> sortujPoNazwisku(List<Kucharz> kucharze) {
        return kucharze.stream()
                .flatMap(k -> k.getListaKonkurow().stream())
                .sorted(Comparator.comparing(u -> u.getKucharz().getNazwisko()))
                .collect(Collectors.toList());
    }

    public Kucharz getKucharz() {
        return kucharz;
    }

    public void setKucharz(Kucharz kucharz) {
        this.kucharz = kucharz;
    }

    public KonkursKulinarny getKonkurs() {
        return konkurs;
    }

    public void setKonkurs(KonkursKulinarny konkurs) {
        this.konkurs = konkurs;
    }

    public int getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(int miejsce) {
        this.miejsce = miejsce;
    }

    public String getDanie() {
        return danie;
    }

    public void setDanie(String danie) {
        this.danie = danie;
    }

    public int getLiczbaPunktow() {
        return liczbaPunktow;
    }

    public void setLiczbaPunktow(int liczbaPunktow) {
        this.liczbaPunktow = liczbaPunktow;
    }
    @Override
    public String toString() {
        return "UdzialWKonkursie{" +
                ", miejsce=" + miejsce +
                ", danie='" + danie + '\'' +
                ", liczbaPunktow=" + liczbaPunktow +
                '}';
    }
}
