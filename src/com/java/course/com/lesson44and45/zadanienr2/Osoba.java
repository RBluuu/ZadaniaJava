package com.java.course.com.lesson44and45.zadanienr2;

public class Osoba<T, U> {
    //Napisz klase Osoba która ma 2 parametry ktore moga byc roznymi typami, np String int, String String.
    private T parametr1;
    private U parametr2;

    public Osoba(T parametr1, U parametr2) {
        this.parametr1 = parametr1;
        this.parametr2 = parametr2;
    }

    public T getParametr1() {
        return parametr1;
    }

    public U getParametr2() {
        return parametr2;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "parametr1=" + parametr1 +
                ", parametr2=" + parametr2 +
                '}';
    }


}
