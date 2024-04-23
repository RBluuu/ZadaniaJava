package com.java.course.com.lesson16;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> menu = new HashMap<>(); //LinkedHashmap i Treemap
        System.out.println(menu);
        menu.put("Schabowy", 39.99);
        menu.put("Rosol", 8.99);
        menu.put("Woda", 7.99);
        System.out.println(menu.get("Schabowy"));
        System.out.println(menu.get("Stek"));
        System.out.println(menu.getOrDefault("Stek", 99.0));
        System.out.println(menu.getOrDefault("Rosol", 99.0));
        menu.put("Schabowy", 59.99);
        menu.put("Schabowy", 122.59);
        menu.put("Stek", 100.0);
        menu.putIfAbsent("Stek", 150.0);
        System.out.println(menu.containsValue(100.0));
        System.out.println(menu.containsKey("Schabowy"));
        System.out.println(menu.values());
        System.out.println(menu.keySet());
        System.out.println(menu.entrySet());
        System.out.println(menu);
        System.out.println();


        //for(String imie :imiona)
        for (Map.Entry<String, Double> entry : menu.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Map<Integer,Boolean> unikatoweLiczby = new HashMap<>();
        unikatoweLiczby.put(1,true);
        unikatoweLiczby.put(1,true);
        unikatoweLiczby.put(3,true);
        unikatoweLiczby.put(3,true);
        unikatoweLiczby.put(3,true);
        unikatoweLiczby.put(5,true);
        unikatoweLiczby.put(5,true);
        System.out.println(unikatoweLiczby);


        String pies = "jeż";
       tlumaczenie(pies);
    }


    //napisz funkcje ktora bedzie tlumaczyc slowa z polskiego na angielki
    //tlumacz("pies") -> dog
    //??? jakas mapa ktora przechowuje polskie slowo i angielski odpowiednik



    public static void tlumaczenie(String polskieSolow) {
        Map<String,String> tlumacz = new HashMap<>();
        tlumacz.put("pies","dog");
        tlumacz.put("kot","cat");
        System.out.println(tlumacz.get(polskieSolow));
    }
}


