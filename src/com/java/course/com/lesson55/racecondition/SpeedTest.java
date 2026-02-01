package com.java.course.com.lesson55.racecondition;

public class SpeedTest {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 300_000; i++) {
            counter.increaseV4();
        }
        long end = System.currentTimeMillis();
        System.out.println("Wynik: " + counter.atomicInteger);
        System.out.println("Czas:" + (end - start) + "ms");
        System.out.println();


        Counter counter2 = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                counter2.increaseV4();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                counter2.increaseV4();
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                counter2.increaseV4();
            }
        });

        long start2 = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        long end2 = System.currentTimeMillis();
        System.out.println("Wynik2 = " + counter2.atomicInteger);
        System.out.println("Czas: " + (end2 - start2) + "ms");

    }
}
