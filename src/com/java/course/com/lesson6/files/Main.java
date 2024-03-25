package com.java.course.com.lesson6.files;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //FileWriter
        //FileReader

//        String path = "src\\com\\java\\course\\com\\java\\lesson6\\files\\file.txt";
//        try (FileWriter fw = new FileWriter(path, false)) {
//            fw.write("hej" + "\n");
//            fw.write("siema" + System.lineSeparator());
//            fw.write("witam" + System.lineSeparator());
//        }
//
//        try (FileReader fr = new FileReader(path)) {
//            int c;
//            while ((c = fr.read()) != -1) {
//                System.out.print((char) c);
//            }
//        }


        //BufferredWriter
        //BUfferredReader
        System.out.println();

        String animals = "src\\com\\java\\course\\com\\java\\lesson6\\files\\animals.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(animals))) {
            bw.write("zolw");
            bw.newLine();
            bw.write("kon");
            bw.newLine();
            bw.write("malpa");
        }

        try (BufferedReader bw = new BufferedReader(new FileReader(animals))) {
            String line;
            while ((line = bw.readLine()) != null){
                System.out.println(line);
            }
        }


    }
}
