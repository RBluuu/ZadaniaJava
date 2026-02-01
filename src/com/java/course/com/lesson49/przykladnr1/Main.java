package com.java.course.com.lesson49.przykladnr1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car toyota = new Car("Toyota", "Corolla", 30000);
        Car bmw = new Car("BMW", "X5", 60000);
        Car ford = new Car("Ford", "Mustang", 55000);

        Plane boeing = new Plane("Boeing", "737", 100000000);
        Plane airbus = new Plane("Airbus", "A320", 110000000);
        Plane gulfstream = new Plane("Gulfstream", "G650", 65000000);

        Boat yamaha = new Boat("Yamaha", "242X", 75000);
        Boat bayliner = new Boat("Bayliner", "VR5", 35000);
        Boat sunseeker = new Boat("Sunseeker", "Predator 55", 1200000);

        List<Vechicle> vechicles = new ArrayList<>(List.of(toyota,bmw,ford,boeing,airbus,gulfstream,yamaha,bayliner,sunseeker));
        wypiszWyszystkiePojazdy(vechicles);
        System.out.println();
        wypiszWszystkieSamochody(vechicles);
        System.out.println();
        wypiszWszystkieSamoloty(vechicles);
        System.out.println();
        wypiszWszystkieLodzie(vechicles);
        System.out.println();


        wypiszWszystkieSamolotyV2(vechicles,new FlyChecker());
        System.out.println();

        wypiszWszystkieSamochodyV2(vechicles,new DrivingChecker());
        System.out.println();

        VechicleChecker wszystkieSamochodyKtoreJadaLambda = vechicle -> vechicle.canDrive();
        wypiszWszystkieSamochodyV2(vechicles,wszystkieSamochodyKtoreJadaLambda);
        System.out.println();

        VechicleChecker wszystkieSamolotyILodzieLambda = vechicle -> {
            return vechicle.canFly() || vechicle.canSailing();
        };

        System.out.println("Samoloty i lodzie: \n");
        wypiszWyszystkiePojazdyV2(vechicles,wszystkieSamolotyILodzieLambda);

    }

    public static void wypiszWyszystkiePojazdy(List<Vechicle> lista) {
        for (Vechicle vechicle : lista) {
            System.out.println(vechicle);
        }
    }

    public static void wypiszWyszystkiePojazdyV2(List<Vechicle> lista,VechicleChecker vechicleChecker) {
        for (Vechicle vechicle : lista) {
            if (vechicleChecker.chceck(vechicle)) {
                System.out.println(vechicle);
            }
        }
    }

    public static void wypiszWszystkieSamochody(List<Vechicle> lista) {
        for (Vechicle vechicle : lista) {
            if (vechicle.canDrive()) {
                System.out.println(vechicle);
            }
        }
    }

    public static void wypiszWszystkieLodzie(List<Vechicle> lista) {
        for (Vechicle vechicle : lista) {
            if (vechicle.canSailing()) {
                System.out.println(vechicle);
            }
        }
    }

    public static void wypiszWszystkieSamoloty(List<Vechicle> lista) {
        for (Vechicle vechicle : lista) {
            if (vechicle.canFly()) {
                System.out.println(vechicle);
            }
        }
    }

    public static void wypiszWszystkieSamolotyV2(List<Vechicle> lista,VechicleChecker vechicleChecker) {
        for (Vechicle vechicle : lista) {
            if (vechicleChecker.chceck(vechicle)) {
                System.out.println(vechicle);
            }
        }
    }

    public static void wypiszWszystkieSamochodyV2(List<Vechicle> lista,VechicleChecker vechicleChecker) {
        for (Vechicle vechicle : lista) {
            if (vechicleChecker.chceck(vechicle)) {
                System.out.println(vechicle);
            }
        }
    }







}
