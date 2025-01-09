package com.java.course.com.lesson31_32.zadanienr1;

import java.util.ArrayList;
import java.util.List;

public class Developer {
    private String firstname;
    private String lastname;
    private int age;
    private String language;
    private List<Date> dates = new ArrayList<>();

    public Developer(String firstname, String lastname, int age, String language) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.language = language;
    }

    public int sumDeveloperWithLanguage(List<Developer> developers) {
        int suma = 0;
        Developer sumWithLanguage = developers.get(0);
        for (Developer developer : developers) {
            if (developer.getLanguage().equals(sumWithLanguage.getLanguage())) {
                suma++;
            }
        }
        return suma;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Developer: " +
                "firstname=" + firstname +
                ", lastname='" + lastname +
                ", age=" + age +
                ", language='" + language;
    }
}
