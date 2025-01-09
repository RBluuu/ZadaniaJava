package com.java.course.com.lesson28_29.asocjacje;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private String street;
    private int streetNumber;
    private String city;

    private Address address;
    private List<Student> students = new ArrayList<>();

    private final List<Classroom> classrooms = new ArrayList<>();


    public School(String name, String street, int streetNumber, String city) {
        this.name = name;
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
    }

    public School(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    //addStudent()
    public void addStudent(Student student) {
        if (student == null || student.getSchool() != null) {
            return;
        }
        student.setSchool(this);
        //informacja zwrotna!!!
        this.getStudents().add(student);
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", city='" + city + '\'' +
                '}';
    }
}
