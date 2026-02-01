package com.java.course.com.lesson58.asocjacje.onetomany;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstame;
    private String lastname;
    private final List<Car> cars = new ArrayList<>();

    public Person(String firstame, String lastname) {
        this.firstame = firstame;
        this.lastname = lastname;
    }

    public void addCar(Car car) {
        if (car == null || car.getPerson() != null) {
            throw new IllegalArgumentException();
        }
        cars.add(car);
        //informacja zwrotna
        car.setPerson(this);
    }


    public String getFirstame() {
        return firstame;
    }

    public void setFirstame(String firstame) {
        this.firstame = firstame;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Car> getCars() {
        return cars;
    }

    public String getFirstName() {
        return firstame;
    }
}
