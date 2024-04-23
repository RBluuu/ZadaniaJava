package com.java.course.com.lesson22;

import com.java.course.com.lesson22.Osoby.Manager;
import com.java.course.com.lesson22.Osoby.Programista;
import com.java.course.com.lesson22.ZadanieKoszyk.Koszyk;

public class Main {
    public static void main(String[] args) {
        /*
        Hermetyzacja OK
        Dziedziczenie OK
        Abstrakcja OK
        Polimorfizm OK
         */



        Programista radek = new Programista(3500, "Radek", "Błauciak", "Java");
        Programista marek = new Programista(5500, "Marek", "Nowak", "JavaScript");
        Programista darek = new Programista(6500, "Darek", "Kowalski", "UI/UX");
        Manager mariusz = new Manager(10_000,"Mariusz", "Kowalewski", 2550);


        System.out.println(darek.getPensja());
        darek.setPensja(12_000);
        System.out.println(darek.getPensja());
        darek.setPensja(-100);
        System.out.println(darek.getPensja());


        //dajPodwyzke ktora zwiekszy pensje o jakis % ale nie wikeszy niz 20%
        System.out.println(darek.podwyzka(20));


        darek.przywitajSie();
        mariusz.przywitajSie();

        System.out.println(Math.random());

        //Person janek = new Person();

        //2 arbuzy i 3 bulki
        //Koszyk koszyk = new Koszyk();














    }
}
