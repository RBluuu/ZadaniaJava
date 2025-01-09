package com.java.course.com.lesson33;

import com.java.course.com.lesson31_32.zadanienr2.Choice;

import java.util.ArrayList;
import java.util.List;

public class Quizz {
    private String nameQuizz;
    List<Question> questionList = new ArrayList<>();

    public Quizz(String nameQuizz) {
        this.nameQuizz = nameQuizz;
    }

    public String getNameQuizz() {
        return nameQuizz;
    }

    public void setNameQuizz(String nameQuizz) {
        this.nameQuizz = nameQuizz;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    @Override
    public String toString() {
        return nameQuizz ;
    }
}
