package com.java.course.com.lesson28_29_30.mechanics.zadanienr1;

import com.java.course.com.lesson28_29_30.mechanics.zadanienr1.Repair;

import java.time.LocalDate;

public class WheelReplacement extends Repair {
    public WheelReplacement(int price, LocalDate localDate) {
        super(price, localDate);
    }

    @Override
    public String toString() {
        return "WheelReplacement: " +
                "price=" + this.getPrice() +
                ", date=" + this.getLocalDate();
    }
}
