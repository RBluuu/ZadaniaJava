package com.java.course.com.lesson25.staticvsnonstatic;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car mercedes = new Car("Mercedes", 500_000, 124_215);
        Car bmw = new Car("BMW", 400_000, 224_215);


        bmw.drive(100);
        mercedes.drive(500);


    }
}
