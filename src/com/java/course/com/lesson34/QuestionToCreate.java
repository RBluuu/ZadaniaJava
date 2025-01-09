package com.java.course.com.lesson34;

import java.util.ArrayList;
import java.util.List;

//DTO - Data Transfer Object
public class QuestionToCreate {
    private String text;
    private boolean isMultipleChoice;
    private List<Answer> answers = new ArrayList<>();

    public QuestionToCreate(String text, boolean isMultipleChoice, List<Answer> answers) {
        this.text = text;
        this.isMultipleChoice = isMultipleChoice;
        this.answers = answers;
    }

    public String getText() {
        return text;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}
