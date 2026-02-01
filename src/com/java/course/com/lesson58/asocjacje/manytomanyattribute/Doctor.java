package com.java.course.com.lesson58.asocjacje.manytomanyattribute;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String firstname;
    private String lastname;
    private List<Visit> visits = new ArrayList<>();

    public Doctor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
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


}
