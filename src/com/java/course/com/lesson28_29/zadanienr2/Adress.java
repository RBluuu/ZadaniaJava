package com.java.course.com.lesson28_29.zadanienr2;

public class Adress {
    private String street;
    private int streetNumber;
    private String city;

    public Adress(String street, int streetNumber, String city) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", city='" + city + '\'' +
                '}';
    }
}
