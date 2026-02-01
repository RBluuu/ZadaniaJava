package com.java.course.com.lesson42.klientiprodukt;

public class Main {
    public static void main(String[] args) {
        //Stworz asocjacje pomiedzy klientem i produktem 1-*. Obsluz sytuacje gdy produkt jest nullem, wtedy automatycznie ustwiamy
        //klientowi ze zamowil lamborghini za 10000000
        //zamow(Produkt) -> jezeli produk to null to dodajemy mu lamborghini

        Klient radek = new Klient("Radek","Blauciak","Gorzow");
        Klient wojtek = new Klient("Wojtek","Nowak","Krakow");
        Klient marek = new Klient("Marek","Kowalski","Gdansk");

        Produkt rower = new Produkt("Rower",3500,1);
        Produkt telewizor = new Produkt("Telewizor",5500,2);
        Produkt monitor = new Produkt("Monitor",1500,3);
        Produkt motor = new Produkt(null,0,0);


        radek.zamow(rower);
        radek.zamow(null);
        System.out.println();
        wojtek.zamow(telewizor);
        wojtek.zamow(motor);
        System.out.println();
        marek.zamow(monitor);
        marek.zamow(null);
    }
}
