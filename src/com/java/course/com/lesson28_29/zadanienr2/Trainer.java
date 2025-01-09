package com.java.course.com.lesson28_29.zadanienr2;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String firstName;
    private String lastName;
    private Adress adress;
    private List<Animal> animals = new ArrayList<>();

    public Trainer(String firstName, String lastName, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }

    public void addAnimal(Animal animal) {
        if (animal == null || animal.getTrainer() != null) {
            return;
        }
        animal.setTrainer(this);
        this.getAnimals().add(animal);
    }

    //-znajdz trenera ktory trenował najwiecej zwierzat
    public static Trainer moustPopularTrainer(List<Trainer> trainers) {
        Trainer moustPopular = null;
        int quantity = Integer.MIN_VALUE;
        for(Trainer trainer : trainers) {
            if (trainer.getAnimals().size() > quantity) {
                quantity = trainer.getAnimals().size();
                moustPopular = trainer;
            }
        }
        return moustPopular;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
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

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "firstName=" + firstName + '\'' +
                ", lastName=" + lastName + '\'' +
                ", adress=" + adress +
                ", animals=" + animals +
                '}';
    }
}
