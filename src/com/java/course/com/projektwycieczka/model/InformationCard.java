package com.java.course.com.projektwycieczka.model;

public class InformationCard {
    private String information;
    private String restricitons;
    private String commentsOnTrip;
    private Trip trip;
    //wycieczka

    public InformationCard(String information, String restricitons, String commentsOnTrip) {
        this.information = information;
        this.restricitons = restricitons;
        this.commentsOnTrip = commentsOnTrip;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getRestricitons() {
        return restricitons;
    }

    public void setRestricitons(String restricitons) {
        this.restricitons = restricitons;
    }

    public String getCommentsOnTrip() {
        return commentsOnTrip;
    }

    public void setCommentsOnTrip(String commentsOnTrip) {
        this.commentsOnTrip = commentsOnTrip;
    }

    @Override
    public String toString() {
        return "InformationCard{" +
                "information='" + information + '\'' +
                ", restricitons='" + restricitons + '\'' +
                ", commentsOnTrip='" + commentsOnTrip + '\'' +
                ", trip=" + trip +
                '}';
    }
}
