package com.java.course.com.lesson34;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        User jan = new User("Jan", "Kowalski");
        User radek = new User("Radek", "Błauciak");
        User marek = new User("Marek", "Nowak");
        User wojtek = new User("Wojtek", "Kowalski");

        Quizz quizzJavaPodstawy = new Quizz("Java Podstawy", "Test na zaliczenie podstaw z Javy");

        Question q1 = new Question("Co to jest JVM?", quizzJavaPodstawy, true);
        Answer q1A = new Answer("Java Virtual Machine", true, q1);
        Answer q1B = new Answer("Java Vending Machine", false, q1);
        Answer q1C = new Answer("Java Virtual Mechanism", false, q1);

        Question q2 = new Question("Co to jest JVM?", quizzJavaPodstawy, true);
        Answer q2A = new Answer("Java Virtual Machine", true, q1);
        Answer q2B = new Answer("Java Vending Machine", false, q1);
        Answer q2C = new Answer("Java Virtual Mechanism", false, q1);

        Question q3 = new Question("Co to jest String?", quizzJavaPodstawy, true);
        Answer q3A = new Answer("text", true, q1);
        Answer q3B = new Answer("liczba", false, q1);
        Answer q3C = new Answer("działanie", false, q1);

        Question q4 = new Question("Z czego sklada sie obiekt", quizzJavaPodstawy, true);
        Answer q4A = new Answer("ze zmiennych i konstruktora", true, q1);
        Answer q4B = new Answer("zmiennych, konstruktora, getterow i setterow", false, q1);
        Answer q4C = new Answer("zmiennych", false, q1);

        Choice janQ1Choice = new Choice(jan, q1A);
        Choice janQ2Choice = new Choice(jan, q2B);
        Choice janQ3Choice = new Choice(jan, q3B);
        Choice janQ4Choice = new Choice(jan, q4C);

        Choice radekQ1Choice = new Choice(radek, q1A);
        Choice radekQ2Choice = new Choice(radek, q2A);
        Choice radekQ3Choice = new Choice(radek, q3A);
        Choice radekQ4Choice = new Choice(radek, q4A);

        Choice marekQ1Choice = new Choice(marek, q1A);
        Choice marekQ2Choice = new Choice(marek, q2A);
        Choice marekQ3Choice = new Choice(marek, q3C);
        Choice marekQ4Choice = new Choice(marek, q4C);

        Choice wojtekQ1Choice = new Choice(wojtek, q1C);
        Choice wojtekQ2Choice = new Choice(wojtek, q2B);
        Choice wojtekQ3Choice = new Choice(wojtek, q3C);
        Choice wojtekQ4Choice = new Choice(wojtek, q4C);

        System.out.println(User.userWithTopScore(List.of(jan), quizzJavaPodstawy));

        QuestionToCreate questionToCreate = new QuestionToCreate("fqfew", true, List.of(q1A, q2B, q3C));
        System.out.println(Quizz.generateQuizz(List.of(questionToCreate), 1, "DQW", "AWDD"));

        System.out.println();

        System.out.println("Generowanie testow: " + Quizz.generateQuizz(List.of(questionToCreate), 3, "Test2", "Java"));
        System.out.println();

        System.out.println("Sredni wynik odpowiedzi z testu:" + Quizz.resultOfTest(List.of(quizzJavaPodstawy)));
        System.out.println();

        System.out.println("Najgorszy gracz: " + User.userWithWorstScore(List.of(jan,radek,marek,wojtek),quizzJavaPodstawy));
        System.out.println();

        System.out.println("Top3: " + User.topUsers(List.of(jan,radek,marek,wojtek),quizzJavaPodstawy,3));
        System.out.println();

        System.out.println("Top3V2: " + User.topUsersV2(List.of(jan,radek,marek,wojtek),quizzJavaPodstawy,3));
        System.out.println("Top3V2: " + User.topUsersV3(List.of(jan,radek,marek,wojtek),quizzJavaPodstawy,3));
        System.out.println();

    }
}
/*
- znajdz top3 userow - nie wiem
-znajdz najlepszego usera - ok
- znajdz najgorszego usera - ok
- przetestuj generowanie testow ( dodac wiecej pytan i sprawdzic czy dziala) - ok
- jaka jest srednia dobrych odpowiedziy z testu z Javy z podstaw? ok
- Oblicz srednie wynikow per test -> Java podstawy = 80%, Java ROzszerzenie -> 50% .... ok
 */