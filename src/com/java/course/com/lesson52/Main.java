package com.java.course.com.lesson52;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", "Smith", 5000, "USA"),
                new Person("Jane", "Doe", 6000, "UK"),
                new Person("Mike", "Smith", 7000, "Canada"),
                new Person("Anna", "Brown", 5500, "USA"),
                new Person("Lucy", "Smith", 4800, "Australia"),
                null
        );
        //people = null;

        String searchLastName = "Smith";
        List<Person> result = Person.findByLastname(people, searchLastName);

        System.out.println("People with last name '" + searchLastName + "':");
        result.forEach(System.out::println);


    }
}
/*
Stworz klase Apartment(metraz,cena za metr, pietro, ilosc pokoi) + liste udogodnien (balkon,patio,...)
napisz funkcje
- znajdz najdrozsze mieszaknie
- najtansze mieszkanie
- oblicz srednia cene za metr mieszkan
- zwroc wszystkie mieszakania dostepne za okreslona kwote np. 1 000 000
- zwroc mieszkania po podaenj liscie udogodnien
-pogrupuj mieszkania po pietrac
- *** pogrupuj mieszkania po cenie za metr od-do
[5000-7000] - mieszkania
[7001-1000] - mieszkania
 */