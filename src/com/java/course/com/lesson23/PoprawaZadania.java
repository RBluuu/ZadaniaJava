package com.java.course.com.lesson23;

import java.util.ArrayList;
import java.util.List;

public class PoprawaZadania {
    public static void main(String[] args) {
        Produkt arbuz = new Produkt("Arbuz",2,5);
        Produkt bulka = new Produkt("Bulka",4,0.50);
        Produkt woda = new Produkt("Woda",2,1.50);

        Koszyk koszyk = new Koszyk(List.of(arbuz,bulka,woda));
        System.out.println("Cena produktow = " + koszyk.cenaKoszyka());

        Przelew przelew = new Przelew();
        System.out.println("Rodzaj platnosci " + koszyk.cenaPoDodaniuPlatnosciV2(przelew));

        ZaPobraniem pobranie = new ZaPobraniem();
        System.out.println(koszyk.cenaPoDodaniuPlatnosciV2(pobranie));


        //KartaLojalnosciowa -> zaawsze masz 15% znizki a jak zakupy >400 to 20%
        //https://refactoring.guru/pl/design-patterns/strategy

        System.out.println();
        Koszyk radek = new Koszyk(new ArrayList<>(List.of(arbuz,bulka,woda,woda,arbuz)));
        System.out.println(radek);

        for (Produkt produkt : radek.getProdukty()) {
            System.out.println(produkt.getNazwa());
        }
        System.out.println(radek.listaPoUsunieciu("Arbuz"));

        for (Produkt produkt : radek.getProdukty()) {
            System.out.println(produkt.getNazwa());
        }
    }
}
