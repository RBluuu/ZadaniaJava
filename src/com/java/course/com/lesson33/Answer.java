package com.java.course.com.lesson33;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Answer {
    private Question question;
    private String text; //Java Virtual Machine
    private boolean isCorrect;
    private int point;

    public Answer(Question question, String text, int point,boolean isCorrect) {
        this.question = question;
        this.text = text;
        this.point = point;
        this.isCorrect = isCorrect;
        question.answers.add(this);
    }

    /*//system powinine przechowywac wyniki quizow danego uzytkownika
    public static Map<String,Integer> scoreFromQuizz(List<Player> playerList) {
        Map<String,Integer> mapScore = new HashMap<>();
        Player playerName = playerList.get(0);
        for (Player player : playerList) {
            if (player.getFirstName().equals(playerName.getFirstName())) {
                mapScore.put(playerName.getFirstName(),player.points);
            }
        }
        return mapScore;
    }

     */

    /*public int points() {
        int sum = 0;
        for (Answer playerChoice : getQuestion().getAnswers()) {
            if (getQuestion(). == true) {
                sum++;
            }
        }
        return sum;
    }

     */

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "question=" + question +
                ", text='" + text + '\'' +
                ", isCorrect=" + isCorrect +
                ", point=" + point +
                '}';
    }
}
