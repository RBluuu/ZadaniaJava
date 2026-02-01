package com.java.course.com.lesson42.osobaisklep;

import com.java.course.com.lesson42.osobaisklep.exceptions.NoHomoHereException;
import com.java.course.com.lesson42.osobaisklep.exceptions.NoWomenException;
import com.java.course.com.lesson42.osobaisklep.exceptions.ShopsAreOnlyForWomenException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoWomenException, ShopsAreOnlyForWomenException, NoHomoHereException {
        // Stworz klase Osoba (imie, nazwisko, miasto, wiek) oraz Sklep (nazwa, miasto)
        // - metoda co zwraca najstarsza kobiete lub NoWomenException jesli brak kobiet na liscie
        // - kobiety chodza do sklepow, mezczyzni nie, zatem powiazania ze sklepem moga miec tylko kobiety, w przypadku próby dodania powiazania mezyczyzna
        //   sklep rzuc wyjatkiem ShopsAreOnlyForWomenException()
        // - osoby moga sie umawiac na randki, ale jestesmy homofobami, nie akceptujemy par homo, dodaj osobie plec
        // przy probie umowienia sie na randke pary homo rzuc wyjatkiem NoHomoHereException()
        // - nasz system przechowuje tylko osoby pełnoletnie, zatem wiek > 18, pryz próbie tworzenia osoby która ma mniej niz 18 lat
        // progarm powinien to naprawic, ustawiajac danej osobie 18 lat

        Osoba jan = new Osoba("Jan", "Kowalski", "Warszawa", 30);
        Osoba piotr = new Osoba("Piotr", "Nowak", "Krakow", 25);
        Osoba adam = new Osoba("Adam", "Wiśniewski", "Gdansk", 40);
        Osoba anna = new Osoba("Anna", "Zielinska", "Wrocław", 28);
        Osoba katarzyna = new Osoba("Katarzyna", "Lewandowska", "Poznan", 35);
        Osoba magdalena = new Osoba("Magdalena", "Kaczmarek", "Łodz", 22);
        List<Osoba> klienci = new ArrayList<>();
        klienci.add(jan);
        klienci.add(piotr);
        klienci.add(adam);
        klienci.add(anna);
        klienci.add(katarzyna);
        klienci.add(magdalena);
        System.out.println("Lista wszystkich klientow = " + klienci);
        System.out.println();

        List<Osoba> listaMezczyzn = new ArrayList<>();
        listaMezczyzn.add(jan);
        listaMezczyzn.add(piotr);
        listaMezczyzn.add(adam);
        System.out.println("Lista samych mezczyzn = " + listaMezczyzn);
        System.out.println();

        List<Osoba> listaKobiet = new ArrayList<>();
        listaKobiet.add(anna);
        listaKobiet.add(katarzyna);
        listaKobiet.add(magdalena);
        System.out.println("lista samych kobiet = " + listaKobiet);
        System.out.println();


        Sklep mediamarkt = new Sklep("MediaMarkt", "Warszawa");
        Sklep empik = new Sklep("Empik", "Krakow");
        Sklep ikea = new Sklep("IKEA", "Gdansk");

        List<Sklep> listaSklepow = new ArrayList<>();
        listaSklepow.add(mediamarkt);
        listaSklepow.add(empik);
        listaSklepow.add(ikea);
        System.out.println("Lista sklepow = " + listaSklepow);
        System.out.println();

        System.out.println("Najstarsza koieta na liscie kobiet" + Osoba.najstarszaKobieta(listaKobiet)); // Dziala
        System.out.println();
        //System.out.println(Osoba.najstarszaKobieta(klienci)); // nie dziala bo sa kobiety na liscie

        empik.dodajKlienta(katarzyna);
        // empik.dodajKlienta(piotr); // - dziala
        System.out.println(empik.getKlienci());
        System.out.println();

        Osoba jan2 = new Osoba("Jan", "Kowalski", "Warszawa", 30,"Mezczyzna");
        Osoba piotr2 = new Osoba("Piotr", "Nowak", "Krakow", 25,"Mezczyzna");
        Osoba adam2 = new Osoba("Adam", "Wiśniewski", "Gdansk", 15,"Mezczyzna");
        Osoba anna2 = new Osoba("Anna", "Zielinska", "Wrocław", 28,"Kobieta");
        Osoba katarzyna2 = new Osoba("Katarzyna", "Lewandowska", "Poznan", 35,"Kobieta");
        Osoba magdalena2 = new Osoba("Magdalena", "Kaczmarek", "Łodz", 17,"Kobieta");

        //System.out.println(Osoba.randka(jan2,piotr2)); // dziala
        System.out.println(Osoba.randka(jan2,anna2));
        System.out.println();

        List<Osoba> nowaLista2 = new ArrayList<>();
        nowaLista2.add(piotr2);
        nowaLista2.add(adam2);
        nowaLista2.add(magdalena2);
        nowaLista2.add(katarzyna2);
        System.out.println(nowaLista2);

        System.out.println("lista z poprawionym wiekiem osoby");
        System.out.println(Osoba.sprawdzanieWieku(nowaLista2));








    }
}
