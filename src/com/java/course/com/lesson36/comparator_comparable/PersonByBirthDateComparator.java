package com.java.course.com.lesson36.comparator_comparable;

import java.util.Comparator;

public class PersonByBirthDateComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}
