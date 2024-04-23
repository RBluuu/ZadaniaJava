package com.java.course.com.lesson24;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person radek = new Person("Radek", "Blauciak", 29);
        Person michal = new Person("Michal", "Kowalski", 33);


        Set<Person> ludzie = new HashSet<>();
        ludzie.add(radek);
        ludzie.add(michal);

        System.out.println(ludzie.size());
        System.out.println(ludzie);

        System.out.println(radek);
        System.out.println(michal);



        Person darek = new Person("Darek", "Nowak", 19);
        Person darek1 = new Person("Darek", "Nowak", 19);


        System.out.println(darek == darek1);
        System.out.println(darek.equals(darek1));

        System.out.println(darek.hashCode());
        System.out.println(darek1.hashCode());


        ludzie.add(darek);
        ludzie.add(darek1);


        System.out.println(ludzie);
        System.out.println(ludzie.size());


        //0. Zmien imie jakieogos obiektu w secie (Radek) i sprawdz funckja contains() czy ten obiekt dalej
        //znajduje sie w secie, po operacjach wypisz caly set


        radek.setName("Lukasz");

        System.out.println(ludzie.contains(radek));
        System.out.println(ludzie);
    }
}

/*
Stworz klase TodoList(title,description)
Ktora powinna zawierac lista Taskow(name, description, status, deadline,priority)
dodaj metody:
- addTask - dodajaca task do listy
- deleteTask - usuwajaca task z listy
- getTasks - zwracajaca liste taskow
- getTasksSortedByPriority - zwracajaca posortowana liste taskow po priorytecie
- getTasksSortedByDeadline - zwracajaca posortowana liste taskow po deadline (od najblizszego)
- toggleTask - zmieniajaca status tasku
- dodaj jakiekolwiek inne metody ktore uwazasz za stosowne
Stworz aplikacje konsolowa (Scanner) ktora umozliwi uzytkownikowi zarzadzanie lista zadanó
*/

//6. Projektujesz sklep dla sprzedawcy gitar, Stworz Klasy
//Inventory - klasa, ktora bedzie przechowywac wszystkie gitary
//Guitar - klasa, ktora bedzie przechowywac informacje o gitarze (marka, model, cena, rok produkcji, rodzaj gitary)
//w inventory dodaj metode search, ktora powinna znalezc gitare ktorej szuka uzytkownik