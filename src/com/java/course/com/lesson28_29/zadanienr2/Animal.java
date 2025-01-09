package com.java.course.com.lesson28_29.zadanienr2;

import java.util.List;

public abstract class Animal {
    private String name;
    private String type;
    private Trainer trainer;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Animal(String name, String type, String genre, Trainer trainer) {
        this.name = name;
        this.type = type;
        this.type = genre;
        this.trainer = trainer;
    }

    //-znajdz wszystkie pterodaktyle ktore nigdy nie mialy przypisanego trenera
    public static Animal pterodactylWithoutTrainer(List<Animal> animals) {
        Animal bird = null;
        for (Animal animal : animals) {
            if (animal.getTrainer() == null) {
                bird = animal;
            }
        }
        return bird;
    }

    //-znajdz trenerow ktorzy trenowali psy z gatunku spaniel
    public static Trainer trainerOfGanre(List<Animal> animals, String genre) {
        Trainer name = null;
        for (Animal animal : animals) {
            if (animal.type.equals(genre)) {
                name = animal.getTrainer();
            }
        }
        return name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animals: " +
                "name='" + name + '\'' +
                ", genre='" + type + '\'' + ";";
    }
}
