package com.java.course.com.lesson66.poprawka;

public final class PrzedzialCenowy {
    private final String nazwaPrzedzialu;
    private final int cenaOd;
    private final int cenaDo;

    public PrzedzialCenowy(String nazwaPrzedzialu, int cenaOd, int cenaDo) {
        this.nazwaPrzedzialu = nazwaPrzedzialu;
        if (cenaOd >= 0 && cenaOd < cenaDo) {
            this.cenaOd = cenaOd;
            this.cenaDo = cenaDo;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public String getNazwaPrzedzialu() {
        return nazwaPrzedzialu;
    }


    public int getCenaOd() {
        return cenaOd;
    }


    public int getCenaDo() {
        return cenaDo;
    }


    @Override
    public String toString() {
        return "PrzedziałCenowy{" +
                "nazwaPrzedzialu='" + nazwaPrzedzialu + '\'' +
                ", cenaOd=" + cenaOd +
                ", cenaDo=" + cenaDo +
                '}';
    }
}
