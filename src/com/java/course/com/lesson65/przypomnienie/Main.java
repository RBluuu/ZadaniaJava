package com.java.course.com.lesson65.przypomnienie;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(4324, 2, 13, 13, 32, 43, 43, 23, 112, 3);

        //i=undex
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }
}
