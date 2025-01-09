package com.java.course.com.lesson34;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Question {
    private String text;
    private Quizz quizz;
    private boolean isMultipleChoice;
    private List<Answer> answers = new ArrayList<>();

    public Question(String text, Quizz quizz, boolean isMultipleChoice) {
        this.isMultipleChoice = isMultipleChoice;
        if (quizz == null) {
            throw new IllegalArgumentException("quizz cannot be null");
        }
        this.text = text;
        this.quizz = quizz;
        quizz.getQuestions().add(this);
    }

    public String getText() {
        return text;
    }

    public Quizz getQuizz() {
        return quizz;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public boolean isMultipleChoice() {
        return isMultipleChoice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return isMultipleChoice == question.isMultipleChoice && Objects.equals(text, question.text) && Objects.equals(quizz, question.quizz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, quizz, isMultipleChoice);
    }
}
