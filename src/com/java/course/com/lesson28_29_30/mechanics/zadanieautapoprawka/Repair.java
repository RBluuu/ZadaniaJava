package com.java.course.com.lesson28_29_30.mechanics.zadanieautapoprawka;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Repair {
    //cene i date
    private int price;
    private LocalDate localDate;
    private List<PartCar> partCars = new ArrayList<>();
    private final Mechanic mechanic;
    private final Car car;

    public Repair(int price, LocalDate localDate, Mechanic mechanic, Car car) {
        if (mechanic == null || car == null) {
            throw new IllegalArgumentException();
        }
        this.price = price;
        this.localDate = localDate;
        this.mechanic = mechanic;
        this.car = car;
        //info zwrotne
        car.getRepairs().add(this);
        mechanic.getRepairs().add(this);
    }

    /*
     public Grade(int value, Student student, Test test) {
        if(student == null || test == null){
            throw new IllegalArgumentException("Student or test cannot be null");
        }
        this.value = value;
        this.student = student;
        this.test = test;
        //info zwrotne
        student.getGrades().add(this);
        test.getGrades().add(this);
    }
     */

    public void addPartCar(PartCar partCar) {
        if (partCar == null) {
            return;
        }
        partCar.setRepair(this);
        this.getPartCars().add(partCar);
    }

    //znajdz najdrozsza naprawe
    public static Repair moustExpensiveRepair(List<Repair> repairs) {
        Repair moustExpensive = null;
        int price = Integer.MIN_VALUE;
        for (Repair repair : repairs) {
            if (repair.price > price) {
                price = repair.price;
                moustExpensive = repair;
            }
        }
        return moustExpensive;
    }

    //ile wyniosla suma napraw za okres od czerwca do listopada 2022?
    public static int totalRepairsDuringThePeriod(List<Repair> repairs, LocalDate from, LocalDate to) {
        int sum = 0;
        for (Repair repair : repairs) {
            if (repair.localDate.isAfter(from) || repair.localDate.isBefore(to)) {
                sum += repair.price;
            }
        }
        return sum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return localDate;
    }

    public void setDate(LocalDate date) {
        this.localDate = date;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public List<PartCar> getPartCars() {
        return partCars;
    }

    public void setPartCars(List<PartCar> partCars) {
        this.partCars = partCars;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }


    @Override
    public String toString() {
        return "Repair: " +
                "price=" + price +
                ", date=" + localDate;
    }
}
