package com.java.course.com.projektwycieczka.model;

import java.util.List;

public class AbroadTrip extends Trip {
    private String country;
    private String typeOfTransport;

    public AbroadTrip(int numberID, String nameOfTrip, double price, List<ThemeOfTrip> themeOfTrip, int tripReview, InformationCard informationCard, String country, String typeOfTransport) {
        super(numberID, nameOfTrip, price, themeOfTrip, tripReview, informationCard);
        this.country = country;
        this.typeOfTransport = typeOfTransport;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    @Override
    public String toString() {
        return "AbroadTrip{" +
                "country='" + country + '\'' +
                ", typeOfTransport='" + typeOfTransport + '\'' +
                '}';
    }
}
