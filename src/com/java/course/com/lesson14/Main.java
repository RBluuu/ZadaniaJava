package com.java.course.com.lesson14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> liczby = new HashSet<>(); //Nieuporzadkowany
        System.out.println(liczby.add(12));
        System.out.println(liczby.add(12));
        System.out.println(liczby.add(12));
        liczby.add(55);
        liczby.add(13);
        liczby.add(55);
        liczby.add(66);
        System.out.println(liczby);
        liczby = new LinkedHashSet<>();
        System.out.println(liczby.add(12));
        System.out.println(liczby.add(12));
        System.out.println(liczby.add(12));
        liczby.add(55);
        liczby.add(13);
        liczby.add(55);
        liczby.add(66);
        System.out.println(liczby);
        liczby = new TreeSet<>();
        System.out.println(liczby.add(12));
        System.out.println(liczby.add(12));
        System.out.println(liczby.add(12));
        liczby.add(55);
        liczby.add(13);
        liczby.add(55);
        liczby.add(66);
        // liczby.add(null);
        System.out.println(liczby);
        System.out.println(checkNumber(liczby, 10));
        System.out.println(checkNumberV2(liczby, 10));
        System.out.println(checkNumberV2(List.of(12, 32, 43, 1), 10));

        System.out.println(srednia(Set.of(1, 2, 3, 4, 5, 6, 7, 31231)));


        //Typy list
        //ArrayList
        //LinkedList
        //https://www.programiz.com/sites/tutorial2program/files/Java-list-interface.png
        List<String> imiona = new ArrayList<>();
        imiona.add("Ala");
        imiona.add("Kasia");
        imiona.add("Basia");
        System.out.println(imiona);
        imiona = new LinkedList<>();
        imiona.add("Ala");
        imiona.add("Kasia");
        imiona.add("Basia");
        System.out.println(imiona);

        System.out.println(liczba3(List.of(21, 43, 3, 12, 21, 32), 3)); //1
        System.out.println(liczba3(List.of(21, 43, 3, 12, 21, 32), 5)); //0
        System.out.println(liczba3(List.of(21, 43, 3, 12, 21, 32,13,13,13), 13)); //3

    }

    //stworz metde ktora przyjmie liste i policzy ile jest 3
    public static int liczba3(List<Integer> liczby, int n) {
        int licznik = 0;
        for (int liczba : liczby) {
            if (n == 3) {
                licznik++;
            }
        }
        return licznik;
    }
    public static boolean checkNumber(Set<Integer> numbers, int n) {
        return numbers.contains(n);
    }

    public static boolean checkNumberV2(Collection<Integer> numbers, int n) {
        return numbers.contains(n);
    }

    public static double srednia(Set<Integer> numbers) {
        //enhanced for, foreach
        double suma = 0;
        for (int n : numbers) {
            suma += n;
        }
        return suma / numbers.size();
    }



}
