package com.java.course.com.lesson74;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String test = "test@email.com";
        Optional<String> optional = Optional.ofNullable(test);
        if (optional.isPresent()) {
            System.out.println("istnieje + " + optional.get());
        } else {
            System.out.println("nie istnieje");
        }

       String email = optional.orElse(test);
        System.out.println(email);

        /*
        Poprawic test
        Obejrzec filmik
        Projekt wycieczka
         */
    }
}
