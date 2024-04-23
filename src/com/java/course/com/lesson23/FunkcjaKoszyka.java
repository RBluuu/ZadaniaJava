package com.java.course.com.lesson23;

import com.java.course.com.lesson22.ZadanieKoszyk.Koszyk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface FunkcjaKoszyka {
      List<String> produkty = null;
}
     /*
    Napisz klase Koszyk(produkty,ilosc,cena)
    w ktorej mozna wybrac rozne metody platnosci
    przy platnosci karta - dolicz prowizje 2%
    przy platnosci przelewem - daj rabat 3%
    przy platnosci za pobraniem - dolicz 10zl
    zaimplementuj metody
    - total()
    - pay()
    - addProduct()
    - removeProduct()
    - changeQuantity()
     */




    class Usuwanie implements FunkcjaKoszyka {

        public String produkty(List<String> produkty, String produktUsuwany) {
            List<String> nowaLista = new ArrayList<>(produkty);
            for (String produkt : produkty) {
                if (produkt.equals(produktUsuwany)) {
                    nowaLista.remove(produktUsuwany);
                }
            }
            return nowaLista.toString();
    }

    public static List<com.java.course.com.lesson22.ZadanieKoszyk.Koszyk> dodawanie(List<com.java.course.com.lesson22.ZadanieKoszyk.Koszyk> listaProduktow, String sprzet) {
        List<com.java.course.com.lesson22.ZadanieKoszyk.Koszyk> nowaLista = new ArrayList<>(listaProduktow);
        for (Iterator<com.java.course.com.lesson22.ZadanieKoszyk.Koszyk> produkty = nowaLista.iterator(); produkty.hasNext();) {
            Koszyk nastpeny = produkty.next();
            if (produkty.equals(sprzet)) {
                nowaLista.add(nastpeny);
            }
        }
        return nowaLista;
    }



}
