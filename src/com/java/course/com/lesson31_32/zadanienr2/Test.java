package com.java.course.com.lesson31_32.zadanienr2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private List<Quiz> quizzes = new ArrayList<>();

    private List<Player> players = new ArrayList<>();


    public Test(List<Quiz> quizzes, List<Player> players) {
        this.quizzes = quizzes;
        this.players = players;
    }

    public Test(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "quizzes=" + quizzes;
    }
}
