package com.java.course.com.lesson49.przykladnr1;

public interface VechicleChecker {
    boolean chceck(Vechicle vechicle);
}

class DrivingChecker implements VechicleChecker {

    @Override
    public boolean chceck(Vechicle vechicle) {
        return vechicle.canDrive();
    }
}

class SailingCheckcer implements VechicleChecker {

    @Override
    public boolean chceck(Vechicle vechicle) {
        return vechicle.canSailing();
    }
}

class FlyChecker implements VechicleChecker {

    @Override
    public boolean chceck(Vechicle vechicle) {
        return vechicle.canFly();
    }
}


