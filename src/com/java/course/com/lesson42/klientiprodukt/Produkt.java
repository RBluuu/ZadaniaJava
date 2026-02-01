package com.java.course.com.lesson42.klientiprodukt;

public class Produkt {
    //Stworz asocjacje pomiedzy klientem i produktem 1-*. Obsluz sytuacje gdy produkt jest nullem, wtedy automatycznie ustwiamy
    //klientowi ze zamowil lamborghini za 10000000
    //zamow(Produkt) -> jezeli produk to null to dodajemy mu lamborghini
    private String nazwaProduktu;
    private long cena;
    private int ilosc;

    public Produkt(String nazwaProduktu, long cena, int ilosc) {
        this.nazwaProduktu = nazwaProduktu;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public long getCena() {
        return cena;
    }

    public void setCena(long cena) {
        this.cena = cena;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cena=" + cena +
                ", ilosc=" + ilosc +
                '}';
    }
}
