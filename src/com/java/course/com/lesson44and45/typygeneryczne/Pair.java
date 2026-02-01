package com.java.course.com.lesson44and45.typygeneryczne;

//T,U
//Type
//Value
public class Pair <T1,T2>{
    private T1 content1;
    private T2 content2;

    public T1 getContent1() {
        return content1;
    }

    public void setContent1(T1 content1) {
        this.content1 = content1;
    }

    public T2 getContent2() {
        return content2;
    }

    public void setContent2(T2 content2) {
        this.content2 = content2;
    }
}
