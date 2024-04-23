package com.java.course.com.lesson20;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Ranking {
    public static void main(String[] args) {
         /*Utworz klase Gracz(imie,nazwisko,kraj,punkty)
        Oraz klase Ranking ktora bedzie przechowywawc mape zawodnikow,
         ktora bedzie ich przechowywac na podsatwie zdobytych punktow
        w klasie ranking napisz funckke ktore
        - znajda najlepszego zawodnika
        - znajda najgorszego zawodnika
        - oblicza srednia ilosc punktow w top 10
         */

        //Mapa z zadowodnikami i punktami:


    }

    public static int najlepszyGracz(Map<String, Integer> mapa) {
        int max = 0;
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    public static int najgorszyGracz(Map<String, Integer> mapa) {
        int min = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
            }
        }
        return min;
    }

    public static int top10(List<Integer> lista) {
        Collections.sort(lista);
        int suma = 0;
        int n = Math.min(10, lista.size());
        for (int i = 0; i < n; i++) {

        }
        return suma;
    }

}
