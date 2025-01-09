package com.java.course.com.lesson41;

public class Hoodie {
    private String brand;
    private double price;
    private String color;
    private Size size;

    public Hoodie(String brand, double price, String color, Size size) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Hoodie{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
