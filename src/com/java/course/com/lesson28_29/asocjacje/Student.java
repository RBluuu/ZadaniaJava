package com.java.course.com.lesson28_29.asocjacje;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Model danych ANEMICZNY VS DOMENOWY
public class Student {
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private School school;
    private List<Grade> grades = new ArrayList<>();


    public Student(String firstname, String lastname, LocalDate birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    //oblicz srednia ocen wszystkich uczniow - zrobione
    public static double meanGrade(List<Student> students) { // tez jest ok
        int number = 0;
        double averageRating = 0;
        for (Student student : students) {
            for (Grade grade : student.getGrades()) {
                averageRating += grade.getValue();
                number++;
            }
        }
        return averageRating / number;
    }

    public static double meanGradeV2(List<Student> students) { // ale to jest lepiej
        double averageRating = 0;
        for (Student student : students) {
            averageRating += student.averageGrade();
        }
        return averageRating / students.size();
    }

    public static Student bestStudent(List<Student> students) {
        Student topStudent = students.get(0);
        for (Student student : students) {
            if (student.averageGrade() > topStudent.averageGrade()) {
                topStudent = student;
            }
        }
        return topStudent;
    }


    //znajdz najgorszeo ucznia
    public static Student weakestStudentV2(List<Student> students) {
        Student worstAverage = students.get(0);
        for (Student student : students) {
            if (student.averageGrade() < worstAverage.averageGrade()) {
                worstAverage = student;
            }
        }
        return worstAverage;
    }
    //znajdz najwyzsza srednia ocen
    public static Student highestMeanGrade(List<Student> students) {
        Student worstAverage = students.get(0);
        for (Student student : students) {
            if (student.averageGrade() > worstAverage.averageGrade()) {
                worstAverage = student;
            }
        }
        return worstAverage;
    }



    //szuka po obiekcie i liczy srednia kazdego ucznia
    public double averageGrade() {
        double averageRating = 0;
        for (Grade grade : this.getGrades()) {
            averageRating += grade.getValue();
        }
        return averageRating / (grades.size());
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthdate=" + birthdate +
                ", school=" + school +
                ", grades=" + grades +
                '}';
    }
}
