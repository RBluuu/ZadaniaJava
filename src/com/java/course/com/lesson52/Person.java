package com.java.course.com.lesson52;

import java.util.*;
import java.util.stream.Collectors;

public class Person {
    private String firstName;
    private String lastName;
    private int salary;
    private String country;

    public Person(String firstName, String lastName, int salary, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.country = country;
    }

    public static List<Person> findByLastname(List<Person> people, String lastname) {
        return Optional.ofNullable(people)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(person -> person.getLastName().equals(lastname))
                .toList();
    }

    public static Person findByMaxSalary(List<Person> people) {
        return people.stream()
                .sorted(Comparator.comparingInt(Person::getSalary).reversed())
                .findFirst()
                .orElseThrow();
    }

    public static Person findByMaxSalaryV2(List<Person> people) {
        return people.stream()
                .max(Comparator.comparingInt(Person::getSalary))
                .orElseThrow();
    }

    public static int findMaxSalary(List<Person> people) {
        return people.stream()
                .mapToInt(p -> p.getSalary())
                .sum();
    }

    public static double findAverageSalary(List<Person> people) {
        return people.stream()
                .mapToInt(p -> p.getSalary())
                .average()
                .orElse(0);
    }

    //pogrupuj wszystkich ludzi  po inicjale (pierwsza litera naziwska)
    public static Map<Character, List<Person>> groupByInitials(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(
                        person -> person.getLastName().charAt(0)
                ));
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", country='" + country + '\'' +
                '}';
    }
}
