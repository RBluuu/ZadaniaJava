package com.java.course.com.lesson44and45.typygeneryczne.funkcjegeneryczne;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(12, 2, 3, 2);
        List<String> string = List.of("String", "Jan");
        System.out.println(addAllElements(string, string));

        List<Animal> animals = List.of(new Animal());
        List<Mammal> mammals = List.of(new Mammal());
        List<Dog> dogs = List.of(new Dog());

        addAllAnimals(animals,animals);
        addAllAnimals(dogs,dogs);
        //addAllAnimals(mammals,mammals);
        //addAllAnimals(list1,list1);
        addAllAnimals2(animals,dogs);
        //addAllAnimals2(dogs,dogs);
        //addAllAnimals2(list1,dogs);
        //addAllAnimals2(animals,List.of(new Mammal()));
    }

    //napisz funkcje ktora doda elementy z jednej listy do drugiej ???
    public static <T> List<T> addAllElements(List<T> list1, List<T> list2) {
        var copy = new ArrayList<>(list1);
        copy.addAll(list2);
        return copy;
    }
    public static <T extends Animal> List<T> addAllAnimals(List<T> list1, List<T> list2) {
        var copy = new ArrayList<>(list1);
        copy.addAll(list2);
        return copy;
    }
    public static List<? super Animal> addAllAnimals2(List<? super Animal> list1, List<? extends Animal> list2) {
        list1.addAll(list2);
        return list1;
    }

    public static List<?> addAllAnimals3(List<?> list1, List<?> list2) {
        return list1;
        //return <Object>
    }
}

//Mammal
//Animal extends Mammal
//Dog extends Animal