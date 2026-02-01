package com.java.course.com.projektwycieczka.model;

import java.util.List;

public class DomesticTrip extends Trip {
    private String City;

    public DomesticTrip(int numberID, String nameOfTrip, double price, List<ThemeOfTrip> themeOfTrip, int tripReview, InformationCard informationCard, String City) {
        super(numberID, nameOfTrip, price, themeOfTrip, tripReview, informationCard);
        this.City = City;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    @Override
    public String toString() {
        return "DomesticTrip{" +
                "City='" + City + '\'' +
                '}';
    }
}
