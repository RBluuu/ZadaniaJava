package com.java.course.com.lesson28_29_30.mechanics.zadanienr1;

import java.time.LocalDate;
import java.util.List;

public class Car {
    //producent,model,cena,rocznik,przebieg
    private String manufacturer;
    private String model;
    private double price;
    private LocalDate localDate;
    private int distance;
    private Mechanic mechanic;

    public Car(String manufacturer, String model, double price, LocalDate localDate, int distance) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.localDate = localDate;
        this.distance = distance;
    }

    //znajdz samochod ktory byl naprawiany najwieksza ilosc razy
    public static Car moustRepairCar(List<Car> cars) {
        Car moustPopular = null;
        for (Car car : cars) {
            if (car.model.equals(car.model)) {
                moustPopular = car;
            }
        }
        return moustPopular;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public String getmanufacturer() {
        return manufacturer;
    }

    public void setmanufacturert(String manufacturer) {
        this.manufacturer = manufacturer;
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

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Car: " +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", date=" + localDate +
                ", distance=" + distance;
    }
}
