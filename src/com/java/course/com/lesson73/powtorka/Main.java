package com.java.course.com.lesson73.powtorka;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>(List.of(1,2,2,3,5));
        liczby.add(null);
        liczby.add(2,null);
        liczby.stream()
                .filter(Objects::nonNull)
                .filter(l -> l != null)
                .filter(l -> l % 2 ==0)
                .map(l -> l * l)
                .forEach(System.out::println);
    }
}

//napisz funkcje za pomocja streamow ktora przyjmie lsite intow i zwroci liste tylko parzystych podniesionych do kwardru
//** pamietaj o walidacji na westepie

