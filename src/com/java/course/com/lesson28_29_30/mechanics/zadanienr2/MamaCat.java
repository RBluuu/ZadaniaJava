package com.java.course.com.lesson28_29_30.mechanics.zadanienr2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MamaCat {

    private int id;
    private String name;
    private String type;
    private LocalDate dateOfBirth;
    private int weight;
    private int hight;
    private List<SmallCat> smallCats = new ArrayList<>();

    public MamaCat(int id, String name, String type, LocalDate dateOfBirth, int weight, int hight) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.hight = hight;
    }

    public void addChild(SmallCat smallCat) {
        if (smallCat == null) {
            return;
        }
        smallCat.setMamaid(String.valueOf(this));
        this.getSmallCats().add(smallCat);
    }

    // Podaj imię i wagę najciężej kociej mamy.
    public static MamaCat heaviestMamaCat(List<MamaCat> mamaCats) {
        MamaCat mama = null;
        int weight = Integer.MIN_VALUE;
        for (MamaCat mamaCat : mamaCats) {
            if (mamaCat.weight > weight) {
                mama = mamaCat;
                weight = mama.getWeight();
            }
        }
        return mama;
    }

    //Znajdź kocia mame, ktora miała najwięcej potomstwa od stycznia 2018 do stycznia 2019.


    /*
    1. tworzymy pomocniczna mama -> 55
    2. petla po mamach
    3. petla po dzieciach mamy
    4. sprawdzenie czy dziecko sie urodzilo w okreslonej dacie
    5.zwiekszami licznik dzieci urodzonych w dacie -> 64
    5.5. Sprawdzeni czy matka z petli ma wiecej dzieci niz poprzednia matka
    6. ustawiamy mame z pkt.1. na mame z petli
     */
    public static MamaCat mostChildrenFromTo(List<MamaCat> mamaCats, LocalDate fromYear, LocalDate toYear) {
        MamaCat mama = mamaCats.get(0);
        int numberOfChildren = mama.getSmallCats().size();
        for (MamaCat mamaCat : mamaCats) {
            //ctrl + alt + M
            int currMomChildren = getSmallCatsByDate(fromYear, toYear, mamaCat);
            if (numberOfChildren < currMomChildren) {
                mama = mamaCat;
            }
        }
        return mama;
    }

    public static MamaCat mostChildrenFromToV2(List<MamaCat> mamaCats, LocalDate fromYear, LocalDate toYear) {
        MamaCat mama = mamaCats.get(0);
        int numberOfChildren = mama.getSmallCats().size();
        for (MamaCat mamaCat : mamaCats) {
            //ctrl + alt + M
            int currMomChildren = mamaCat.getKidsByDate(fromYear, toYear);
            if (numberOfChildren < currMomChildren) {
                mama = mamaCat;
            }
        }
        return mama;
    }

    private static int getSmallCatsByDate(LocalDate fromYear, LocalDate toYear, MamaCat mamaCat) {
        int currMomChildren = 0;
        for (SmallCat smallCat : mamaCat.getSmallCats()) {
            if (smallCat.wasBornInDate(fromYear, toYear)) {
                currMomChildren++;
            }
        }
        return currMomChildren;
    }

    private int getKidsByDate(LocalDate fromYear, LocalDate toYear) {
        int currMomChildren = 0;
        for (SmallCat smallCat : this.getSmallCats()) {
            if (smallCat.getDateOfBirth().isAfter(fromYear) && smallCat.getDateOfBirth().isBefore(toYear)) {
                currMomChildren++;
            }
        }
        return currMomChildren;
    }

    public List<SmallCat> getSmallCats() {
        return smallCats;
    }

    public void setSmallCats(List<SmallCat> smallCats) {
        this.smallCats = smallCats;
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

    @Override
    public String toString() {
        return "MamaCat: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", weight=" + weight +
                ", hight=" + hight;
    }

    public String toString2() {
        return "MamaCat: " +
                "name= " + name +
                ", weight= " + weight;
    }

}
