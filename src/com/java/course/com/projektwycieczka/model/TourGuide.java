package com.java.course.com.projektwycieczka.model;

import java.util.ArrayList;
import java.util.List;

public class TourGuide extends Employee {
    private List<String> listOtherLanguages;
    private List<Trip> trips;

    public TourGuide(String firstName, String lastName, String email, int numerTelefonu, int pensjaMinimalna, TypeOfContract rodzajUmowy, int totalHoursWorked, List<String> listOtherLanguages) {
        super(firstName, lastName, email, numerTelefonu, pensjaMinimalna, rodzajUmowy, totalHoursWorked);
        this.listOtherLanguages = listOtherLanguages;
        this.trips = new ArrayList<>();
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    public List<String> getListOtherLanguages() {
        return listOtherLanguages;
    }

    public void setListOtherLanguages(List<String> listOtherLanguages) {
        this.listOtherLanguages = listOtherLanguages;
    }

    @Override
    public String toString() {
        return "TourGuide{" +
                "listOtherLanguages=" + listOtherLanguages +
                ", trips=" + trips +
                '}';
    }
}
