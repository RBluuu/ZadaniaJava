package com.java.course.com.lesson52.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Optional
        System.out.println(avg(5));
        System.out.println(avg(10, 15, 20));
        System.out.println(avg());
        System.out.println(avg(0, 0, 0, 0, 0));
        System.out.println();
        System.out.println(avgOptional(10,20));
        System.out.println(avgOptional());
        System.out.println(avgOptional(0,0,0));

        Optional<Double> optionalResult = avgOptional(50, 12, 23, 4, 2, 3, 1, 31);
        Double result = optionalResult.get();
        System.out.println(result > 10);

        Optional<Double> emptyResult = avgOptional();
        //System.out.println(emptyResult.get() > 10); //Exception in thread "main" java.util.NoSuchElementException: No value present
        if(emptyResult.isPresent()){
            System.out.println(emptyResult.get() > 10);
        }else{
            System.out.println("No results!");
        }

        Optional<String> empty = Optional.of("ADAM");

        String orElse = empty.orElse("USER");
        System.out.println(orElse);
        String orElseGet = empty.orElseGet(()->"USER");
        System.out.println(orElseGet);
        String orElseThrow = empty.orElseThrow();
        System.out.println(orElseThrow);
        String orElseThrow2 = empty.orElseThrow(() -> new RuntimeException("!!!"));
        System.out.println(orElseThrow2);


        Optional<List<String>> emptyUsernames  = Optional.empty();
        Optional<List<String>> usernames  = Optional.of(Arrays.asList("maciek","zuzia","marek"));

        List<String> users = emptyUsernames.orElseGet(()->getUsernames());
        System.out.println(users);

        String username = "adam123PL";

        Optional<String> usernameOptional = username == null ? Optional.empty() : Optional.of(username);
        usernameOptional = Optional.ofNullable(username);

    }
    public static List<String> getUsernames() {
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return Arrays.asList("alice", "bob", "charlie");
    }
    public static double avg(double... scores) {
        if (scores.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / scores.length;
    }

    public static Optional<Double> avgOptional(double... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return Optional.of(sum / scores.length);
    }
}
