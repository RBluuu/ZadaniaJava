package com.java.course.com.lesson27;

public class Person {
    //Person(name,lastname,age,salary)
    private String name;
    private String lastname;
    private int age;
    private double salary;

    public Person(String name, String lastname, int age, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
