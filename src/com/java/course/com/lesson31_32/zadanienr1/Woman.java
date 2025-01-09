package com.java.course.com.lesson31_32.zadanienr1;

import java.util.ArrayList;
import java.util.List;

public class Woman {
    private String firstname;
    private String lastname;
    private String favoritePlace;
    private String breasts;
    private List<Date> dates = new ArrayList<>();

    public Woman(String firstname, String lastname, String favoritePlace, String breasts) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.favoritePlace = favoritePlace;
        this.breasts = breasts;
    }

    //znajz kobiety z biustem A ktore lubia restauracje
    public static List<Woman> womanWithSizeBreastsAndFavoritePlace(List<Woman> womanList, String favoritePlace) {
        List<Woman> womens = new ArrayList<>();
        for (Woman woman : womanList) {
            if (woman.breasts.equals("A") && woman.favoritePlace.equals("Restaurant")) {
                womens.add(woman);
            }
        }
        return womens;
    }


    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
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

    public String getFavoritePlace() {
        return favoritePlace;
    }

    public void setFavoritePlace(String favoritePlace) {
        this.favoritePlace = favoritePlace;
    }

    public String getBreasts() {
        return breasts;
    }

    public void setBreasts(String breasts) {
        this.breasts = breasts;
    }

    @Override
    public String toString() {
        return "Woman:" +
                "firstname='" + firstname+
                ", lastname='" + lastname+
                ", favoritePlace='" + favoritePlace +
                ", breasts='" + breasts + "; ";
    }
}
