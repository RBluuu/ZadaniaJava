package com.java.course.com.lesson36.interfaces;

public interface Animal {
    static String name = "Animal";

    public void makeSound();
}

class Dog implements Animal {


    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }

    public void waveTail() {
        System.out.println("Waving my tail...");
    }
}

class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }

    public void jump() {
        System.out.println("Jumping...");
    }
}