package com.java.course.com.lesson22.Osoby;

public class Manager extends Person {

    private double bonus;

    public Manager(int pensja, String imie, String nazwisko, double bonus) {
        super(pensja, imie, nazwisko);
        this.bonus = bonus;
    }

    @Override
    public void przywitajSie() {
        System.out.println("Witam serdecznie!");
    }

    @Override
    public void pozegnajSie() {
        System.out.println("Narazie");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
