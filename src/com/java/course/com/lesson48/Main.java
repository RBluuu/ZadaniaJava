package com.java.course.com.lesson48;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", "Doe", 30);
        Person alice = new Person("Alice", "Smith", 25);

        // Create animals
        Animal dog = new Animal("Buddy");
        Animal cat = new Animal("Whiskers");
        Animal parrot = new Animal("Polly");

        // Assign animals to people
        john.addAnimal(dog);
        alice.addAnimal(cat);
        alice.addAnimal(parrot);

        // Create a list of people
        List<Person> people = Arrays.asList(john, alice);

        serialize(people);

        List<Person> deserialized = deserialize();
        System.out.println(deserialized);
    }

    private static List<Person> deserialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
            List<Person> deserializedPerson = (List<Person>) ois.readObject();
            System.out.println("Deserialization successful: " + deserializedPerson);
            return deserializedPerson;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException();
        }
    }

    private static void serialize(List<Person> people) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            oos.writeObject(people);
            //System.out.println("Serialization successful: " + people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
