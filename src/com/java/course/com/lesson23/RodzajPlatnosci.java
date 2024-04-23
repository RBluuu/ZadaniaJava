package com.java.course.com.lesson23;

public interface RodzajPlatnosci {
    double dopłata(double cena);
}

class PlatnoscKarta implements RodzajPlatnosci {

    @Override
    public double dopłata(double cena) {
        return cena * 0.2;
    }
}

class Przelew implements RodzajPlatnosci {

    @Override
    public double dopłata(double cena) {
        return cena * 0.3;
    }
}

class ZaPobraniem implements RodzajPlatnosci {
    private static final int OPŁATA = 13;

    @Override
    public double dopłata(double cena) {
        return OPŁATA;
    }
}

class KartaLojalnosciowa implements RodzajPlatnosci {
    private static final double znizka15 = 15;
    private static final double powyzej15 = 20;

    public double dopłata(double cena) {
        if (cena < 400) {
            return cena - cena * znizka15;
        } else {
            return cena - cena * powyzej15;
        }
    }

}