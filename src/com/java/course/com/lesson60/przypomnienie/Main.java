package com.java.course.com.lesson60.przypomnienie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(342, 32, 432, 42, 413, 123, 124, 13, 412, 31));
        ImmutableClassExample imm = new ImmutableClassExample(
                "Immutable class example",
                numbers
        );

        System.out.println(imm.getName());
        System.out.println(imm.getNumbers().add(141241));
        System.out.println(imm.getNumbers().remove(0));
        System.out.println(imm.getNumbers());

        //numbers.stream().findFirst().orElseGet()


    }
}
