package com.java.course.com.lesson28_29.zadanienr2;

public class Cat extends Animal {

    private int rankOfVexation;

    public Cat(String name, String genre, int rankOfVexation) {
        super(name, genre);
        this.rankOfVexation = rankOfVexation;
    }

    public Cat(String name, String genre, Trainer trainer, int rankOfVexation) {
        super(name, "CAT", genre, trainer);
        this.rankOfVexation = rankOfVexation;
    }

    public int getRankOfVexation() {
        return rankOfVexation;
    }

    public void setRankOfVexation(int rankOfVexation) {
        this.rankOfVexation = rankOfVexation;
    }

    @Override
    public String toString() {
        return "Cat: " +
                "name=" + getName() + '\'' +
                ", genre=" + getType() + '\'' +
                ", rankOfVexation=" + rankOfVexation +
                ';';
    }
}
