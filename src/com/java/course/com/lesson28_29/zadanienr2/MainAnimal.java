package com.java.course.com.lesson28_29.zadanienr2;

import java.util.List;

public class MainAnimal {
    public static void main(String[] args) {

 /*
 W systemie przechowujemy informacje o zwierzetach (nazwa, gatunek). Dla psów przechowujemy dodatkowe ich dlugosc siersci
 oraz ulubione zabawki ,dla kotów stopien bycia wkurwiajacym futrzakiem (1-10) oraz dla pterodaktylow rozpietosc skrzydel.

 Trenerzy (imie, nazwisko, adres) trenuja zwierzeta. Kazdy trener trenuje wiele zwierzat, ale zwierze jest pod okiem jednego trenera.


 -znajdz trenera ktory trenował najwiecej zwierzat
 -znajdz trenerow ktorzy trenowali psy z gatunku spaniel
 -znajdz wszystkie pterodaktyle ktore nigdy nie mialy przypisanego trenera
*/

        Animal azor = new Dog("Azor","German Schepherd", 20, "duck");
        Animal kostek = new Dog("Kostek","pitbull", 2,"bones");
        Animal rafik = new Dog("Rafik", "spaniel", 5,"ball");
        Animal mruczek = new Cat("Mruczek", "persian",9);
        Animal filemon = new Cat("Filemon","Ragdoll", 10);
        Animal rex = new Pterodactyl("Rex", "bird",10);
        Animal brutus = new Pterodactyl("Brutus","bird", 12);

        Trainer radek = new Trainer("Radek", "Blauciak",new Adress("Polska",42,"Gorzow Wlkp."));
        Trainer norbert = new Trainer("Norbert","Nowak",new Adress("Pocztowa",5,"Zielona Gora"));
        Trainer lukasz = new Trainer("Lukasz", "Kowalski",new Adress("Wiejska", 45, "Warszawa"));

        radek.addAnimal(azor);
        radek.addAnimal(kostek);
        radek.addAnimal(rafik);
        norbert.addAnimal(mruczek);
        norbert.addAnimal(filemon);
        lukasz.addAnimal(rex);

        System.out.println("Radek: " + radek.getAnimals());
        System.out.println();
        System.out.println("Norbert: " + norbert.getAnimals());
        System.out.println();
        System.out.println("Lukasz: " + lukasz.getAnimals());
        System.out.println();

        System.out.println("trenował najwiecej zwierzat: " + Trainer.moustPopularTrainer(List.of(radek,norbert,lukasz)));
        System.out.println();

        System.out.println("trenowali psy z gatunku spaniel: " + Animal.trainerOfGanre(List.of(azor,kostek,rafik,mruczek,filemon,rex,brutus),"spaniel"));
        System.out.println();

        System.out.println("pterodaktyle ktore nigdy nie mialy przypisanego trenera: " + Animal.pterodactylWithoutTrainer(List.of(rex,brutus)));
    }
}
