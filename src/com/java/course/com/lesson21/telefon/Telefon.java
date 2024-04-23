package com.java.course.com.lesson21.telefon;

import java.util.List;

public class Telefon {
    /*Stworz Klase Telefon(Marka,kolor,pamiec,mpix,cena)
- wlacz
- wylacz
- znajdz najdrozszy telefon
- znajdz wszystkie telefonu Apple
- zadzwonDoKogos
- oblicz srednia cene telefonow Apple
- zrob zdjecie
* stworz Klase smartfon ktora dziedziczy po klasie telefon
 */

    private String marka;
    private String kolor;
    private int pamiec;
    private int mpix;
    private int cena;
    private boolean wlaczTelefon;
    private boolean wylaczTelefon;
    private boolean zadzwonDoKogos;

    private boolean zrobZdjecie;

    public boolean ZadzwonDoKogos() {
        return zadzwonDoKogos;
    }

    public boolean ZrobZdjecie() {
        return zrobZdjecie;
    }


    public boolean WlaczTelefon() {
        return wlaczTelefon;
    }

    public boolean WylaczTelefon() {
        return wylaczTelefon;
    }

    public String getMarka() {
        return marka;
    }

    public String getKolor() {
        return kolor;
    }

    public int getPamiec() {
        return pamiec;
    }

    public int getMpix() {
        return mpix;
    }

    public int getCena() {
        return cena;
    }

    public Telefon(String marka, String kolor, int pamiec, int mpix, int cena) {
        this.marka = marka;
        this.kolor = kolor;
        this.pamiec = pamiec;
        this.mpix = mpix;
        this.cena = cena;
    }

    public Telefon(boolean zrobZdjecie) {
        this.zrobZdjecie = zrobZdjecie;
    }

    public Telefon(boolean wlaczTelefon, boolean wylaczTelefon) {
        this.wlaczTelefon = wlaczTelefon;
        this.wylaczTelefon = wylaczTelefon;
    }


   /* public void wlaczTelefon() {
        boolean wlaczTelefon = false;
        wlaczTelefon = !wlaczTelefon;
        if (wlaczTelefon)
        System.out.println("Wlaczony telefon");
        else
            System.out.println("Wylaczony telefon");
    }
    */

    public void zadzwonDoKogos() {
        zadzwonDoKogos = true;
        System.out.println("Telefon dzwoni do....");
    }

    public void zrobZdjecie() {
        zrobZdjecie = true;
        System.out.println("Zdjecie zostanie zrobione");
    }

    public static int najdrozszyTelefon(List<Telefon> telefony) {
        int najdrozszy = 0;
        for (Telefon smartfon : telefony) {
            if (smartfon.cena > najdrozszy) {
                najdrozszy = smartfon.cena;
            }
        }
        return najdrozszy;
    }

    public static int ilosc(List<Telefon> telefony, String marka) {
        int liczba = 0;
        for (Telefon smartfon : telefony) {
            if (smartfon.marka.equals(marka)) {
                liczba++;
            }
        }
        return liczba;
    }

    public static double sredniaCena(List<Telefon> telefony, String marka) {
        double suma = 0;
        int liczba = 0;
        for (Telefon smartfon : telefony) {
            if (smartfon.marka.equals(marka)) {
                suma += smartfon.cena;
                liczba++;
            }
        }
        return suma / liczba;
    }


    public void wlaczTelefon() {
    }
}
