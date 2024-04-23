package com.java.course.com.lesson21.bank;


//static - atrybuty klasowe
//non-static - atrubuty obiektowe


import java.time.LocalDate;
import java.util.List;

public class KontoBankowe {

    public static int iloscKont = 0;

    private String nrKonta;
    private String wlasciciel;
    private LocalDate dataZalozenia;
    private double balans;

    public KontoBankowe(String nrKonta, String wlasciciel, LocalDate dataZalozenia, double balans) {
        this.nrKonta = nrKonta;
        this.wlasciciel = wlasciciel;
        this.dataZalozenia = dataZalozenia;
        this.balans = balans;
    }

    public void ileWplacono() {
        System.out.println(this.balans);
    }

    //kontoJedrka.wyplac();
    //KontoBankowe.wyplac();
    public void wyplac(double ilosc) {
        this.balans -= ilosc;
    }

    //kontoJedrka.iloscWplaconychPieniedzy()

    //KontoBankowe.iloscWplaconychPieniedzy();
    public static double iloscWplaconychPieniedzy(List<KontoBankowe> kontoBankowe) {
        int suma = 0;
        for (KontoBankowe bankowe : kontoBankowe) {
            suma += bankowe.balans;
        }
        return suma;
    }

    public String getNrKonta() {
        return nrKonta;
    }

    public void setNrKonta(String nrKonta) {
        this.nrKonta = nrKonta;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public LocalDate getDataZalozenia() {
        return dataZalozenia;
    }

    public void setDataZalozenia(LocalDate dataZalozenia) {
        this.dataZalozenia = dataZalozenia;
    }

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }
}
