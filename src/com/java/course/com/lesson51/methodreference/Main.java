package com.java.course.com.lesson51.methodreference;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> newMap = new HashMap<>();
        newMap.put("Radek", 10);
        newMap.put("Marek", 105);
        newMap.put("Darek", 99);
        newMap.merge(
                "Radek", 50, (oldValue, defaultValue) -> oldValue + defaultValue
        );
        newMap.merge(
                "Radek", 50, Integer::sum
        );
        newMap.merge(
                "Radek", 50, Integer::max
        );
        newMap.merge(
                "Radek", 50, Main::doSomething
        );
    }

    public static int doSomething(int a, int b) {
        return (int) (a * b * b + 100 / 29.0 * a);
    }
}
