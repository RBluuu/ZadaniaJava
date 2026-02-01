package com.java.course.com.lesson49.przykladnr2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("HP", 3000);
        Computer c2 = new Computer("Acer", 5000);
        Computer c3 = new Computer("Apple", 8000);

        Telefon t1 = new Telefon("Apple",5600);
        Telefon t2 = new Telefon("Samsung",4900);
        Telefon t3 = new Telefon("Xaomi",2500);

        TV tv1 = new TV("Samsung",9999);
        TV tv2 = new TV("Sony",8999);
        TV tv3 = new TV("TCL",4999);

        List<Electronica> electronicas = new ArrayList<>(List.of(c1,c2,c3,t1,t2,t3,tv1,tv2,tv3));
        wszystkieElementy(electronicas);
        System.out.println();

        wszystkieElementyZCheckerem(electronicas,electronica -> electronica.canLearn());
        System.out.println();

        ElecktronicaChecker electronicaCheckerLambda = electronica -> electronica.canLearn();
        System.out.println("Lambda");
        wszystkieElementyZCheckerem(electronicas,electronicaCheckerLambda);



    }

    public static void wszystkieElementy(List<Electronica> lista) {
        for (Electronica element : lista) {
            System.out.println(element);
        }
    }

    public static void wszystkieElementyZCheckerem(List<Electronica> electronicas, ElecktronicaChecker checker) {
        for (Electronica electronica : electronicas) {
            if (checker.check(electronica)) {
                System.out.println(electronica);
            }
        }
    }
}
