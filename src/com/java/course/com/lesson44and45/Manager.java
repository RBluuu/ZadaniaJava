package com.java.course.com.lesson44and45;


public class Manager extends Pracownik {
    private int premiaOstatniegoMiesiaca;

    public Manager(String imie, String nazwisko, RodzajUmowy rodzajUmowy) {
        super(imie, nazwisko, rodzajUmowy);
    }

    public int getPremiaOstatniegoMiesiaca() {
        return premiaOstatniegoMiesiaca;
    }

    public void setPremiaOstatniegoMiesiaca(int premiaOstatniegoMiesiaca) {
        this.premiaOstatniegoMiesiaca = premiaOstatniegoMiesiaca;
    }

    @Override
    public String toString() {
        return "Menager{" +
                "premiaOstatniegoMiesiaca=" + premiaOstatniegoMiesiaca +
                '}';
    }
}
