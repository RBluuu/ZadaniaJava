package com.java.course.com.lesson57.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService employees = Executors.newFixedThreadPool(5); // ThreadPool - Pula Wątków

        for (int i = 0; i < 15; i++) {
            employees.submit(new TaskForEmployee(i + 1));
            //new Thread(new TaskForEmployee(i+1)).start();
        }

        employees.shutdown();

    }

    static class TaskForEmployee implements Runnable {
        int id;

        public TaskForEmployee(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println("===Task number: " + id + " started by " + Thread.currentThread().getName() + "===");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("===Task number: " + id + " finished by " + Thread.currentThread().getName() + "===");
        }
    }
}
/*
- Poprawic zadanie na zliczanie plikow
- 2 tryby dzialania
- wątek dla każdego pliku
- można przekazaź ilosć wątków
- przetestowac ktore rozwiazanie jest szybsze
 */

/*Do powtorzenia
-skroty
-refactor
-comparator i comparable
-relacje posredniczaca kompozycje wiele do wiele z atrybutem kompozycja
-obsluga bledow

 */
