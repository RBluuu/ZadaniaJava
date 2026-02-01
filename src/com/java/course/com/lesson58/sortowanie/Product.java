package com.java.course.com.lesson58.sortowanie;

public class Product implements Comparable<Product>{
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                '}';
    }

    @Override
    public int compareTo(Product other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) return nameComparison;

        int priceComparison = Double.compare(this.price, other.price);
        if (priceComparison != 0) return priceComparison;

        return Integer.compare(this.quantityInStock, other.quantityInStock);
    }
}
