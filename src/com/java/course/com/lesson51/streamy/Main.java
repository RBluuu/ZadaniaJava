package com.java.course.com.lesson51.streamy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );

        Stream<Integer> stream = numbers.stream();
        System.out.println(stream.allMatch(n -> n % 2 == 0));

         /*
         System.out.println(stream.allMatch(n -> n % 2 != 0));
        Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:637)
    }
    */
        System.out.println(numbers.stream()
                .allMatch(n -> n % 2 != 0));

        System.out.println(numbers.stream().count());
        System.out.println(numbers.size());

        System.out.println(numbers.stream().max(Comparator.naturalOrder()));
        System.out.println(numbers.stream().max(Comparator.reverseOrder()));
        System.out.println(numbers.stream().min(Comparator.naturalOrder()));

        System.out.println(numbers.stream()
                .map(n -> n * n)
                .toList());

        System.out.println(numbers.stream()
                .map(n -> +2)
                .max(Comparator.naturalOrder()));

        System.out.println(numbers.stream().anyMatch(n -> n % 2 == 0));
        System.out.println(numbers.stream().noneMatch(n -> n > 1000));
        System.out.println(numbers.stream().distinct().toList());
        System.out.println(numbers.stream()
                .map(n -> n * n)
                .dropWhile(n -> n < 30).toList());
        System.out.println(numbers.stream()
                .map(n -> n * n)
                .takeWhile(n -> n < 30).toList());
        System.out.println(numbers.stream().filter(n->n % 2 == 0).toList());
        System.out.println(numbers.stream().findAny());
        System.out.println(numbers.stream().findFirst());
        System.out.println(numbers.stream().limit(5L).toList());
        System.out.println(numbers.stream().skip(3L).toList());
        System.out.println();
        System.out.println();
        System.out.println();
        numbers.stream().map(n -> n * 2)
                .peek(System.out::println)
                .map( n -> n * 2)
                .peek(System.out::println)
                .filter(n -> n > 200)
                .peek(System.out::println)
                .toList();
        numbers.stream();

                //omowic Optional
                // reduce
                // collect
                //flatMap i mapMulti
    }
}