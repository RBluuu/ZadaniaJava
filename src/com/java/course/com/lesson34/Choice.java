package com.java.course.com.lesson34;

public class Choice {
    private User user;
    private Answer answer;

    public Choice(User user, Answer answer) {
        Question currentQuestion = answer.getQuestion();
        boolean isMultiple = currentQuestion.isMultipleChoice();
        if (!isMultiple && !user.choicesByQuestion(currentQuestion).isEmpty()) {
            throw new IllegalArgumentException("cannot answer more than once to a single choice question");
        }
        if (user == null || answer == null) {
            throw new IllegalArgumentException();
        }
        this.user = user;
        this.answer = answer;
        user.getChoices().add(this);
        answer.getChoices().add(this);
    }

    public boolean isCorecrt(){
        if (answer.isCorrect() == true) {
            return true;
        }
        return false;
    }

    public User getUser() {
        return user;
    }

    public Answer getAnswer() {
        return answer;
    }
}
