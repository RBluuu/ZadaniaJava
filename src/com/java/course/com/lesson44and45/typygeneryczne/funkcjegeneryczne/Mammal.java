package com.java.course.com.lesson44and45.typygeneryczne.funkcjegeneryczne;

public class Mammal implements Comparable<Mammal>{ //Comparator!!!
    @Override
    /*
    > 0
    ==0
    < 0
     */
    public int compareTo(Mammal o) {
        return 0;
    }
}
