package com.java.course.com.lesson25;

public class Boat extends Vehicle{
    //Boat(licensePlate,horsePower,brand,price,finMaterial String)
    private String finMaterial;

    public Boat(String licensePlate, int horsePower, String brand, int price, String finMaterial) {
        super(licensePlate, horsePower, brand, price);
        this.finMaterial = finMaterial;
    }

    public String getFinMaterial() {
        return finMaterial;
    }

    public void setFinMaterial(String finMaterial) {
        this.finMaterial = finMaterial;
    }

    @Override
    public void move() {

    }

    @Override
    public void breakVehicle() {

    }
}
