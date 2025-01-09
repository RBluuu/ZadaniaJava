package com.java.course.com.lesson28_29.zadanienr2;

public class Pterodactyl extends Animal {
    private int wingspan;

    public Pterodactyl(String name, String genre, int wingspan) {
        super(name, genre);
        this.wingspan = wingspan;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return "Pterodactyl: " +
                "name=" + getName() + '\'' +
                ", genre=" + getType() + '\'' +
                ", wingspan=" + wingspan +
                ';';
    }
}
