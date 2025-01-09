package com.java.course.com.lesson34;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    private String text;
    private boolean isCorrect;
    private Question question;
    private List<Choice> choices = new ArrayList<>();

    public Answer(String text, boolean isCorrect, Question question) {
        if (question == null) {
            throw new IllegalArgumentException();
        }
        this.text = text;
        this.isCorrect = isCorrect;
        this.question = question;
        question.getAnswers().add(this);
    }

    public String getText() {
        return text;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public Question getQuestion() {
        return question;
    }

    public List<Choice> getChoices() {
        return choices;
    }
}
