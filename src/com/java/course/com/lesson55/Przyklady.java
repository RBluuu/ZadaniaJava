package com.java.course.com.lesson55;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static com.java.course.com.lesson55.CountRaceCondition.coutner;
import static com.java.course.com.lesson55.CountRaceCondition.increment;

public class Przyklady {
    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello world");
            }
        });
        t1.start();
        System.out.println(t1);
        System.out.println();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        });
        t2.start();
        System.out.println(t2);
        System.out.println();

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                increment();
            }
        });
        t3.start();
        t3.join();

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 13; i++) {
                increment();
            }
        });
        t4.start();
        t4.join();

        System.out.println();
        System.out.println(coutner);
        System.out.println();


        Thread t5 = new Thread(() -> {
            lock.lock();
            for (int i = 0; i < 3; i++) {
                System.out.println("Hello world");
            }
            lock.unlock();
        });
        t5.start();
        System.out.println(t5);
        System.out.println();

        Thread t6 = new Thread(() -> {
            lock.lock();
            for (int i = 0; i < 2; i++) {
                System.out.println("Hello world v2");
            }
            lock.unlock();
        });
        t6.start();
        System.out.println(t6);
        System.out.println();



    }
}
