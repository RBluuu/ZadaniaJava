package com.java.course.com.lesson31_32.zadanienr2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Player radek = new Player("Radek", "Blauciak", 29, "Gorzow Wlkp.");
        //Player darek = new Player("Darek", "Nowak", 33, "Warszawa");
        //Player mariusz = new Player("Mariusz","Kowal",27,"Krakow");
        //Player lukasz = new Player("Lukasz","Bielik",29,"Gdynia");
        //Player michal = new Player("Michal","Kowalski",35,"Sopot");

        Question question1 = new Question("How many days is in year",2);
        Question question2 = new Question("What is the name of the capital of Poland",3);
        Question question3 = new Question("When America was discovered",4);
        Question question4 = new Question("When destroyed two towers in NY?",3);
        Question question5 = new Question("What day is a day off from work?",1);

        Choice choice1 = new Choice("365","360","366","370");
        Choice choice2 = new Choice("Warszawa","Krakow","Sopot","Lublin");
        Choice choice3 = new Choice("1493","1792","1492","1893");
        Choice choice4 = new Choice("2000","2010","2011","2001");
        Choice choice5 = new Choice("on Sunday","on Monday","on Friday","on Saturday");

        Quiz quiz1 = new Quiz(1,question1, choice1);
        Quiz quiz2 = new Quiz(2,question2, choice2);
        Quiz quiz3 = new Quiz(3,question3, choice3);
        Quiz quiz4 = new Quiz(4,question4, choice4);
        Quiz quiz5 = new Quiz(5,question5, choice5);

        TestAnswer answer1 = new TestAnswer(1,"A");
        TestAnswer answer2 = new TestAnswer(2,"A");
        TestAnswer answer3 = new TestAnswer(3,"C");
        TestAnswer answer4 = new TestAnswer(4,"D");
        TestAnswer answer5 = new TestAnswer(5,"A");

        Test test1 = new Test(List.of(quiz1,quiz2,quiz3,quiz4,quiz5));

        System.out.println(test1);











    }
}
