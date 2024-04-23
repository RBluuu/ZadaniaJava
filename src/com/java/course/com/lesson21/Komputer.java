package com.java.course.com.lesson21;

public class Komputer {
    private String procesor;
    private int cena;
    private String producent;

    public Komputer(String procesor, int cena, String producent) {
        this.procesor = procesor;
        this.cena = cena;
        this.producent = producent;
    }

    public String getProcesor() {
        return procesor;
    }

    public int getCena() {
        return cena;
    }

    public String getProducent() {
        return producent;
    }

    public void wlaczfilm() {
        System.out.println("Film został właczony.. ");
    }

}
