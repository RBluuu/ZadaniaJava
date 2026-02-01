package com.java.course.com.lesson56.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Task task = new Task();
            task.id = i+1;
            executor.submit(task);
        }

        executor.shutdown();
    }


    static class Task implements Runnable{

        int id;

        @Override
        public void run() {
            System.out.println(id + "  Started by " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(id + " Finished by " + Thread.currentThread().getName());
        }
    }
}
