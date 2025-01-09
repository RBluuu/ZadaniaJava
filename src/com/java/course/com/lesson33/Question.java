package com.java.course.com.lesson33;

import com.java.course.com.lesson31_32.zadanienr2.Quiz;

import java.util.ArrayList;
import java.util.List;

public class Question {

    //int points

    private Quizz quizz;
    private String text; //Co to JVM?
    List<Answer> answers = new ArrayList<>();
    List<PlayerChoice> playerChoiceList = new ArrayList<>();

    public Question(Quizz quizz, String text) {
        this.quizz = quizz;
        this.text = text;
        //info zwrotne
        quizz.questionList.add(this);
    }

    public Quizz getQuizz() {
        return quizz;
    }

    public void setQuizz(Quizz quizz) {
        this.quizz = quizz;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<PlayerChoice> getPlayerChoiceList() {
        return playerChoiceList;
    }

    public void setPlayerChoiceList(List<PlayerChoice> playerChoiceList) {
        this.playerChoiceList = playerChoiceList;
    }

    @Override
    public String toString() {
        return "quizz=" + quizz +
                ", text='" + text ;
    }
}
