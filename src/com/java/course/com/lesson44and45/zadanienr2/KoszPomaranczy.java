package com.java.course.com.lesson44and45.zadanienr2;

public class KoszPomaranczy {
    private Pomarancze pomarancz;

    public KoszPomaranczy(Pomarancze pomarancz) {
        this.pomarancz = pomarancz;
    }

    public Pomarancze getPomarancz() {
        return pomarancz;
    }

    public void setPomarancz(Pomarancze pomarancz) {
        this.pomarancz = pomarancz;
    }

    @Override
    public String toString() {
        return "KoszPomaranczy{" +
                "pomarancz=" + pomarancz +
                '}';
    }
}
