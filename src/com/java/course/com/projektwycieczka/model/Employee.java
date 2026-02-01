package com.java.course.com.projektwycieczka.model;

import jdk.jshell.spi.ExecutionControl;

public abstract class Employee extends Person {
    private int minimumWage;
    private TypeOfContract typeOfContract;
    private int totalHoursWorked;

    public Employee(String firstName, String lastName, String email, int phoneNumber, int minimumWage, TypeOfContract typeOfContract, int totalHoursWorked) {
        super(firstName, lastName, email, phoneNumber);
        this.minimumWage = minimumWage;
        this.typeOfContract = typeOfContract;
        this.totalHoursWorked = totalHoursWorked;
    }

    public int getMinimumWage() throws ExecutionControl.NotImplementedException {
        if (this.typeOfContract != TypeOfContract.TEMPORARY_CONTRACT) {
            throw new ExecutionControl.NotImplementedException("Stawka nie dotyczy tego pracownika");
        }
        return minimumWage;
    }

    public void setMinimumWage(int minimumWage) {
        this.minimumWage = minimumWage;
    }

    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(int totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "minimumWage=" + minimumWage +
                ", typeOfContract=" + typeOfContract +
                ", totalHoursWorked=" + totalHoursWorked +
                '}';
    }
}
