package com.java.course.com.lesson54;

import javax.naming.NameNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NameNotFoundException {
        /*
        Słodycze
        // stworz klase dziecko (imie) oraz slodycz (nazwa) i asocjacje * -- * pomiedzy nimi - zrobione


		// zwroc lista wszystkich slodyczy ktore kupily dzieci - zrobione

		// zwroc liste unikalnych nazw wszystkich slodyczy ktore kupily dzieci - zrobione

		// ile słodyczy podanego typu kupily dzieci - zrobione


		// znajdz pierwsze dziecko które ma przynajmniej 2 slodycze - zrobione

		// sprawdz czy ktorekolwiek dziecko ma gume - zrobione

		// znajdz n-ty najpopularniejszy slodycz wsrod dzieci

		// zwroc wszystkie nazwy slodyczy, bezpowtórzen, scalone w jednego stringa z
		// malych liter
         */


        // dzieki
        Dziecko janek = new Dziecko("Janek");
        Dziecko kasia = new Dziecko("Kasia");
        Dziecko michal = new Dziecko("Michal");
        Dziecko darek = new Dziecko("Darek");
        Dziecko lukasz = new Dziecko("Lukasz");

        //slodycze
        Slodycz czekolada = new Slodycz("Czekolada",14);
        Slodycz lizak = new Slodycz("Lizak",5);
        Slodycz baton = new Slodycz("Baton",4);
        Slodycz guma = new Slodycz("Guma",3);
        Slodycz cukierek = new Slodycz("Cukierek",2);
        Slodycz lod = new Slodycz("Lod",6);
        Slodycz cola = new Slodycz("Cola",6);

        //dodawanie slodyczy
        janek.dodajSlodycz(czekolada);
        janek.dodajSlodycz(lizak);
        janek.dodajSlodycz(guma);

        kasia.dodajSlodycz(baton);
        kasia.dodajSlodycz(cukierek);
        kasia.dodajSlodycz(czekolada);

        michal.dodajSlodycz(lizak);
        michal.dodajSlodycz(lod);

        darek.dodajSlodycz(czekolada);

        lukasz.dodajSlodycz(baton);
        lukasz.dodajSlodycz(lod);

        System.out.println("Sprawdzanie janka i slodyczy" + janek.getSlodycze());
        System.out.println();

        // zwroc lista wszystkich slodyczy ktore kupily dzieci - zrobione
        System.out.println("Lista wszystkich slodyczy dzieci: " + Slodycz.listaKupionychSlodyczy(List.of(janek,kasia,michal,darek,lukasz)));
        System.out.println();

        System.out.println("Lista wszystkich slodyczy dzieci V2: " + Slodycz.listaKupionychSlodyczyV2(List.of(janek,kasia,michal,darek,lukasz)));
        System.out.println();

        // zwroc liste unikalnych nazw wszystkich slodyczy ktore kupily dzieci
        System.out.println("Unikalna lista slodyczy: " + Slodycz.listaKupionychSlodyczyUnikalnych(List.of(janek,kasia,michal,darek,lukasz)));
        System.out.println();
        System.out.println("Unikalna lista slodyczy v2: " + Slodycz.listaKupionychSlodyczyUnikalnychV2(List.of(janek,kasia,michal,darek,lukasz)));
        System.out.println();

        // ile słodyczy podanego typu kupily dzieci
        System.out.println("Ilosc słodycyz podanego typu: " + Slodycz.iloscPodanegoTypuSlodyczy(List.of(janek,kasia,michal,darek,lukasz),lizak));
        System.out.println();
        System.out.println("Ilosc słodycyz podanego typu v2: " + Slodycz.iloscPodanegoTypuSlodyczyV2(List.of(janek,kasia,michal,darek,lukasz),czekolada));
        System.out.println();

        // znajdz pierwsze dziecko które ma przynajmniej 3 slodycze
        System.out.println("Pierwsze dziecko z 3 slodyczami = " + Dziecko.pierwszeDzieckoZ3Slodyczami(List.of(janek,kasia,michal,darek,lukasz)));
        System.out.println();
        System.out.println("Pierwsze dziecko z 3 slodyczami V2= " + Dziecko.pierwszeDzieckoZ3SlodyczamiV2(List.of(janek,kasia,michal,darek,lukasz)));
        System.out.println();

        // sprawdz czy ktorekolwiek dziecko ma gume
        System.out.println("Sprawdz czy dziecko ma gume = " + Dziecko.sprawdzCzyMaTenSlodycz(List.of(janek,kasia,michal,darek,lukasz),guma));
        System.out.println();
        System.out.println("Sprawdz czy dziecko ma gume V2 = " + Dziecko.sprawdzCzyMaTenSlodyczV2(List.of(janek,kasia,michal,darek,lukasz),guma));
        System.out.println();


        // zwroc wszystkie nazwy slodyczy, bezpowtórzen, scalone w jednego stringa z
        // malych liter
        System.out.println("Polaczone slodycze ze slodyczy = " + Slodycz.polaczoneWJednoSlowo(List.of(czekolada,lizak,guma,baton,baton,cukierek,lod,cola)));
        System.out.println();

        //znajdz n-ty najpopularniejszy slodycz wsrod dzieci
        System.out.println("Najpopularnieszy slodycz wsrod dzieci = " + Slodycz.znajdzNPopularniejszySlodycz(List.of(czekolada,lizak,guma,baton,baton,cukierek,lod,cola),1));
        System.out.println();

    }
}
