package com.java.course.com.lesson36.comparator_comparable;

import java.time.LocalDate;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    /*
    >0
    == 0
    < 0
     */
    @Override
    public int compareTo(Person o) {
        int firstNameComparison = this.firstName.compareTo(o.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }

        int lastNameComparison = this.lastName.compareTo(o.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        return this.dateOfBirth.compareTo(o.dateOfBirth);
    }
}
