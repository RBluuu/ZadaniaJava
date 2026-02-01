package com.java.course.com.lesson57.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
//        queue.put("msg1");
//        queue.put("msg2");
//        queue.put("msg3");
//        queue.poll();
        queue.put("msg3");
        queue.take();
        System.out.println(queue);
    }
}
/*
Napisac przyklad producer-consumer ale uzywajac BlickingQUeue. Czy wtedy potrzebujemy synchronizacji?
 */