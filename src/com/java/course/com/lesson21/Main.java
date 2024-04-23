package com.java.course.com.lesson21;

import com.java.course.com.lesson21.telefon.Smartfon;
import com.java.course.com.lesson21.telefon.Telefon;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    /*    *//* Stworz Klase Telefon(Marka,kolor,pamiec,mpix,cena)
        - wlacz
        - wylacz
        - znajdz najdrozszy telefon
        - znajdz wszystkie telefonu Apple
        - zadzwonDoKogos
        - oblicz srednia cene telefonow Apple
        - zrob zdjecie
        * stworz Klase smartfon ktora dziedziczy po klasie telefon
        */

        Telefon telefonNR1 = new Telefon("Samasong", "Galaxy S12", 125, 50, 3000);
        Telefon telefonNR2 = new Telefon("Google", "Pixel 8 Pro", 128, 48, 3500);
        Telefon telefonNR3 = new Telefon("Realme", "12+", 512, 50, 1600);
        Telefon telefonNR4 = new Telefon("Apple", "13", 128, 12, 2500);
        Telefon telefonNR5 = new Telefon("Apple", "15 Pro", 128, 48, 4649);


        System.out.println("Zadanie nr1:");
        telefonNR1.wlaczTelefon();
        System.out.println();

        System.out.println("Zadanie nr 3");
        System.out.println("Najdroższy telefon to = " + Telefon.najdrozszyTelefon(List.of(telefonNR1, telefonNR2, telefonNR3, telefonNR4, telefonNR5)));
        System.out.println();

        System.out.println("Zadanie nr 4");
        System.out.println("Ilosc telefonow Appel = " + Telefon.ilosc(List.of(telefonNR1, telefonNR2,telefonNR3,telefonNR4,telefonNR5), "Apple"));
        System.out.println();

        System.out.println("Zadanie nr 5");
        telefonNR1.zadzwonDoKogos();
        System.out.println();

        System.out.println("Zadania nr 6");
        System.out.println("Srednia cena Apple = " + Telefon.sredniaCena(List.of(telefonNR1,telefonNR1, telefonNR3, telefonNR4, telefonNR5),"Apple"));
        System.out.println();

        System.out.println("Zadanie nr 7");
        telefonNR1.zrobZdjecie();
        System.out.println();

        System.out.println("Zadanie z *");
        Smartfon NOKIA = new Smartfon("Nokia", "biały",33, 125, 5500, 2021);
        //System.out.println(NOKIA.rokProdukcji);
        System.out.println(NOKIA.getMarka());
        System.out.println();

        NOKIA.info();
        System.out.println();

        System.out.println("Zadanie nr 1 i 2");
        NOKIA.wlaczIWylacz();
        NOKIA.wlaczIWylacz();

















    }
}

/*
Stworz Klase Telefon(Marka,kolor,pamiec,mpix,cena)
- wlacz
- wylacz
- znajdz najdrozszy telefon
- znajdz wszystkie telefonu Apple
- zadzwonDoKogos
- oblicz srednia cene telefonow Apple
- zrob zdjecie
* stworz Klase smartfon ktora dziedziczy po klasie telefon

3 odcinek o dziedziczeniu min: 16:37

 */
