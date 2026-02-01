package com.java.course.com.lesson58.asocjacje.onetomany;

public class Car {
    private String licensePlate;
    private String make;
    private String model;

    private Person person;

    public Car(String licensePlate, String make, String model) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
