package com.java.course.com.lesson58.asocjacje.manytomany;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Course> courses = new ArrayList<>();


    public List<Course> getCourses() {
        return courses;
    }
}
