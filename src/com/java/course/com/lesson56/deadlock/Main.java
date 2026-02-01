package com.java.course.com.lesson56.deadlock;

public class Main {
    public static void main(String[] args) {
        String kowalski = "12312314124";
        String nowak = "555443434";

        new Thread(new Transfer(kowalski, nowak)).start();
        new Thread(new Transfer(nowak, kowalski)).start();
    }
}
