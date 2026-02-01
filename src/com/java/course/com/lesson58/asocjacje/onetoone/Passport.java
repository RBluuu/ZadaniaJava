package com.java.course.com.lesson58.asocjacje.onetoone;

public class Passport {
    private String passportNumber;
    private final Person person; //jedna osoba

    public Passport(String passportNumber, Person person) {
        this.passportNumber = passportNumber;
        this.person = person;
        //informacja zwrotna
        person.setPassport(this);
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Person getPerson() {
        return person;
    }
}
