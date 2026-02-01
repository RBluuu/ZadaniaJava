package com.java.course.com.lesson42.klientiprodukt;

import java.util.ArrayList;
import java.util.List;

public class Klient {
    //Stworz asocjacje pomiedzy klientem i produktem 1-*. Obsluz sytuacje gdy produkt jest nullem, wtedy automatycznie ustwiamy
    //klientowi ze zamowil lamborghini za 10000000
    //zamow(Produkt) -> jezeli produk to null to dodajemy mu lamborghini
    private String imie;
    private String nazwisko;
    private String miasto;
    private List<Produkt> listaProduktow;

    public Klient(String imie, String nazwisko, String miasto) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.listaProduktow = new ArrayList<>();
    }

    public void zamow(Produkt artykul) {
        if (artykul == null) {
            artykul = new Produkt("Lamborghini",10000000L,1);
        }
        listaProduktow.add(artykul);
        System.out.println(artykul);
    }

    public List<Produkt> getListaProduktow() {
        return listaProduktow;
    }

    public void setListaProduktow(List<Produkt> listaProduktow) {
        this.listaProduktow = listaProduktow;
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

    @Override
    public String toString() {
        return "Klient{" +
                "nazwaProduktu='" + imie + '\'' +
                ", cena=" + nazwisko +
                ", ilosc=" + miasto +
                '}';
    }
}
