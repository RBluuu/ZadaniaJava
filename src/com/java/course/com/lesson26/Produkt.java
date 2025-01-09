package com.java.course.com.lesson26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Produkt {
    ////Produkt(nazwa,cena,krajPochodzenia)
    private String producent;
    private double cena;
    private String krajPochodzenia;
    private String model;


    public Produkt(String producent, double cena, String krajPochodzenia, String model) {
        this.producent = producent;
        this.cena = cena;
        this.krajPochodzenia = krajPochodzenia;
        this.model = model;
    }

    //-znajdz najdrozszy produkt
    public static Produkt najdrozszyProduktZListy(List<Produkt> produkty) {
        double najdrozszy = 0;
        Produkt maxCena = null;
        for (Produkt produkt : produkty) {
            if (produkt.cena > najdrozszy) {
                najdrozszy = produkt.cena;
                maxCena = produkt;
            }
        }
        return maxCena;
    }

    //przyjmij liste produktow i zwroc pierwsy produkt z polski
    public static Produkt produktZPolski(List<Produkt> produkty, String krajProduktu) {
        Produkt zPolski = null;
        for (Produkt produkt : produkty) {
            if (produkt.krajPochodzenia.equals(krajProduktu)) {
                zPolski = produkt;
            }
        }
        return zPolski;
    }

    //-znajdz ssrednia cene telefonow
    public static double sredniaCenaTelefonu(List<Telefon> telefony) {
        double sredniaCena = 0;
        for (Telefon telefon : telefony) {
            sredniaCena += telefon.getCena();
            System.out.println(sredniaCena);
        }
        System.out.println();
        System.out.println(sredniaCena);
        System.out.println(telefony.size());
        System.out.println(sredniaCena / telefony.size());
        return sredniaCena / telefony.size();
    }

    //-oblicz sume cen produktow
    public static double sumaCenProduktow(List<Produkt> produkty) {
        double suma = 0;
        for (Produkt produkt : produkty) {
            suma += produkt.cena;
        }
        return suma;
    }

    /*//-pogrupuj telewizory po producentach (samsung-lc1123,re22121,4223111 sony-e3ee23,323,322 toshiba-3232,323,23) Map<String,List<Product>>
    public Map<String, List<Produkt>> grupowanieProduktowPoProducencie(List<Produkt> produkty, String nazwaProducenta) {
        Map<String,List<Produkt>> nowaMapa = new HashMap<>();
        for (Produkt produkt : produkty) {
            if (produkt.producent.equals(nazwaProducenta)) {
                nowaMapa.put(produkt.producent, produkt.model);
            }
        }
        return nowaMapa;
    }
     */

    public static Map<String, List<Produkt>> grupoweaniePoProducentach(List<Produkt> produkty) {
        Map<String, List<Produkt>> nowaMapa = new HashMap<>();
        //1. przejsc przez liste produktow
        //2. zczytac producenta
        //3. i dodac do listy pod odpowiednim kluczem

        for (Produkt produkt : produkty) {
            String producent = produkt.getProducent();
            List<Produkt> produktyTegoProducenta = nowaMapa.getOrDefault(producent, new ArrayList<>());
            produktyTegoProducenta.add(produkt);
            nowaMapa.put(producent, produktyTegoProducenta);
        }
        return nowaMapa;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena > 0) {
            this.cena = cena;
        }
    }

    public String getKrajPochodzenia() {
        return krajPochodzenia;
    }

    public void setKrajPochodzenia(String krajPochodzenia) {
        this.krajPochodzenia = krajPochodzenia;
    }


    @Override
    public String toString() {
        return "Produkt: " +
                "nazwa= " + producent + '\'' +
                ", cena= " + cena +
                ", krajPochodzenia= " + krajPochodzenia + '\'' +
                ", model= " + model;
    }
    // public static ??? top3NajdrozszeProdukty(){


    //Napisz funkcje
    //-znajdz najdrozszy produkt - zrobione
    //-znajdz ssrednia cene telefonow - zrobione
    //-oblicz sume cen produktow - zrobione
    //-pogrupuj telewizory po producentach (samsung-lc1123,re22121,4223111 sony-e3ee23,323,322 toshiba-3232,323,23) Map<String,List<Product>>


}