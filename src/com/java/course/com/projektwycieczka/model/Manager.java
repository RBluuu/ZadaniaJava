package com.java.course.com.projektwycieczka.model;

public class Manager extends Employee {
    private int lastMonthBonus;

    public Manager(String firstName, String lastName, String email, int phoneNumber, int minimumWage, TypeOfContract typeOfContract, int totalHoursWorked, int lastMonthBonus) {
        super(firstName, lastName, email, phoneNumber, minimumWage, typeOfContract, totalHoursWorked);
        this.lastMonthBonus = lastMonthBonus;
    }

    public int getLastMonthBonus() {
        return lastMonthBonus;
    }

    public void setLastMonthBonus(int lastMonthBonus) {
        this.lastMonthBonus = lastMonthBonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "lastMonthBonus=" + lastMonthBonus +
                '}';
    }
}
