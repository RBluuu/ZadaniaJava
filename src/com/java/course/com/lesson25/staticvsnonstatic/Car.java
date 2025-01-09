package com.java.course.com.lesson25.staticvsnonstatic;

import java.util.List;

public class Car {
    private String model;
    private double price;
    private double mileage;

    public Car(String model, double price, double mileage) {
        this.model = model;
        this.price = price;
        this.mileage = mileage;
    }

    public void drive(double miles) {
        System.out.println("Driving..." + this.getModel());
        this.mileage += miles;
    }

    public static Car findMostExpensiveCar(List<Car> cars) {
        return cars.get(0);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
