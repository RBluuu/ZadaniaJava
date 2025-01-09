package com.java.course.com.lesson28_29_30.mechanics.zadanienr2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDate.of;

public class SmallCat {
    private int id;
    private String name;
    private String type;
    private LocalDate dateOfBirth;
    private int weight;
    private int hight;
    private String mamaid;
    private final MamaCat mamaCat;

    public SmallCat(int id, String name, String type, LocalDate dateOfBirth, int weight, int hight, String mamaid, MamaCat mamaCat) {
        if (mamaCat == null) {
            throw new IllegalArgumentException("Mama cannto be null");
        }
        this.id = id;
        this.name = name;
        this.type = type;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.hight = hight;
        this.mamaid = mamaid;
        this.mamaCat = mamaCat;
        mamaCat.getSmallCats().add(this);
    }

    public boolean wasBornInDate(LocalDate from,LocalDate to){
        return this.getDateOfBirth().isAfter(from) && this.getDateOfBirth().isBefore(to);
    }

    //Ile jest maluchów ważących poniżej 3 kg
    public static List<SmallCat> smallCatsUnder3KG(List<SmallCat> smallCats, int weightUnder) {
        List<SmallCat> cats = new ArrayList<>();
        for (SmallCat smallCat : smallCats) {
            if (smallCat.weight < weightUnder) {
                cats.add(smallCat);
            }
        }
        return cats;
    }

    //Podaj średnią wagę kociąt urodzonych w lipcu 2019.
    public static double meanWeightSmallCatsAfterYear(List<SmallCat> smallCats, LocalDate monthAndYear) {
        List<SmallCat> cats = new ArrayList<>();
        double meanWeight = 0;
        for (SmallCat smallCat : smallCats) {
            if (smallCat.dateOfBirth.isAfter(monthAndYear)) {
                meanWeight += smallCat.weight;
                cats.add(smallCat);
            }
        }
        return meanWeight / cats.size();
    }

    public MamaCat getMamaCat() {
        return mamaCat;
    }

    public void setMamaid(String mamaid) {
        this.mamaid = mamaid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public String getMamaid() {
        return mamaid;
    }

    @Override
    public String toString() {
        return "SmallCat: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", weight=" + weight +
                ", hight=" + hight +
                ", mamaid=" + mamaid;
    }
}
