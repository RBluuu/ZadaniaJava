package com.java.course.com.lesson31_32.zadanienr1;

import java.util.*;

public class Date {

    /*
     Szansa na zaliczenie rosnie o 10% jezeli miejsce randki to ulubione miejsce randki kobiety.
     Szansa na zaliczenie rowniez zalezy od rozmiaru biustu kobiety.
     A - 10%
     B - 20%
     C - 30%
     D - 40%
     E i wieksze - 50%
     */
    private String nameplace;
    private int chance;
    private final Woman woman;
    private final Developer developer;

    public Date(String nameplace, int chance, Woman woman, Developer developer) {
        if (woman == null || developer == null) {
            throw new IllegalArgumentException("Student or test cannot be null");
        }
        this.nameplace = nameplace;
        this.woman = woman;
        this.developer = developer;
        this.chance = getChance(chance);
        woman.getDates().add(this);
        developer.getDates().add(this);
    }

    private int getChance(int chance) {
        if (this.isFavouritePlace()) {
            chance += 10;
        }
        chance += chanceByBreastSize();
        return chance;
    }

    private int chanceByBreastSize() {
        return switch (woman.getBreasts()) {
            case "A" -> 10;
            case "B" -> 20;
            default -> 30;
        };
    }

    //znajdz programistow jezyka Java ktorzy mieli wiecej niz 3 randki w ulubionym miejscu randki kobiety
    public static HashSet moustPopularJavaDevelopers(List<Date> dates, String language) {


        HashSet<Developer> moustPopular = new HashSet<>();
        for (Date date : dates) {
            if (date.developer.getLanguage().equals(language) && date.woman.getFavoritePlace().equals(date.getNameplace())) {
                moustPopular.add(date.developer);
            }
        }
        return moustPopular;
    }

    //ile kobiet umowilo sie z programistami C++?
    public static HashSet howMuchDateWithDeveloper(List<Date> dates, String language) {
        HashSet<Woman> newList = new HashSet<>();
        for (Date date : dates) {
            if (date.developer.getLanguage().equals(language)) {
                newList.add(date.woman);
            }
        }
        return newList;
    }

    //jaki jezyk programowania ma najwieksze powodzenie?

    /*
    Java - 5 randek
    C++ - 3 randki
    COBOL - 20
     */

    //- pogrupuj srednia szanse na zaliczenie randki dla programistow w zaleznosci od jezyka programowania

    /*
    Java = 30%
    C++ = 10%
     */
    public static Map<String, Double> groupChancesByProgrammingLanguage(List<Date> dates) {
        Map<String, List<Date>> datesByLanguages = groupDatesByProgrammingLanguages(dates);
        Map<String, Double> chancesByLanguages = new HashMap<>();

        for (Map.Entry<String, List<Date>> entry : datesByLanguages.entrySet()) {
            double chance = 0;
            for (Date date : entry.getValue()) {
                chance += date.getChance();
            }
            String programmingLanguage = entry.getKey();
            int numberOfDates = entry.getValue().size();
            chancesByLanguages.put(programmingLanguage, chance / numberOfDates);
        }
        return chancesByLanguages;
    }

    /*
    Java - Randka Marcina i Agaty, Randka Tomasza i Karoliny
    C++ - Randka Tomka i Mateusza, Zygmunta i Marii
     */
    public static Map<String, List<Date>> groupDatesByProgrammingLanguages(List<Date> dates) {
        Map<String, List<Date>> result = new HashMap<>();
        for (Date date : dates) {
            result.putIfAbsent(date.developer.getLanguage(), new ArrayList<>());
            result.get(date.developer.getLanguage()).add(date);
        }
        return result;
    }

    public static String whichLanguageHaveBigestChangeOnSucces(List<Date> dateList) {
        String language = null;
        Date number = dateList.get(0);
        for (Date date : dateList) {
            if (date.howManyProcentOnSuccess() > number.howManyProcentOnSuccess()) {
                language = date.getDeveloper().getLanguage();
            }
        }
        return language;
    }

    public int howManyProcentOnSuccess() {
        /*
        !!!!!!!!!!
        Maciek idzie na randke z Aneta do Restauracji
        - Przegladasz wszystkie radnki Anety
        - jezeli JAKAKOLWIEK randka Anety odbyla sie w Restauracji to ustawiasz sume na 10 + szansa tej randki
         */
        int sum = 0;
        for (Date date : this.woman.getDates()) {
            if (date.nameplace.equals(date.getWoman().getFavoritePlace())) {
                sum = 10 + date.getChance();
            }
        }
        return sum;
    }

    public boolean isFavouritePlace() {
        if (nameplace.equals(woman.getFavoritePlace())) {
            return true;
        }
        return false;
    }

    public boolean isFavouritePlaceV2() {
        return nameplace.equals(woman.getFavoritePlace());
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }


    public String getNameplace() {
        return nameplace;
    }

    public void setNameplace(String nameplace) {
        this.nameplace = nameplace;
    }

    public Woman getWoman() {
        return woman;
    }

    public Developer getDeveloper() {
        return developer;
    }

    @Override
    public String toString() {
        return "Date:" + "nameplace=" + nameplace + ", chance=" + chance + ", woman=" + woman + ", developer=" + developer;
    }
}
