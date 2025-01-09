package com.java.course.com.lesson42.exceptioniheritance;

import java.util.Random;

public class MyException extends RuntimeException {
}

class ChildException extends MyException {
}

class BabyException extends ChildException {
}

class Example{
    public static void random(){
        int randomNumber = (int) (Math.random() * 100);
        if( randomNumber < 10) {
            throw new MyException();
        }else if(randomNumber < 50) {
            throw new ChildException();
        }else if(randomNumber < 80){
                throw new IndexOutOfBoundsException();
        }else{
            throw new BabyException();
        }
    }

    public static void main(String[] args) {
        try {
            random();
        }catch (MyException e){
            System.out.println("Top level exception");
        }

        try{
            random();
        }catch (BabyException ex){
            System.out.println("Baby");
        }catch (ChildException ex){
            System.out.println("child");
        }catch (MyException ex){
            System.out.println("MyException");
        }

        try{
            random();
        }catch (BabyException | IndexOutOfBoundsException ex){
            System.out.println("Baby or IndexOutOfBounds");
        }catch (ChildException ex){
            System.out.println("child");
        }catch (MyException ex){
            System.out.println("MyException");
        }
    }
}