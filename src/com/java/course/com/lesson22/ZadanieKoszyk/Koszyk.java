package com.java.course.com.lesson22.ZadanieKoszyk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Koszyk {
    private String produkty;
    private int ilosc;
    private double cena;

    public Koszyk(String produkty, int ilosc, double cena) {
        this.produkty = produkty;
        this.ilosc = ilosc;
        this.cena = cena;
    }

    public String Produkty() {
        return produkty;
    }

    public int Ilosc() {
        return ilosc;
    }

    public double Cena() {
        return cena;
    }

    public static double rodzajPlatnosci(List<Koszyk> listaProduktow,String rodzaj) {
        String karta = "karta";
        String przelew = "przelew";
        String pobranie = "pobranie";
        double kosztKarty = 0;
        double kosztPrzelewu = 0;
        double kosztPobrania = 10;
        double suma = 0;
        double sumaCalkowita = 0;
        for (Koszyk produkt : listaProduktow) {
            //ifologia
            if (rodzaj.equals(karta)) {
                suma += produkt.cena * produkt.ilosc;
                kosztKarty = (suma / 100) * 2;
                sumaCalkowita = suma + kosztKarty;
            } else if (rodzaj.equals(przelew)) {
                suma += produkt.cena * produkt.ilosc;
                kosztPrzelewu = (suma / 100) * 3;
                sumaCalkowita = suma + kosztKarty;
            } else if (rodzaj.equals(pobranie)) {
                suma += produkt.cena * produkt.ilosc;
                sumaCalkowita = suma + kosztPobrania;
            }
        }
        return sumaCalkowita;
    }

    public static List<Koszyk> usuwanie(List<Koszyk> listaProduktow, String sprzet) {
        List<Koszyk> nowaLista = new ArrayList<>(listaProduktow);
        for (Koszyk produkty : nowaLista) {
            if (produkty.produkty.equals(sprzet)) {
                nowaLista.remove(sprzet);
            }
        }
        return nowaLista;
    }

    public static List<Koszyk> dodawanie(List<Koszyk> listaProduktow, String sprzet) {
        List<Koszyk> nowaLista = new ArrayList<>(listaProduktow);
        for (Iterator<Koszyk> produkty = nowaLista.iterator(); produkty.hasNext();) {
            Koszyk nastpeny = produkty.next();
            if (produkty.equals(sprzet)) {
                nowaLista.add(nastpeny);
            }
        }
        return nowaLista;
    }





}

