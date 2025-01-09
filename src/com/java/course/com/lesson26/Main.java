package com.java.course.com.lesson26;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Dziedziczenie - ok
        //Hermetyzacja - gettery settery
        //Abstracja
        //Polimorfizm


        //Produkt(nazwa,cena,krajPochodzenia)

        Produkt rower = new Rower("Kross", 1500,"Polska","Cross");
        Telefon telefon = new Telefon("Apple", 5000, "USA","13");
        Telefon telefon1 = new Telefon("Nokia", 200, "Chiny","16");
        Telefon telefon2 = new Telefon("Samsung", 3000, "Hiszpania","14");
        Produkt telewizor = new Telewizor("Sony", 3900, "Niemcy","LS564");
        Produkt telewizor2 = new Telewizor("Sony", 5500, "Niemcy","MC369");
        Produkt telewizor3 = new Telewizor("Sony", 6999, "Niemcy","XB299");
        Produkt telewizor4 = new Telewizor("Toshiba", 2999, "Chiny","XB299");
        Produkt telewizor5 = new Telewizor("Toshiba", 2899, "Chiny","GB4652");
        Produkt telewizor6 = new Telewizor("Toshiba", 2649, "Chiny","TW46529");



        //telefon.setCena(2131);
        //telefon.setCena(-444);
        //System.out.println(telefon.getCena());


        //telefon.getCena(); = 2400;
        //telefon.setCena(); = 2400;

        //System.out.println(telefon.setCena(111));
        System.out.println(telefon.getCena());

        //telefon.getCena(213213);

        double cenaMojegoTelefonu = telefon.getCena();
        //double cenaTElefonu = telefon.setCena(12312);

        System.out.println(telefon);
        System.out.println(telewizor);
        System.out.println();


        System.out.println("Najdrozszy produkt = " + Produkt.najdrozszyProduktZListy(List.of(rower,telefon,telefon1,telefon2,telewizor,telefon1,telewizor2,telewizor3,telewizor4,telewizor5,telewizor6)));
        System.out.println();

        System.out.println("Srednia cena telefonow = " + Telefon.sredniaCenaTelefonu(List.of(telefon,telefon1,telefon2)));
        System.out.println();

        System.out.println("Suma cen produktow = " + Produkt.sumaCenProduktow(List.of(rower,telefon,telefon1,telefon2,telewizor,telefon1,telewizor2,telewizor3,telewizor4,telewizor5,telewizor6)));
        System.out.println();

        System.out.println("Produkt z Polski = " + Produkt.produktZPolski(List.of(rower,telefon,telefon1,telefon2,telewizor,telefon1,telewizor2),"Polska"));
        System.out.println("Grupowane z Polski = " + Produkt.grupoweaniePoProducentach(List.of(rower,telefon,telefon1,telefon2,telewizor,telefon1,telewizor2)));











    }
}
//0. Napisac i wyjasnic funkcje quicksort(List<Ingerger> numbers) - z pomocą, ale zeby bylo wiadomo co sie dzieje
