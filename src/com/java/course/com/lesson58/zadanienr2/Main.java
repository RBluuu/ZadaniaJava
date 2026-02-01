package com.java.course.com.lesson58.zadanienr2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Kucharz kucharz1 = new Kucharz("Anna", "Nowak", "kuchnia włoska", 5);
        Kucharz kucharz2 = new Kucharz("Tomasz", "Wiśniewski", "kuchnia azjatycka", 8);
        Kucharz kucharz3 = new Kucharz("Katarzyna", "Kowalczyk", "kuchnia francuska", 6);


        KonkursKulinarny konkurs1 = new KonkursKulinarny("MasterChef Polska", "Warszawa", LocalDate.of(2023, 5, 10));
        KonkursKulinarny konkurs2 = new KonkursKulinarny("Smaki Europy", "Kraków", LocalDate.of(2022, 9, 18));

        UdzialWKonkursie x1 = new UdzialWKonkursie(kucharz1, konkurs1, 3, "Pizza Margherita", 50);
        UdzialWKonkursie x2 = new UdzialWKonkursie(kucharz2, konkurs1, 2, "Sushi roll", 66);
        UdzialWKonkursie x3 = new UdzialWKonkursie(kucharz3, konkurs1, 1, "Lasagne", 95);
        UdzialWKonkursie x4 = new UdzialWKonkursie(kucharz1, konkurs2, 1, "Ramen", 99);
        UdzialWKonkursie x5 = new UdzialWKonkursie(kucharz2, konkurs2, 3, "Pizza Diabola", 33);
        UdzialWKonkursie x6 = new UdzialWKonkursie(kucharz3, konkurs2, 2, "Schabowy z ziemniaki", 70);

   /*     kucharz1.dodajUdzialKonkursie(x1);
        kucharz2.dodajUdzialKonkursie(x2);
        kucharz3.dodajUdzialKonkursie(x3);
        kucharz1.dodajUdzialKonkursie(x4);
        kucharz2.dodajUdzialKonkursie(x5);
        kucharz3.dodajUdzialKonkursie(x6);

        konkurs1.dodajUdzialWKonkursie(x1);
        konkurs1.dodajUdzialWKonkursie(x2);
        konkurs1.dodajUdzialWKonkursie(x3);
        konkurs2.dodajUdzialWKonkursie(x1);
        konkurs2.dodajUdzialWKonkursie(x2);
        konkurs2.dodajUdzialWKonkursie(x3);*/

        List<UdzialWKonkursie> lista = new ArrayList<>(List.of(x1,x2,x3,x4,x5,x6));
        List<Kucharz> listaKucharzy = new ArrayList<>(List.of(kucharz1,kucharz2,kucharz3));

        System.out.println("Kucharz top1" + Kucharz.miejsceWKonkursie(listaKucharzy,1));
        System.out.println();

        System.out.println("Danie top1 ramen" + Kucharz.wyszukajDanie(listaKucharzy,"ramen"));
        System.out.println();

        System.out.println("Min punktow w konkursie" + UdzialWKonkursie.punktyWKonkursie(listaKucharzy,90));
        System.out.println();

        System.out.println("Udziały w konkursie" + KonkursKulinarny.grupujPoKonkursie(listaKucharzy));
        System.out.println();

        System.out.println("Najwieksza liczba punktow" + Kucharz.najwiekszaLiczbaPunktow(listaKucharzy));
        System.out.println();

        System.out.println("Sortowanie po ilosci Punktow" + UdzialWKonkursie.sortujPoPunktach(listaKucharzy));
        System.out.println();

        System.out.println("Sortowanie po nazwiskach" + UdzialWKonkursie.sortujPoNazwisku(listaKucharzy));
        System.out.println();



    }
}
