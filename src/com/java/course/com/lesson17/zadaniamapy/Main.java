package com.java.course.com.lesson17.zadaniamapy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Mapy:
        //1. Napisz metode ktora sprawdzi czy mapa zawiera podany klucz - zrobione
        //2. Napisz metode ktora sprawdzi czy mapa zawiera podana wartosc - zrobione
        //3. Napisz metode ktora sprawdzi czy mapa zawiera tylko klucze podzielne przez 3 - zrobione
        //4. Napisz metode ktora sprawdzi czy mapa zawiera tylko wartosci podzielne przez 3 - zrobione
        //5. Stwórz metodę, która porównuje dwie mapy i zwraca true jeśli mają identyczne klucze, niezależnie od wartości. - nie zrobione
        //7. Stwórz metodę, która zwraca mapę odwrotną, gdzie wartości stają się kluczami, a klucze wartościami. Zakładając, że wszystkie wartości są unikalne.  - nie zrobione
        //8. Stwórz metodę, która zwraca listę kluczy z mapy, których wartości są największe.  - nie zrobione
        //9. Stwórz metodę, która łączy dwie mapy. W przypadku powtarzających się kluScannczy, wartości powinny być sumowane.  - nie zrobione
        //10. Stwórz metodę, która oblicza sumę wartości dla danego zestawu kluczy w mapie. - zrobione
        //11. Stwórz metodę, która zwraca mapę z wartościami jako lista słów, a kluczem długość tych słów.  - nie zrobione
        //12. Stwórz metodę, która sprawdza, czy mapa jest pusta lub czy wszystkie jej wartości są puste/null.  - zrobione
        //13. Stwórz metodę, która usuwa z mapy wszystkie pary, których wartości są mniejsze od podanej liczby. -zle zrobione
        //14. Stwórz metodę, która zwraca Seta wartości z mapy, które występują więcej niż raz. - zrobione
        //15. Dla podanego Stringa wypisz ilosc wystapien kazdego znaku - nie zrobione
        //np dla Stringa "Sokół zawsze może być fajnym zwierzem"
        //wypisze:
        //S - 1
        //o - 2
        //k - 1
        //itd...
        //16. Stwórz metodę, która zwraca mapę, w której kluczem jest długość słowa, a wartością lista słów o tej długości. nie zrobione
        //17. Stworz metode ktora przyjmie liste stringow i zwroci mape gdzie kluczem bedzie dlugosc slowa a wartoscia lista slow o tej dlugosci - nie zrobione
        //18. Stworz metode ktora przyjmie liste stringow i zwroci mape gdzie kluczem bedzie litera a wartoscia lista slow zaczynajacych sie na ta litere - nie zrobione
        //19. Stworz mape niemutowalna - nie zrobione

         */
        Map<String, String> mapaDoTestow = new HashMap<>();
        mapaDoTestow.put("Motor", "Rower");
        mapaDoTestow.put("Komputer", "Laptop");
        mapaDoTestow.put("Krzeslo", "Stolik");
        mapaDoTestow.put("Gitara", "Perkusja");
        System.out.println("Czy zawiera klucz? " + mapContainsKey(mapaDoTestow, "Gitara"));
        System.out.println("Czy zawiera klucz? " + mapContainsKey(mapaDoTestow, "Drzewo"));
        System.out.println("Odwrocona mapa " + reverseMap(mapaDoTestow));
        Map<Integer, Integer> mapa3 = new HashMap<>();
        mapa3.put(-3, 9);
        mapa3.put(-12, 2);
        mapa3.put(-5, 1);
        mapa3.put(-7, 4);
        System.out.println("Max klucz: " + maxKey(mapa3));
        System.out.println("Max klucz: " + maxKeyV2(mapa3));

        Map<String, Integer> mapaDoTestow2 = new HashMap<>();
        mapaDoTestow2.put("Motor", 1);
        mapaDoTestow2.put("Komputer", 2);
        mapaDoTestow2.put("Motor", 1);
        mapaDoTestow2.put("Komputer", 2);
        Map<String, Integer> mapaDoTestow3 = new HashMap<>();
        mapaDoTestow3.put("Motor", 1);
        mapaDoTestow3.put("samochod", 2);
        System.out.println(newMap(mapaDoTestow2, mapaDoTestow3));

        System.out.println(pusta(mapaDoTestow));
        Map<String, String> empty = Collections.emptyMap();
        System.out.println(empty);
        System.out.println(pusta(empty));

        System.out.println(sortowanie(mapaDoTestow));

        System.out.println(mapaDoTestow2);

        wiekszeOdV2(mapaDoTestow2, 3); //java.util.ConcurrentModificationException

        System.out.println(mapaDoTestow2);

        System.out.println("zadanie 22");


        Map<String, Integer> powtorki = Map.ofEntries(
                Map.entry("a", 1),
                Map.entry("b", 1),
                Map.entry("c", 1),
                Map.entry("e", 2)
        );
        System.out.println(powtorki);
        wiecejNizRaz(powtorki);
    }


    ////14. Stwórz metodę, która zwraca Seta wartości z mapy, które występują więcej niż raz. - zrobione
    /*
    {c=1, b=1, a=1}

    [1,1,1]
     */
    public static void wiecejNizRaz(Map<String, Integer> map) {
        //stworzyc seta
        for (int s : map.values()) {
            int counter = 0;
            for (int z : map.values()) {
                if (s == z) {
                    counter++;
                }
            }
            //jezeli counter > 1  to znaczy ze mamy powrtorki --- dodajemy wartosc do seta
            System.out.println(counter);
        }
        //zwracamy seta z powtorka
    }

    //1. Napisz metode ktora sprawdzi czy mapa zawiera podany klucz - zrobione
    public static boolean mapContainsKey(Map<String, String> map, String key) {
        return map.containsKey(key);
    }

    //2. Napisz metode ktora sprawdzi czy mapa zawiera podana wartosc - zrobione
    public static boolean mapContainsValue(Map<String, String> map, String value) {
        return map.containsValue(value);
    }

    //3. Napisz metode ktora sprawdzi czy mapa zawiera tylko klucze podzielne przez 3 - zrobione
    public static boolean keysDivisibleBy(Map<Integer, Integer> map, int d) {
        for (int key : map.keySet()) {
            if (key % d != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean keysDivisibleByV2(Map<Integer, Integer> map, int d) {
        for (int key : map.keySet()) {
            if (key % d == 0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    //5. Stwórz metodę, która porównuje dwie mapy i zwraca true jeśli mają identyczne klucze, niezależnie od wartości. - nie zrobione
    public static boolean areKeysEqual(Map<String, String> map1, Map<String, String> map2) {
        Set<String> keysMap1 = map1.keySet();
        Set<String> keysMap2 = map2.keySet();
        return keysMap1.equals(keysMap2);
    }

    public static boolean areKeysEqualV2(Map<String, String> map1, Map<String, String> map2) {
        return map1.keySet().equals(map2.keySet());
    }

    //7. Stwórz metodę, która zwraca mapę odwrotną, gdzie wartości stają się kluczami, a klucze wartościami.
    // Zakładając, że wszystkie wartości są unikalne.  - nie zrobione

    /*
    {"a":"aaa"} -> {"aaa": "a"}
     */
    public static Map<String, String> reverseMap(Map<String, String> map) {
        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }

    //7,5 . Znajdz max klucz
    public static int maxKey(Map<Integer, Integer> map) {
        int max = Integer.MIN_VALUE;
        for (int key : map.keySet()) {
            if (key > max) {
                max = key;
            }
        }
        return max;
    }

    public static int maxKeyV2(Map<Integer, Integer> map) {
        return Collections.max(map.keySet());
    }
    //8. Stwórz metodę, która zwraca listę kluczy z mapy, których wartości są największe.  - nie zrobione

    public static List<Integer> keysWithMaxValue(Map<Integer, Integer> map) {
        int maxValue = Collections.max(map.values());
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    //9. Stwórz metodę, która łączy dwie mapy. W przypadku powtarzających się kluScannczy, wartości powinny być sumowane.  - nie zrobione
    /*
    {"a":111}
    {"b": 222}
    {"a": 111 , "b":222}
     */
    public static Map<String, Integer> newMap(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> map3 = new HashMap<>();
        map3.putAll(map1);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            if (map3.containsKey(key)) {
                map3.put(key, map3.get(key) + map2.get(key));
            } else {
                map3.put(entry.getKey(), entry.getValue());
            }
        }
        return map3;
    }

    //12. Stwórz metodę, która sprawdza, czy mapa jest pusta lub czy wszystkie jej wartości są puste/null.  - zrobione
    public static boolean pusta(Map<String, String> map) {
        if (map.isEmpty()) {
            return true;
        } else {
            for (String s : map.values()) {
                if (s == null || s.isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    //HashMap,,TreeMap,LinkedHashMap
    //przyjmij jakas mape i zwroc posortowana po kluczac

    public static Map<String, String> sortowanie(Map<String, String> map) {
        return new TreeMap<>(map);
    }

    ////13. Stwórz metodę, która usuwa z mapy wszystkie pary, których wartości są mniejsze od podanej liczby. -zle zrobione
    public static void wiekszeOd(Map<String, Integer> map, int liczba) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < liczba) {
                map.remove(entry.getKey());
            }
        }
    }

    public static void wiekszeOdV2(Map<String, Integer> map, int liczba) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < liczba) {
                iterator.remove();
            }
        }
    }

}
