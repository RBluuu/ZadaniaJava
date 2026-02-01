package com.java.course.com.lesson58.zadanienr2;

import java.util.*;
import java.util.stream.Collectors;

public class Kucharz {
    private String imie;
    private String nazwisko;
    private String rodzajSpecjalizacji;
    private int lataDoswiadczen;
    private List<UdzialWKonkursie> listaKonkurow = new ArrayList<>();

    public Kucharz(String imie, String nazwisko, String rodzajSpecjalizacji, int lataDoswiadczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rodzajSpecjalizacji = rodzajSpecjalizacji;
        this.lataDoswiadczen = lataDoswiadczen;
    }

    //public static Kuchach znadzKucharzaPoIlosciPunktow
    public static Kucharz znajdzKucharzaPoIlosciPunktow(List<Kucharz> list, int iloscPunktow) {
        return list.stream()
                .flatMap(k -> k.getListaKonkurow().stream())
                .filter(x -> x.getLiczbaPunktow() > iloscPunktow)
                .map(UdzialWKonkursie::getKucharz)
                .findFirst().orElseThrow(NoSuchElementException::new);
    }

    public static List<Kucharz> miejsceWKonkursie(List<Kucharz> kucharze, int miejsce) {
        return kucharze.stream()
                .filter(k -> k.getListaKonkurow().stream().anyMatch(u -> u.getMiejsce() == miejsce))
                .collect(Collectors.toList());
    }

    public static List<Kucharz> wyszukajDanie(List<Kucharz> kucharze, String nazwaDania) {
        return kucharze.stream()
                .filter(k -> k.getListaKonkurow().stream().anyMatch(u -> u.getDanie().equalsIgnoreCase(nazwaDania)))
                .collect(Collectors.toList());
    }

    public static Optional<UdzialWKonkursie> najwiekszaLiczbaPunktow(List<Kucharz> kucharze) {
        return kucharze.stream()
                .flatMap(k -> k.getListaKonkurow().stream())
                .max(Comparator.comparingInt(UdzialWKonkursie::getLiczbaPunktow));
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

    public String getRodzajSpecjalizacji() {
        return rodzajSpecjalizacji;
    }

    public void setRodzajSpecjalizacji(String rodzajSpecjalizacji) {
        this.rodzajSpecjalizacji = rodzajSpecjalizacji;
    }

    public int getLataDoswiadczen() {
        return lataDoswiadczen;
    }

    public void setLataDoswiadczen(int lataDoswiadczen) {
        this.lataDoswiadczen = lataDoswiadczen;
    }

    public List<UdzialWKonkursie> getListaKonkurow() {
        return listaKonkurow;
    }

    public void setListaKonkurow(List<UdzialWKonkursie> listaKonkurow) {
        this.listaKonkurow = listaKonkurow;
    }

    @Override
    public String toString() {
        return "Kucharz{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rodzajSpecjalizacji='" + rodzajSpecjalizacji + '\'' +
                ", lataDoswiadczen=" + lataDoswiadczen +
                ", listaKonkurow=" + listaKonkurow +
                '}';
    }
}
