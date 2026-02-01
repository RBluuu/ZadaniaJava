package com.java.course.com.lesson42.osobaisklep;

import com.java.course.com.lesson42.osobaisklep.exceptions.ShopsAreOnlyForWomenException;

import java.util.ArrayList;
import java.util.List;

public class Sklep {
    // Stworz klase Osoba (imie, nazwisko, miasto, wiek) oraz Sklep (nazwa, miasto)
    // - metoda co zwraca najstarsza kobiete lub NoWomenException jesli brak kobiet na liscie
    // - kobiety chodza do sklepow, mezczyzni nie, zatem powiazania ze sklepem moga miec tylko kobiety, w przypadku próby dodania powiazania mezyczyzna
    //   sklep rzuc wyjatkiem ShopsAreOnlyForWomenException()
    // - osoby moga sie umawiac na randki, ale jestesmy homofobami, nie akceptujemy par homo, dodaj osobie plec
    // przy probie umowienia sie na randke pary homo rzuc wyjatkiem NoHomoHereException()
    // - nasz system przechowuje tylko osoby pełnoletnie, zatem wiek > 18, pryz próbie tworzenia osoby która ma mniej niz 18 lat
    // progarm powinien to naprawic, ustawiajac danej osobie 18 lat
    private String nazwa;
    private String miasto;
    private List<Osoba> klienci;

    public Sklep(String nazwa, String miasto) {
        this.nazwa = nazwa;
        this.miasto = miasto;
        this.klienci = new ArrayList<>();
    }


    /*public void dodajKlienta(Osoba osoba) throws ShopsAreOnlyForWomenException {
        if (!osoba.isKobieta()) {
            throw new ShopsAreOnlyForWomenException("Sklepy są dostępne tylko dla kobiet!");
        }
        klienci.add(osoba);
    }

     */

    // - kobiety chodza do sklepow, mezczyzni nie, zatem powiazania ze sklepem moga miec tylko kobiety, w przypadku próby dodania powiazania mezyczyzna
    //   sklep rzuc wyjatkiem ShopsAreOnlyForWomenException()
    public void dodajKlienta(Osoba osoba) throws ShopsAreOnlyForWomenException {
        if (osoba.getImie().endsWith("a")) {
            klienci.add(osoba);
        } else{
            throw new ShopsAreOnlyForWomenException("Sklepy są dostępne tylko dla kobiet!");
        }
    }

    public List<Osoba> getKlienci() {
        return klienci;
    }

    public void setKlienci(List<Osoba> klienci) {
        this.klienci = klienci;
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

    @Override
    public String toString() {
        return "Sklep{" +
                "nazwa='" + nazwa + '\'' +
                ", miasto='" + miasto + '\'' +
                ", klienci=" + klienci +
                '}';
    }
}
