package com.java.course.com.lesson52.zadanie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class PriceRange {
    private final double from;
    private final double to;

    public PriceRange(double from, double to) {
        if (from > to) {
            throw new IllegalArgumentException("From nie moze byc wieksze od To");
        }
        this.from = from;
        this.to = to;
    }

    public static List<PriceRange> validatedRanges(List<PriceRange> ranges) {
        if (ranges == null) {
            throw new IllegalArgumentException("nie moze byc null");
        }
        for (PriceRange range : ranges) {
            if (range == null) {
                throw new IllegalArgumentException("Price range cannot be null");
            }
            if (range.from > range.to) {
                throw new IllegalArgumentException("Invalid range: " + range);
            }
        }

        // Opcjonalnie: sprawdzanie nakładających się zakresów
        List<PriceRange> sorted = new ArrayList<>(ranges);
        sorted.sort(Comparator.comparingDouble(PriceRange::getFrom));
        for (int i = 0; i < sorted.size() - 1; i++) {
            PriceRange current = sorted.get(i);
            PriceRange next = sorted.get(i + 1);
            if (current.to >= next.from) {
                throw new IllegalArgumentException("Overlapping ranges: " + current + " and " + next);
            }
        }
        return sorted;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    @Override
    public String toString() {
        return
                "from=" + from +
                ", to=" + to;
    }
}
