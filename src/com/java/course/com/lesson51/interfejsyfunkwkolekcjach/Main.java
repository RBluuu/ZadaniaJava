package com.java.course.com.lesson51.interfejsyfunkwkolekcjach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //napisz przyklad Predicate np sparwdz czy liczba jest wieksza od 100
        //napisz przyklad bifuction np przyjmij stringa inta i zwroc inta (dlugosc + number)

        Predicate<Integer> wiekszeOd100 = x -> x > 100;
        System.out.println(wiekszeOd100.test(101));

        BiFunction<String, Integer, Integer> result = (word, number) -> word.length() + number;
        System.out.println(result.apply("word", 10));


        //consumer
        Consumer<String> hello = word -> System.out.println("Hello");
        hello.accept("Hello");


        List<Integer> lista = new ArrayList<>(List.of(1, 2, 4, 5, 6, 8, 9, 10));
        lista.replaceAll(n -> n * 2);
        lista.removeIf(n -> n == 4);
        System.out.println(lista);

        //map<string,int>
        HashMap<String, Integer> newMap = new HashMap<>();
        newMap.put("Radek", 10);
        newMap.put("Marek", 105);
        newMap.put("Darek", 99);
        System.out.println(newMap);
        newMap.replaceAll(
                (k, v) -> v + k.length()
        );
        System.out.println(newMap);
        newMap.compute(
                "Radek", (k, v) -> v * v
        );
        newMap.compute(
                "Agata", (k, v) -> v != null ? v * v: 100
        );
        //newMap.computeIfAbsent()
        //newMap.computeIfPresent()
        newMap.merge(
                "Radek", 50,(oldValue,defaultValue) -> oldValue + defaultValue
        );
        System.out.println(newMap);

    }
}
/*
Lambda wyrażenia
	   // napisz wyrazenie lambda ktore wykonuje operacje na 2 liczbach


       // napisz interfejs + lambda wyrazenie ktore sprawdza czy liczba jest parzysta


       // napisz wyrazenie ktore sprawdza czy liczba jest wieksza od 5


       // napis wyrazenie ktore zwraca czy napis jest dluzszy niz 10, jesli tak to
       // returnujemy "dlugi" a jak nie "krotki"


       //napisz interfejs ktory przyjmuje dowolny typ i go wyswietla


       // Oblicz sume dlugosci wszystkich stringow na liscie
       // znajdz najdluzszego stringa na liscie

       /*
        * Napisz program który za pomocą wyrażeń lambda wykona działania jak kalkulator
        * czyli dodawanie, odejmowanie, mnożenie i dzielenie.
        */

// napisz metode która kaazda liczbbe z listy zastpeuje liczba 2* wieksza
// napisz metode która kazda liczbe mnozy przez sama siebie
// napisz metode która do kazdego stringa z listy dodaje * na koncu
// napisz metode która wyfiltruje nam z listy intów wszystkie te które sa
// mniejsze od 0
// napisz metode która wyfiltruje nam z listy intów wszystkie te które koncza
// sie na liczbe podana jako parametr metody
// napisz metode ktora kazdego danego stringa z listy zastapi go potrojonym
// stringiem, np
// hello -> hellohellohello
// napisz metode która dla kazdego stringa dodaje y na poczatku i na koncu
// napisz metode ktora wszystkie elementy z listy zastepuje malymi literami
// napisz metode ktora dla kazdego stringa usuwa z niego wszystkie literki a
// napisz metode która wyrzuci z listy intow elementy ktore sa z przedzialu od a
// do b (a i b to parametry metody)
// napisz metode ktora z listy stringów wyswietli tylko te które posiadaja a
// napisz metode która sortuje liczby rosnaco z uzyciem metody list.sort()
// napisz metode która sortuje liste odwrotnie po dlugosci z uzyciem metody
// list.sort()
// napisz metode która dla podanej listy doubli zwraca liste zawierajaca
// pierwiastki liczby z pierwotnej listy
// napisz metode ktora wyswietli cała liste bez uzywania petli oraz bez [,]
// napisz metode która dla podanego klucza zwieksza jego wartosc o 100 jesli
// klucz istnieje
// napisz metode ktora dla podanego klucza ustawia wartosc 5000 jesli klucz nie
// istnieje
// napisz metode ktora podwaja stringa, uzyj metody transform z klasy String
// napisz metode która ze stringa w ktorym wyrazy sa rozdzielone przecinkiem
// tworzy liste tych wyrazow