package com.java.course.com.lesson8.funkcje;

import java.util.Scanner;

public class NoweKolkoIKrzyzyk {
    public static void main(String[] args) {
        System.out.println("Witamy w Tic-Tac-Toe!!!");
        System.out.println("Powodzenia!!!");
        int wymiar = 3;
        char gracz = 'X';
        char[][] planszaDoGry = new char[wymiar][wymiar];
        //{{'O', 'X', 'O'},
        // {'0', 'X', 'O'},
        // {'O', 'X', 'O'}};
        boolean czyGramyDalej = true;
        int licznikRuchow = 0;
        while (czyGramyDalej && licznikRuchow <= (wymiar*wymiar)) {
            NoweKolkoIKrzyzyk.wyswietlPlansze(planszaDoGry);
            boolean dobryRych = ruchGracza(planszaDoGry, gracz);
            if (!dobryRych) {
                licznikRuchow++;
                boolean wygranaWiersz = sprawdzWiersz(planszaDoGry, gracz);
                boolean wygranaKolumna = sprawdzKolumne(planszaDoGry, gracz);
                boolean wygranaPrzekatna1 = sprawdzPrzekatna1(planszaDoGry, gracz);
                boolean wygranaPrzekatna2 = sprawdzPrzekatna2(planszaDoGry, gracz);
                if (wygranaWiersz || wygranaKolumna || wygranaPrzekatna1 || wygranaPrzekatna2) {
                    System.out.println("Gratulacje " + gracz + " wgrałes TIC-TAC-TOE");
                    czyGramyDalej = false;
                }
            }
            gracz = gracz == 'X' ? 'O' : 'X';
        }

    }

    public static void wyswietlPlansze(char[][] planszaDoGry) {
        int wymiar = planszaDoGry.length;
        System.out.print("\t");
        for (int i = 0; i < wymiar; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int wiersz = 0; wiersz < wymiar; wiersz++) {
            System.out.print(wiersz + ":\t");
            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                System.out.print(planszaDoGry[wiersz][kolumna] + "\t");
            }
            System.out.println();
        }

    }

    public static boolean ruchGracza(char[][] planszaDoGry, char gracz) {
        System.out.println(gracz + " - twój ruch kolego");
        System.out.println("Podaj indeks wiersza od 0 do 2:");
        int wiersz = new Scanner(System.in).nextInt();
        System.out.println("Podaj indeks kolumny od 0 do 2:");
        int kolumna = new Scanner(System.in).nextInt();
        boolean zlyRuch = planszaDoGry[wiersz][kolumna] == 0;
        if (!zlyRuch) {
            System.out.println("Zły ruch kolego. Wybierz jeszcze raz :)");
            return false;
        }
        planszaDoGry[wiersz][kolumna] = gracz;
        return true;
    }

    public static boolean sprawdzWiersz(char[][] planszaDoGry, char gracz) {
        int wymiar = planszaDoGry.length;
        for (int wiersz = 0; wiersz < wymiar; wiersz++) {
            boolean wygrana = true;
            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                if (planszaDoGry[wiersz][kolumna] != gracz) {
                    wygrana = false;
                    break;
                }
            }
            if (wygrana) {
                return true;
            }
        }
        return false;
    }

    public static boolean sprawdzKolumne(char[][] planszaDoGry, char gracz) {
        int wymiar = planszaDoGry.length;
        for (int kolumna = 0; kolumna < wymiar; kolumna++) {
            boolean wygrana = true;
            for (int wiersz = 0; wiersz < wymiar; wiersz++) {
                if (planszaDoGry[wiersz][kolumna] != gracz) {
                    wygrana = false;
                    break;
                }
            }
            if (wygrana) {
                return true;
            }
        }
        return false;
    }

    public static boolean sprawdzPrzekatna1(char[][] planszaDoGry, char gracz) {
        int wymiar = planszaDoGry.length;
        for (int i = 0; i < wymiar; i++) {
            if (planszaDoGry[i][i] != gracz) {
                return false;
            }
        }
        return false;
    }

    public static boolean sprawdzPrzekatna2(char[][] planszaDoGry, char gracz) {
        int wymiar = planszaDoGry.length;
        for (int i = 2; i < wymiar; i--) {
            if (planszaDoGry[i][i] != gracz) {
                return false;
            }
        }
        return false;
    }
}
