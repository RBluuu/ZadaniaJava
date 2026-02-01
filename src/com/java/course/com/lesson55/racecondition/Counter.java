package com.java.course.com.lesson55.racecondition;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    int counter = 0;
    AtomicInteger atomicInteger = new AtomicInteger();
    Lock lock = new ReentrantLock();
    synchronized void increase(){
        counter++;
    }
     void increaseV2(){
        ///.... 100 linijek
        synchronized (this) {
            counter++; //czesc krytyczna
        }
        //.... 100 linijek
    }
    void increaseV3(){
        ///.... 100 linijek
        lock.lock();
        counter++; //czesc krytyczna
        lock.unlock();
        //... 100 linijek
    }

    void increaseV4(){
        atomicInteger.getAndIncrement(); //++
        //atomicInteger++;
    }


}
