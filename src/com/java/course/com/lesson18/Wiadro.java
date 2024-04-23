package com.java.course.com.lesson18;

import java.util.List;

public class Wiadro {
    String nazwa;
    int pojemnosc;
    int wypelnienie;

    public Wiadro(String nazwa, int pojemnosc, int wypelnienie) {
        this.nazwa = nazwa;
        this.pojemnosc = pojemnosc;
        this.wypelnienie = wypelnienie;
    }

    //oraz metody: wlejWode (powinno zwiekszyc wypelnienie),
    // wylejWode (powinno zmniejszyc wypelnienie),
    // przelejWode (powinno zmniejszyc wypelnienie w jednym obiekcie i zwiekszyc w drugim)

    public void wlejWode(int ilosc) {
        System.out.println("Woda przed wlaniem = " + wypelnienie + "lit.");
        this.wypelnienie += ilosc;
        System.out.println("Ilosc wody po wlaniu = " + wypelnienie + "lit.");
    }

    public void wylejWode(int ilosc) {
        System.out.println("Woda przed wylaniem = " + wypelnienie + "lit.");
        this.wypelnienie -= ilosc;
        System.out.println("Ilosc wody po wylaniu = " + wypelnienie + "lit.");
    }

    public void przelejWode(int ilosc) {
        System.out.println("Wiadro nr1: " + wypelnienie + "lit");
        System.out.println("Wiadro nr2: " + wypelnienie + "lit");
        this.wypelnienie -= ilosc;
        this.wypelnienie += ilosc;

    }

    //znajdz wiadro o najwiekszej pojemnosci

    public static Wiadro najwiekszaPojemnosc(List<Wiadro> wiadra) {
        Wiadro pojemnosc = null;
        int wielkosc = 0;
        for (Wiadro wiadro : wiadra) {
            if (wiadro.pojemnosc > wielkosc) {
                pojemnosc = wiadro;
                wielkosc = wiadro.pojemnosc;
            }
        }
        return pojemnosc;
    }

    public void printInfo() {
        System.out.println(this.nazwa);
        System.out.println(this.pojemnosc);
    }

    public static Wiadro najwiekszeWypelnienie(List<Wiadro> wiadra) {
        Wiadro wyplenienie = null;
        int wielkosc = 0;
        for (Wiadro wiadro : wiadra) {
            if (wiadro.wypelnienie > wielkosc) {
                wyplenienie = wiadro;
                wielkosc = wiadro.wypelnienie;
            }
        }
        return wyplenienie;
    }

    public static Wiadro najmniejszaPojemnosc(List<Wiadro> wiadra) {
        Wiadro wypelnienie = null;
        int wielkosc = Integer.MAX_VALUE;
        for (Wiadro wiadro : wiadra) {
            if (wiadro.pojemnosc < wielkosc) {
                wypelnienie = wiadro;
                wielkosc = wiadro.pojemnosc;
            }
        }
        return wypelnienie;
    }

    public void printInfo2() {
        System.out.println(this.nazwa);
        System.out.println(this.wypelnienie);
    }

    public static int sumaWypelnien(List<Wiadro> wiadra) {
        int suma = 0;
        for (Wiadro wiadro : wiadra) {
            suma += wiadro.wypelnienie;
        }
        return suma;
    }

    public static double sredniaWypelnien(List<Wiadro> wiadra) {
        double suma = 0;
        for (Wiadro wiadro : wiadra) {
            suma += wiadro.wypelnienie;
        }
        return suma / wiadra.size();
    }


}
