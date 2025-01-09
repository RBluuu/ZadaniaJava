package com.java.course.com.lesson27;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Person(name,lastname,age,salary)

        //Stworz Mape gdzie kluczem bedzie String (danie) a wartoscia jego cena
        Map<String, Integer> mapaDan = new HashMap<>();
        mapaDan.put("Rosol", 40);
        mapaDan.put("Pomidorowa", 50);
        mapaDan.put("Ogorkowa", 45);
        System.out.println(mapaDan);

        //Oblciz sume cen z menu
        //Oblicz srednia cene z menu
        //znajdz najdrozsze danie
        //znajdz najtansze danie

        System.out.println(sumaCenZMenu(mapaDan));
        System.out.println();
        System.out.println(najdrozszeDanie(mapaDan));
        System.out.println(sredniaCenZMenu(mapaDan));
        System.out.println(najtanszeDanie(mapaDan));


    }


    public static double sumaCenZMenu(Map<String, Integer> mapa) {
        double suma = 0;
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            suma += entry.getValue();
        }
        return suma;
    }

    public static double sredniaCenZMenu(Map<String, Integer> mapa) {
        double suma = 0;
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            suma += entry.getValue();
        }
        return suma / mapa.size();
    }

    public static String najdrozszeDanie(Map<String, Integer> mapa) {
        String produkt = null;
        double cena = 0;
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() > cena) {
                produkt = entry.getKey();
            }
        }
        return produkt;
    }

    public static String najtanszeDanie(Map<String, Integer> mapa) {
        String produkt = null;
        double cena = 0;
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() < cena) {
                produkt = entry.getKey();
            }
        }
        return produkt;
    }
}
