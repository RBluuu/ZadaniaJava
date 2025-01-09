package com.java.course.com.lesson25;

public class Motorbike extends Vehicle{
    //Motorbike(licensePlate,horsePower,brand,price,gripType)
    private String gripType;

    public Motorbike(String licensePlate, int horsePower, String brand, int price, String gripType) {
        super(licensePlate, horsePower, brand, price);
        this.gripType = gripType;
    }

    public String getGripType() {
        return gripType;
    }

    public void setGripType(String gripType) {
        this.gripType = gripType;
    }

    @Override
    public void move() {

    }

    @Override
    public void breakVehicle() {

    }
}
