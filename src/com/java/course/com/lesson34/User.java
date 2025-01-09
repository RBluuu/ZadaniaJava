package com.java.course.com.lesson34;

import java.util.*;

public class User {
    private String firstame;
    private String lastname;

    private List<Choice> choices = new ArrayList<>();

    public User(String firstame, String lastname) {
        this.firstame = firstame;
        this.lastname = lastname;
    }

    //Comparator i comparable
    public static List<User> topUsers(List<User> users, Quizz quizz, int howManyUsers) {
        List<User> top3 = new ArrayList<>();
        User topScorer = users.get(0);
        for (User user : users) {
            if (topScorer.correctAnswers(quizz) < user.correctAnswers(quizz)) {
                topScorer = user;
                top3.add(topScorer);
            }
            if (top3.size() > howManyUsers) {
                top3.remove(topScorer);
            }
        }
        return top3;
    }

    public static List<User> topUsersV3(List<User> users, Quizz quizz, int howManyUsers) {
        List<User> copy = new ArrayList<>(users);
        copy.sort(new UserByCorrectAnswersComparator(quizz));
        int amount = Math.min(howManyUsers, copy.size());
        return copy.subList(0, amount); //[1,2,3,4] sublist(0,2) -> [1,2]
    }

    public static List<User> topUsersV2(List<User> users, Quizz quizz, int howManyUsers) {
        List<User> top3 = new ArrayList<>();
        for (User user : users) {
            top3.add(user);
            if (top3.size() > howManyUsers) {
                top3.remove(user);
            }
        }
        return top3;
    }

    public static User userWithWorstScore(List<User> users, Quizz quizz) {
        User topScorer = users.get(0);
        for (User user : users) {
            if (topScorer.correctAnswers(quizz) > user.correctAnswers(quizz)) {
                topScorer = user;
            }
        }
        return topScorer;
    }

    public static User userWithTopScore(List<User> users, Quizz quizz) {
        User topScorer = users.get(0);
        for (User user : users) {
            if (topScorer.correctAnswers(quizz) < user.correctAnswers(quizz)) {
                topScorer = user;
            }
        }
        return topScorer;
    }

    public int correctAnswers(Quizz quizz) {
        int correctAnswersCounter = 0;
        for (Choice choiceByQuizz : choicesByQuizz(quizz)) {
            if (choiceByQuizz.getAnswer().isCorrect()) {
                correctAnswersCounter++;
            }
        }
        return correctAnswersCounter;
    }

    public List<Choice> choicesByQuizz(Quizz quizz) {
        List<Choice> choices = new ArrayList<>();
        for (Choice choice : this.choices) {
            if (choice.getAnswer().getQuestion().getQuizz().equals(quizz)) {
                choices.add(choice);
            }
        }
        return choices;
    }

    public List<Choice> choicesByQuestion(Question question) {
        List<Choice> choices = new ArrayList<>();
        for (Choice choice : this.choices) {
            if (choice.getAnswer().getQuestion().equals(question)) {
                choices.add(choice);
            }
        }
        return choices;
    }

    public String getFirstame() {
        return firstame;
    }

    public String getLastname() {
        return lastname;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstame='" + firstame + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public int compareTo(User o) {
        int result = this.firstame.compareTo(o.firstame);
        return result;
    }
}
