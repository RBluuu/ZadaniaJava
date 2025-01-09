package com.java.course.com.lesson37_38_39.mutablemapkey;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Newborn,Integer> map = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();

        Newborn newborn = new Newborn(123,'b',"Michal", LocalDate.of(1995,5,5),2500,53);
        map.put(newborn,10);
        System.out.println(map);
        Integer number = map.get(newborn);
        System.out.println(number);
        System.out.println();
        newborn.setFirstName("Ala");
        number = map.get(newborn);
        System.out.println(number);
        System.out.println(map.containsKey(newborn));
        System.out.println(map);

        /*
        If an object’s hashCode() value can change based on its state,
        then we must be careful when using such objects as keys in hash-based collections
         to ensure that we don’t allow their state to change
         when they are being used as hash keys.
         All hash-based collections assume that an object’s hash
         value does not change while it is in use as a key in the collection.
          If a key’s hash code were to change while it was in a collection,
           some unpredictable and confusing consequences could follow.
           This is usually not a problem in practice — it is not common practice
            to use a mutable object like a List as a key in a HashMap.
         */


    }
}
