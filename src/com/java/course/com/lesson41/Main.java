package com.java.course.com.lesson41;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Enumy - typy wyliczeniowe
        Tshirt nikeXl = new Tshirt("Nike",99.99,"BLACK","XL");
        Tshirt nikeS = new Tshirt("Nike",99.99,"BLACK","DEQWfae123123@");
        Hoodie adidasXXL = new Hoodie("Adidas",99.99,"BLACK",Size.XXL);
        System.out.println(nikeXl);
        System.out.println(nikeS);
        System.out.println(adidasXXL);

        System.out.println(Month.JANUARY);
        System.out.println(Month.DECEMBER);

        System.out.println(DayOfWeek.MONDAY);
        System.out.println(DayOfWeek.FRIDAY);
        System.out.println(ChronoUnit.DAYS);
        System.out.println(ChronoUnit.ERAS);
        System.out.println(ChronoUnit.DECADES);

        DayOfWeek day = DayOfWeek.FRIDAY;

        switch (day){
            case FRIDAY -> System.out.println("Jest piatek");
            case SUNDAY -> System.out.println("Jest niedziela");
        }

        Size xxl = Size.valueOf("XXL");
        System.out.println(xxl);
        System.out.println(Arrays.toString(Size.values()));
        System.out.println(Size.XL.name());
        System.out.println(Size.XL.ordinal());

        System.out.println(Seniority.MANAGER.getBonus());

        Greetings.ENGLISH.sayHello();

        Osoba jan = new Osoba("Jan", "Kowalski", KolorOczu.NIEBIESKIE, KolorWlosow.BLOND);
        Osoba anna = new Osoba("Anna", "Nowak", KolorOczu.ZIELONE, KolorWlosow.RUDY);
        Osoba piotr = new Osoba("Piotr", "Wisniewski", KolorOczu.BRAZOWE, KolorWlosow.BRUNET);
        Osoba katarzyna = new Osoba("Katarzyna", "Zielinska", KolorOczu.CZARNE, KolorWlosow.BLOND);
        Osoba tomasz = new Osoba("Tomasz", "Mazur", KolorOczu.PIWNE, KolorWlosow.SIWY);
        Osoba maria = new Osoba("Maria", "Wojcik", KolorOczu.NIEBIESKIE, KolorWlosow.RUDY);
        Osoba michal = new Osoba("Michal", "Krawczyk", KolorOczu.ZIELONE, KolorWlosow.BRUNET);
        Osoba ewa = new Osoba("Ewa", "Kaczmarek", KolorOczu.BRAZOWE, KolorWlosow.BLOND);
        Osoba adam = new Osoba("Adam", "Piotrowski", KolorOczu.ZIELONE, KolorWlosow.CZARNE);
        Osoba babara = new Osoba("Barbara", "Grabowska", KolorOczu.PIWNE, KolorWlosow.SIWY);

        List<Osoba> nowaLista = new ArrayList<>();
        nowaLista.add(jan);
        nowaLista.add(anna);
        nowaLista.add(piotr);
        nowaLista.add(katarzyna);
        nowaLista.add(tomasz);
        nowaLista.add(maria);
        nowaLista.add(michal);
        nowaLista.add(ewa);
        nowaLista.add(adam);
        nowaLista.add(babara);


        //Napisz ktora zwraca liste osobo o kolorze oczu  podanym jako parametr
        System.out.println();
        System.out.println(Osoba.kolorOczu(nowaLista,KolorOczu.ZIELONE));
        System.out.println();

        //Napisz metodę która zwraca Osobe o najdluzszym nazwisku z oczami podanymi jako parametr
        System.out.println(Osoba.osobaZNajdluzszymNazwiskiemOKolorzeOczu(nowaLista,KolorOczu.ZIELONE));
        System.out.println();

        //Napisz metodę która liczy ile jest osób z kolorem wlosow podanym jako parametr
        System.out.println(Osoba.liczbaOsobOKolorzeOczu(nowaLista,KolorOczu.ZIELONE));
        System.out.println();



    }
}
/*
 * Stworz klase Osoba, imie nazwisko, kolor oczu, kolor wlosow, pomysl co moze byc enumem.
 * Napisz metody:
 * Napisz ktora zwraca liste osobo o kolorze oczu  podanym jako parametr - zrobione
 * Napisz metodę która liczy ile jest osób z kolorem wlosow podanym jako parametr - zrobione
 * Napisz metodę która zwraca Osobe o najdluzszym nazwisku z oczami podanymi jako parametr - zrobione
 */

// Stworz klase Dyplom ktora posiada imie i nazwisko, date wystawienia, na
// dyplomie znajduja sie oceny z przedmiotow(lista klasy Ocena, gdzie ocena ma wartosc i nazwe przedmiotu)
// stworz kilka dyplomow, znajdz dyplom z najwieksza srednia - zrobione


// Napisz kalkulator opierajacy sie o typ wyliczeniowy i metode abstrakcyjna licz(double d1, double d2)
/*
Map<String,???> calculator = new HashMap<>();
calcualtor.put("+",???)
calculator.put("-",???)
calculator.get("+").licz(2,2) -> 4
calculator.get("-").licz(2,2) -> 0
 */

/*
 * Stwórz klase klient i wycieczka, klient moze miec wiele wycieczek, wycieczka
 * moze miec wielu klientow. Wycieczka ma nazwe, kraj, cena i liste dodatkow
 * (kazdy jest dodatkowo platny) Znadz klienta który wydal najwiecej na dodatki
 * do wycieczki uwzgledniajac tez cene wycieczki Znadz klienta który wydal
 * najwiecej na dodatki do wycieczki nieuwzgledniajac tez ceny wycieczki
 */
