package com.java.course.com.lesson28_29.zadanienr2;

public class Dog extends Animal {

    private int hairLength;

    private String favoriteToy;

    public Dog(String name, String genre, int hairLength, String favoriteToy) {
        super(name, genre);
        this.hairLength = hairLength;
        this.favoriteToy = favoriteToy;
    }

    public int getHairLength() {
        return hairLength;
    }

    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    @Override
    public String toString() {
        return "Dog: " +
                "name=" + getName() + '\'' +
                ", genre=" + getType() + '\'' +
                ", hairLength=" + hairLength +
                ", favoriteToy=" + favoriteToy + '\'' +
                ';';
    }
}
