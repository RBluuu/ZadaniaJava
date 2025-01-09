package com.java.course.com.lesson28_29.asocjacje;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //https://www.lucidchart.com/

        //https://www.youtube.com/watch?v=6XrL5jXmTwM&t=1s&ab_channel=LucidSoftware

        //https://www.youtube.com/watch?v=eWDTx-PEBqQ&list=PLy_unw2Vd9hPg-jPSX6aY82PHdRMOWfLH&ab_channel=Inteca

        /*
        jeden do jeden - OK
        jeden do wiele - OK
        wiele do wiele OK
        wiele do wiele z atrybutem OK
        kompozycja OK
        agregacja - to samo co kompozycja tylko bez warunku, ze czesc nie moze istniec bez calosci, robimy tak samo jak 1 do wiele (funkcja addCostam)
         */

        LocalDate now = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2002, 11, 30);
        LocalDate localDate2 = LocalDate.of(1995, Month.JANUARY, 15);
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(now);

        Student radek = new Student("Radek", "Błauciak", LocalDate.of(1995, 7, 16));
        Student marek = new Student("Marek", "Nowak", LocalDate.of(1994, 5, 19));
        Student lukasz = new Student("Lukasz", "Bielik", LocalDate.of(1996, 4, 25));

        School school = new School("Preimary School", "Gorzowska", 55, "Gorzów Wlkp.");

        school.addStudent(marek);
        school.addStudent(radek);

        System.out.println(marek.getSchool());
        System.out.println(school.getStudents());

        School school12 = new School("Preimary School", new Address("Gorzowska", 55, "Gorzów Wlkp."));

        Test testMath = new Test("Math",LocalDate.of(2025,12,3));
        Test testHistory = new Test("History",LocalDate.of(2025,11,13));
        Test testEnglish = new Test("English",LocalDate.of(2025,12,9));

        new Grade(1,marek,testMath);
        new Grade(3,radek,testMath);
        new Grade(4,lukasz,testMath);
        new Grade(1,marek,testHistory);
        new Grade(1,radek,testHistory);
        new Grade(3,lukasz,testHistory);
        new Grade(1,marek,testEnglish);
        new Grade(2,radek,testEnglish);
        new Grade(4,lukasz,testEnglish);

        System.out.println("Marek");
        for (Grade grade : marek.getGrades()) {
            System.out.println(grade.getValue());
        }
        System.out.println();

        System.out.println("Radek");
        for (Grade grade : radek.getGrades()) {
            System.out.println(grade.getValue());
        }
        System.out.println();

        System.out.println("Lukasz");
        for (Grade grade : lukasz.getGrades()) {
            System.out.println(grade.getValue());
        }

        System.out.println("oblicz srednia ocene wszystkich uczniow: " + Student.meanGradeV2(List.of(radek,marek,lukasz)));
        System.out.println();

        System.out.println("znajdz najwyzsza srednia ocen: " + Student.highestMeanGrade(List.of(radek,marek,lukasz)));
        System.out.println();

        System.out.println("znajdz najorszego ucznia: " + Student.weakestStudentV2(List.of(radek,marek,lukasz)));
        System.out.println();

        System.out.println("znajdz najlepszego ucznia: " + Student.bestStudent(List.of(radek,marek,lukasz)));
        System.out.println();

        System.out.println("znajdz najtrudniejszy test: " + Test.toughestTest(List.of(testEnglish,testHistory,testMath)));
        System.out.println();

        Classroom klasaNR1 = new Classroom("4b",school12);
        Classroom klasaNR2 = new Classroom("5b",school12);
        Classroom klasaNR3 = new Classroom("6A",school12);

        System.out.println(school12.getClassrooms());
        System.out.println(school12.getClassrooms().size());
    }
}
/*
Dane sa 2 pliki:
ksiazki.txt
id|tytul|cena|gatunek|id_autora
1,Krol Lew,20.00,przygodowa,1

autorzy.txt
id|imie|nazwisko
1,Jan,Kowalski

Napisz program, ktory wczyta dane z plikow i wypisze na ekranie ksiazki wraz z autorem.
Zadbaj o odpowiednia asocjacje miedzy ksiazka a autorem.
Oraz napisz metody:
- znajdz ksiazke po id autora
- znajdz wszystkie ksiazki po nazwisku autora
- znajdz ksiazki drozsze niz 30zl
- znajdz ksiazki taniejsze niz 10zl
- znajdz ksiazki w przedziale cenowym 10-20zl
- znajdz najdrozsza ksiazke
- znajdz najtansza ksiazke
- znajdz autora ktory ma najwiecej ksiazek
- oblicz srednia cene ksiazek po gatunku
*/
/*
 W systemie przechowujemy informacje o zwierzetach (nazwa, gatunek). Dla psów przechowujemy dodatkowe ich dlugosc siersci
 oraz ulubione zabawki ,dla kotów stopien bycia wkurwiajacym futrzakiem (1-10) oraz dla pterodaktylow rozpietosc skrzydel.

 Trenerzy (imie, nazwisko, adres) trenuja zwierzeta. Kazdy trener trenuje wiele zwierzat, ale zwierze jest pod okiem jednego trenera.


 -znajdz trenera ktory trenował najwiecej zwierzat
 -znajdz trenerow ktorzy trenowali psy z gatunku spaniel
 -znajdz wszystkie pterodaktyle ktore nigdy nie mialy przypisanego trenera
*/


/*
- znajdz najwyzsza srednia ocen - ok
- znajdz najgorszeo ucznia -ok
- oblicz srednia ocen wszystkich uczniow - ok
- znajdz najtrudniejszy test - ok
 */