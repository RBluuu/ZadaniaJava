package com.java.course.com.lesson44and45.typygeneryczne.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(List.of(
                new Animal("Gacek","Black","Cat"),
                new Animal("Reksio","Brown","Dog"),
                new Animal("Nemo","Gold","Fish")
        ));

        Collections.sort(animals);

        System.out.println(animals);
    }
}
