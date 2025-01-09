package com.java.course.com.lesson25;

public abstract class Vehicle {

    private String licensePlate;
    private int horsePower;
    private String brand;
    private int price;

    public Vehicle(String licensePlate, int horsePower, String brand, int price) {
        this.licensePlate = licensePlate;
        this.horsePower = horsePower;
        this.brand = brand;
        this.price = price;
    }

    public abstract void move();

    public abstract void breakVehicle();

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
