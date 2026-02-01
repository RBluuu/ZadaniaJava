package com.java.course.com.lesson58.asocjacje.onetoone;

public class Person {
    private String firstame;
    private String lastname;

    private Passport passport; // jeden paszport

    public Person(String firstame, String lastname) {
        this.firstame = firstame;
        this.lastname = lastname;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Passport getPassport() {
            return passport;
    }

    public String getFirstName() {
        return firstame;
    }
}
