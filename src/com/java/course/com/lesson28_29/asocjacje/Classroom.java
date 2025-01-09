package com.java.course.com.lesson28_29.asocjacje;

public class Classroom {
    private String number;
    private final School school;

    public Classroom(String number, School school) {
        if (school == null) {
            throw new IllegalArgumentException("School cannot be null");
        }
        this.number = number;
        this.school = school;
        //info zwrotne
        school.getClassrooms().add(this);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "number='" + number + '\'' +
                ", school=" + school +
                '}';
    }
}
