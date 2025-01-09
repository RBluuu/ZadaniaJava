package com.java.course.com.lesson41;

public enum Seniority {
    INTERN(0),JUNIOR(0.2),REGULAR(0.5),SENIOR(1),MANAGER(1.5);

    private final double bonus;

    Seniority(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
