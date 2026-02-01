package com.java.course.com.lesson71;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Stworz liste liczb i oblicz ich srednia
        //2. posortuj liste ludzi po wieku malejaco
        List<Integer> listaLiczb = new ArrayList<>(List.of(1,2,3,4,5));
        double srednia = listaLiczb.stream()
                .mapToDouble(n -> n)
                .average()
                .orElse(0);
        System.out.println("Srednia = " + srednia);


        Person p1 = new Person("Adam", 125);
        Person p2 = new Person("Ewa", 30);
        Person p3 = new Person("Marek", 30);
        Person p4 = new Person("Anna", 26);
        Person p5 = new Person("Paweł", 35);

        List<Person> listaLudzi = new ArrayList<>(List.of(p1,p2,p3,p4,p5));

        List<Person> posortowanaListaLudzi = listaLudzi.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .toList();
        System.out.println("Posortowana lista = " + posortowanaListaLudzi);




    }
}
