package com.java.course.com.lesson72;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,1,1,1,2,2,2,2));
        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum());
        System.out.println(list.stream()
                .takeWhile(n -> n % 2 != 0)
                .mapToInt(n -> n)
                .sum());

        int suma = list.stream()
                .reduce(0,(a,b) -> a + b);
        System.out.println(suma);

        //oblicz iloczyn wszyskich liczb za pomoca funkcji reduce(mnozenie)

        int suma2 = list.stream()
                .reduce(1,(a,b) -> a * b);
        System.out.println(suma2);

        int wynik = list.stream()
                .filter(n -> n %2 ==0)
                .findFirst()
                .orElse(0);
        System.out.println(wynik);


        List<Object> map1 = list.stream()
                .map(l -> l *2)
                .collect(Collectors.toList());
        System.out.println(map1);


        int suma5 = list.stream()
                .reduce(0,(a,b) -> a + b);
        System.out.println(suma5);

        List<Integer> collect = list.stream()
                .collect(
                        () -> list,
                        (list1, n) -> System.out.println(list1),
                        (list1, list2) -> System.out.println(list)
                );

        System.out.println(collect);
        System.out.println();

        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .collect(
                        () -> new ArrayList<>(),
                        (l, number) -> l.add(number),
                        (l1, l2) -> l1.addAll(l2)
                ));

        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .collect(
                        Collectors.toList()
                ));

        //na podstwaie collect(1,2,3) zbierz elemety parzyste z listy do TreeSeta
        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .collect(
                        () -> new TreeSet<>(),
                        (l, parzyste) -> l.add(parzyste),
                        (l2,l3) -> l2.add(l3)
                ));
    }
}
