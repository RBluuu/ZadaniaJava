package com.java.course.com.lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PoprawaZadan {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(21, 43, 5, 6, 7, 3, 32, 43, 54));
        System.out.println(checkNumber(integers, 6));
        System.out.println(checkNumber(integers, 21));
        System.out.println();
        List<Integer> odwroconaLista = odwrocListe(integers);
        System.out.println(odwroconaLista);
        System.out.println(integers);

    }

    public static boolean checkNumber(List<Integer> numbers, int n) {
        //numbers.get(0)
        return numbers.contains(n);
    }

    public static List<Integer> odwrocListe(List<Integer> numbers) {
        List<Integer> kopia = new ArrayList<>(numbers);
        Collections.reverse(kopia);
        return kopia;
    }

    public static List<Integer> bezDuplikatow(List<Integer> numbers) {
        return new ArrayList<>(new HashSet<>(numbers));
    }
    //2,2,1,3,4,4,4,5
    //1,2,2,3,4,4,4,5
}
