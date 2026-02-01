package com.java.course.com.lesson57.callable;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<Double> future = threadPool.submit(() -> getRate("EUR"));
        Instant start = Instant.now();
        ///.... jakieś bardzo skomplikowane obliczenia....
        Thread.sleep(2000);
        //...koniec skomplikowanych obliczen....
        double eur = future.get();
        System.out.println(eur);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis());
    }

    public static double getRate(String currency) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 4.28;
    }
}
