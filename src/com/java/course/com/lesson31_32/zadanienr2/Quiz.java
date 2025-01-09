package com.java.course.com.lesson31_32.zadanienr2;

public class Quiz {
    private int questionNumber;
    private final Question question; //List<Question>
    private final Choice choice;

    public Quiz(int questionNumber, Question question, Choice choice) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.choice = choice;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public Question getQuestion() {
        return question;
    }

    public Choice getAnswer() {
        return choice;
    }

    @Override
    public String toString() {
        return "questinoNumber=" + questionNumber +
                ", question=" + question +
                ", answer=" + choice;
    }
}
