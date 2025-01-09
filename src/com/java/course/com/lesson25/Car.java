package com.java.course.com.lesson25;

public class Car extends Vehicle {

    private String drivingMode;

    //Car(licensePlate,horsePower,brand,price,drivingMode)
    public Car(String licensePlate, int horsePower, String brand, int price, String drivingMode) {
        super(licensePlate, horsePower, brand, price);
        this.drivingMode = drivingMode;
    }

    public String getDrivingMode() {
        return drivingMode;
    }

    public void setDrivingMode(String drivingMode) {
        this.drivingMode = drivingMode;
    }

    @Override
    public void move() {
        System.out.println("Samochod jedzie..");
    }

    @Override
    public void breakVehicle() {
        System.out.println("Samochod hamuje..");
    }
}
