package com.java.course.com.lesson8.funkcje;

import java.util.Scanner;

public class KamienPapierNozyce {
    private static int[] gracz;

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
            cyfraGracza(gracz);

            System.out.println("Teraz losuje komputer:");
            int komputer = (int) (Math.random() * 3);
            cyfraKomputera(komputer);

            System.out.println("Wynik gry:");
            wynikGry(gracz, komputer);
            System.out.println();
            System.out.println("Zagramy jeszcze raz?? Wybierz 1 lub 2");
            int dalszaGra = new Scanner(System.in).nextInt();
            ciagDalszy(dalszaGra);
        }
    }

    public static void cyfraGracza(int gracz) {
        int liczba = gracz;
        if (liczba == 0) {
            System.out.println("Gracz wybrał: Kamien");
        }else if (liczba == 1) {
            System.out.println("Gracz wybrał: Papier");
        } else if (liczba == 2) {
            System.out.println("Gracz wybrał: Nozyce");
        } else if (liczba > 2) {
            System.out.println("ZLE!!! Wybierz od 0 do 2!!");
        }
    }

    public static void cyfraKomputera(int komputer2) {
        int komputer = komputer2;
        if (komputer == 0) {
            System.out.println("Komputer wybrał: Kamien");
        } else if (komputer == 1) {
            System.out.println("Komputer wybrał: Papier");
        } else if (komputer == 2) {
            System.out.println("Komputer wybrał: Nozyce");
        }
    }

    public static void wynikGry(int gracz, int komputer) {
        int gracz1 = gracz;
        int komputer1 = komputer;
        if (gracz1 == komputer1) {
            System.out.println("Remis");
        } else if (gracz1 < komputer1) {
            System.out.println("Sorry, wygrał Komputer :(");
        } else if (gracz1 > komputer1) {
            System.out.println("Gratulacje. Wygrałes!");
        }
    }

    public static void ciagDalszy(int gra) {
        int dalszaGra = gra;
        if (dalszaGra == 1) {
            System.out.println("OK. Gramy dalej");
        } else if (dalszaGra == 2) {
            System.out.println("Koniec gry, dziekujemy!!!");
        } else if (dalszaGra >= 3) {
            System.out.println("Oszukujesz, spadaj na drzewo.");
        }
    }
}

