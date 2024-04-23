package com.java.course.com.lesson20;

public class Gracz {
    String imie; //private
    String nazwisko;  //private
    String kraj;  //private
    int punkty;  //private

    public Gracz(String imie, String nazwisko, String kraj, int punkty) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kraj = kraj;
        this.punkty = punkty;
    }

    // alt + insert
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public void GraczNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void GraczPunkty(int punkty) {
        this.punkty = punkty;
    }
}
