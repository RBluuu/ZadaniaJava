package com.java.course.com.lesson46.mapper;

import com.java.course.com.lesson46.objectcontainer.ObjectContainer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Przyjac lista  liste
        //i zwrocic przeksztalcona liste
        //np przyjac liste Stringow a zwrocic liste intow....

        //Zwrocic liste dlugosci tych stringow
        //Zwrocic liste sum kodow ASCII dla sllow...

        System.out.println(map(List.of("mama", "kasia", "basia", "ala"), new StringToLengthMapper()));
        //String na inne String
        System.out.println();
        System.out.println(map(List.of("mama", "kasia", "basia", "ala"), new StringToUpperString()));
        List<Integer> lista = new ArrayList<>(List.of(1,2,3,10,2123,123));
        //System.out.println(MinMaxService.getMinMax(lista));

        ObjectContainer<String> lista1 = new ObjectContainer<>();
        lista1.addItem("Radek");
        lista1.addItem("Marek");
        System.out.println(lista1);
        System.out.println();
        lista1.removeItem("Radek");
        lista1.addItem("Lukasz");
        lista1.addItem("Michal");
        lista1.addItem("Mirek");
        System.out.println(lista1);
        //System.out.println(lista1.findElement("Michal"));

        ObjectContainer<Integer> numbers = new ObjectContainer<>();
        numbers.addItem(12);
        numbers.addItem(32);
        numbers.addItem(14);
        numbers.addItem(55);
        numbers.addItem(17);
        numbers.addItem(77);
        System.out.println(numbers);
        System.out.println(numbers.findElement(55));
        System.out.println(numbers.findElement(12));
        //Poprawic funkcje find zeby poprawnie zwracała wartosc dla ostatniego elementu listy
        System.out.println(numbers.findElement(77));
        System.out.println(numbers.findElement(-312312));




        /*
        Stworz klase ObjectContaiener<T> ktora moze przechowywac elemetny dowolnego typu
        zaimplementuj funkcje
        add()
        print()
        remove()
        find() - zwraca indeks peirwszego elementu o szukanej wartosci

        !!!! Nie mozesz skorzystac z: Array,List,Map,Set,Kolekcji, nie mozna tez zapisywac elementow w pliku

        //zastanów się/poszukaj  jak działa LinkedList w Javie
        */



    }

    static <A, B> List<B> map(List<A> words, Mapper<A, B> mapper) {
        List<B> result = new ArrayList<>();
        for (A element : words) {
            B mappedElement = mapper.map(element);
            result.add(mappedElement);
        }
        return result;
    }

    interface Mapper<A, B> {
        B map(A a);
    }


    static class StringToUpperString implements Mapper<String,String> {

        @Override
        public String map(String s) {
            return s.toUpperCase();
        }
    }

    static class StringToLengthMapper implements Mapper<String, Integer> {
        @Override
        public Integer map(String s) {
            return s.length();
        }
    }
}
