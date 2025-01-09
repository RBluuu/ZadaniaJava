package com.java.course.com.lesson28_29;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Stworz mape Map<String,Integer>
        //i  oblczi sume wartosci

        Map<String,Integer> mapOfProducts = new HashMap<>();
        mapOfProducts.put("Rower", 2400);
        mapOfProducts.put("Telewizor", 5600);
        mapOfProducts.put("Radio", 1200);
        System.out.println(mapOfProducts);

        System.out.println(sumaWartosci(mapOfProducts));
    }

    public static double sumaWartosci(Map<String,Integer> mapa) {
        double suma = 0;
        for (Map.Entry<String,Integer> map : mapa.entrySet()) {
            suma += map.getValue();
        }
        return suma;
    }
}