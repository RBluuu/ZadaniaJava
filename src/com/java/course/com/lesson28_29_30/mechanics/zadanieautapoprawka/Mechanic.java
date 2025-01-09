package com.java.course.com.lesson28_29_30.mechanics.zadanieautapoprawka;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {
    //Mechaników(imie,nazwisko,pensja,wiek)
    private String firstName;
    private String lastName;
    private int salary;
    private int age;
    private List<Repair> repairs = new ArrayList<>();


    public Mechanic(String firstName, String lastName, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    //- znajdz mechanika ktory wykonal najdrozsze naprawy
    public static Mechanic moustExpensiveRepairOfMechniak(List<Mechanic> mechanics) {
        Mechanic moustExpensiveMechanic = mechanics.get(0);
        for (Mechanic mechanic : mechanics) {
           if (mechanic.moustExpensiveRepair() >moustExpensiveMechanic.moustExpensiveRepair()) {
               moustExpensiveMechanic = mechanic;
            }
        }
        return moustExpensiveMechanic;
    }

    public int moustExpensiveRepair() {
        int price = Integer.MIN_VALUE;
        for (Repair repair : this.getRepairs()) {
            if (repair.getPrice() > price) {
                price = repair.getPrice();
            }
        }
        return price;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
    }

    @Override
    public String toString() {
        return "Mechanic: " + '\'' +
                "firstName= " + firstName + '\'' +
                ", lastName= " + lastName + '\'' +
                ", salary= " + salary +
                ", age= " + age ;
    }
}
