package com.java.course.com.lesson28_29_30.mechanics.zadanienr1;

import java.time.LocalDate;

public class LightBulbReplacemnt extends Repair {
    public LightBulbReplacemnt(int price, LocalDate localDate) {
        super(price, localDate);
    }

    @Override
    public String toString() {
        return "LightBulbReplacemnt: " +
                "price=" + this.getPrice() +
                ", date=" + this.getLocalDate();
    }
}
