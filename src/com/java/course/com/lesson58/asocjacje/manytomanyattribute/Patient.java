package com.java.course.com.lesson58.asocjacje.manytomanyattribute;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String firstname;
    private String lastname;
    private String pesel;
    private List<Visit> visits = new ArrayList<>();

    public Patient(String firstname, String lastname, String pesel) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.pesel = pesel;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
