package com.java.course.com.lesson28_29.asocjacje;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grade {
    private final int value;
    private final Student student;
    private final Test test;

    public Grade(int value, Student student, Test test) {
        if(student == null || test == null){
            throw new IllegalArgumentException("Student or test cannot be null");
        }
        this.value = value;
        this.student = student;
        this.test = test;
        //info zwrotne
        student.getGrades().add(this);
        test.getGrades().add(this);
    }

    public int getValue() {
        return value;
    }

    public Student getStudent() {
        return student;
    }

    public Test getTest() {
        return test;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "value=" + value +
                '}';
    }
}


