package com.java.course.com.lesson44and45;

import com.java.course.com.projektwycieczka.model.Person;
import jdk.jshell.spi.ExecutionControl;

public class Pracownik extends Person {
    private RodzajUmowy rodzajUmowy;
    private int stawkaZaGodzine;
    private int pensjaMinimalna;
    private int liczbaPrzeparacowanychGodzin;


    public Pracownik(String imie, String nazwisko, RodzajUmowy rodzajUmowy) {
        super(imie, nazwisko);
        this.rodzajUmowy = rodzajUmowy;
    }

    public Pracownik(String imie, String nazwisko, String email, int numerTelefonu, RodzajUmowy rodzajUmowy, int pensjaMinimalna, int liczbaPrzeparacowanychGodzin) {
        super(imie, nazwisko, email, numerTelefonu);
        this.rodzajUmowy = rodzajUmowy;
        this.pensjaMinimalna = pensjaMinimalna;
        this.liczbaPrzeparacowanychGodzin = liczbaPrzeparacowanychGodzin;
    }

    public int getPensjaMinimalna() {
        return pensjaMinimalna;
    }

    public void setPensjaMinimalna(int pensjaMinimalna) {
        this.pensjaMinimalna = pensjaMinimalna;
    }

    public int getLiczbaPrzeparacowanychGodzin() {
        return liczbaPrzeparacowanychGodzin;
    }

    public void setLiczbaPrzeparacowanychGodzin(int liczbaPrzeparacowanychGodzin) {
        this.liczbaPrzeparacowanychGodzin = liczbaPrzeparacowanychGodzin;
    }

    public int getStawkaZaGodzine() throws ExecutionControl.NotImplementedException {
        if(this.rodzajUmowy != RodzajUmowy.UMOWA_TYMCZASOWA){
            throw new ExecutionControl.NotImplementedException("Stawka za godzine nie dotyczy tego pracownika");
        }
        return stawkaZaGodzine;
    }

    @Override
    public String toString() {
        return "Pracownicy{" +
                "pensjaMinimalna=" + pensjaMinimalna +
                ", liczbaPrzeparacowanychGodzin=" + liczbaPrzeparacowanychGodzin +
                '}';
    }
}
