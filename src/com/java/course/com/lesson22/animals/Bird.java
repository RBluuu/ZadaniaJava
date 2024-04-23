package com.java.course.com.lesson22.animals;

public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Squeek");
    }
    public void fly(){
        System.out.println("Flying...");
    }
}
