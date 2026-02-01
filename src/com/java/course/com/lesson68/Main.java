package com.java.course.com.lesson68;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(43, 24, 123, 431, 432, 42, 3, 13, 133, 2423, 432, 4324123);

        Stream<Integer> stream = list.stream();
        System.out.println(stream.skip(3).toList());
        //System.out.println(stream.limit(5).toList());
        System.out.println(list.stream().limit(5).toList());

        //wypisz sume wszystkich liczb parzystych z streama
        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n->n)
                .sum());


    }
}
