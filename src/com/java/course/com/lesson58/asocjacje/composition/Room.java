package com.java.course.com.lesson58.asocjacje.composition;

public class Room {

    private final House house;

    /*
            jeden do wiele OK
            calosc sklada sie z czesci w domysle
            czesc nie moze byc wspoldzielona OK
            czesc nie moze istniec bez calosci OK
             */
    public Room(House house) {
        if (house == null) {
            throw new IllegalArgumentException();
        }
        this.house = house;
        house.getRooms().add(this);
    }
}
