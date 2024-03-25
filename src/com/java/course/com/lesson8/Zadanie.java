package com.java.course.com.lesson8;

import com.java.course.com.lesson8.funkcje.Main;

import java.util.Arrays;

public class Zadanie {
    public static void main(String[] args) {
        int[] tablica = {2, 3};
        obliczSumeElementowZTablicy(tablica);
        Main.wypiszHelloWorldNaTablicy6Razy();
    }

    public static void obliczSumeElementowZTablicy(int[] tablica){
        double suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        System.out.println(suma);

        //Zadanie Kolko i krzyzyk

        int[][] kolkoIKrzyzk = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        System.out.println(Arrays.toString(kolkoIKrzyzk));
    }
}


//Kolko i krzyzyk
//- wyswietlamy tablice do gry
//- prosimy uzytkownika o podanie pola
//- losujemy pole komputera
//- sprawdzamy czy ktos wygral lub czy jest remis (pozioma,przekatna,pionowa)
//- jezeli gra sie skonczyla to wyswietlamy wynik i pytamy czy chcemy zagrac nowa gre
//- jezeli nie to gra toczy sie do poki ktos wygra lub remisu
//-!!! sprawdzac to co wpisal uzytkownik np. nie moze wstawic X w pole ktore jest juz zajete, lub pole ktore jest
//poza zasiegiem planszy
//3x3 nie moze wstawic w 100 pole

//Gra w kamien papier nozyce
