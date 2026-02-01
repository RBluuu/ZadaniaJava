package com.java.course.com.lesson65;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Napisz funkcje ktora sprawdzi czy w podanej LISCIE sa JAKIEKOLWIEK 2 takie same liczby po sobie
        //*** N powtorzen, czyli nie 2 obok siebie ale dowolna ilosc
        //[1,15,2,2,6,7]
        //[1,15,2,8,2,7]

        //[1,1,5,4,2]
        //[1,6,5,7,7]
        List<Integer> lista = new ArrayList<>(List.of(1111, 1111, 5, 4, 2));
        System.out.println(sprawdzanieParLiczbNaLiscie(lista, 1111));
        List<Integer> lista2 = new ArrayList<>(List.of(1, 6, 5, 7, 5));
        System.out.println(sprawdzanieParLiczbNaLiscie(lista2, 7));


        //czy lista zawiera 2 liczby ktore sumuja sie do oczekiwanej wartosci
        //5 -> [2,1,1,1,3,6] -> [2,3] -> jezeli tak true/false
        System.out.println("=============");
        List<Integer> list3 = new ArrayList<>(List.of(2, 1, 1, 1, 3, 6));
        System.out.println(wynikDodawaniaDwochLiczb(list3, 8));
        List<Integer> list4 = new ArrayList<>(List.of(2, 1, 1, 1, 3, 6));
        System.out.println(wynikDodawaniaDwochLiczb(list4, 16));
        List<Integer> list5 = new ArrayList<>(List.of(2, 1, 1, 1, 1, 1));
        System.out.println(wynikDodawaniaDwochLiczb(list5, 4));
        System.out.println("==========11111");
        List<Integer> list6 = new ArrayList<>(List.of(2, 1, 1, 1, 3, 6));
        System.out.println(wynikDodawaniaDwochLiczbV2(list6, 8));
        List<Integer> list7 = new ArrayList<>(List.of(2, 1, 1, 1, 3, 6));
        System.out.println(wynikDodawaniaDwochLiczbV2(list7, 16));
        //xbadxxx - true
        //badxxx - true
        //xxbadxx - false

        String slowo1 = "xbadxxx";
        String slowo2 = "badxxx";
        String slowo3 = "xxbadxx";
        System.out.println(sprawdzanieCzyZawieraSlowo(slowo1, "bad", 1));
        System.out.println(sprawdzanieCzyZawieraSlowo(slowo2, "bad", 1));
        System.out.println(sprawdzanieCzyZawieraSlowo(slowo3, "bad", 1));

        System.out.println("=========V3++++++++++++++");
        List<Integer> list8 = new ArrayList<>(List.of(2, 1, 1, 1, 3, 6));
        System.out.println(wynikDodawaniaDwochLiczbV3(list8, 8));

    }

    public static boolean sprawdzanieParLiczbNaLiscie(List<Integer> lista, int podajLiczba) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == podajLiczba) {
                if (lista.get(i).equals(lista.get(i + 1))) {
                    return true;
                }
            }
        }
        return false;
    }

    //napisz werjse 1linijkowa
    public static boolean wynikDodawaniaDwochLiczb(List<Integer> lista, int wynik) {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 1; j < lista.size(); j++) {
                if (lista.get(i) + lista.get(j) == wynik) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean wynikDodawaniaDwochLiczbV3(List<Integer> lista, int wynik) {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) + lista.get(i) == wynik) {
                    return true;
                }
            }
        return false;
    }


    public static Map<Integer, Integer> wynikDodawaniaDwochLiczbV2(List<Integer> lista, int wynik) {
        Map<Integer, Integer> mapa = new HashMap<>();
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 1; j < lista.size(); j++) {
                if (lista.get(i) + lista.get(j) == wynik) {
                    mapa.put(i, j);
                }
            }
        }
        return mapa;
    }

    /*
   //Sprawdz czy podany String jako parametr zaczynajac od 0 lub 1 indeksu ma w sobie slowo bad
	//xbadxxx - true
	//badxxx - true
	//xxbadxx - false
     */

    public static boolean sprawdzanieCzyZawieraSlowo(String slowo, String slowoZawarte, int numerIndeksu) {
        System.out.println(slowo.substring(numerIndeksu));
        if (slowo.substring(0,4).equals(slowoZawarte)) {
            return true;
        }
        return false;
    }
}
