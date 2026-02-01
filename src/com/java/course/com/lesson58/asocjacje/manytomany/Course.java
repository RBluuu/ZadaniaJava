package com.java.course.com.lesson58.asocjacje.manytomany;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<Student> students = new ArrayList<>();
    public void addStudent(Student student){
        if(student == null){
            throw new IllegalArgumentException();
        }
        students.add(student);
        student.getCourses().add(this);
    }
}
