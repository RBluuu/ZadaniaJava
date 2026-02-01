package com.java.course.com.lesson55;

public class Main {
    public static void main(String[] args) {
        //Wielowątkowosć - Concurrency

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(currentThread() + " " + i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(currentThread() + " " + i);
            }
        }
        );
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(currentThread() + " " + i);
            }
        }
        );


        t1.start();
        t2.start();
        t3.start();
        new MyFirstCustomThread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(currentThread() + " " + i);
            }
        }
                , "my-custom-thread"
        ).start();
    }

    private static String currentThread() {
        return Thread.currentThread().getName();
    }
}
/*
1. Zmierzyl ktore rozwiazanie jest szybsze zwiekszenie do 300_000 w watkach czy w zwyklych petlach
2. Napisz VariableCountingService - klasa ktora liczy ile zmiennych danego typu zawieraja podane pliki
- String: 50, int: 100, boolean: 20 .....
- mozemy przekazac liste plikow i serwis liczy ilosc zmiennych w kazdym pliku w osobnym watku
 */