package com.java.course.com.lesson22.ZadanieKoszyk;

import java.util.ArrayList;
import java.util.List;

public class ZadanieKoszyk {
    public static void main(String[] args) {
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

        Koszyk telefon = new Koszyk("Telefon", 2, 5_000);
        Koszyk telewizor = new Koszyk("Telewizor", 1, 6_999);
        Koszyk ladowarka = new Koszyk("Ladowarka", 3, 58);
        Koszyk kabel = new Koszyk("Kabel", 1, 50);
        Koszyk przedluzacz = new Koszyk("Przedluzacz", 2, 69);


        System.out.println("Rodzaj platnosci: " + Koszyk.rodzajPlatnosci(List.of(telefon,telewizor,ladowarka,kabel,przedluzacz),"pobranie") + " zl");

        System.out.println("Usuwanie produktu z listy " + Koszyk.usuwanie(List.of(telefon,telewizor,ladowarka,kabel,przedluzacz),"Telefon"));

        System.out.println("Dodawanie do listy = " + Koszyk.dodawanie(List.of(telefon,telewizor,ladowarka,kabel,przedluzacz),"Telefon"));


    }












}
