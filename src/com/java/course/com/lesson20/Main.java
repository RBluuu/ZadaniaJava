package com.java.course.com.lesson20;

import java.util.*;

import static com.java.course.com.lesson20.Ranking.*;


public class Main {
    public static void main(String[] args) {

        /*Utworz klase Gracz(imie,nazwisko,kraj,punkty)
        Oraz klase Ranking ktora bedzie przechowywawc mape zawodnikow,
         ktora bedzie ich przechowywac na podsatwie zdobytych punktow
        w klasie ranking napisz funckke ktore
        - znajda najlepszego zawodnika
        - znajda najgorszego zawodnika
        - oblicza srednia ilosc punktow w top 10
         */


        Gracz graczNR1 = new Gracz("Radek", "Błauciak", "Polska", 98);
        Gracz graczNR2 = new Gracz("Marek", "Laskowski", "Niemicy", 66);
        Gracz graczNR3 = new Gracz("Aleksander", "Nowak", "Polska", 77);
        Gracz graczNR4 = new Gracz("Bartłomiej", "Piątkowski", "Polska", 69);
        Gracz graczNR5 = new Gracz("Dariusz", "Nowicki", "Niemcy", 99);
        Gracz graczNR6 = new Gracz("Mirosław", "Kowalski", "Polska", 100);
        Gracz graczNR7 = new Gracz("Mikołaj", "Nowakowski", "Polska", 95);
        Gracz graczNR8 = new Gracz("Łukasz", "Niewiadomoski", "Włochy", 54);
        Gracz graczNR9 = new Gracz("Jakub", "Kowalewski", "Austria", 44);
        Gracz graczNR10 = new Gracz("Arek", "Gregorczyk", "Polska", 39);
        Gracz graczNR11 = new Gracz("Mateusz", "Nowikowski", "Hiszpania", 68);
        Gracz graczNR12 = new Gracz("Przemek", "Szpakowski", "Francja", 74);
        Gracz graczNR13 = new Gracz("Igancy", "Drzewiecki", "Holandia", 45);
        Gracz graczNR14 = new Gracz("Atoni", "Gorski", "Holandia", 12);
        Gracz graczNR15 = new Gracz("Marek", "Drawski", "Hiszpania", 9);


        System.out.println("Lista Graczy:");
        Map<String, Integer> ranking = new LinkedHashMap<>();
        ranking.put(graczNR1.imie, graczNR1.punkty);
        ranking.put(graczNR2.imie, graczNR2.punkty);
        ranking.put(graczNR3.imie, graczNR3.punkty);
        ranking.put(graczNR4.imie, graczNR4.punkty);
        ranking.put(graczNR5.imie, graczNR5.punkty);
        ranking.put(graczNR6.imie, graczNR6.punkty);
        ranking.put(graczNR7.imie, graczNR7.punkty);
        ranking.put(graczNR8.imie, graczNR8.punkty);
        ranking.put(graczNR9.imie, graczNR9.punkty);
        ranking.put(graczNR10.imie, graczNR10.punkty);
        ranking.put(graczNR11.imie, graczNR11.punkty);
        ranking.put(graczNR12.imie, graczNR12.punkty);
        ranking.put(graczNR13.imie, graczNR13.punkty);
        ranking.put(graczNR14.imie, graczNR14.punkty);
        ranking.put(graczNR15.imie, graczNR15.punkty);
        System.out.println(ranking);
        System.out.println();

        System.out.println("Ilosc punktow najlepszego gracza:" + najlepszyGracz(ranking));
        System.out.println();

        System.out.println("Ilosc punktow najgorzego gracza gracza:" + najgorszyGracz(ranking));
        System.out.println();

        System.out.println("Najlepszy gracz:" + najlepszyGracz(ranking));

        System.out.println("Sortowanie:");




    }
}
