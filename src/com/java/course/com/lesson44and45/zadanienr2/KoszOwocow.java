package com.java.course.com.lesson44and45.zadanienr2;

public class KoszOwocow<T extends Owoc >{
    private T owowce;

    public KoszOwocow(T owowce) {
        this.owowce = owowce;
    }

    public T getOwowce() {
        return owowce;
    }

    public void setOwowce(T owowce) {
        this.owowce = owowce;
    }

    @Override
    public String toString() {
        return "Kosz zawiera: " + owowce;
    }
}
