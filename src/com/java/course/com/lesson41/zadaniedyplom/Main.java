package com.java.course.com.lesson41.zadaniedyplom;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Stworz klase Dyplom ktora posiada imie i nazwisko, date wystawienia, na
        // dyplomie znajduja sie oceny z przedmiotow(lista klasy Ocena, gdzie ocena ma wartosc i nazwe przedmiotu)
        // stworz kilka dyplomow, znajdz dyplom z najwieksza srednia

        List<Dyplom> dyplomy = new ArrayList<>();

        Dyplom dyplom1 = new Dyplom("Jan", "Kowalski", LocalDate.of(2023, 6, 15));
        dyplom1.dodajOcene(new Ocena(Przedmiot.MATEMATYKA, 5.0));
        dyplom1.dodajOcene(new Ocena(Przedmiot.POLSKI, 4.0));
        dyplom1.dodajOcene(new Ocena(Przedmiot.FIZYKA, 5.0));
        dyplomy.add(dyplom1);
        System.out.println(dyplom1);
        System.out.println();

        Dyplom dyplom2 = new Dyplom("Anna", "Nowak", LocalDate.of(2023, 6, 15));
        dyplom2.dodajOcene(new Ocena(Przedmiot.MATEMATYKA, 4.5));
        dyplom2.dodajOcene(new Ocena(Przedmiot.POLSKI, 5.0));
        dyplom2.dodajOcene(new Ocena(Przedmiot.CHEMIA, 4.0));
        dyplomy.add(dyplom2);
        System.out.println(dyplom2);
        System.out.println();

        Dyplom dyplom3 = new Dyplom("Piotr", "Krawczyk", LocalDate.of(2023, 6, 15));
        dyplom3.dodajOcene(new Ocena(Przedmiot.POLSKI, 3.5));
        dyplom3.dodajOcene(new Ocena(Przedmiot.FIZYKA, 4.0));
        dyplom3.dodajOcene(new Ocena(Przedmiot.CHEMIA, 5.0));
        dyplomy.add(dyplom3);
        System.out.println(dyplom3);
        System.out.println();

        //znajdz dyplom z najwieksza srednia
        System.out.println("Dyplom z najlepsza srednia" + Dyplom.znajdzDyplomZNajwiekszaSrednia(dyplomy));
    }
}
