package com.java.course.com.lesson41.kalkulator;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Operacje> calculator = new HashMap<>();
        calculator.put("+", Operacje.DODAWANIE);
        calculator.put("-", Operacje.ODEJMOWANIE);
        calculator.put("*", Operacje.MNOZENIE);
        calculator.put("/", Operacje.DZIELENIE);

        System.out.println(calculator.get("+").licz(2, 2));
        System.out.println(calculator.get("-").licz(2, 2));
        System.out.println(calculator.get("*").licz(2, 2));
        System.out.println(calculator.get("/").licz(2, 2));

    }
}
