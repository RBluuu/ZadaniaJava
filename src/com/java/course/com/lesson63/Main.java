package com.java.course.com.lesson63;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> slowa = new ArrayList<>();
        slowa.add("ola");
        slowa.add("Radek");
        slowa.add("Michał");
        slowa.add("Dawid");
        slowa.add("komputer");

        System.out.println("Najdluze slowo: " + najdluzszeSlowo(slowa,5));

    }

    public static String najdluzszeSlowo(List<String> listaSlow, int nWyrazDlugosci) {
        //if
        //if
        listaSlow.sort(Comparator.reverseOrder());
        return listaSlow.get(nWyrazDlugosci-1);
    }
}
/*
- napisz funkcje ktora zwroci najdluzsze slowo z listy
- teraz chcemy zeby funkcja wypisywala n-ty najdluzszy wyraz
 */

