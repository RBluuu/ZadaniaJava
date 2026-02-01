package com.java.course.com.lesson47;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Klasa{

    // W systemie przechowujemy nazwe klasy (szkolnej, np 1a, 2b) oraz listę osób
    // (same nazwiska jako Stringi) które uczeszczaja do klasy.
    // 1) Napisz metode ktora zwraca liste osob o najdluzszych nazwiskach z kazdej klasy
    // 2) Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas
    private String klasa;
    private List<Uczen> uczniowie;

    public Klasa(String klasa, List<Uczen> uczniowie) {
        this.klasa = klasa;
        this.uczniowie = uczniowie;
    }

    public static Map<Klasa,List<Uczen>> listaNajdluzszychNazwiskWKazdejKlasie(List<Klasa> klasy) {
        Map<Klasa,List<Uczen>> lista = new HashMap<>();
        int najdluzszeNazwisko = 0;
        for (Klasa klasa1 : klasy) {
            List<Uczen> uczniowie = klasa1.getUczniowie();
            for (Uczen uczen : klasa1.getUczniowie()) {
                int dlugosc = uczen.getNazwisko().length();
                if (dlugosc > najdluzszeNazwisko) {
                    najdluzszeNazwisko = dlugosc;
                }
            }
            List<Uczen> listaNajdluzszych = new ArrayList<>();
            for (Uczen uczen : uczniowie) {
                if (uczen.getNazwisko().length() == najdluzszeNazwisko) {
                    listaNajdluzszych.add(uczen);
                }
            }
            lista.put(klasa1, listaNajdluzszych);
        }
        return lista;
    }

    public static Uczen najdluzszeNazwisko(List<Klasa> klasy) {
        Uczen najdluzszeNazwisko = null;
        for (Klasa klasa : klasy) {
            for (Uczen uczen : klasa.getUczniowie()) {
                if (najdluzszeNazwisko == null || uczen.getNazwisko().length() > najdluzszeNazwisko.getNazwisko().length()) {
                    najdluzszeNazwisko = uczen;
                }
            }
        }
        return najdluzszeNazwisko;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public List<Uczen> getUczniowie() {
        return uczniowie;
    }

    public void setUczniowie(List<Uczen> uczniowie) {
        this.uczniowie = uczniowie;
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "klasa='" + klasa + '\'' +
                ", uczniowie=" + uczniowie +
                '}';
    }
}
