package com.java.course.com.lesson22.Osoby;

import com.java.course.com.lesson22.Osoby.Person;

public class Programista extends Person {
    private String jezykProgramowania;

    public Programista(int pensja, String imie, String nazwisko, String jezykProgramowania) {
        super(pensja, imie, nazwisko);
        this.jezykProgramowania = jezykProgramowania;
    }

    public int podwyzka(int procent) {
        //15_000
        int podwyzka = pensja / 100; //150
        int kwota = podwyzka * procent;//150 * 20 -> 3000
        if (procent <= 20) {
            pensja = pensja + kwota;
        } else {
            System.out.println("Nie dostaniesz podwyzki");
        }
        return pensja;

    }

    public String getJezykProgramowania() {
        return jezykProgramowania;
    }

    public void setJezykProgramowania(String jezykProgramowania) {
        this.jezykProgramowania = jezykProgramowania;
    }


    @Override
    public void pozegnajSie() {
        System.out.println("Siema!");
    }
}
