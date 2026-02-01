package com.java.course.com.lesson58.sortowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Collections.addAll(products,
                new Product("Laptop", 999.99, 10),
                new Product("Smartphone", 599.49, 25),
                new Product("Tablet", 329.00, 15),
                new Product("Monitor", 199.99, 12),
                new Product("Keyboard", 49.99, 50),
                new Product("Mouse", 29.99, 60),
                new Product("Printer", 149.95, 8),
                new Product("Desk Lamp", 39.89, 20),
                new Product("Webcam", 89.99, 18),
                new Product("External HDD", 120.00, 30),
                new Product("USB-C Cable", 12.99, 100),
                new Product("Charger", 24.95, 40),
                new Product("Graphics Card", 399.99, 5),
                new Product("Gaming Chair", 229.00, 7),
                new Product("Microphone", 79.00, 13),
                new Product("Router", 89.49, 9),
                new Product("HDMI Cable", 10.50, 80),
                new Product("Surge Protector", 18.99, 25),
                new Product("Laptop Stand", 34.90, 14),
                new Product("Notebook Cooler", 27.75, 11)
        );


        Collections.sort(products);
        System.out.println(products);
        Collections.sort(products, Comparator.comparingInt(Product::getQuantityInStock));
        System.out.println(products);
    }
}
