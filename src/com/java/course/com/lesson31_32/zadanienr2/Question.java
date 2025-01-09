package com.java.course.com.lesson31_32.zadanienr2;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String questionName;
    private int point;
    private List<Choice> choices = new ArrayList<>();

    public Question(String questionName, int point) {
        this.questionName = questionName;
        this.point = point;
    }

    public void addAnswer(Choice choice) {
        if (choice == null || choice.getQuestion() != null) {
            return;
        }
        choice.setQuestion(this);
        this.getAnswers().add(choice);
    }

    public List<Choice> getAnswers() {
        return choices;
    }

    public void setAnswers(List<Choice> choices) {
        this.choices = choices;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "question='" + questionName+
                ", point=" + point;
    }
}
