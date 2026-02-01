package com.java.course.com.lesson49;

public interface Animal {
    boolean canJump();
    boolean canFly();
    boolean canSwim();
}
class Dog implements Animal{
    @Override
    public boolean canJump() {
        return true;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
class Fish implements Animal{
    @Override
    public boolean canJump() {
        return false;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
class Bird implements  Animal{
    @Override
    public boolean canJump() {
        return true;
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}