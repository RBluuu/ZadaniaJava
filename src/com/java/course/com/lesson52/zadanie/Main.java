package com.java.course.com.lesson52.zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment("apartment number1",45.5, 250000, 3, 2, List.of(Facilities.GARAZ,Facilities.PIWNICA));
        Apartment apartment2 = new Apartment("apartment number2",60.0, 350000, 5, 3, List.of(Facilities.BALKON,Facilities.BASEN));
        Apartment apartment3 = new Apartment("apartment number3",75.3, 450000, 7, 4, List.of(Facilities.OGRODEK,Facilities.BALKON));
        Apartment apartment4 = new Apartment("apartment number4",89, 450000, 9, 4, List.of(Facilities.KLIMATYZACJA,Facilities.KOMINEK,Facilities.PATIO));
        Apartment apartment5 = new Apartment("apartment number5",100, 4000000, 99, 4, List.of(Facilities.TARAS,Facilities.SKRYTKA_LOKATORSKA,Facilities.GARAZ,Facilities.OGRODEK,Facilities.BALKON,Facilities.KLIMATYZACJA));
        Apartment apartment6 = new Apartment("apartment number6",55.99, 359659, 7, 4, List.of(Facilities.SKRYTKA_LOKATORSKA,Facilities.GARAZ));
        Apartment apartment7 = new Apartment("apartment number7",30.1, 299999, 6, 4, List.of(Facilities.SKRYTKA_LOKATORSKA));

        //apartment2.pricePerMSq(apartment2);
        //apartment2.pricePerMSq(apartment6);


        List<Apartment> apartments = new ArrayList<>(List.of(apartment1,apartment2,apartment3,apartment4,apartment5,apartment6,apartment7));
        List<Facilities> special = new ArrayList<>(List.of(Facilities.GARAZ,Facilities.SKRYTKA_LOKATORSKA));

        System.out.println("Moust expensive apartment = " + Apartment.findMoustExpensiveApartment(apartments));
        System.out.println();

        System.out.println("Cheapest apartment = " + Apartment.findCheapestApartment(apartments));
        System.out.println();

        System.out.println("Price per meter = " + Apartment.calculateAveragePricePerMeter(apartments));
        System.out.println();

        System.out.println("Apartment for 250000 zl " + Apartment.apartmentsSpecifiedPreis(apartments,250000));
        System.out.println();

        System.out.println("Apartment with special facilities = " + Apartment.apartmentsWithFacilities(apartments,special));
        System.out.println();

        System.out.println("Apartments by floor = " + Apartment.groupApartmentsByFloor(apartments));
        System.out.println();

        System.out.println("Preis per square meter= " + Apartment.groupApartmentsByPricePerSquareMeter(apartments));
        System.out.println();

        Map<PriceRange, List<Apartment>> priceRangeListMap = Apartment.groupApartmentsByPricePerSquareMeterV2(apartments,
                List.of(
                        new PriceRange(0, 10000),
                        new PriceRange(10001, 20000),
                        new PriceRange(20001, 30000),
                        new PriceRange(38001, 60000)
                ));
        System.out.println("reis per square meter V2= "
                + priceRangeListMap);
        System.out.println();

        System.out.println(priceRangeListMap.get( new PriceRange(38001, 60000)));

        /*

        - Dodac walidacje do PriceRange construktora, tak aby nie mozna bylo stworzyc zlego range'a gdzie from jest wieksze niz to
        - Poprawic domyslny zakres w groupApartmentsByPricePerSquareMeterV2 tak, ze jezeli nie znaleziono range dla apartametnu
        to go pomijamy
        - dodaj w PriceRange funkcje statyczna ktora zwroci liste PriceRange i ja waliduje, srpawdza czy zakresy maja sens
         */

        //Słodycze
        // stworz klase dziecko (imie) oraz slodycz (nazwa) i asocjacje * -- * pomiedzy nimi

        // zwroc lista wszystkich slodyczy ktore kupily dzieci

        // zwroc liste unikalnych nazw wszystkich slodyczy ktore kupily dzieci

        // ile słodyczy podanego typu kupily dzieci


        // znajdz pierwsze dziecko które ma przynajmniej 2 slodycze

        // sprawdz czy ktorekolwiek dziecko ma gume

        // chcemy zwrócic dziecko które ma najwiecej slodyczy podanego typu
        // czyli np d1 ma s1,s1,s2,s3,s4,s4,s4
        // d2 ma s1,s1,s1,s1,s3,s4,s5
        // to metoda dla parametru s1 powinna dac d2, dla parametru s4 powinna dac d1

        // znajdz n-ty najpopularniejszy slodycz wsrod dzieci

        // zwroc wszystkie nazwy slodyczy, bezpowtórzen, scalone w jednego stringa z
        // malych liter

    }
}
