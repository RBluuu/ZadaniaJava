package com.java.course.com.lesson50.java.builtin.functional.interfaces;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

        //Consumer
        Consumer<String> print =  word -> System.out.println(word);
        Consumer<String> printUppperCase = word -> System.out.println(word.toUpperCase());
        print.accept("Hello World!!!");
        print.andThen(printUppperCase).accept("hello");
        //napisz consumer ktory do slowa doda !!! i polacz 3 consumery w jeden lancuch (chain)
        Consumer<String> chain = word2 -> System.out.println(word2 + "!!!");
        chain.accept("Hello");
        //Supplier
        Supplier<Double> random =  ()-> Math.random();
        //
        Supplier<String> string1 = () -> "Radek";
        System.out.println(random.get());
        System.out.println(string1.get());
        //Predicate
        Predicate<Integer> even = i -> i % 2==0;
        Predicate<Integer> odd = i -> i % 2 !=0; //nieparzysta
        odd = even.negate();

        Predicate<Integer> wieszkaNiz100 = i -> i > 100;
        System.out.println(wieszkaNiz100.test(2));
        System.out.println(even.test(25));

        Predicate<Integer> parzystaIWiekszaNiz100 = even.and(wieszkaNiz100);
        Predicate<Integer> parzystaLUBWiekszaNiz100 = even.or(wieszkaNiz100);
        System.out.println(parzystaIWiekszaNiz100.test(200));
        System.out.println(parzystaIWiekszaNiz100.test(201));
        System.out.println(parzystaIWiekszaNiz100.test(50));
        //Function
        Function<String,Integer> toLength = word -> word.length();
        System.out.println(toLength.apply("Hello"));

        //2 Funcke
        //doda 2 do liczby
        // pomnozy liczbe przez 2
        Function<Integer,Integer> dodaj = liczba -> liczba + 2;
        Function<Integer,Integer> mnozenie = liczba -> liczba * 2;
        System.out.println(dodaj.apply(5));


        Function<Integer, Integer> f1 = dodaj.andThen(mnozenie);
        Function<Integer, Integer> f2 = dodaj.compose(mnozenie);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(f1.apply(2));
        System.out.println(f2.apply(2));

        print =  word -> System.out.println(word);
        BiConsumer<String,Integer> printWithNumber = (word,number) -> System.out.println(word + number);
        printWithNumber.accept("Hello",10);
        //przyjmij 1 slowo, 1 liczbe i zwroc i sume
        BiFunction<String,Integer,Integer> sum = (word,number) -> word.length() + number;
        DoubleConsumer consumeNumber = number -> System.out.println(number);
        consumeNumber.accept(2.0);

        DoubleToIntFunction func1 = d -> (int)d;
        System.out.println(func1.applyAsInt(23.4214124));
        ToIntFunction<String> stringToInt = word -> word.length();
        System.out.println(stringToInt.applyAsInt("Witam!!"));

        UnaryOperator<Integer> multiplyBy10 = x ->x*10;



    }
}
