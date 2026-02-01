package com.java.course.com.lesson53;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Osoba janek = new Osoba("Jan","Kowalski",50);
        Osoba karol = new Osoba("Karol","Kowalski",50);
        System.out.println(janek.getImie());
        int wiekJanka = janek.getWiek();
        janek.setWiek(44);

        System.out.println(Osoba.znajdzNajstarsza(List.of(janek)));

        janek.przywitajSie();
        karol.przywitajSie();

        //Osoba.przywitajSie();
    }
}
