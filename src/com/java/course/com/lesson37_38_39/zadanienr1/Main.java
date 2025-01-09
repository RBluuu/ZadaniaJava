package com.java.course.com.lesson37_38_39.zadanienr1;

import java.math.BigInteger;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //1.
        //Klient(imie, nazwisko, pesel) moze posiadac wiele Kont(nazwa,data założenia, saldo, waluta)
        //Korzystajac z Wielkich Liczb zaimplementuj metody
        //wplac- dodaje do konta kwote w danej walucie
        //wyplac - odejmuje z konta kwote w danej walucie
        //transfer - przenosi kwote w danej walucie na inne konto
        //- kto zrobil najwiecej przelewow?
        //- czyje przelewy byly na najwieksze kwowy
        //- oblicz srednia wartos z listy przelewow
        //- jaki byl maksymalny przelew


        Customer customer1 = new Customer("Jan","Kowalski",new BigInteger("95071610472"));
        Customer customer2 = new Customer("Michal","Nowak",new BigInteger("85042211556"));
        Customer customer3 = new Customer("Darek","Podolski",new BigInteger("89051602389"));
        Customer customer4 = new Customer("Lukasz","Jnakowski",new BigInteger("98110705523"));
        Customer customer5 = new Customer("Wojtek","Nowakowski",new BigInteger("78010101556"));

        Account account1 = new Account("Account Currency", LocalDate.of(2021,2,19),new BigInteger("45648485321516351531"),"EURO");
        Account account2 = new Account("Senior Account", LocalDate.of(2023,12,12),new BigInteger("5464213548354132322"),"PLN");
        Account account3 = new Account("Salary Account", LocalDate.of(2020,11,28),new BigInteger("54653284465554113188"),"DOLAR");
        Account account4 = new Account("Salary Account", LocalDate.of(2005,9,13),new BigInteger("65526319798871654"),"FUNT");
        Account account5 = new Account("Saving Account", LocalDate.of(2018,5,19),new BigInteger("13223222001108888"),"RUBLE");
        Account account6 = new Account("Income Account", LocalDate.of(2000,4,15),new BigInteger("65989889895559922"),"YUAN");
        Account account7 = new Account("Salary Account", LocalDate.of(1985,12,4),new BigInteger("43211144788954113511"),"BAT");
        Account account8 = new Account("Account Currency", LocalDate.of(2024,10,1),new BigInteger("5461336659988822111132"),"PLN");
        Account account9 = new Account("Senior Account", LocalDate.of(2012,1,12),new BigInteger("6668887774444559995521"),"DOLAR");
        Account account10 = new Account("Salary Account", LocalDate.of(1999,3,14),new BigInteger("124651321651651203241"),"EURO");

        customer1.addAccount(account1);
        customer1.addAccount(account10);
        customer1.addAccount(account6);
        customer2.addAccount(account5);
        customer3.addAccount(account2);
        customer4.addAccount(account7);
        customer4.addAccount(account8);
        customer4.addAccount(account9);
        customer4.addAccount(account4);
        customer5.addAccount(account3);

        System.out.println(customer1.getAccountList());
        System.out.println(customer1.getAccountList().size());
        System.out.println();

        System.out.println(customer2.getAccountList());
        System.out.println(customer2.getAccountList().size());
        System.out.println();

        System.out.println(customer3.getAccountList());
        System.out.println(customer3.getAccountList().size());
        System.out.println();

        System.out.println(customer4.getAccountList());
        System.out.println(customer4.getAccountList().size());
        System.out.println();

        System.out.println(customer5.getAccountList());
        System.out.println(customer5.getAccountList().size());
        System.out.println();

        System.out.println(account2.addOrSubtrationAmount("Podolski","Senior Account","PLN", "subtraction", new BigInteger("5464646545454849245")));
        System.out.println();

        System.out.println("zadanie z dodawaniem");
        System.out.println(account10.addOrSubtractionMony(account10,"add",new BigInteger("56545555555555555555555555555555555555564654")));

        System.out.println();






    }
}
