package com.java.course.com.lesson49.przykladnr2;

public interface Electronica {
    boolean canPlay();
    boolean canLearn();
    boolean canWatchFilms();
}

class TV implements Electronica {
    private String name;
    private int price;

    public TV(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean canPlay() {
        return true;
    }

    @Override
    public boolean canLearn() {
        return true;
    }

    @Override
    public boolean canWatchFilms() {
        return true;
    }

}

class Computer implements Electronica {
    private String name;
    private int price;

    public Computer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean canPlay() {
        return true;
    }

    @Override
    public boolean canLearn() {
        return true;
    }

    @Override
    public boolean canWatchFilms() {
        return true;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Telefon implements Electronica {
    private String name;
    private int price;

    public Telefon(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean canPlay() {
        return true;
    }

    @Override
    public boolean canLearn() {
        return false;
    }

    @Override
    public boolean canWatchFilms() {
        return true;
    }

    @Override
    public String toString() {
        return "telefon{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

