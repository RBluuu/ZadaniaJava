package com.java.course.com.lesson58.zadanienr2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KonkursKulinarny {
    /*
    nazwa konkursu,

        lokalizacja,

        rok edycji,

        lista uczestniczących kucharzy (z dodatkowymi informacjami).

        Dodatkowe informacje dla każdego udziału kucharza w konkursie (czyli atrybut):
        zdobyte miejsce (np. 1., 2., 3.),

        przygotowane danie,

        liczba punktów przyznana przez jury.

     */
    private String nazwaKonkursu;
    private String lokalizacja;
    private LocalDate rokEdycji;
    private List<UdzialWKonkursie> uczesnicy = new ArrayList<>();

    public KonkursKulinarny(String nazwaKonkursu, String lokalizacja, LocalDate rokEdycji) {
        this.nazwaKonkursu = nazwaKonkursu;
        this.lokalizacja = lokalizacja;
        this.rokEdycji = rokEdycji;
    }


    public static Map<KonkursKulinarny, List<UdzialWKonkursie>> grupujPoKonkursie(List<Kucharz> kucharze) {
        return kucharze.stream()
                .flatMap(k -> k.getListaKonkurow().stream())
                .collect(Collectors.groupingBy(UdzialWKonkursie::getKonkurs));
    }

    public String getNazwaKonkursu() {
        return nazwaKonkursu;
    }

    public void setNazwaKonkursu(String nazwaKonkursu) {
        this.nazwaKonkursu = nazwaKonkursu;
    }

    public String getLokalizacja() {
        return lokalizacja;
    }

    public void setLokalizacja(String lokalizacja) {
        this.lokalizacja = lokalizacja;
    }

    public LocalDate getRokEdycji() {
        return rokEdycji;
    }

    public void setRokEdycji(LocalDate rokEdycji) {
        this.rokEdycji = rokEdycji;
    }

    public List<UdzialWKonkursie> getUczesnicy() {
        return uczesnicy;
    }

    public void setUczesnicy(List<UdzialWKonkursie> uczesnicy) {
        this.uczesnicy = uczesnicy;
    }

    @Override
    public String toString() {
        return "KonkursKulinarny{" +
                "nazwaKonkursu='" + nazwaKonkursu + '\'' +
                ", lokalizacja='" + lokalizacja + '\'' +
                ", rokEdycji=" + rokEdycji +
                ", uczesnicy=" + uczesnicy +
                '}';
    }
}
