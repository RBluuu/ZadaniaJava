package com.java.course.com.lesson49.przykladnr1;

public interface Vechicle {
    boolean canFly();
    boolean canDrive();
    boolean canSailing();

}

class Car implements Vechicle {
    private String name;
    private String model;
    private int price;

    public Car(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canDrive() {
        return true;
    }

    @Override
    public boolean canSailing() {
        return false;
    }
}

class Plane implements Vechicle {

    private String name;
    private String model;
    private int price;

    public Plane(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canDrive() {
        return false;
    }

    @Override
    public boolean canSailing() {
        return false;
    }
}

class Boat implements Vechicle {

    private String name;
    private String model;
    private int price;

    public Boat(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canDrive() {
        return false;
    }

    @Override
    public boolean canSailing() {
        return true;
    }
}
