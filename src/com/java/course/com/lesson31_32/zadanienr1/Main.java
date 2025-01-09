package com.java.course.com.lesson31_32.zadanienr1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Programisci chodza na randki z Kobietami w rozne miejsca.
        Randka musi miec jakies miejsce i szanse na zaliczenie.
        Miejsce randki jest losowane z jakiejs odgornie ustalonej listy.
        Szansa na zaliczenie rosnie o 10% jezeli miejsce randki to ulubione miejsce randki kobiety.
        Szansa na zaliczenie rowniez zalezy od rozmiaru biustu kobiety.
        A - 10%
        B - 20%
        C - 30%
        D - 40%
        E i wieksze - 50%

        Napisz metody:
        - znajdz programistow jezyka Java ktorzy mieli wiecej niz 3 randki w ulubionym miejscu randki kobiety - zrobione
        - znajz kobiety z biustem A ktore lubia restauracje - zrobione
        - ile kobiet umowilo sie z programistami C++? -
        - jaki jezyk programowania ma najwieksze powodzenie?
        - pogrupuj srednia szanse na zaliczenie randki dla programistow w zaleznosci od jezyka programowania
        */

        Developer radek = new Developer("Radek", "Błauciak", 29, "JAVA");
        Developer marek = new Developer("Marek", "Nowak", 33, "JAVA");
        Developer lukasz = new Developer("Lukasz", "Kowalski", 26, "JAVA");
        Developer darek = new Developer("Darek", "Przybylski", 29, "C++");
        Developer michal = new Developer("Michal", "Rogal", 45, "C++");
        Developer arek = new Developer("Arek", "Bielik", 28, "Python");
        Developer nikodem = new Developer("Nikodem", "Gorski", 31, "Python");

        Woman daria = new Woman("Daria", "Nowak", "Restaurant", "A");
        Woman michalina = new Woman("Michalinak", "Kowalczy", "Restaurant", "A");
        Woman karolina = new Woman("Karolina", "Byk", "Cinema", "B");
        Woman elza = new Woman("Elza", "Nowik", "Forest", "C");
        Woman ewelina = new Woman("Ewelina", "Sowa", "Field", "D");
        Woman ewa = new Woman("Ewa", "Kokosz", "Restaurant", "D");
        Woman elzbieta = new Woman("Elzbieta", "Rak", "Forest", "E");


        Date date1 = new Date("Restaurant", 10, daria, radek);
        Date date2 = new Date("Cinema", 10, daria, marek);
        Date date3 = new Date("Forest", 10, michalina, radek);
        Date date4 = new Date("Field", 20, karolina, radek);
        Date date5 = new Date("Cinema", 30, elza, lukasz);
        Date date6 = new Date("Field", 40, ewelina, darek);
        Date date7 = new Date("Restaurant", 40, ewa, michal);
        Date date8 = new Date("Restaurant", 50, elzbieta, nikodem);
        Date date9 = new Date("Field", 30, elza, arek);
        Date date10 = new Date("Cinema", 40, ewa, darek);
        Date date11 = new Date("Cinema", 10, daria, nikodem);
        Date date12 = new Date("Forest", 30, elza, nikodem);
        Date date13 = new Date("Restaurant", 20, karolina, nikodem);
        Date date14 = new Date("Forest", 50, elzbieta, radek);
        Date date15 = new Date("Restaurant", 40, ewa, radek);
        Date date16 = new Date("Field", 30, ewelina, radek);

        System.out.println("sprawdzam");
        System.out.println(date3.isFavouritePlace());


        System.out.println();
        System.out.println("znajdz programistow jezyka Java ktorzy mieli wiecej niz 3 randki w ulubionym miejscu randki kobiety: " + Date.moustPopularJavaDevelopers(List.of(date1, date2, date3, date4, date5, date6, date7, date8, date9, date10, date11, date12, date13, date14, date15, date16), "JAVA"));
        System.out.println();

        System.out.println("znajz kobiety z biustem A ktore lubia restauracje: " + Woman.womanWithSizeBreastsAndFavoritePlace(List.of(daria, michalina, karolina, elza, ewelina, ewa, elzbieta), "Restaurant"));
        System.out.println();

        System.out.println("ile kobiet umowilo sie z programistami C++?: " + Date.howMuchDateWithDeveloper(List.of(date1, date2, date3, date4, date5, date6, date7, date8, date9, date10, date11, date12, date13, date14, date15, date16), "C++"));
        System.out.println();

        System.out.println("jaki jezyk programowania ma najwieksze powodzenie?: " + Date.whichLanguageHaveBigestChangeOnSucces(List.of(date1, date2, date3, date4, date5, date6, date7, date8, date9, date10, date11, date12, date13, date14, date15, date16)));
        System.out.println();

        //System.out.println("pogrupuj srednia szanse na zaliczenie randki dla programistow w zaleznosci od jezyka programowania: " + Date.meanOfSuccesWithLanguage(List.of(date1,date2,date3,date4,date5,date6,date7,date8,date9,date10,date11,date12,date13,date14,date15,date16)));
        System.out.println();

        List<Date> dates = List.of(date1, date2, date3, date4, date5, date6, date7, date8, date9, date10, date11, date12, date13, date14, date15, date16);
        System.out.println(Date.groupDatesByProgrammingLanguages(dates));
        System.out.println(Date.groupChancesByProgrammingLanguage(dates));

    }
}
