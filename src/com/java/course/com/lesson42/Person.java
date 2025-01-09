package com.java.course.com.lesson42;

import com.java.course.com.lesson42.exceptions.EntityNotFoundException;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate age;

    public Person(String firstName, String lastName, LocalDate age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //Rzucic wyjatkiem w sytuacji gdy Person sie nie znajdzie
    public static Person findPerson(List<Person> personList, String firstName, String lastname) {
        for (Person person : personList) {
            if (person.firstName.equals(firstName) && person.lastName.equals(lastname)) {
                return person;
            }
        }
        throw new EntityNotFoundException(
                "Person",
                Map.of("firstname", firstName, "lastname", lastname),
                Instant.now()
        );
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
