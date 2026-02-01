package com.java.course.com.lesson66;

import com.java.course.com.lesson66.poprawka.PrzedzialCenowy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List<Integer> listaPunktowGracza = new ArrayList<>(List.of(10,5,3,25,6));

        //System.out.println(wynikGracza(listaPunktowGracza));




    /*public static String wynikGracza(List<Integer> lista) {
        String text = null;
        for (int liczba : lista) {
            if (liczba > 50 ) {
                text = "Super wynik: X";
            } else if (liczba > 20 && liczba < 50) {
                text = "OK wynik: X";
            } else if (liczba < 20){
                text = "Słabo: X";
            } else if (liczba == 100) {
                text = "Perfekcyjna runda!";
            }
        }
        return text;

     */

        List<Zamowienie> lista1 = new ArrayList<>();

        lista1.add(new Zamowienie(LocalDate.of(2023, 1, 10), 199));
        lista1.add(new Zamowienie(LocalDate.of(2023, 2, 5), 251));
        lista1.add(new Zamowienie(LocalDate.of(2023, 3, 15), 900));
        lista1.add(new Zamowienie(LocalDate.of(2023, 4, 1), 559));
        lista1.add(new Zamowienie(LocalDate.of(2023, 5, 20), 455));
        lista1.add(new Zamowienie(LocalDate.of(2023, 6, 7), 120));
        lista1.add(new Zamowienie(LocalDate.of(2023, 7, 30), 750));
        lista1.add(new Zamowienie(LocalDate.of(2023, 8, 12), 150));
        lista1.add(new Zamowienie(LocalDate.of(2023, 9, 3), 8));
        lista1.add(new Zamowienie(LocalDate.of(2023, 10, 18), 55));
        lista1.add(new Zamowienie(LocalDate.of(2023, 11, 11), 200.00));
        lista1.add(new Zamowienie(LocalDate.of(2023, 12, 25), 300.49));
        lista1.add(new Zamowienie(LocalDate.of(2024, 1, 1), 450.00));
        lista1.add(new Zamowienie(LocalDate.of(2024, 2, 14), 601));
        lista1.add(new Zamowienie(LocalDate.of(2024, 3, 8), 899));

        List<PrzedzialCenowy> lista2 = new ArrayList<>();
        lista2.add(new PrzedzialCenowy("Male",0,200));
        lista2.add(new PrzedzialCenowy("Srednie",201,500));
        lista2.add(new PrzedzialCenowy("Duze",501,1000));

        System.out.println(Zamowienie.posegregowanaWPrzedziałachCenowychZamowien(lista1));
        System.out.println();
        System.out.println("V2");
        System.out.println(Zamowienie.posegregowanaWPrzedziałachCenowychZamowien2(lista1,lista2));
    }
}
/*
Masz listę liczb całkowitych reprezentującą punkty zdobyte przez gracza w kolejnych rundach gry.
Napisz program, który:

Iteruje po tej liście i:

Jeżeli liczba punktów w danej rundzie jest większa niż 50, to dopisz do nowej listy napis "Super wynik: X".

Jeżeli liczba punktów jest pomiędzy 20 a 50 (włącznie), to dopisz "OK wynik: X".

Jeżeli liczba punktów jest mniejsza niż 20, to dopisz "Słabo: X".

Dodatkowo, jeśli w jakiejś rundzie liczba punktów to dokładnie 100, wypisz komunikat "Perfekcyjna runda!" (nie do listy, tylko na konsolę).



 Masz liste zamowien(data i cena) posegreguj zamowienia na male (do 200, srednie 200-500, duze od 500)

 */