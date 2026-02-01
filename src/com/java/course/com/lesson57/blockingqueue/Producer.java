package com.java.course.com.lesson57.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    private BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            int count = 0;
            while (count < 5) {
                String item = "nr " + count;
                queue.put(item);
                System.out.println("Produced: " + item);
                Thread.sleep(100);
                count++;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
