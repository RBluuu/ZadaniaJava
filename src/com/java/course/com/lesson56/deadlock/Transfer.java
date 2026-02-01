package com.java.course.com.lesson56.deadlock;

import java.util.Random;

public class Transfer implements Runnable {

    String accountFrom;
    String accountTo;

    public Transfer(String accountFrom, String accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    public static void transfer(String accountFrom, String accountTo, double amount) {
        int diff = accountFrom.compareTo(accountTo);
        if (diff > 0) {
            synchronized (accountFrom) {
                synchronized (accountTo) {
                    System.out.printf("Transferring %.2f amount from %s to %s\n", amount, accountFrom, accountTo);
                }
            }
        } else {
            synchronized (accountTo) {
                synchronized (accountFrom) {
                    System.out.printf("Transferring %.2f amount from %s to %s\n", amount, accountFrom, accountTo);
                }
            }
        }

    }


    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            double amount = random.nextDouble(100, 2000);
            transfer(accountFrom, accountTo, amount);
        }
    }
}
