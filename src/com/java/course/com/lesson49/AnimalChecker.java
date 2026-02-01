package com.java.course.com.lesson49;

public interface AnimalChecker {

    boolean check(Animal animal);

}
class FlyChecker implements AnimalChecker{

    @Override
    public boolean check(Animal animal) {
        return animal.canFly();
    }
}

class JumpChecker implements AnimalChecker{

    @Override
    public boolean check(Animal animal) {
        return animal.canJump();
    }
}