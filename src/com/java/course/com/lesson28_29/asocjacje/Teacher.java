package com.java.course.com.lesson28_29.asocjacje;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private List<String> subject;
    private List<Course> courses = new ArrayList<>();

    public Teacher(String name, String lastName, LocalDate birthDate, List<String> subject) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.subject = subject;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", subject=" + subject +
                ", courses=" + courses +
                '}';
    }
}
