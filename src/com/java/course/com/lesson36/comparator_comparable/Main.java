package com.java.course.com.lesson36.comparator_comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("John", "Doe", LocalDate.of(1990, 5, 15)));
        people.add(new Person("Jane", "Smith", LocalDate.of(1985, 10, 3)));
        people.add(new Person("Emily", "Johnson", LocalDate.of(2000, 1, 25)));
        people.add(new Person("Michael", "Brown", LocalDate.of(1992, 7, 19)));
        people.add(new Person("Jessica", "Davis", LocalDate.of(1998, 4, 30)));


        Collections.sort(people);

        System.out.println(people);

        Collections.sort(people,new PersonByBirthDateComparator());
        System.out.println(people);
    }
}
