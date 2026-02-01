package com.java.course.com.projektwycieczka.model;

public class UnregisteredCustomer extends Customer {
    public UnregisteredCustomer(String firstName, String lastName, String email, int phoneNumber) {
        super(firstName, lastName, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "Unregistered{}";
    }
}
