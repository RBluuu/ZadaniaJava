package com.java.course.com.przyklady;

import java.util.*;

public class ExampleThree {
    public static void main(String[] args) {
        //Napisz program, który za pomocą pętli for wypisze liczby od 1 do 100.
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Napisz program, który obliczy sumę liczb od 1 do N, gdzie N jest podane jako zmienna.
        System.out.println();
        System.out.println(sum(15));
        System.out.println();

        //Napisz program, który wypisze wszystkie liczby parzyste z zakresu od 1 do 50.
        for (int i = 1; i < 51; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        //Dana jest tablica liczb całkowitych. Wypisz jej elementy w odwrotnej kolejności, używając pętli for
        int[] list = {-5, -4, 0, 1, 5, 12};
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println();
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }

        //Napisz program, który policzy, ile razy dany znak występuje w napisie (String).
        String text = "ola ma kota w bytach, ola jedzie na rowerze, ola jedzie autem";
        System.out.println();
        System.out.println();
        System.out.println("ilsc char = " + iloscWystepowaniaChar(text, 'o'));


        //przyjmuje tablicę String[]
        //zapisuje w HashMap<String, Integer> ile razy każde słowo występuje w tablicy
        String[] tablica = {"ala", "ma", "kota", "ala"};
        System.out.println("Mapa ze slowami = " + iloscSlowWTekscie(tablica));

        /*
        Zadanie 2 – Mapa uczniów
        Stwórz HashMap<String, Integer>, gdzie:
        klucz → imię ucznia
        wartość → jego ocena

        Program ma:
        dodać kilka uczniów
        wypisać uczniów z oceną ≥ 4
        obliczyć średnią ocen
         */

        HashMap<String,Integer> listaUczniow = new HashMap<>();
        listaUczniow.put("Radek",5);
        listaUczniow.put("Wojtek",5);
        listaUczniow.put("Michal",2);
        listaUczniow.put("Lukasz",3);
        listaUczniow.put("Darek",4);
        listaUczniow.put("Irek",2);

        /*
        Zadanie 4: Zliczanie liter
        Napisz metodę, która:
        przyjmuje String (np. "programowanie")
        zlicza wystąpienia każdej litery
        ignoruje wielkość liter
        Wynik: Map<Character, Integer>
         */
        String text3 = "programowanie";
        System.out.println("Liczymy litery: " + iloscLiterWSlowie(text3));
        System.out.println("Liczymy litery 2 : " + zliczLitery(text3));

        /*
        Zadanie 3: Oceny uczniów
        Masz listę ocen w postaci:
        Jan 5
        Anna 4
        Jan 3
        Anna 5
        zapisz dane do Map<String, List<Integer>>
        oblicz średnią ocen dla każdego ucznia
         */
        List<String> lista2 = List.of(
                "Jan 5",
                "Anna 4",
                "Jan 3",
                "Anna 5"
        );

        System.out.println("Oceny uczniow = " + ocenyUczniow(lista2));

        //Tlumaczenie slowa

        Map<String,String> obceSlowa = new HashMap<>();
        obceSlowa.put("pies","dog");
        obceSlowa.put("auto","car");
        obceSlowa.put("kot","cat");

        String obcelowo = "cat";
        System.out.println("TLUMACZE SLOWO = " + tlumaczoneSlowo(obceSlowa,obcelowo));


    }

    public static String tlumaczoneSlowo(Map<String,String> obceSlowa, String slowo) {
        for (Map.Entry<String,String> entry : obceSlowa.entrySet()) {
            if (entry.getValue().equals(slowo)) {
                return entry.getKey();
            } else if (entry.getKey().equals(slowo)) {
                return entry.getValue();
            } else {
                System.out.println("nie ma takiego slowa");
            }
        }
        return null;
    }

    public static Map<String, List<Integer>> ocenyUczniow(List<String> lista) {
        Map<String, List<Integer>> mapa = new HashMap<>();
        for (String uczen : lista ){
            String[] ocena = uczen.split(" ");
            String imie = ocena[0];
            int wartosc = Integer.parseInt(ocena[1]);
            mapa
                    .computeIfAbsent(imie, k -> new ArrayList<>())
                    .add(wartosc);

        }
        return mapa;
    }

    public static HashMap<Character,Integer> iloscLiterWSlowie(String text) {
        HashMap<Character,Integer> newMap = new HashMap<>();
        Character litera = text.charAt(0);
        int ilosc = 0;
        for (int i = 0; i < text.length(); i++) {
          if (litera == text.charAt(i)) {
              ilosc++;
          }
          newMap.put(text.charAt(i),ilosc);
        }
        return newMap;
    }

    public static Map<Character, Integer> zliczLitery(String tekst) {
        Map<Character, Integer> mapa = new HashMap<>();

        for (char c : tekst.toLowerCase().toCharArray()) {
            mapa.put(c, mapa.getOrDefault(c, 0) + 1);
        }

        return mapa;
    }

    public static int SredniaUczniow(HashMap<String,Integer> listaUczniow) {
        int suma = 0;
        for (Map.Entry<String,Integer> entry : listaUczniow.entrySet() ){
            int ocena = entry.getValue();
            if (ocena >= 4) {
                suma += ocena;
            }
        }
        return suma / listaUczniow.size();
    }

    public static HashMap<String, Integer> iloscSlowWTekscie(String[] tablica) {
        HashMap<String, Integer> nowaMapa = new HashMap<>();
        for (String tekst : tablica) {
            if (tekst.equals(tekst)) {
                nowaMapa.put(tekst, nowaMapa.getOrDefault(tekst, 0) + 1);
            }
        }
        return nowaMapa;
    }

    public static int sum(Integer number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int iloscWystepowaniaChar(String text, char x) {
        int suma = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == x) {
                suma++;
            }
        }
        return suma;
    }
}
