package com.java.course.com.lesson69;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Stworz liste liczb naturalynch, i za pomoca streamow
        - oblicz ich sume
        - znajdz min
        - znajdz max
        -znajdz srednia
        - * wyciagnij tylko liczby parzyste, wszystkie podnies do kwadratu i zsumuj liczby od piatej do dziesiatej
         */

        List<Integer> liczby = new ArrayList<>(List.of(1,2,5,6,7,8,9,12,15,18,20,25,30,36));
                int suma = liczby.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(suma);
    }
}
