package com.java.course.com.lesson34;

import java.util.Comparator;

public class UserByCorrectAnswersComparator implements Comparator<User> {

    private final Quizz quizz;

    public UserByCorrectAnswersComparator(Quizz quizz) {
        this.quizz = quizz;
    }

    @Override
    public int compare(User o1, User o2) {
        return -(o1.correctAnswers(quizz) - o2.correctAnswers(quizz));
    }
}
