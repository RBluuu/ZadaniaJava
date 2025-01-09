package com.java.course.com.lesson36.usecase;

import java.time.LocalDate;

public interface ObjectPrinter {
    void print(String... data); //vargs -> moge przyjac 0,1 lub wiele argumentow
}

class PersonPrinter implements ObjectPrinter {

    @Override
    public void print(String... data) {
        Person person = new Person(data[1], data[2], LocalDate.parse(data[3]));
        System.out.println(person);
    }
}

class DogPrinter implements ObjectPrinter {

    @Override
    public void print(String... data) {
        Dog dog = new Dog(data[1], data[2], Integer.parseInt(data[3]));
        System.out.println(dog);
    }
}