package com.java.course.com.lesson33;

import java.util.ArrayList;
import java.util.List;

public class Player {

     private String firstName;
     private String lastName;
     private int age;
     private String city;
     List<PlayerChoice> playerChoiceList = new ArrayList<>();

     public Player(String firstName, String lastName, int age, String city) {
          this.firstName = firstName;
          this.lastName = lastName;
          this.age = age;
          this.city = city;
     }

     public List<PlayerChoice> getPlayerChoiceList() {
          return playerChoiceList;
     }

     public void setPlayerChoiceList(List<PlayerChoice> playerChoiceList) {
          this.playerChoiceList = playerChoiceList;
     }

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public String getCity() {
          return city;
     }

     public void setCity(String city) {
          this.city = city;
     }

     @Override
     public String toString() {
          return "Player{" +
                  "firstName='" + firstName + '\'' +
                  ", lastName='" + lastName + '\'' +
                  ", age=" + age +
                  ", city='" + city + '\'' +
                  '}';
     }
}
