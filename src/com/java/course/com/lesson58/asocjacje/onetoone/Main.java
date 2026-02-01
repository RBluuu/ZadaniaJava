package com.java.course.com.lesson58.asocjacje.onetoone;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski");
        Passport janPassport = new Passport("1234", person);


        System.out.println(person.getPassport().getPassportNumber());
        System.out.println(janPassport.getPerson().getFirstName());
    }
}
