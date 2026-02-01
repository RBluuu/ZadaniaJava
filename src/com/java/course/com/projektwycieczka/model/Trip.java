package com.java.course.com.projektwycieczka.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Trip {
    private int numberID;
    private String nameOfTheTrip;
    private double price;
    private List<ThemeOfTrip> nameOfTrip;
    private int tripReview;
    private InformationCard informationCard;
    private List<BuyingTirp> listOfBuyingTrips;
    private List<TourGuide> guides;

    public Trip(int numberID, String nameOfTheTrip, double price, List<ThemeOfTrip> nameOfTrip, int tripReview, InformationCard informationCard) {
        this.numberID = numberID;
        this.nameOfTheTrip = nameOfTheTrip;
        this.price = price;
        this.nameOfTrip = nameOfTrip;
        this.tripReview = tripReview;
        this.informationCard = informationCard;
        this.listOfBuyingTrips = new ArrayList<>();
        this.guides = new ArrayList<>();
    }

    public void dodajPrzewodnikaDoWycieczki(TourGuide tourGuide) {
        this.guides.add(tourGuide);
        tourGuide.getTrips().add(this);
    }

    public List<TourGuide> getGuides() {
        return guides;
    }

    public void setGuides(List<TourGuide> guides) {
        this.guides = guides;
    }

    public List<ThemeOfTrip> getNameOfTrip() {
        return nameOfTrip;
    }

    public void setNameOfTrip(List<ThemeOfTrip> nameOfTrip) {
        this.nameOfTrip = nameOfTrip;
    }

    public List<BuyingTirp> getListOfBuyingTrips() {
        return listOfBuyingTrips;
    }

    public void setListOfBuyingTrips(List<BuyingTirp> listOfBuyingTrips) {
        this.listOfBuyingTrips = listOfBuyingTrips;
    }

    public int getNumberID() {
        return numberID;
    }

    public void setNumberID(int numberID) {
        this.numberID = numberID;
    }

    public String getNameOfTheTrip() {
        return nameOfTheTrip;
    }

    public void setNameOfTheTrip(String nameOfTheTrip) {
        this.nameOfTheTrip = nameOfTheTrip;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public InformationCard getInformationCard() {
        return informationCard;
    }

    public void setInformationCard(InformationCard informationCard) {
        this.informationCard = informationCard;
    }

    public int getTripReview() {
        return tripReview;
    }

    public void setTripReview(int tripReview) {
        this.tripReview = tripReview;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "numerID=" + numberID +
                ", nameOfTheTrip='" + nameOfTrip + '\'' +
                ", price=" + price +
                ", themeOfTheTrip=" + nameOfTrip +
                ", tripReview=" + tripReview +
                ", informationCard=" + informationCard +
                ", listOfBuyingTrips=" + listOfBuyingTrips +
                ", guides=" + guides +
                '}';
    }
}
