package com.java.course.com.lesson51.interfejsyfunkwkolekcjach;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Zadania {
    public static void main(String[] args) {
        // napisz wyrazenie lambda ktore wykonuje operacje na 2 liczbach
        BiFunction<Integer, Integer, Integer> dodawanie = (liczba1, liczba2) -> liczba1 + liczba2;
        System.out.println(dodawanie.apply(2, 2));
        System.out.println();

        // napisz interfejs + lambda wyrazenie ktore sprawdza czy liczba jest parzysta
        Predicate<Integer> parzysta = x -> x % 2 == 0;
        System.out.println(parzysta.test(4));
        System.out.println();

        // napisz wyrazenie ktore sprawdza czy liczba jest wieksza od 5
        int liczba = 5;
        Predicate<Integer> wieszkaOd = x -> x > liczba;
        System.out.println(wieszkaOd.test(3));
        System.out.println();

        // napis wyrazenie ktore zwraca czy napis jest dluzszy niz 10, jesli tak to
        // returnujemy "dlugi" a jak nie "krotki"
        String slowo = "Alabama";
        int dlugosc = 10;
        Function<String, String> wielkoscSlowa = wyraz -> wyraz.length() > dlugosc ? "dlugi" : "krotki";
        System.out.println(wielkoscSlowa.apply(slowo));
        System.out.println();

        //napisz interfejs ktory przyjmuje dowolny typ i go wyswietla
        Consumer<String> print = wyraz -> System.out.println(wyraz);
        print.accept("Radek");
        System.out.println();

        // Oblicz sume dlugosci wszystkich stringow na liscie
        // znajdz najdluzszego stringa na liscie
        List<String> lista = List.of("Radek", "Arkadiusz", "Mirek");
        Function<List<String>, Integer> dlugoscListy = list -> list.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(dlugoscListy.apply(lista));

        BinaryOperator<String> znajdzNajdluzszy = (s1, s2) -> s1.length() >= s2.length() ? s1 : s2;
        int suma = dlugoscListy.apply(lista);
        Optional<String> najdluzszy = lista.stream().reduce(znajdzNajdluzszy);
        System.out.println(najdluzszy);
        System.out.println();

        //napisz interfejs ktory przyjmuje dowolny typ i go wyswietla
        Supplier<String> tekst = () -> "Hello";
        System.out.println(tekst.get());
        System.out.println();

        //Napisz program który za pomocą wyrażeń lambda wykona działania jak kalkulator
        //czyli dodawanie, odejmowanie, mnożenie i dzielenie.

        BiFunction<Double, Double, Double> dodawanieLiczb = (a, b) -> a + b;
        BiFunction<Double, Double, Double> odejmowanieLiczb = (a, b) -> a - b;
        BiFunction<Double, Double, Double> mnozenieLiczb = (a, b) -> a * b;
        BiFunction<Double, Double, Double> dzielenieLiczb = (a, b) -> a / b;

        double x1 = 10.4;
        double x2 = 2.1;
        System.out.println(dodawanieLiczb.apply(x1, x2));
        System.out.println(odejmowanieLiczb.apply(x1, x2));
        System.out.println(mnozenieLiczb.apply(x1, x2));
        System.out.println(dzielenieLiczb.apply(x1, x2));
        System.out.println();

        // napisz metode która kaazda liczbbe z listy zastpeuje liczba 2* wieksza
        List<Integer> listaLiczb = List.of(1, 2, 3, 5);
        Function<List<Integer>, List<Integer>> liczbaPodwojona = list -> list.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(liczbaPodwojona.apply(listaLiczb));
        System.out.println();


        // napisz metode która kazda liczbe mnozy przez sama siebie
        List<Integer> listaLiczb1 = List.of(1, 2, 3, 5);
        Function<List<Integer>, List<Integer>> mnozonaPrzezSiebie = list -> list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(mnozonaPrzezSiebie.apply(listaLiczb1));
        System.out.println();
        
        // napisz metode która do kazdego stringa z listy dodaje * na koncu
        List<String> listaImion = List.of("Radek","Marek");
        Function<List<String>, List<String>> listaZGwiadka = list -> list.stream()
                .map(n -> n + "*" )
                .collect(Collectors.toList());
        System.out.println(listaZGwiadka.apply(listaImion));
        System.out.println();

        // napisz metode która wyfiltruje nam z listy intów wszystkie te które sa
        // mniejsze od 0
        List<Integer> listaLiczb2 = List.of(-1, 0, 1, 2, 3, 5);
        Function<List<Integer>, List<Integer>> mniejszeNizZero = list -> list.stream()
                .filter(n -> n < 0)
                .collect(Collectors.toList());
        System.out.println(mniejszeNizZero.apply(listaLiczb2));
        System.out.println();

        // napisz metode która wyfiltruje nam z listy intów wszystkie te które koncza
        // sie na liczbe podana jako parametr metody
        List<Integer> listaLiczb3 = List.of(1, 2, 3, 5, 10, 15);
        BiFunction<List<Integer>, Integer, List<Integer>> filtrujPoOstatniejCyfrze = (list, cyfra) -> list.stream()
                .filter(n -> n % 10 == cyfra)
                .collect(Collectors.toList());
        System.out.println(filtrujPoOstatniejCyfrze.apply(listaLiczb3,5));
        System.out.println();

        // napisz metode ktora kazdego danego stringa z listy zastapi go potrojonym
        // stringiem, np
        // hello -> hellohellohello
        List<String> listaImion2 = List.of("Radek","Marek");
        Function<List<String>, List<String>> potrojneSlowa = list -> list.stream()
                .map(n -> n + n + n )
                .collect(Collectors.toList());
        System.out.println(potrojneSlowa.apply(listaImion2));
        System.out.println();

        // napisz metode która dla kazdego stringa dodaje y na poczatku i na koncu
        List<String> listaImion3 = List.of("Radek","Marek");
        Function<List<String>, List<String>> slowaZY = list -> list.stream()
                .map(n -> "y" + n + "y")
                .collect(Collectors.toList());
        System.out.println(slowaZY.apply(listaImion3));
        System.out.println();

        // napisz metode ktora wszystkie elementy z listy zastepuje malymi literami
        List<String> listaImion4 = List.of("RADEK","MICHAL");
        Function<List<String>, List<String>> slowaZMalejLitery = list -> list.stream()
                .map(n -> n.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(slowaZMalejLitery.apply(listaImion4));
        System.out.println();

        // napisz metode ktora dla kazdego stringa usuwa z niego wszystkie literki a
        List<String> listaImion5 = List.of("RADEK","MICHAL");
        Function<List<String>, List<String>> usuwaLitereA = list -> list.stream()
                .map(n -> n.replace("A",""))
                .collect(Collectors.toList());
        System.out.println(usuwaLitereA.apply(listaImion5));
        System.out.println();

        // napisz metode która wyrzuci z listy intow elementy ktore sa z przedzialu od a
        // do b (a i b to parametry metody)
        List<Integer> listaLiczb6 = List.of(1, 2, 3, 5, 10, 15);
        BiFunction<List<Integer>, int[], List<Integer>> liczbaZPrzedzialu = (list, przedzial) -> list.stream()
                .filter(n -> n < przedzial[0] || n > przedzial[1])
                .collect(Collectors.toList());
        int[] przedzial = {3,10};
        System.out.println(liczbaZPrzedzialu.apply(listaLiczb6,przedzial));
        System.out.println();

        // napisz metode ktora z listy stringów wyswietli tylko te które posiadaja a
        List<String> listaSlow = List.of("Radek","Rower","Komputer","Mucha");
        Function<List<String>, List<String>> slowaZA = list -> list.stream()
                .filter(n -> n.contains("a"))
                .collect(Collectors.toList());
        System.out.println(slowaZA.apply(listaSlow));
        System.out.println();

        // napisz metode która sortuje liczby rosnaco z uzyciem metody list.sort()
        List<Integer> listaLiczb4 = new ArrayList<>(List.of(9,-1, 0, 66, 2, 18, 5));
        listaLiczb4.sort(Integer::compareTo);
        System.out.println(listaLiczb4);
        System.out.println();

        // napisz metode która sortuje liste odwrotnie po dlugosci z uzyciem metody
        // list.sort()
        List<Integer> listaLiczb5 = new ArrayList<>(List.of(9,-1, 0, 66, 2, 18, 5));
        listaLiczb5.sort(Comparator.reverseOrder());
        System.out.println(listaLiczb5);
        System.out.println();

        // napisz metode która dla podanej listy doubli zwraca liste zawierajaca
        // pierwiastki liczby z pierwotnej listy
        List<Double> listaLiczb7 = new ArrayList<>(List.of(9.4, -1.0, 66.0, 2.0, 18.0, 5.0));
        Function<List<Double>, List<Double>> liczbyZPierwiastkowane = list -> list.stream()
                .map(n -> n >=0 ? Math.sqrt(n): Double.NaN)
                .collect(Collectors.toList());
        System.out.println(liczbyZPierwiastkowane.apply(listaLiczb7));
        System.out.println();

        // napisz metode ktora wyswietli cała liste bez uzywania petli oraz bez [,]
        List<Integer> listaLiczb8 = new ArrayList<>(List.of(9, 1, 66, 2, 18));
        String wynik = listaLiczb8.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(wynik);
        System.out.println();

        // napisz metode która dla podanego klucza zwieksza jego wartosc o 100 jesli
        // klucz istnieje
        Map<String,Integer> newMap = new HashMap<>();
        newMap.put("Radek", 100);
        newMap.put("Michal", 150);
        newMap.put("Dawid", 150);
        System.out.println(newMap);
        System.out.println();
        newMap.merge("Radek",100,(oldValue,defaultValue) -> oldValue + defaultValue);
        System.out.println(newMap);
        System.out.println();

        // napisz metode ktora dla podanego klucza ustawia wartosc 5000 jesli klucz nie
        // istnieje
        Map<String,Integer> newMap1 = new HashMap<>();
        newMap1.put("Radek", 100);
        newMap1.put("Michal", 150);
        newMap1.put("Dawid", 150);
        System.out.println();
        newMap1.merge("Tomek",5000,(oldValue,defaultValue) -> oldValue + defaultValue);
        System.out.println(newMap1);
        System.out.println();

        // napisz metode ktora podwaja stringa, uzyj metody transform z klasy String
        String tekstNR1 = "Hello";
        String wynikTestu = podwojneSlowo(tekstNR1);
        System.out.println(wynikTestu);

        // napisz metode która ze stringa w ktorym wyrazy sa rozdzielone przecinkiem
        // tworzy liste tych wyrazow
        String tekstNR2 = "Radek,Marek,Michal";
        List<String> wynikTestu2 = zmianaNaListe(tekstNR2);
        System.out.println(wynikTestu2);
    }

    public static List<String> zmianaNaListe(String string) {
        return Arrays.asList(string.split(","));
    }

    public static String podwojneSlowo(String slowo) {
        return slowo.transform(s -> s + s);
    }

    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }

    public interface Supplier<T> {
        T get();
    }
}
