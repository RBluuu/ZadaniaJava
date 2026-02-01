package com.java.course.com.lesson50;

import com.java.course.com.lesson49.Animal;

@FunctionalInterface
public interface AnimalChecker {

    boolean check(Animal animal);

    static void pet(Animal animal) {
        System.out.println("Petting " + animal);
    }

    default boolean defaultCheck(Animal animal) {
        return animal.canFly();
    }
}