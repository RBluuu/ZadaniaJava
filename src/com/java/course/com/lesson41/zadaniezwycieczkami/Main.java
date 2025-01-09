package com.java.course.com.lesson41.zadaniezwycieczkami;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
         * Stwórz klase klient i wycieczka, klient moze miec wiele wycieczek, wycieczka
         * moze miec wielu klientow. Wycieczka ma nazwe, krajx, cena i liste dodatkow
         * (kazdy jest dodatkowo platny) Znadz klienta który wydal najwiecej na dodatki
         * do wycieczki uwzgledniajac tez cene wycieczki Znadz klienta który wydal
         * najwiecej na dodatki do wycieczki nieuwzgledniajac tez ceny wycieczki
         */

        Klient radek = new Klient("Radek","Blauciak");
        Klient marek = new Klient("Marek","Nowak");
        Klient darek = new Klient("Darek","Kowalski");
        Klient mirek = new Klient("Mirek","Podolski");

        Wycieczka zakopane = new Wycieczka("Zakopane","Polska",3000);
        Wycieczka gdansk = new Wycieczka("Gdansk","Polska",5000);
        Wycieczka wroclaw = new Wycieczka("Wroclaw","Polska",4500);
        Wycieczka warszawa = new Wycieczka("Warszawa","Polska",6000);

        zakopane.dodajDodatek(Dodatki.WYPORZYCZENIEAUTA);
        gdansk.dodajDodatek(Dodatki.ZWIEDZANIEMUZEUM);
        wroclaw.dodajDodatek(Dodatki.ZWIEDZANIESKUTERAMI);
        warszawa.dodajDodatek(Dodatki.ZWIEDZANIEMUZEUM);
        warszawa.dodajDodatek(Dodatki.ZWIEDZANIESKUTERAMI);


        radek.dodajWycieczke(zakopane);
        radek.dodajWycieczke(warszawa);
        radek.dodajWycieczke(gdansk);

        marek.dodajWycieczke(wroclaw);

        darek.dodajWycieczke(zakopane);
        darek.dodajWycieczke(warszawa);

        mirek.dodajWycieczke(gdansk);


    }
}
