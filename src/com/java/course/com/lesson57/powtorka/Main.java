package com.java.course.com.lesson57.powtorka;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List vs Set vs Map
        //ArrayList vs LinkedList
        //HashSet vs TreeSet vs LinkedHashSet - to samo dla map
        List<Integer> list = new ArrayList<>( List.of(12, 431, 32, 10, 3, 22, 33)); //Arrays.asList()
        addNumber(9999, list);
        System.out.println(list);

    }

    public static void addNumber(int number, List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == 10) {
                nums.add(number);
            }
        }
    }
}
