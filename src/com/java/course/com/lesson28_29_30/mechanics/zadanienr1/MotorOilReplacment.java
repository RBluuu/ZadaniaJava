package com.java.course.com.lesson28_29_30.mechanics.zadanienr1;

import java.time.LocalDate;

public class MotorOilReplacment extends Repair {
    public MotorOilReplacment(int price, LocalDate localDate) {
        super(price, localDate);
    }

    @Override
    public String toString() {
        return "MotorOilReplacment: " +
                "price=" + this.getPrice() +
                ", date=" + this.getLocalDate();
    }
}
