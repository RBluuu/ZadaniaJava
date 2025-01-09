package com.java.course.com.lesson28_29_30.mechanics.zadanienr1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Repair {
    //cene i date
    private int price;
    private LocalDate localDate;
    private List<PartCar> partCars = new ArrayList<>();
    private Mechanic mechanic;

    public Repair(int price, LocalDate localDate) {
        this.price = price;
        this.localDate = localDate;
    }

    public void addPartCar(PartCar partCar) {
        if (partCar == null || partCar != null) {
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

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    @Override
    public String toString() {
        return "Repair: " +
                "price=" + price +
                ", date=" + localDate;
    }
}
