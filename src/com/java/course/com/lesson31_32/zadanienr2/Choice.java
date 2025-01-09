package com.java.course.com.lesson31_32.zadanienr2;

import java.util.ArrayList;
import java.util.List;

public class Choice {
    public Object add;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private Question question;
    private List<Question> questions = new ArrayList<>();

    public Choice(String answerA, String answerB, String answerC, String answerD) {
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public void add(Question question) {
    }

    @Override
    public String toString() {
        return "Answer: " +
                "answerA='" + answerA +
                ", answerB='" + answerB +
                ", answerC='" + answerC +
                ", answerD='" + answerD;
    }
}
