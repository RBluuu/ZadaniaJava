package com.java.course.com.lesson44and45.typygeneryczne;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.setContent(123);
        System.out.println(box.getContent());
        box.setContent("hello world!!!");
        System.out.println(box.getContent());

        //box.setContent(true);
        String boxContent =(String) box.getContent(); //Exception in thread "main" java.lang.ClassCastException
        System.out.println(boxContent.length());

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setContent("Hello Content");
        String content = stringGenericBox.getContent();

        GenericBox<Integer> integerGenericBox = new GenericBox<>();

        //!!! Zla praktyka, zawsze chcemy definiowac typ klasy generycznej
        GenericBox objectBox = new GenericBox();

        List whatever = new ArrayList<>();
        whatever.add(123);
        whatever.add("aefafea");
        whatever.add(true);

        System.out.println(whatever);

        Pair<Integer,String> pair = new Pair<>();
        pair.setContent1(123);
        pair.setContent2("Hello");


        Pair<Integer,Integer> par2 = new Pair<>();
        par2.setContent1(123);
        par2.setContent2(321);
    }
}
//Stworzmy klase Pair i przechowuje 2 contenty roznych typow
//