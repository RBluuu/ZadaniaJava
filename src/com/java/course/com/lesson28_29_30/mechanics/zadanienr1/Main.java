package com.java.course.com.lesson28_29_30.mechanics.zadanienr1;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Samochody(producent,model,cena,rocznik,przebieg)
        są naprawiane przez Mechaników(imie,nazwisko,pensja,wiek)
        Do napraw mogą zostać wykorzystane nowe części samochodowe(nazwa,cena)
        Dla kazdej naprawy chcemy przechowywac cene i date
        - znajdz mechanika ktory wykonal najdrozsze naprawy - zrobione
        - znajdz najdrozsza naprawe - zrobione
        - znajdz samochod ktory byl naprawiany najwieksza ilosc razy
        - ile wyniosla suma napraw za okres od czerwca do listopada 2022?
        - znajdz najdrozsza wykorzystana czesc
         */

        ///!!!
        Bmw bmw1 = new Bmw("BMW", "M3", 500_000, LocalDate.of(2024,10,4),65_452);

        Car bmw = new Car("BMW", "M3", 500_000, LocalDate.of(2024,10,4),65_452);
        Car mercedes = new Car("Mercedes", "Brabus 900", 900_000, LocalDate.of(2022,9,15),35_546);
        Car ford = new Car("Ford", "Focus RS3", 200_000, LocalDate.of(2021,2,19),88_546);
        Car vw = new Car("VW", "Golf", 90_000, LocalDate.of(2023,5,12),74_390);

        Mechanic radek = new Mechanic("Radek", "Blauciak", 5_800,28);
        Mechanic marek = new Mechanic("Marek", "Nowak", 5_400,32);
        Mechanic lukasz = new Mechanic("Lukasz", "Kowalski", 5_800,46);

        Repair wheelReplacement = new WheelReplacement(250,LocalDate.of(2022,Month.AUGUST,15));
        Repair motorOilReplacment = new MotorOilReplacment(650,LocalDate.of(2022,Month.JUNE,23));
        Repair lightBulbReplacemnt = new LightBulbReplacemnt(100,LocalDate.of(2022,Month.DECEMBER,12));
        Repair handBrakeReplecmant = new HandBrakeReplecmant(750,LocalDate.of(2022,Month.NOVEMBER,13));

        PartCar wheel = new PartCar("Wheel",850);
        PartCar oilFilter = new PartCar("airFilter",320);
        PartCar oil = new PartCar("Oil",250);
        PartCar lightBulb = new PartCar("Light Bulb",30);
        PartCar line = new PartCar("line",250);

        radek.addCar(bmw);
        radek.addCar(mercedes);
        radek.addCar(vw);

        marek.addCar(ford);
        marek.addCar(vw);

        lukasz.addCar(vw);
        lukasz.addCar(ford);

        radek.addRepairCar(wheelReplacement);
        radek.addRepairCar(handBrakeReplecmant);

        lukasz.addRepairCar(motorOilReplacment);

        lukasz.addRepairCar(lightBulbReplacemnt);
        lukasz.addRepairCar(wheelReplacement);

        wheelReplacement.addPartCar(wheel);
        motorOilReplacment.addPartCar(oil);
        motorOilReplacment.addPartCar(oilFilter);
        lightBulbReplacemnt.addPartCar(lightBulb);
        motorOilReplacment.addPartCar(line);

        System.out.println();

        System.out.println("znajdz mechanika ktory wykonal najdrozsze naprawy: " + Mechanic.moustExpensiveRepairOfMechniak(List.of(radek,marek,lukasz)));
        System.out.println();

        System.out.println("znajdz najdrozsza naprawe: " + Repair.moustExpensiveRepair(List.of(wheelReplacement,motorOilReplacment,lightBulbReplacemnt,handBrakeReplecmant)));
        System.out.println();

        System.out.println("znajdz samochod ktory byl naprawiany najwieksza ilosc razy: " + Car.moustRepairCar(List.of(bmw,mercedes,ford,vw)));
        System.out.println();

        System.out.println("ile wyniosla suma napraw za okres od czerwca do listopada 2022?: " + Repair.totalRepairsDuringThePeriod(List.of(wheelReplacement,motorOilReplacment,lightBulbReplacemnt,handBrakeReplecmant), LocalDate.of(2022,6,1),LocalDate.of(2022,11,1)));
        System.out.println();
    }
}


/*
/*
KocieMamy(id, imie, rasa, dataUrodzenia, waga, wysokosc) mogą rodzić Kociątka(id, imie, rasa, dataUrodzenia, waga, wysokosc)
W pliku kociemamy.txt znajduje się lista kocich rodziców podana w formacie: id, imie, rasa, dataUrodzenia, waga, wysokosc
np.
1, Lusia, Brytyjska, 2016-04-15, 4, 55
2, Puszek, Syjamska, 2017-05-22, 6, 40
3, Burek, Maine Coon, 2016-03-11, 10, 70
4, Misiek, Ragdoll, 2016-06-18, 8, 65

W pliku kociatka.txt znajduje się lista kociąt podana w formacie: id, imie, rasa, dataUrodzenia, waga, wysokosc, mamaId
np.
1, Maluszek, Brytyjska, 2018-03-21, 2, 35, 1
6, Lisek, Brytyjska, 2019-01-20, 2, 30, 1

2, Kuleczka, Syjamska, 2019-04-25, 3, 25, 2


3, Płateczek, Maine Coon, 2018-02-19, 5, 45, 3
5, Burasek, Maine Coon, 2019-08-05, 5, 50, 3

7, Puchatek, Ragdoll, 2019-09-15, 6, 42, 4
4, Kłębek, Ragdoll, 2019-07-23, 4, 40, 4

-- Znajdź kocie mamy, ktore urodzily bliźnięta. - nie wiem jak z data
-- Ile jest maluchów ważących poniżej 3 kg? - zrobione
-- Znajdź kocia mame, ktora miała najwięcej potomstwa od stycznia 2018 do stycznia 2019.
-- Podaj imię i wagę najciężej kociej mamy.
-- Podaj średnią wagę kociąt urodzonych w lipcu 2019.

!!!
Kociatko nie moze istniec bez mamy
Asocjacje zawsze przeprowadzamy po calych obiektach a nie identyfikatorach
Kociatko powinno miec "cala Mame" jako obiekt a nie tylko idMatki
 */
