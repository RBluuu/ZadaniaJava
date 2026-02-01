package com.java.course.com.lesson46.mapper.minmax;

import com.java.course.com.lesson46.minmax.MinMax;

import java.util.Collections;
import java.util.List;

public class MinMaxService {

    public static <T extends Comparable<T>> MinMax<T> getMinMax(List<T> list) {
        return new MinMax<>(
                Collections.min(list),
                Collections.max(list)
        );
    }
}
