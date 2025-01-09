package com.java.course.com.lesson41;

public enum Greetings {
    POLISH {
        @Override
        public void sayHello() {
            System.out.println("DZIEN DOBRY");
        }
    },GERMAN {
        @Override
        public void sayHello() {
            System.out.println("GUTEN TAG");
        }
    },ENGLISH {
        @Override
        public void sayHello() {
            System.out.println("GOOD MORNING");
        }
    };

    public abstract void sayHello();
}
