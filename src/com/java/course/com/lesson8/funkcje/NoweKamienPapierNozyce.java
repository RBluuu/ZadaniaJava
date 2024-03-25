package com.java.course.com.lesson8.funkcje;

import java.util.Scanner;

public class NoweKamienPapierNozyce {
    public static void main(String[] args) {
        System.out.println("Witamy w grze: Kamien - Papier - Nożyce!!!!\n" +
                "Zasady gry sa bardzo proste:\n" +
                "Kamień wygrywaja z nożycami, ale przegrywa z papierem. Aby wybrać kamień wybierz: 0\n" +
                "Papier wygrywa z kamieniem, ale przegrywa z nożycami. Aby wybrac Papier wybierz: 1\n" +
                "Nożyce wygrywaja z papierem, ale przegrywaja z kamieniem. Aby wybrac Nożyce wybierz: 2\n" +
                "Pamietaj aby dobrze wybrać ;}\n" +
                "POWODZENIA!!!!");

        while (true) {
            System.out.println("Wybierz swoją cyfre:");
            int gracz = new Scanner(System.in).nextInt();
            while (gracz == 0) {
                System.out.println("Gracz wybrał: Kamien");
            } if (gracz == 1) {
                System.out.println("Gracz wybrał: Papier");
            } else if (gracz == 2) {
                System.out.println("Gracz wybrał: Nozyce");
            } else if (gracz > 2) {
                System.out.println("ZLE!!! Wybierz od 0 do 2!!");
                continue;
            }



            System.out.println("Teraz losuje komputer:");
            int komputer = (int) (Math.random() * 3);
            System.out.println(komputer);
            if (komputer == 0) {
                System.out.println("Komputer wybrał: Kamien");
            } else if (komputer == 1) {
                System.out.println("Komputer wybrał: Papier");
            } else if (komputer == 2) {
                System.out.println("Komputer wybrał: Nozyce");
            }

            System.out.println("Wynik gry:");
            if (gracz == komputer) {
                System.out.println("Remis");
            } else if (gracz < komputer) {
                System.out.println("Sorry, wygrał Komputer :(");
            } else if (gracz > komputer) {
                System.out.println("Gratulacje. Wygrałes!");
            }

            System.out.println();
            System.out.println("Zagramy jeszcze raz?? Wybierz 1 lub 2");
            int dalszaGra = new Scanner(System.in).nextInt();
            if (dalszaGra == 1) {
                System.out.println("OK. Gramy dalej");
            } else if (dalszaGra == 2) {
                System.out.println("Koniec gry, dziekujemy!!!");
                break;
            } else if (dalszaGra >= 3) {
                System.out.println("Oszukujesz, spadaj na drzewo.");
                break;
            }
        }
    }
}
