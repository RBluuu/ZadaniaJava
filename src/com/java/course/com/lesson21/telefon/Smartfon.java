package com.java.course.com.lesson21.telefon;

public class Smartfon extends Telefon {

    int rokProdukcji;
    boolean wlacz = false;

    public Smartfon(String marka, String kolor, int pamiec, int mpix, int cena, int rokProdukcji) {
        super(marka, kolor, pamiec, mpix, cena);
        this.rokProdukcji = rokProdukcji;
    }

    public void info() {
        System.out.println(super.getMarka());
        System.out.println(super.getKolor());
        System.out.println(super.getPamiec());
        System.out.println(super.getMpix());
        System.out.println(super.getCena());
        System.out.println(this.rokProdukcji);
    }



    public void wlaczIWylacz() {
        wlacz = !wlacz;
        if (wlacz) {
            System.out.println("Wlaczony telefon");
        } else {
            System.out.println("Wylaczony telefon");
        }
    }
}
