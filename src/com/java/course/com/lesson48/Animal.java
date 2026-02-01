package com.java.course.com.lesson48;

import java.io.Serial;
import java.io.Serializable;

public class Animal implements Serializable {
    @Serial
    private static final long serialVersionUID = 764999986127349318L;
    private String name;
    private Person person;

    public Animal(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
