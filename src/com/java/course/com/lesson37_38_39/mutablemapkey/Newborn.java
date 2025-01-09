package com.java.course.com.lesson37_38_39.mutablemapkey;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Newborn {
    private int id;
    private char sex;
    private String firstName;
    private LocalDate dayOfBirthday;
    private int weight;
    private int growth;
    public Newborn(int id, char sex, String firstName, LocalDate dayOfBirthday, int weight, int growth) {

        this.id = id;
        this.sex = sex;
        this.firstName = firstName;
        this.dayOfBirthday = dayOfBirthday;
        this.weight = weight;
        this.growth = growth;
    }

    //a) Podaj imię i wzrost najwyższego chłopca oraz imię i wzrost najwyższej dziewczynki.
    // funkcje tallestNewbort(List<Newborn,char sex>
    public static List<Newborn> tallestBoyAndGirl(List<Newborn> newbornsList) {
        Newborn tallestBoy = null;
        Newborn tallestGirl = null;
        for (Newborn newborn : newbornsList) {
            if (newborn.getSex() == 's') {
                if (tallestBoy == null || newborn.getGrowth() > tallestBoy.getGrowth()){
                    tallestBoy = newborn;
                }
            } else {
                if (tallestGirl == null || newborn.getGrowth() > tallestGirl.getGrowth()){
                    tallestGirl = newborn;
                }
            }
        }
            List<Newborn> result = new ArrayList<>();
            if (tallestBoy != null) {
                result.add(tallestBoy);
            }
            if (tallestGirl != null) {
                result.add(tallestGirl);
            }
        return result;
    }

    //b) W którym dniu tygodnia urodziło się najwięcej dzieci? Podaj dzien tygodnia i liczbe dzieci.
    public static Map.Entry<DayOfWeek, Integer> theMostPopularBirthday(List<Newborn> newbornsList) {
        Map<DayOfWeek, Integer> dayOfBirthdayMap = new HashMap<>();
        for (Newborn newborn : newbornsList) {
            DayOfWeek dayOfWeek = newborn.getDayOfBirthday().getDayOfWeek();
            dayOfBirthdayMap.put(dayOfWeek, dayOfBirthdayMap.getOrDefault(dayOfWeek, 0) + 1);
        }
        Map.Entry<DayOfWeek, Integer> mostPopularDay = null;
        for (Map.Entry<DayOfWeek, Integer> entry : dayOfBirthdayMap.entrySet()) {
            if (mostPopularDay == null || entry.getValue() > mostPopularDay.getValue()) {
                mostPopularDay = entry;
            }
        }
        return mostPopularDay;
    }

    public char getSex() {
        return sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getDayOfBirthday() {
        return dayOfBirthday;
    }

    public int getWeight() {
        return weight;
    }

    public int getGrowth() {
        return growth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDayOfBirthday(LocalDate dayOfBirthday) {
        this.dayOfBirthday = dayOfBirthday;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "Newborn{" +
                "id=" + id +
                ", sex=" + sex +
                ", firstName='" + firstName + '\'' +
                ", dayOfBirthday=" + dayOfBirthday +
                ", weight=" + weight +
                ", growth=" + growth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Newborn newborn = (Newborn) o;
        return id == newborn.id && sex == newborn.sex && weight == newborn.weight && growth == newborn.growth && Objects.equals(firstName, newborn.firstName) && Objects.equals(dayOfBirthday, newborn.dayOfBirthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sex, firstName, dayOfBirthday, weight, growth);
    }
}
