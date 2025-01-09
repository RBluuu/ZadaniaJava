package com.java.course.com.lesson36.usecase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ObjectReader {
    //person,jan,kowalski,1995-10-10
    //dog,burek,kundel,10
    //Strategia https://www.youtube.com/watch?v=yzxd7Sp_nSU&ab_channel=lukasz-cpu

    static Map<String, ObjectPrinter> printers = new HashMap<>();

    static {
        printers.put("person", new PersonPrinter());
        printers.put("dog", new DogPrinter());
    }

    public static void read(String path, String peremeter) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(peremeter);
                String type = data[0];
                printers.get(type).print(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
