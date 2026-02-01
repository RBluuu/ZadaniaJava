package com.java.course.com.projektwycieczka.model;

import java.util.ArrayList;
import java.util.List;

public class RegisteredCustomer extends Customer {
    private int IDNumber;
    private List<TourService> tripService;

    public RegisteredCustomer(String firstName, String lastName, String email, int phoneNumber, int IDNumber) {
        super(firstName, lastName, email, phoneNumber);
        this.IDNumber = IDNumber;
        this.tripService = new ArrayList<>();
    }

    public List<TourService> getTripService() {
        return tripService;
    }

    public void setTripService(List<TourService> tripService) {
        this.tripService = tripService;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    @Override
    public String toString() {
        return "RegisteredCustomer{" +
                "IDNumber=" + IDNumber +
                ", tripService=" + tripService +
                '}';
    }
}
