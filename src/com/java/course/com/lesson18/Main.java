package com.java.course.com.lesson18;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Klasa - wzor obiektu, przepis na obiekt
        Car bmwM3 = new Car(); //obiekt klasy car
        bmwM3.make = "BMW";
        bmwM3.model = "M3";
        bmwM3.price = 500_000;
        bmwM3.productionYear = 2022;
        bmwM3.country = "Germany";
        System.out.println(bmwM3.make);
        System.out.println(bmwM3.model);
        System.out.println(bmwM3.price);
        System.out.println(bmwM3.productionYear);

        Car mercedeBrabus = new Car(); //obiekt klasy car
        mercedeBrabus.make = "Mercedes";
        mercedeBrabus.model = "Brabus";
        mercedeBrabus.price = 1_000_000;
        mercedeBrabus.productionYear = 2020;
        mercedeBrabus.country = "Germany";
        System.out.println(mercedeBrabus.make);
        System.out.println(mercedeBrabus.model);
        System.out.println(mercedeBrabus.price);
        System.out.println(mercedeBrabus.productionYear);

        Car ferrariSf90 = new Car("Ferrari", "SF90", 3_000_000, 2022, 23_000, "Italy");
        System.out.println(ferrariSf90.model);
        System.out.println(ferrariSf90.make);

        Car vwGolf = new Car("VW", "GolfR", 200_000, 2022, 55_000, "Germany");
        System.out.println(vwGolf.make);
        System.out.println(vwGolf.price);

        Car bmwX5 = new Car("BMW", "X5", 300_000, 2021, 85_000, "Germany");

        Car mercedesGLS = new Car("Mercedes", "GLS", 600_000, 2022, 65_000, "Germany");

        //Car audi = new Car("Audi","RS6", 800_000, 2023, 35_000, "Germany");

        int ilosc = Car.ilosc(List.of(bmwX5, ferrariSf90, mercedesGLS), ferrariSf90.make);
        ilosc = Car.ilosc(List.of(bmwX5, ferrariSf90, mercedesGLS), "Ferrari");
        ilosc = Car.ilosc(List.of(bmwX5, ferrariSf90, mercedesGLS), "Mercedes");
        System.out.println(ilosc);


        bmwM3.startEngine();
        ferrariSf90.startEngine();
        ferrariSf90.stopEngine();
        //Car.startEngine()//!!!
        System.out.println();
        ferrariSf90.printInfo();
        System.out.println();
        bmwM3.printInfo();

        Car mostExpensiveCar = Car.findMostExpensiveCar(List.of());
        ferrariSf90.drive();
        System.out.println();
        bmwM3.stopEngine();
        bmwM3.startEngine();
        System.out.println(bmwM3.distance);
        bmwM3.drive(400);
        System.out.println(bmwM3.distance);

        Car mostExpensiveCar1 = Car.findMostExpensiveCar(List.of(bmwM3, mercedeBrabus, ferrariSf90));
        mostExpensiveCar1.printInfo();
        //Car seat = new Car("Seat", "Model");
        //ferrari
        //"nie ferrari"
        //"ferrari to wloska marka sportowych aut.."

        System.out.println("Zadania nr1");
        System.out.println("Najniższa cena auta z listy to = ");
        Car najtansze = Car.najtanszeAuto(List.of(bmwX5, mercedeBrabus, ferrariSf90));
        najtansze.printInfo();

        System.out.println();
        System.out.println("Zadanie nr2:");
        System.out.println("SREDNIA cena auta " + Car.sredniaCena(List.of(bmwM3, mercedeBrabus, ferrariSf90)));

        System.out.println();
        System.out.println("Zadanie nr3:");
        System.out.println("Najwiecej jest =  ");
        Car najwiecej = Car.najwiecejAut(List.of(bmwM3, mercedeBrabus, ferrariSf90, bmwM3, mercedeBrabus, bmwM3, bmwM3, mercedeBrabus, mercedeBrabus, mercedeBrabus));
        najwiecej.printInfo3();


        Map<String, Integer> carMap = Car.policzPoMarce(List.of(bmwM3, mercedeBrabus, ferrariSf90, bmwM3, mercedeBrabus, bmwM3, bmwM3, mercedeBrabus));
        System.out.println(carMap);
        System.out.println("BBB");
        String carMax = Car.max(carMap);
        System.out.println(("AAA"));
        System.out.println(carMax);

        System.out.println();
        System.out.println("Zadanie nr4:");
        System.out.println("Srednia cena auta z niemiec: " + Car.middelPrice(List.of(bmwX5, vwGolf, ferrariSf90, mercedesGLS, mercedeBrabus)));

        System.out.println();
        System.out.println("Zadanie nr6: funkcje honk");
        vwGolf.Honk();
        System.out.println();


        //Wiadro
        Wiadro wiadro15l = new Wiadro("wiadro15l", 15, 10);
        Wiadro wiadro20l = new Wiadro("wiadro20l", 20, 19);
        Wiadro wiadro25l = new Wiadro("wiadro25l", 25, 17);
        Wiadro wiadro50l = new Wiadro("wiadro50l", 50, 20);

        System.out.println("Suma wypelnienia wszystkich wiader: " + Wiadro.sumaWypelnien(List.of(wiadro15l, wiadro20l, wiadro25l, wiadro50l)));
        System.out.println();

        System.out.println("Srednia wypeniania wiader:" + Wiadro.sredniaWypelnien(List.of(wiadro15l, wiadro20l, wiadro25l, wiadro50l)));
        System.out.println();

        System.out.println("Zadanie z Wiadrem - wlewanie wody");
        wiadro15l.wlejWode(5);
        System.out.println();

        System.out.println("Zadanie z Wiadrem - wylewanie wody");
        wiadro20l.wylejWode(11);
        System.out.println();

        Wiadro najwiekszeWiadro = Wiadro.najwiekszaPojemnosc(List.of(wiadro15l, wiadro20l, wiadro25l, wiadro50l));
        System.out.println("Wiadro z najwieksza pojemnoscia to: ");
        najwiekszeWiadro.printInfo();
        System.out.println();

        System.out.println("Wiadro z najmniejsza pojemnoscia to ");
        Wiadro najmniejszaPojemnosc = Wiadro.najmniejszaPojemnosc(List.of(wiadro15l, wiadro20l, wiadro25l, wiadro50l));
        najmniejszaPojemnosc.printInfo();
        System.out.println();

        Wiadro najwiekszeWypelnienieWiadra = Wiadro.najwiekszeWypelnienie(List.of(wiadro15l, wiadro20l, wiadro25l, wiadro50l));
        System.out.println("Wiadro z najwiekszym wyplenieniem to:");
        najwiekszeWypelnienieWiadra.printInfo2();
        System.out.println();

        //Ksiazka
        System.out.println("Zadanie nr4: Ksiazka");
        Ksiazka nr1 = new Ksiazka("Harry Potter", "Rowling", 330, 2001);
        nr1.printInfo();
        System.out.println();
        Ksiazka nr2 = new Ksiazka("Wiedzimin", "Sapkowski", 400, 2004);
        nr2.printInfo();
        System.out.println();
        Ksiazka nr3 = new Ksiazka("Nic mnie nie zlamie", "Goggins", 368, 2018);
        nr3.printInfo();
        System.out.println();

        System.out.println("Srednia ilosc stron ksiazek to = " + Ksiazka.sredniaStro(List.of(nr1, nr2, nr3)));
        System.out.println();

        System.out.println("Najstarsza ksiazka to = " + Ksiazka.najstarszaKsiazka(List.of(nr1, nr2, nr3)));



    }
}
