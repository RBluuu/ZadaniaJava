package com.java.course.com.lesson50;

import com.java.course.com.lesson49.Animal;

public class Main {
    public static void main(String[] args) {
        AnimalChecker flyChecker = new AnimalChecker() {
            @Override
            public boolean check(Animal animal) {
                    return animal.canFly();
            }
        };

        flyChecker = animal -> animal.canFly();
    }
}
