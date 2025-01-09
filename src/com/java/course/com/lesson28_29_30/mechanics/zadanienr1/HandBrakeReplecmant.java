package com.java.course.com.lesson28_29_30.mechanics.zadanienr1;

import java.time.LocalDate;

public class HandBrakeReplecmant extends Repair {
    public HandBrakeReplecmant(int price, LocalDate localDate) {
        super(price, localDate);
    }

    @Override
    public String toString() {
        return "HandBrakeReplecmant: " +
                "price=" + this.getPrice() +
                ", date=" + this.getLocalDate();
    }
}
