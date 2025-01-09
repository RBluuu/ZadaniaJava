package com.java.course.com.lesson33;

public class PlayerChoice {

    private Player player;
    private Question question;
    private boolean answer;

    public PlayerChoice(Player player, Question question, boolean answer) {
        this.player = player;
        this.question = question;
        this.answer = answer;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public boolean getAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "PlayerChoice{" +
                "player=" + player +
                ", question=" + question +
                ", answer=" + answer +
                '}';
    }

}
