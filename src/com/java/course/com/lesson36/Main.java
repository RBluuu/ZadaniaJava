package com.java.course.com.lesson36;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //2. Uzupelnij kod tak aby program dzialal poprawnie.
        Integer x = 10;
        //x.calculate();
        Map<String, Operation> calculator = new HashMap<>();
        calculator.put("+", new Addition());
        calculator.put("-", new Subtraction());
        calculator.get("+").calculate(2, 3);
        System.out.println(calculator.get("-").calculate(2, 3));
    }
}

abstract class Operation {
    abstract double calculate(double a, double b);
}

class Addition extends Operation {
    @Override
    double calculate(double a, double b) {
        return a + b;
    }
}

class Subtraction extends Operation {

    @Override
    double calculate(double a, double b) {
        return a - b;
    }
}