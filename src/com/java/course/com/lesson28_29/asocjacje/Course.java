package com.java.course.com.lesson28_29.asocjacje;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private LocalDate dateStart;
    private LocalDate endStart;
    private String name;
    private List<Teacher> teachers = new ArrayList<>();

    public Course(LocalDate dateStart, LocalDate endStart, String name) {
        this.dateStart = dateStart;
        this.endStart = endStart;
        this.name = name;
    }

    public void addTeacher(Teacher teacher) {
        if (teacher == null) {
            return;
        }
        teacher.getCourses().add(this);
        //informacja zwrotna!!!
        this.getTeachers().add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getEndStart() {
        return endStart;
    }

    public void setEndStart(LocalDate endStart) {
        this.endStart = endStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "dateStart=" + dateStart +
                ", endStart=" + endStart +
                ", name='" + name + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
