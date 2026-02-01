package com.java.course.com.lesson55.racecondition;

import java.nio.file.Path;
import java.util.List;

/*
Zwieksz licznik do 300_000
Ale po 100_000 w kazdym watku
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                counter.increaseV4();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                counter.increaseV4();
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                counter.increaseV4();
            }
        });
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(counter.atomicInteger);
        System.out.println();

        VariableCountingService service = new VariableCountingService();

        List<Path> files = List.of(
                Path.of("C:\\Users\\Radek\\JavaPodstawy\\src\\com\\java\\course\\com\\lesson2\\Teoria.java"),
                Path.of("C:\\Users\\Radek\\JavaPodstawy\\src\\com\\java\\course\\com\\lesson48\\Main.java"),
                Path.of("C:\\Users\\Radek\\JavaPodstawy\\src\\com\\java\\course\\com\\lesson48\\Person.java"),
                Path.of("C:\\Users\\Radek\\JavaPodstawy\\src\\com\\java\\course\\com\\lesson56\\Main.java")

        );

        /*Map<String, Map<String, Integer>> result = service.countVariablesInFiles(files);

        result.forEach((file, counts) -> {
            System.out.println("Plik: " + file);
            counts.forEach((type, count) -> System.out.println("  " + type + ": " + count));
        });

        /*
        0. Przerobic zeby te licznosci sie sumowaly ze wszystkich plikow.
        - Chcemy w osobnych watkach zliczac poszczegolne pliki
        - Zebrac te wyniki w calosc
         */
    }
}
