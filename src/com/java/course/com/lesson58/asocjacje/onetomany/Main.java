package com.java.course.com.lesson58.asocjacje.onetomany;

public class Main {
    public static void main(String[] args) {
        Person radek = new Person("Rdek","Blauciak");
        Car mercedes = new Car("ST12341","Mercedes","W124");
        Car bmw = new Car("WGM123","BMW","X5");

        radek.addCar(mercedes);
        radek.addCar(bmw);
        System.out.println(radek);
    }
}
