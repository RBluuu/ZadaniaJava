package com.java.course.com.lesson31_32.zadanienr2;

import java.util.ArrayList;
import java.util.List;

public class TestAnswer {

    private int numberOfQestion;
    private String answer;

    public TestAnswer(int numberOfQestion, String answer) {
        this.numberOfQestion = numberOfQestion;
        this.answer = answer;
    }

    public int getNumberOfQestion() {
        return numberOfQestion;
    }

    public void setNumberOfQestion(int numberOfQestion) {
        this.numberOfQestion = numberOfQestion;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "TestAnswer:" +
                "numberOfQestion=" + numberOfQestion +
                ", answer='" + answer;
    }
}
