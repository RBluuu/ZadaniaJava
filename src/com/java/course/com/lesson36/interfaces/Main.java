package com.java.course.com.lesson36.interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //https://javastart.pl/baza-wiedzy/programowanie-obiektowe/interfejsy
        Dog dog1 = new Dog();
        dog1.waveTail();


        Cat cat1 = new Cat();
        cat1.jump();

        Animal dog2 = new Dog();
        dog2.makeSound();

        Animal cat2 = new Cat();
        cat2.makeSound();
        Dog dog3 = (Dog) dog2; ///!!!!
        dog3.makeSound();

        makeSounds(List.of(dog2, cat2));
    }

    public static void makeSounds(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
/*
    //0. Zamienic to rozwiazanie na interfejsy
    Integer x = 10;
    //x.calculate();
    Map<String, Operation> calculator = new HashMap<>();
    calculator.put("+", new Addition());
    calculator.put("-", new Subtraction());
    calculator.get("+").calculate(2, 3);
    System.out.println(calculator.get("-").calculate(2, 3));*/
