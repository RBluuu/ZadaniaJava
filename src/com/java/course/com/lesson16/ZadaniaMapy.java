package com.java.course.com.lesson16;

import java.util.*;

public class ZadaniaMapy {
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
        //14. Stwórz metodę, która zwraca zbiór wartości z mapy, które występują więcej niż raz. - zrobione
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


        + codingbat z MAP
         */

        //1. Napisz metode ktora sprawdzi czy mapa zawiera podany klucz
        System.out.println("Zadanie nr1");
        Map<String, String> mapa1 = new HashMap<>();
        mapa1.put("Motor", "Rower");
        mapa1.put("Komputer", "Laptop");
        mapa1.put("Krzeslo", "Stolik");
        mapa1.put("Gitara", "Perkusja");
        System.out.println("Czy Mapa zawiera slowo Komputer - " + klucz(mapa1, "Komputer"));


        //2. Napisz metode ktora sprawdzi czy mapa zawiera podana wartosc
        System.out.println();
        System.out.println("Zadanie nr2");
        Map<String, String> mapa2 = new HashMap<>();
        mapa2.put("Motor", "Rower");
        mapa2.put("Komputer", "Laptop");
        mapa2.put("Krzeslo", "Stolik");
        mapa2.put("Gitara", "Perkusja");
        System.out.println("Czy Mapa zawiera wartos Laptop - " + wartosc(mapa2, "Laptop"));


        //3. Napisz metode ktora sprawdzi czy mapa zawiera tylko klucze podzielne przez 3
        System.out.println();
        System.out.println("Zadanie nr3");
        Map<Integer, Integer> mapa3 = new HashMap<>();
        mapa3.put(3, 9);
        mapa3.put(12, 2);
        mapa3.put(5, 1);
        mapa3.put(7, 4);
        System.out.println("Czy mapa zawiera tylko klucze podzielne przez 3? odpowiedz: " + kluczePodzielnePrzez3(mapa3, 3));

        //4. Napisz metode ktora sprawdzi czy mapa zawiera tylko wartosci podzielne przez 3
        System.out.println();
        System.out.println("Zadanie nr4");
        Map<Integer, Integer> mapa4 = new HashMap<>();
        mapa4.put(3, 9);
        mapa4.put(12, 3);
        mapa4.put(5, 3);
        mapa4.put(7, 3);
        System.out.println("Czy mapa zawiera tylko wartosci podzielne przez 3? Odpowiedz: " + wartoscPodzielonaPrzezTrzy(mapa4, 3));

        //5. Stwórz metodę, która porównuje dwie mapy i zwraca true jeśli mają identyczne klucze, niezależnie od wartości
        System.out.println();
        System.out.println("Zadanie nr5");
        Map<Integer, Integer> mapa5 = new HashMap<>();
        mapa5.put(3, 9);
        mapa5.put(12, 3);
        mapa5.put(5, 3);
        mapa5.put(7, 3);

        Map<Integer, Integer> mapa6 = new HashMap<>();
        mapa6.put(3, 9);
        mapa6.put(12, 3);
        mapa6.put(5, 3);
        mapa6.put(7, 3);
        System.out.println("Czy mapy posiadaja identyczne klucze? odpowiedz: " + dwieMapy(mapa5, mapa6));


        //7. Stwórz metodę, która zwraca mapę odwrotną, gdzie wartości stają się kluczami, a klucze wartościami. Zakładając, że wszystkie wartości są unikalne.
        System.out.println();
        System.out.println("Zadanie nr7");
        Map<String, String> mapa7 = new HashMap<>();
        mapa7.put("Motor", "Rower");
        mapa7.put("Komputer", "Laptop");
        mapa7.put("Krzeslo", "Stolik");
        mapa7.put("Gitara", "Perkusja");
        System.out.println("Odwrocona mapa: " + odwroconaMapa(mapa7));

        //8. Stwórz metodę, która zwraca listę kluczy z mapy, których wartości są największe.
        System.out.println();
        System.out.println("Zadanie nr8");
        Map<Integer, Integer> mapa8 = new HashMap<>();
        mapa8.put(55, 999);
        mapa8.put(99, 499);
        mapa8.put(86, 499);
        mapa8.put(77, 501);
        System.out.println(mapa8);
        System.out.println("Lista kluczy z mapy z najwieszkymi wartosciami: " + najwiekszaWartosKlucza(mapa8));

        //9. Stwórz metodę, która łączy dwie mapy. W przypadku powtarzających się kluScannczy, wartości powinny być sumowane.
        System.out.println();
        System.out.println("Zadania nr9:");
        Map<String, Integer> mapa9 = new HashMap<>();
        mapa9.put("Radek", 9);
        mapa9.put("Roman", 3);
        mapa9.put("Ala", 3);
        mapa9.put("Marek", 3);

        Map<String, Integer> mapa10 = new HashMap<>();
        mapa10.put("Natan", 9);
        mapa10.put("Basia", 3);
        mapa10.put("Wojtek", 3);
        mapa10.put("Konrad", 3);

        System.out.println("Nowa mapa = " + polaczonaMapa(mapa9,mapa10));


        //10. Stwórz metodę, która oblicza sumę wartości dla danego zestawu kluczy w mapie.
        System.out.println();
        System.out.println("Zadanie nr10");
        Map<String, Integer> mapa11 = new HashMap<>();
        mapa11.put("Motor", 999);
        mapa11.put("Komputer", 499);
        mapa11.put("Krzeslo", 499);
        mapa11.put("Gitara", 501);
        System.out.println("Suma wartosci = " + sumaWartosci(mapa11));

        //11. Stwórz metodę, która zwraca mapę z wartościami jako lista słów, a kluczem długość tych słów.
        System.out.println();
        System.out.println("Zadanie nr11");
        Map<Integer, String> mapa12 = new HashMap<>();
        mapa12.put(19, "Radek");
        mapa12.put(10, "Aleksandra");
        mapa12.put(5, "Basia");
        mapa12.put(9, "Wojciech");
        mapa12.put(13, "Mariusz");
        System.out.println("Nowa lista");

        //12. Stwórz metodę, która sprawdza, czy mapa jest pusta lub czy wszystkie jej wartości są puste/null.
        System.out.println();
        System.out.println("Zadanie nr12");
        Map<String, String> mapa13 = new HashMap<>();
        mapa13.put("", "");
        mapa13.put("", "Aleksandra");
        mapa13.put("", "");
        mapa13.put("", "Wojciech");
        mapa13.put("", "");
        System.out.println("Czy mapa jest pusta? Odpowiedz: " + czyPusta(mapa13));


        //13. Stwórz metodę, która usuwa z mapy wszystkie pary, których wartości są mniejsze od podanej liczby.
        System.out.println();
        System.out.println("Zadanie nr13");
        int liczba = 3;
        Map<String, Integer> mapa14 = new HashMap<>();
        mapa14.put("Motor", 5);
        mapa14.put("Komputer", 3);
        mapa14.put("Krzeslo", 4);
        mapa14.put("Gitara", 2);
        System.out.println("Nowa mapa" ); /// sprawdzic

        //14. Stwórz metodę, która zwraca zbiór wartości z mapy, które występują więcej niż raz.
        System.out.println();
        System.out.println("Zadanie nr14");
        Map<String, Integer> mapa15 = new HashMap<>();
        mapa15.put("Motor", 5);
        mapa15.put("Komputer", 3);
        mapa15.put("Krzeslo", 4);
        mapa15.put("Gitara", 4);
        mapa15.put("Rower", 4);
        System.out.println("Wystepuje wiecej niz raz liczba - " + wiecejNizRaz(mapa15));


        Map<String, String> mapa16 = new HashMap<>();
        mapa16.put("a", "aaa");
        mapa16.put("b", "aaa");
        mapa16.put("c", "aaa");
        mapa16.put("d", "aaa");
        System.out.println("Metona1 " + mapa16);



    }

    //Metoda do zadania 1: sprawdzi czy mapa zawiera podany klucz
    public static boolean klucz(Map<String,String> mapa, String slowo) {
        if (mapa.containsKey(slowo)) {
            return true;
        } else {
            return false;
        }
    }

    //Metoda do zadania 2: sprawdzi czy mapa zawiera podana wartosc
    public static boolean wartosc(Map<String,String> mapa, String slowo) {
        if (mapa.containsValue(slowo)) {
            return true;
        } else {
            return false;
        }
    }

    //Metoda do zadania 3: sprawdzi czy mapa zawiera tylko klucze podzielne przez 3
    public static boolean kluczePodzielnePrzez3(Map<Integer, Integer> klucze, int dzielnik) {
        boolean result = klucze.isEmpty();
        for (int i : klucze.keySet()) {
            if (i % 3 == 0) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }


    //4. Napisz metode ktora sprawdzi czy mapa zawiera tylko wartosci podzielne przez 3
    public static boolean wartoscPodzielonaPrzezTrzy(Map<Integer, Integer> liczby, int dzielnik) {
        boolean result = liczby.isEmpty();
        for (int i : liczby.values()) {
            if (i % 3 == 0) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    //5.Porównuje dwie mapy i zwraca true jeśli mają identyczne klucze, niezależnie od wartości
    public static boolean dwieMapy(Map<Integer, Integer> mapa1, Map<Integer, Integer> mapa2) {
        Set<Integer> keysMap1 = mapa1.keySet();
        Set<Integer> keysMap2 = mapa1.keySet();
        return keysMap1.contains(keysMap2);
    }


    //7.Zwraca mapę odwrotną, gdzie wartości stają się kluczami, a klucze wartościami. Zakładając, że wszystkie wartości są unikalne.
    public static Map<String, String> odwroconaMapa(Map<String, String> mapa) {
        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }

    //8. Stwórz metodę, która zwraca listę kluczy z mapy, których wartości są największe.
    public static List<Integer> najwiekszaWartosKlucza(Map<Integer, Integer> wartosc) {
        int maxValue = Collections.max(wartosc.values());
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : wartosc.entrySet()) {
            if (entry.getValue() == maxValue) {
                result.add(entry.getKey());
            }
        }
        return result;
    }


    //9.łączy dwie mapy. W przypadku powtarzających się kluScannczy, wartości powinny być sumowane.
    public static Map<String, Integer> polaczonaMapa(Map<String, Integer> nowa1, Map<String,Integer> nowa2) {
        Map<String, Integer> map3 = new HashMap<>();
        map3.putAll(nowa1);
        for (Map.Entry<String, Integer> entry : nowa2.entrySet()) {
            String key = entry.getKey();
            if (map3.containsKey(key)) {
                map3.put(key, map3.get(key) + nowa2.get(key));
            } else {
                map3.put(entry.getKey(), entry.getValue());
            }
        }
        return map3;
    }



    //10.oblicza sumę wartości dla danego zestawu kluczy w mapie.
    public static int sumaWartosci(Map<String, Integer> mapa) {
        Map<String, Integer> mapa11 = new HashMap<>();
        mapa11.put("Motor", 999);
        mapa11.put("Komputer", 499);
        mapa11.put("Krzeslo", 499);
        mapa11.put("Gitara", 501);
        int sumaWartosci = 0;
        for (int i : mapa11.values()) {
            sumaWartosci += i;
        }
        return sumaWartosci;
    }

    /*//11. Zwraca mapę z wartościami jako lista słów, a kluczem długość tych słów.
    public static Map<Integer, String> dlugoscWartosci(Map<Integer, String> dlugosc) {
        Map<Integer, String> mapa12 = new HashMap<>();
        mapa12.put(19, "Radek");
        mapa12.put(10, "Aleksandra");
        mapa12.put(5, "Basia");
        mapa12.put(9, "Wojciech");
        mapa12.put(13, "Mariusz");
        for (String i : mapa12.values()) {
            mapa12.put(i.length(), mapa12.get(mapa12.values()));
        }
        return dlugosc;
    }

     */

    //12.Sprawdza, czy mapa jest pusta lub czy wszystkie jej wartości są puste/null.
    public static boolean czyPusta(Map<String, String> pusta) {
        if (pusta.isEmpty()) {
            return true;
        } else {
            for (String s : pusta.values()) {
                if (s == null || s.isEmpty()) {
                    return true;
                }
            }
            return false;
        }

    }
    public Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("ab",map.get("a") + map.get("b"));
        }

        return map;
    }


    //13. Usuwa z mapy wszystkie pary, których wartości są mniejsze od podanej liczby.
    public static void mniejszeOd(Map<String, Integer> pusta, int liczba) {
        Iterator<Map.Entry<String, Integer>> iterator = pusta.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < liczba) {
                iterator.remove();
            }
        }
    }



    //14. Zwraca zbiór wartości z mapy, które występują więcej niż raz.
    public static int wiecejNizRaz(Map<String, Integer> mapa) {
        //stworzyc seta
        for (int s : mapa.values()) {
            int counter = 0;
            for (int z : mapa.values()) {
                if (s == z) {
                    counter++;
                }
            }
            //jezeli counter > 1  to znaczy ze mamy powrtorki --- dodajemy wartosc do seta
            System.out.println(counter);
        }
        return 0;
    }



        //Metoda z CodnigBat
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s : strings) {
            String literaPierwsza = String.valueOf(s.charAt(0));
            String literaOstatnia = String.valueOf(s.charAt(s.length()-1));
            map.put(literaPierwsza, literaOstatnia);
        }
        return map;
    }















    public static Map<String, String> mapShare(Map<String, String> map) {
        Map<String, String> newMap = new HashMap();
        for(String s : newMap.values()) {
            if(s.contains("a")) {
                newMap.put("a", "aaa");
            } else if (s.contains("b")) {
                newMap.put("b", "aaa");
            } else {
                newMap.remove(map.entrySet());
            }
        }
        return newMap;
    }

    public Map<String, String> topping1(Map<String, String> map) {
        Map<String, String> newMap = new HashMap<String, String>();
        for(String s : map.keySet()) {
            if(s.contains("ice cream")) {
                newMap.put("bread", "butter");
            } else if (s.contains("peanuts")) {
                newMap.put("ice cream", "cherry");
            } else if (s.contains("pancake")) {
                newMap.put("bread", "butter");
            } else if (s.contains("syrup")) {
                newMap.put("pancake", "syrup");
            } else if (s.contains("")) {
                newMap.put("bread", "butter");
            } else if (s.isEmpty()) {

            }
        }
        return newMap;
    }


}
