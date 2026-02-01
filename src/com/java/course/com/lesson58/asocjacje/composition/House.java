package com.java.course.com.lesson58.asocjacje.composition;

import java.util.ArrayList;
import java.util.List;

public class House {

    private List<Room> rooms = new ArrayList<>();

    public List<Room> getRooms() {
        return rooms;
    }
}
