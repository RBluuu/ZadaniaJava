package com.java.course.com.lesson49;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Programowanie funkcyjne
        List<Animal> animalList = new ArrayList<>(List.of(new Dog(), new Fish(), new Bird()));
        plywajaceZwierzeta(animalList);
        System.out.println();
        wypiszZwierzeta(animalList,new JumpChecker());
        wypiszZwierzeta(animalList,new FlyChecker());
        System.out.println();

        //klasa anonimowa!!!
        AnimalChecker swimChecker = new AnimalChecker() {
            @Override
            public boolean check(Animal animal) {
                return animal.canSwim();
            }
        };
        //Wyrazenia lambda ->
        AnimalChecker swimCheckerLambda = animal -> animal.canSwim();

        wypiszZwierzeta(animalList,swimChecker);
        wypiszZwierzeta(animalList,swimCheckerLambda);
        wypiszZwierzeta(animalList, animal -> animal.canSwim());
        System.out.println();

        //wypisz wszystkie zweireta ktore plywaja i skacza za pomoca lambdy

        AnimalChecker swimAndJumpCheckerLambda = animal -> animal.canSwim() && animal.canSwim();
        AnimalChecker swimAndJumpCheckerLambda1 = animal -> {
            System.out.println("!!!");
            return animal.canSwim() && animal.canSwim();
        };
        wypiszZwierzeta(animalList,swimAndJumpCheckerLambda);
        wypiszZwierzeta(animalList,animal -> animal.canSwim() && animal.canSwim());


        //2 lambdy ktore spelniaja interfejs Mapper
        Mapper<String, String> zmianaAnaB = animal -> animal.toUpperCase();
        //interfejsy funkcyjney ( taki ktory ma tylko jedna funkcje abstrakcyjna)
        //wbudowane interfejsy funkcyjne w Java
        //metody,funkcje na kolekcjach korzystajace z interfejsow funkcjych
        //JavaFX (Interfejs do wycieczek) (SceneBuilder)
    }

    public static void plywajaceZwierzeta(List<Animal> lista) {
        for (Animal animal : lista) {
            if (animal.canSwim()) {
                System.out.println(animal);
            }
        }
    }
    public static void wypiszZwierzeta(List<Animal> lista, AnimalChecker animalChecker) {
        for (Animal animal : lista) {
            if (animalChecker.check(animal)) {
                System.out.println(animal);
            }
        }
    }
}
