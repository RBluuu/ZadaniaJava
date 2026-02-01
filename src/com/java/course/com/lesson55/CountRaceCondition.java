package com.java.course.com.lesson55;

public class CountRaceCondition {
    public static int coutner = 0;

    public static synchronized void increment(){
        coutner++;
    }
}
