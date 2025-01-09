package com.java.course.com.lesson28_29.asocjacje;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    private String subject;
    private LocalDate dateStart;
    private List<Grade> grades = new ArrayList<>();

    public Test(String subject, LocalDate dateStart) {
        this.subject = subject;
        this.dateStart = dateStart;
    }

    /// znajdz najtrudniejszy test - zle
    public static Test toughestTest(List<Test> tests) {
        Test nameTest = tests.get(0);
        for (Test test : tests) {
            if (test.averageGradeFromTest() < nameTest.averageGradeFromTest()) {
                nameTest = test;
            }
        }
        return nameTest;
    }

    public double averageGradeFromTest() {
        double averageRating = 0;
        for (Grade grade : this.getGrades()) {
            averageRating += grade.getValue();
        }
        return averageRating / (grades.size());
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    @Override
    public String toString() {
        return "Test{" +
                "subject='" + subject + '\'' +
                ", dateStart=" + dateStart +
                ", grades=" + grades +
                '}';
    }
}
