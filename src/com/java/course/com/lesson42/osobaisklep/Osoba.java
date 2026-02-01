package com.java.course.com.lesson42.osobaisklep;

import com.java.course.com.lesson42.osobaisklep.exceptions.NoHomoHereException;
import com.java.course.com.lesson42.osobaisklep.exceptions.NoWomenException;

import java.util.ArrayList;
import java.util.List;

public class Osoba {
    // Stworz klase Osoba (imie, nazwisko, miasto, wiek) oraz Sklep (nazwa, miasto)
    // - metoda co zwraca najstarsza kobiete lub NoWomenException jesli brak kobiet na liscie
    // - kobiety chodza do sklepow, mezczyzni nie, zatem powiazania ze sklepem moga miec tylko kobiety, w przypadku próby dodania powiazania mezyczyzna
    //   sklep rzuc wyjatkiem ShopsAreOnlyForWomenException()
    // - osoby moga sie umawiac na randki, ale jestesmy homofobami, nie akceptujemy par homo, dodaj osobie plec
    // przy probie umowienia sie na randke pary homo rzuc wyjatkiem NoHomoHereException()
    // - nasz system przechowuje tylko osoby pełnoletnie, zatem wiek > 18, pryz próbie tworzenia osoby która ma mniej niz 18 lat
    // progarm powinien to naprawic, ustawiajac danej osobie 18 lat
    private String imie;
    private String nazwisko;
    private String miasto;
    private int wiek;
    private String plec;

    public Osoba(String imie, String nazwisko, String miasto, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.wiek = wiek;
    }

    public Osoba(String imie, String nazwisko, String miasto, int wiek, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.wiek = wiek;
        if (wiek < 18) {
            setWiek(18);
        }
        this.plec = plec;
    }

    // metoda co zwraca najstarsza kobiete lub NoWomenException jesli brak kobiet na liscie
    public static Osoba najstarszaKobieta(List<Osoba> osoby) throws NoWomenException {
        Osoba najstarszaOsoba = null;
        Osoba czlowiek = osoby.get(0);
        for (Osoba osoba : osoby) {
            if (osoba.imie.endsWith("a")) {
                if (osoba.wiek > czlowiek.wiek || najstarszaOsoba == null) {
                    najstarszaOsoba = osoba;
                }
            }
            if (najstarszaOsoba == null) {
                throw new NoWomenException("Na liście nie ma żadnych kobiet.");
                }
            }
        return najstarszaOsoba;
    }

    // - osoby moga sie umawiac na randki, ale jestesmy homofobami, nie akceptujemy par homo, dodaj osobie plec
    // przy probie umowienia sie na randke pary homo rzuc wyjatkiem NoHomoHereException()
    //Poprawic na nastepene
    public static String randka(Osoba osoba1,Osoba osoba2) throws NoHomoHereException {
        String para = "udalo sie mozecie byc para";
        if (osoba1.getPlec().equals(osoba2.getPlec())) {
            throw new NoHomoHereException("homo nie akceptujemy");
        }
        return para;
    }

    // - nasz system przechowuje tylko osoby pełnoletnie, zatem wiek > 18, pryz próbie tworzenia osoby która ma mniej niz 18 lat
    // progarm powinien to naprawic, ustawiajac danej osobie 18 lat
    public static List<Osoba> sprawdzanieWieku(List<Osoba> osoby) {
        List<Osoba> newList = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba.wiek < 18) {
                osoba.setWiek(18);
            }
            newList.add(osoba);
        }
        return newList;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
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

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miasto='" + miasto + '\'' +
                ", wiek=" + wiek +
                ", plec='" + plec + '\'' +
                '}';
    }
}
