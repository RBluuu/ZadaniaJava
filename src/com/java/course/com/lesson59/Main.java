package com.java.course.com.lesson59;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Radek\\JavaPodstawy\\src\\com\\java\\course\\com\\lesson59\\raport.txt";

        double totalExpenses = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");


                String name = parts[1];
                double base = Double.parseDouble(parts[3]);
                double bonus = Double.parseDouble(parts[4]);
                double deductions = Double.parseDouble(parts[5]);

                double totalForEmployee = base + bonus - deductions;
                totalExpenses += totalForEmployee;

                System.out.printf("Employee: %s, Total expenses: %.2f PLN%n", name, totalForEmployee);
            }

            System.out.printf("TOTAL expenses for all employees: %.2f PLN%n", totalExpenses);

        } catch (FileNotFoundException e) {
            System.out.println("Ooops... file not found");
        } catch (IOException e) {
            System.out.println("Error reading the file");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file");
        }
    }
}
