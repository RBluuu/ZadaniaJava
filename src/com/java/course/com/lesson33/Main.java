package com.java.course.com.lesson33;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Quizz javaBasicsQuizz = new Quizz("Java Basic Quizz");
        Question question1 = new Question(javaBasicsQuizz, "What is this JVM?");
        Answer answer1ToQuestion1 = new Answer(question1, "Java Virtual Machine", 1,true);
        Answer answer2ToQuestion1 = new Answer(question1, "Java Vending Machine", 0,false);
        Question question2 = new Question(javaBasicsQuizz,"How big is BYTE?");
        Answer answer1ToQuestion2 = new Answer(question2,"From -128 to 127",1,true);
        Answer answer2ToQuestion2 = new Answer(question2,"From -32768 to 32767",0,false);
        Question question3 = new Question(javaBasicsQuizz,"INT in Java is?");
        Answer answer1ToQuestion3 = new Answer(question3,"Numbers?",1,true);
        Answer answer2ToQuestion3 = new Answer(question3,"Text",0,false);
        Question question4 = new Question(javaBasicsQuizz,"What is modulo? ");
        Answer answer1ToQuestion4 = new Answer(question4,"Return rest number after divion two numbers",1,true);
        Answer answer2ToQuestion4 = new Answer(question4,"Return number after divion two numbers",0,false);
        Question question5 = new Question(javaBasicsQuizz,"Can we divide String by int");
        Answer answer1ToQuestion5 = new Answer(question5,"No",1,true);
        Answer answer2ToQuestion5 = new Answer(question5,"Yes",0,false);

        System.out.println(question1);
        System.out.println(question2);
        System.out.println(question3);
        System.out.println(question4);
        System.out.println(question5);

        Player rafal = new Player("Rafal", "Nowak", 33, "Warszawa");
        Player mariusz = new Player("Mariusz","Kowal",27,"Krakow");
        Player lukasz = new Player("Lukasz","Bielik",29,"Gdynia");
        Player michal = new Player("Michal","Kowalski",35,"Sopot");
        Player radek = new Player("Radek", "Blauciak", 29, "Gorzow Wlkp.");

        PlayerChoice rafalQuestion1 = new PlayerChoice(rafal,question1,true);
        PlayerChoice rafalQuestion2 = new PlayerChoice(rafal,question2,false);
        PlayerChoice rafalQuestion3 = new PlayerChoice(rafal,question3,true);
        PlayerChoice rafalQuestion4 = new PlayerChoice(rafal,question4,false);
        PlayerChoice rafalQuestion5 = new PlayerChoice(rafal,question5,true);

        PlayerChoice mariuszQuestion1 = new PlayerChoice(mariusz,question1,true);
        PlayerChoice mariuszQuestion2 = new PlayerChoice(mariusz,question2,false);
        PlayerChoice mariuszQuestion3 = new PlayerChoice(mariusz,question3,true);
        PlayerChoice mariuszQuestion4 = new PlayerChoice(mariusz,question4,false);
        PlayerChoice mariuszQuestion5 = new PlayerChoice(mariusz,question5,true);

        PlayerChoice lukaszQuestion1 = new PlayerChoice(lukasz,question1,false);
        PlayerChoice lukaszQuestion2 = new PlayerChoice(lukasz,question2,false);
        PlayerChoice lukaszQuestion3 = new PlayerChoice(lukasz,question3,false);
        PlayerChoice lukaszQuestion4 = new PlayerChoice(lukasz,question4,false);
        PlayerChoice lukaszQuestion5 = new PlayerChoice(lukasz,question5,false);

        PlayerChoice michalQuestion1 = new PlayerChoice(michal,question1,false);
        PlayerChoice michalQuestion2 = new PlayerChoice(michal,question2,true);
        PlayerChoice michalQuestion3 = new PlayerChoice(michal,question3,false);
        PlayerChoice michalQuestion4 = new PlayerChoice(michal,question4,true);
        PlayerChoice michalQuestion5 = new PlayerChoice(michal,question5,false);

        PlayerChoice radekQuestion1 = new PlayerChoice(radek,question1,true);
        PlayerChoice radekQuestion2 = new PlayerChoice(radek,question2,true);
        PlayerChoice radekQuestion3 = new PlayerChoice(radek,question3,true);
        PlayerChoice radekQuestion4 = new PlayerChoice(radek,question4,true);
        PlayerChoice radekQuestion5 = new PlayerChoice(radek,question5,true);














    }

    /*Stworz program do tworzenia quizzow.
    Program powinien umozliwiac:
        - dodawanie quizzu skladajacego sie z pytania i kilku odpowiedzi
        - mozemy tworzyc quizzy wielokrotnego wyboru i jednokrotnego wyboru
        - system powinine przechowywac wyniki quizow danego uzytkownika
        - system powinien umozliwiac generowanie quizu o roznej dlugosci z losowych pytan.
        - system powinien umozliwiac wyszukiwanie graczy
        -- z najwyzszym wynikiem
        -- z najnizszym wynikiem
        -- top 3 graczy
        */

    //https://codingbat.com/java/Map-2
}
