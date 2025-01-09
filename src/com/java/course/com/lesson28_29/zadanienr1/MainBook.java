package com.java.course.com.lesson28_29.zadanienr1;

import java.io.*;
import java.util.List;

public class MainBook {
    public static void main(String[] args) throws IOException {
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

        System.out.println("Zadanie nr1: ");
        String error = ("Sprawdz prosze jeszcze raz....");
        File pathBooks = new File("src/com/java/course/com/lesson28/zadanieNR1/books.txt");
        File pathAuthor = new File("src/com/java/course/com/lesson28/zadanieNR1/author.txt");

        try (BufferedWriter books = new BufferedWriter(new FileWriter(pathBooks))) {
            books.write("1" + "," + "Dom Versace" + "," + 50 + "," + "biografia" + "," +  "3246");
            books.newLine();
            books.write("2" + "," + "Chlopi" + "," + 48 + "," + "powiesc" + "," + "456");
            books.newLine();
            books.write("3" + "," + "Wiedzimin Geralt z Rivii" + "," + 39 + "," + "fantasy" + "," + "16251");
            books.newLine();
            books.write("4" + "," + "Krol Lew" + "," + 39 + "," + "Fikcja" + "," + "5698");
            books.newLine();
            books.write("5" + "," + "Wiedzimin ostatnie zyczenie" + "," + 42 + "," + "fantasy" + "," + "16251");
            books.newLine();
        }
        catch (IOException e) {
            System.out.println(error);
        }

        try(BufferedReader books = new BufferedReader(new FileReader(pathBooks))) {
            String line = null;
            while ((line = books.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(error);
        }
        System.out.println();

        try (BufferedWriter author = new BufferedWriter(new FileWriter(pathAuthor))) {
            author.write("1" + "," + "Walt" + "," + "Disney");
            author.newLine();
            author.write("2" + "," + "Wladyslaw" + "," + "Rejmont");
            author.newLine();
            author.write("3" + "," + "Dborah" + "," + "Ball");
            author.newLine();
        }
        catch (IOException e) {
            System.out.println(error);
        }

        try(BufferedReader author = new BufferedReader(new FileReader(pathAuthor))) {
            String line = null;
            while ((line = author.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(error);
        }
        System.out.println();

        Book domVersace = new Book(1,"Dom Versace",50,"biografia");
        Book chlopi = new Book(2,"Chlopi",48,"powiesc");
        Book wiedziminGeraltZRivii = new Book(3,"Wiedzimin Geralt z Rivii",29,"fantasy");
        Book krolLew = new Book(4,"Krol Lew", 19,"fikcja");
        Book wiedziminOstatnieZyczenie = new Book(5,"Wiedzimin ostatnie zyczenie",9,"fantasy");

        Author waltDisney = new Author("5698","Walt","Disney");
        Author wladyslawRejmont = new Author("456","Wladyslaw","Rejomnt");
        Author dborahBall = new Author("3246","Dborah","Ball");
        Author andrzejSapkowski = new Author("16251", "Andrzej", "Sapkowski");

        waltDisney.addBook(krolLew);
        wladyslawRejmont.addBook(chlopi);
        dborahBall.addBook(domVersace);
        andrzejSapkowski.addBook(wiedziminGeraltZRivii);
        andrzejSapkowski.addBook(wiedziminOstatnieZyczenie);

        System.out.println(waltDisney);
        System.out.println(wladyslawRejmont);
        System.out.println(dborahBall);
        System.out.println(andrzejSapkowski);
        System.out.println();


        System.out.println("znajdz ksiazke po id autora: " + Book.ksiazkaPoIdAutora(List.of(domVersace,chlopi,wiedziminGeraltZRivii,krolLew,wiedziminOstatnieZyczenie),"3246"));
        System.out.println();

        System.out.println("ksiazki po nazwisku autora: " + Book.allBooksAuthor(List.of(domVersace,chlopi,wiedziminGeraltZRivii,krolLew,wiedziminOstatnieZyczenie),"Sapkowski"));
        System.out.println();

        System.out.println("znajdz ksiazki drozsze niz 30zl: " + Book.priceMore30zl(List.of(domVersace,chlopi,wiedziminGeraltZRivii,krolLew,wiedziminOstatnieZyczenie),30));
        System.out.println();

        System.out.println("znajdz ksiazki taniejsze niz 10zl: " + Book.priceUnder10z(List.of(domVersace,chlopi,wiedziminGeraltZRivii,krolLew,wiedziminOstatnieZyczenie),10));
        System.out.println();

        System.out.println("znajdz ksiazki w przedziale cenowym 10-20zl: " + Book.priceRangeOfBooks(List.of(domVersace,chlopi,wiedziminGeraltZRivii,krolLew,wiedziminOstatnieZyczenie),10,20));
        System.out.println();

        System.out.println("znajdz najdrozsza ksiazke: " + Book.mostExpensiveBook(List.of(domVersace,chlopi,wiedziminGeraltZRivii,krolLew,wiedziminOstatnieZyczenie)));
        System.out.println();

        System.out.println("znajdz najtansza ksiazke: " + Book.cheapestBook(List.of(domVersace,chlopi,wiedziminGeraltZRivii,krolLew,wiedziminOstatnieZyczenie)));
        System.out.println();

        System.out.println("znajdz autora ktory ma najwiecej ksiazek: " + Book.mostPopulaAuthor(List.of(waltDisney,wladyslawRejmont,dborahBall,andrzejSapkowski)));
        System.out.println();

        System.out.println("oblicz srednia cene ksiazek po gatunku: " + Book.averagePriceOfGenre(List.of(domVersace,chlopi,wiedziminGeraltZRivii,krolLew,wiedziminOstatnieZyczenie),"fantasy"));
        System.out.println();
    }
}

  /*  KocieMamy(id, imie, rasa, dataUrodzenia, waga, wysokosc) mogą rodzić Kociątka(id, imie, rasa, dataUrodzenia, waga, wysokosc)
        W pliku kociemamy.txt znajduje się lista kocich rodziców podana w formacie: id, imie, rasa, dataUrodzenia, waga, wysokosc
        np.
        1, Lusia, Brytyjska, 2016-04-15, 4, 55
        2, Puszek, Syjamska, 2017-05-22, 6, 40
        3, Burek, Maine Coon, 2016-03-11, 10, 70
        4, Misiek, Ragdoll, 2016-06-18, 8, 65

        W pliku kociatka.txt znajduje się lista kociąt podana w formacie: id, imie, rasa, dataUrodzenia, waga, wysokosc, mamaId
        np.
        1, Maluszek, Brytyjska, 2018-03-21, 2, 35, 1
        2, Kuleczka, Syjamska, 2019-04-25, 3, 25, 2
        3, Płateczek, Maine Coon, 2018-02-19, 5, 45, 3
        4, Kłębek, Ragdoll, 2019-07-23, 4, 40, 4
        5, Burasek, Maine Coon, 2019-08-05, 5, 50, 3
        6, Lisek, Brytyjska, 2019-01-20, 2, 30, 1
        7, Puchatek, Ragdoll, 2019-09-15, 6, 42, 4

        -- Znajdź kocie mamy, ktore urodzily bliźnięta. - nie wiem jak z datami
        -- Ile jest maluchów ważących poniżej 3 kg? - zrobione
        -- Znajdź kocia mame, ktora miała najwięcej potomstwa od stycznia 2018 do stycznia 2019. - nie weim, jak
        -- Podaj imię i wagę najciężej kociej mamy. - zrobione
        -- Podaj średnią wagę kociąt urodzonych w lipcu 2019. - zrobione

        !!!
        Kociatko nie moze istniec bez mamy
        Asocjacje zawsze przeprowadzamy po calych obiektach a nie identyfikatorach
        Kociatko powinno miec "cala Mame" jako obiekt a nie tylko idMatki


   */