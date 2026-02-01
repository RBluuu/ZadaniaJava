package com.java.course.com.lesson54;

import javax.naming.NameNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Slodycz {
    private String nazwa;
    private int cena;
    private List<Dziecko> dzieci = new ArrayList<>();

    public Slodycz(String nazwa, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    //zwroc liste wszystkich slodyczy ktore kupily dzieci
    public static List<Slodycz> listaKupionychSlodyczy(List<Dziecko> dzieci) {
        List<Slodycz> nowaLista = new ArrayList<>();
        for (Dziecko dziecko : dzieci) {
            nowaLista.addAll(dziecko.getSlodycze());
        }
        return nowaLista;
    }

    public static List<Slodycz> listaKupionychSlodyczyV2(List<Dziecko> dzieci) {
        return dzieci.stream()
                .flatMap(dziecko -> dziecko.getSlodycze().stream())
                .collect(Collectors.toList());
    }


    //zwroc liste unikalnych nazw wszystkich slodyczy ktore kupily dzieci
    public static Set<Slodycz> listaKupionychSlodyczyUnikalnych(List<Dziecko> dzieci) {
        Set<Slodycz> nowaLista = new HashSet<>();
        for (Dziecko dziecko : dzieci) {
            nowaLista.addAll(dziecko.getSlodycze());
        }
        return nowaLista;
    }

    public static Set<String> listaKupionychSlodyczyUnikalnychV2(List<Dziecko> dzieci) {
        return dzieci.stream()
                .flatMap(dziecko -> dziecko.getSlodycze().stream())
                .map(Slodycz::getNazwa)
                .collect(Collectors.toSet());
    }

    // ile słodyczy podanego typu kupily dzieci
    public static int iloscPodanegoTypuSlodyczy(List<Dziecko> dzieci, Slodycz rodzaj) {
        int ilosc = 0;
        for (Dziecko dziecko : dzieci) {
            for (Slodycz slodycz : dziecko.getSlodycze()) {
                if (slodycz.equals(rodzaj)) {
                    ilosc++;
                }
            }
        }
        return ilosc;
    }

    public static long iloscPodanegoTypuSlodyczyV2(List<Dziecko> dzieci, Slodycz rodzaj) {
        return dzieci.stream()
                .flatMap(dziecko -> dziecko.getSlodycze().stream())
                .filter(slodycz -> slodycz.equals(rodzaj))
                .count();
    }

    // zwroc wszystkie nazwy slodyczy, bezpowtórzen, scalone w jednego stringa z
    // malych liter
    public static String polaczoneWJednoSlowo(List<Slodycz> slodycze) {
        return slodycze.stream()
                .map(slodycz -> slodycz.getNazwa().toLowerCase())
                .distinct()
                .collect(Collectors.joining());
    }

    //znajdz n-ty najpopularniejszy slodycz wsrod dzieci
    public static String znajdzNPopularniejszySlodycz(List<Slodycz> slodycze, int n) throws NameNotFoundException {
        return slodycze.stream()
                .collect(Collectors.groupingBy(
                        s -> s.getNazwa().toLowerCase(), // grupuj po nazwie (małymi literami)
                        Collectors.counting()))          // zlicz ile razy się pojawia
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()) // sortuj malejąco po liczbie
                .skip(n - 1)                         // pomiń (n-1) elementów
                .map(Map.Entry::getKey)             // weź tylko nazwę słodycza
                .findFirst()                        // wybierz pierwszy (czyli n-ty)
                .orElseThrow(NameNotFoundException::new);         // jeśli nie ma – zwróć null
    }



    public List<Dziecko> getDzieci() {
        return dzieci;
    }

    public void setDzieci(List<Dziecko> dzieci) {
        this.dzieci = dzieci;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Slodycz{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
