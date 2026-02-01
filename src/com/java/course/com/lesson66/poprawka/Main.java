package com.java.course.com.lesson66.poprawka;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int a = 127;
        int b = 127;
        int c = 1000;
        int d = 1000;

        System.out.println(a==b);
        System.out.println(c==d);

        Integer iA = 127;
        Integer iB = 127;
        Integer iC = 1000;
        Integer iD = 1000;

        System.out.println(iA == iB);
        System.out.println(iC == iD);
        System.out.println(iC.equals(iD));

        TreeSet<Integer> set = new TreeSet<>(Comparator.nullsLast(Comparator.naturalOrder()));
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(null);
        System.out.println(set);
    }
}
