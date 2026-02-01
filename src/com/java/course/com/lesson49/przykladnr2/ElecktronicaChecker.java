package com.java.course.com.lesson49.przykladnr2;

public interface ElecktronicaChecker {
    boolean check(Electronica electronica);
}

class TvChecker implements ElecktronicaChecker {

    @Override
    public boolean check(Electronica electronica) {
        return electronica.canPlay() && electronica.canLearn() && electronica.canWatchFilms();
    }
}

class ComputerChecker implements ElecktronicaChecker {

    @Override
    public boolean check(Electronica electronica) {
        return electronica.canPlay() && electronica.canLearn() && electronica.canWatchFilms();
    }
}

class TelefonChecker implements ElecktronicaChecker {

    @Override
    public boolean check(Electronica electronica) {
        return electronica.canPlay() && electronica.canWatchFilms();
    }
}
