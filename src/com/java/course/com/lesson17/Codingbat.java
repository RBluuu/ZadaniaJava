package com.java.course.com.lesson17;

import java.util.HashMap;
import java.util.Map;

public class Codingbat {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        map.put("ab", "aaa");
        System.out.println(mapShare(map));
    }

    /*
Modyfikuj i zwróć podaną mapę w następujący sposób: jeśli klucz "a" ma wartość,
ustaw klucz "b" na tę samą wartość.
W każdym przypadku usuń klucz "c", pozostawiając resztę mapy bez zmian.
     */
    public static Map<String, String> mapShare(Map<String, String> map) {
        //1. Czy mapa ma klucz "a"?
        //2. Jezeli tak to ustaw te sama wartosc dla klucza b
        //3. Usun klucz c
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

   /* public Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.put("a", "Hi");
        } else if(map.containsKey("b")) {
            map.put("b", "There");
        } else {
                if (map.containsKey("a")) {
                    if (map.containsKey("b")) {
                        map.put("ab", map.get(values));
                }
            }
        }
        return map;
    }

    */
   public Map<String, String> topping1(Map<String, String> map) {
       if(map.containsKey("ice cream")) {
           map.put(map.get("ice cream"), "cherry");
           map.put("bread", "butter");
       } else if (map.containsKey("pancake")) {
           map.put(map.get("pancake"),"syrup");
           map.put("bread", "butter");
       } else {
           map.put("bread", "butter");
       }
       return map;
   }



}
