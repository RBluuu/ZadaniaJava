package com.java.course.com.lesson55;

public class MyFirstCustomThread  extends Thread{
    public MyFirstCustomThread(Runnable target, String name) {
        super(target, name);
    }
}
