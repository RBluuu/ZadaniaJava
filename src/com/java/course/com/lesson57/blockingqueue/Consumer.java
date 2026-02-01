package com.java.course.com.lesson57.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            int count = 0;
            while (count < 5) {
                String item = queue.take();
                System.out.println("Consumed: " + item);
                Thread.sleep(100);
                count++;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
