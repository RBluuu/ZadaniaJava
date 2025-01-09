package com.java.course.com.lesson40.zadanie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", "Doe", "89010112345", "Male"));
        persons.add(new Person("Jane", "Smith", "92050223456", "Female"));
        persons.add(new Person("Alice", "Johnson", "85030434667", "Female"));
        persons.add(new Person("Bob", "Brown", "78010145578", "Male"));
        persons.add(new Person("Charlie", "Davis", "66070656789", "Male"));
        persons.add(new Person("Diana", "Miller", "94032467890", "Female"));
        persons.add(new Person("Eve", "Wilson", "83091578901", "Female"));
        persons.add(new Person("Frank", "Moore", "70120189612", "Male"));
        persons.add(new Person("Grace", "Taylor", "99072890123", "Female"));
        persons.add(new Person("Hank", "Anderson", "82040601234", "Male"));
        persons.add(new Person("Ivy", "Thomas", "79051412340", "Female"));
        persons.add(new Person("Jack", "White", "88110523451", "Male"));
        persons.add(new Person("Kate", "Harris", "60032734562", "Female"));
        persons.add(new Person("Liam", "Martin", "75021445673", "Male"));
        persons.add(new Person("Mia", "Lee", "961030567841111", "Female"));
        persons.add(new Person("Noah", "Walker", "87061867895", "Male"));
        persons.add(new Person("Olivia", "Young", "80092478906", "Female"));
        persons.add(new Person("Paul", "King", "93071289017a", "Male"));
        persons.add(new Person("Quinn", "Scott", "84121390128", "Male"));
        persons.add(new Person("Rachel", "Green", "91050101239aaaaa", "Female"));

        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println(persons.size());
        System.out.println();


        //Sprawdz czy pesel jest poprawny - czy sklada sie z 11 znakow, samych cyfr itp
        System.out.println("Zadnie nr1");
        System.out.println(Person.checkPersonPIN(persons));
        System.out.println(Person.checkPersonPIN(persons).size());
        System.out.println();

        //Sprawdz czy pesel odpowiada podanej płci
        System.out.println("Zadanie nr2");
        Person john = new Person("John", "Doe", "89010112345", "Male");
        Person jane = new Person("Jane", "Smith", "92050223456", "Female");
        Person alice = new Person("Alice", "Johnson", "85030434667", "Female");
        Person bob = new Person("Bob", "Brown", "78010145578", "Male");
        Person charlie = new Person("Charlie", "Davis", "66070656789", "Male");
        Person diana = new Person("Diana", "Miller", "94032467890", "Female");
        Person eve = new Person("Eve", "Wilson", "83091578901", "Female");
        System.out.println(Person.checkPersonSex(john));
        System.out.println(Person.checkPersonSex(jane));
        System.out.println(Person.checkPersonSex(alice));
        System.out.println();

        //Napisz metody które zwracaja z peselu date urodzenia (LocalDAte)
        System.out.println("Zadanie nr3");
        try {
            LocalDate birthDate = Person.dateOfBirthday(bob);
            System.out.println("Data urodzenia: " + birthDate);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }





    }
}
