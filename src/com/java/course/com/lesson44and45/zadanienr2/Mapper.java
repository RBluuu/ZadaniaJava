package com.java.course.com.lesson44and45.zadanienr2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Mapper {
    //nanoszenie obiektow B na A
    public static <A, B> List<B> zmiana(List<A> list, Function<A, B> mapper) {
        List<B> result = new ArrayList<>();
        for (A element : list) {
            result.add(mapper.apply(element));
        }
        return result;
    }

    //mapper do LocalDate
    static class StringToLocalDateMapper implements Function<String, LocalDate> {
        @Override
        public LocalDate apply(String dateString) {
            return LocalDate.parse(dateString);
        }
    }


    //podnoszenie do Kwadratu
    static class SquareMapper implements Function<Integer, Integer> {
        @Override
        public Integer apply(Integer number) {
            return number * number;
        }
    }
}
