package com.java.course.com.lesson60.przypomnienie;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClassExample {
    private final String name;
    private final List<Integer> numbers;

    public ImmutableClassExample(String name, List<Integer> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }
}
