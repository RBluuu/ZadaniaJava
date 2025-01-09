package com.java.course.com.lesson28_29_30.mechanics.zadanienr1;

public class PartCar {
    //części samochodowe(nazwa,cena)
    private String name;
    private double price;
    private Repair repair;

    public PartCar(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Repair getRepair() {
        return repair;
    }

    public void setRepair(Repair repair) {
        this.repair = repair;
    }

    @Override
    public String toString() {
        return "PartCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
