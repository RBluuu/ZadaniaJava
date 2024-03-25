package com.java.course.com.lesson9;

import java.util.Random;
import java.util.Scanner;

public class KamienPapierNozyce {
    //ctrl + alt + M
    public static void main(String[] args) {
        String[] ruchy = {"kamien", "papier", "nozyce"};
        boolean graTrwa = true;
        Random random = new Random();
        try (Scanner scanner = new Scanner(System.in)) {
            while (graTrwa) {
                String ruchGracza = wczytajRuchGracza(ruchy, scanner);
                String ruchKomputera = wczytajRuchKomputera(random, ruchy);
                System.out.println(ruchGracza);
                System.out.println(ruchKomputera);
                sprawdzWynikGry(ruchGracza, ruchKomputera);
                graTrwa = spytajCzyGramyDalej(scanner, graTrwa);
            }
        }
    }

    private static boolean spytajCzyGramyDalej(Scanner scanner, boolean graTrwa) {
        System.out.println("Czy chcesz grac dalej?");
        String czyGracDalej = scanner.nextLine();
        if (czyGracDalej.equalsIgnoreCase("nie")) {
            graTrwa = false;
        }
        return graTrwa;
    }

    private static void sprawdzWynikGry(String ruchGracza, String ruchKomputera) {
        if (sprawdzRemis(ruchGracza, ruchKomputera)) {
            System.out.println("Remis");
        } else if (sprawdzWygrana(ruchGracza, ruchKomputera)) {
            System.out.println("Wygrałes");
        } else {
            System.out.println("Przegrales");
        }
    }

    private static String wczytajRuchKomputera(Random random, String[] ruchy) {
        int losowyIndex = random.nextInt(0, 3);
        String ruchKomputera = ruchy[losowyIndex];
        return ruchKomputera;
    }

    private static String wczytajRuchGracza(String[] ruchy, Scanner scanner) {
        String ruchGracza = "";
        while (!czyDozwolonyRuch(ruchGracza, ruchy)) {
            System.out.println("Podaj ruch: Kamien, papier lub nozyce");
            ruchGracza = scanner.nextLine();
        }
        return ruchGracza;
    }

    private static boolean sprawdzRemis(String ruchGracza, String ruchKomputera) {
        return ruchGracza.equalsIgnoreCase(ruchKomputera);
    }

    private static boolean sprawdzWygrana(String ruchGracza, String ruchKomputera) {
        return (ruchGracza.equalsIgnoreCase("kamien") && ruchKomputera.equalsIgnoreCase("nozyce")) || (ruchGracza.equalsIgnoreCase("papier") && ruchKomputera.equalsIgnoreCase("kamien")) || (ruchGracza.equalsIgnoreCase("nozyce") && ruchKomputera.equalsIgnoreCase("papier"));
    }

    public static boolean czyDozwolonyRuch(String ruch, String[] tablicaRuchow) {
        for (String s : tablicaRuchow) {
            if (ruch.equalsIgnoreCase(s)) {
                return true;
            }
        }
        return false;
    }
}
