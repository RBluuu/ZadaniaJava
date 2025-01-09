package com.java.course.com.lesson41.zadaniezwycieczkami;

public enum Dodatki {
    ZWIEDZANIEMUZEUM(500),ZWIEDZANIESKUTERAMI(1300),WYPORZYCZENIEAUTA(1800); //ZWIEDZANIE_MUZEUM

    private double cena;

    Dodatki(double cena) {
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
