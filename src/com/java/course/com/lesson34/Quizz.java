package com.java.course.com.lesson34;

import java.util.*;

public class Quizz {
    private String title;
    private String description;
    private List<Question> questions = new ArrayList<>();

    public Quizz(String title, String description) {
        this.title = title;
        this.description = description;
    }

    //- Oblicz srednie wynikow per test -> Java podstawy = 80%, Java ROzszerzenie -> 50% ....
    public static Map<String, Double> resultOfTest(List<Quizz> quizzList) {
        Map<String, Double> newMap = new HashMap<>();
        for (Quizz quizz : quizzList) {
            double result = 0;
            for (Question question : quizz.getQuestions()) {
                for (Answer answer : question.getAnswers()) {
                    for (Choice choice : answer.getChoices()) {
                        if (choice.isCorecrt()) {
                            result++;
                        }
                    }
                }
            }
            newMap.put(quizz.title, result / quizz.getQuestions().size());
        }
        return newMap;
    }

    //- system powinien umozliwiac generowanie quizu o roznej dlugosci z losowych pytan.
    public static Quizz generateQuizz(List<QuestionToCreate> questions, int length, String title, String description) {
        Quizz newQuizz = new Quizz(title, description);
        List<QuestionToCreate> selectedQuestions = new ArrayList<>();
        Collections.shuffle(questions);

        int numQuestions = Math.min(length, questions.size());

        for (int i = 0; i < numQuestions; i++) {
            selectedQuestions.add(questions.get(i));
        }
        for (QuestionToCreate selectedQuestion : selectedQuestions) {
            new Question(selectedQuestion.getText(), newQuizz, true);
        }
        return newQuizz;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Quizz{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", questions=" + questions.size() +
                '}';
    }
}
