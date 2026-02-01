package com.java.course.com.lesson44and45.zadania;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Zadeklaruj tablicę stringów. Wypisz z nich wszystkie te których ilość literek a jest większa niż pozostałych literek.

Przykład:
Input: arbuz, anka, aabc, anakonda, alaas, bacada, aabokaa
Output: aabc, alaas, aabokaa

// Napisz metode ktora przyjmuje jako argument liczbe i sprawdza czy jest to liczba parzysta


	// Napisz metode ktora zwraca sume dwoch liczb ale z uwaga ze jesli ktoras z podanych liczb jest z przedzialu [13,19]
	// to zwrocona wartosc to zawsze 19


	//Napisz metode ktora przyjmuje jako parametr Stringa, jesli String zaczyna sie na z zwroc napis zzz, jesli konczy sie na y zwroc napis yyy
	// jesli zaczyna sie na z i konczy na y zwroc zzyy, w kazdym innym przypadku zwroc stringa niezmienionego
	// metoda startsWith() i endsWith() <- sprawdzenie czy string konczy/zaczyna sie na dany literał łancuchowy


	// zddy -> zzyy
	// zasd -> zzz
	// asdy -> yyy
	// pusty string -> pusty string
	// z -> zzz
	// y -> yyy
	// zy -> zzyy
	// a -> a
	// bb -> bb


	//Sprawdz czy podany String jako parametr zaczynajac od 0 lub 1 indeksu ma w sobie slowo bad
	//xbadxxx - true
	//badxxx - true
	//xxbadxx - false


	// Napisz metode ktora liczy ile razy podany znak wystepuje w podanym Stringu.
         */

        //Zadeklaruj tablicę stringów. Wypisz z nich wszystkie te których ilość literek a jest większa niż pozostałych literek.
        //Przykład:
        //Input: arbuz, anka, aabc, anakonda, alaas, bacada, aabokaa
        //Output: aabc, alaas, aabokaa
        System.out.println("Zadanie nr1:");
        List<String> newList = new ArrayList<>();
        newList.add("arbuz");
        newList.add("anka");
        newList.add("aabc");
        newList.add("anakonda");
        newList.add("alaas");
        newList.add("bacada");
        newList.add("aabokaa");
        System.out.println("Input" + newList);
        System.out.println("Output" + literkaXWieszkaOdPozostalych(newList,'a'));
        System.out.println();

        // Napisz metode ktora przyjmuje jako argument liczbe i sprawdza czy jest to liczba parzysta
        System.out.println("Zadanie nr2:");
        int liczba = 2;
        System.out.println("Czy liczba jest parzysta = " + czyLiczbaJestParzysta(liczba));
        System.out.println();

        // Napisz metode ktora zwraca sume dwoch liczb ale z uwaga ze jesli ktoras z podanych liczb jest z przedzialu [13,19]
        // to zwrocona wartosc to zawsze 19
        System.out.println("Zadanie nr3:");
        int liczba1 = 13;
        int liczba2 = 1;
        int liczba3 = 4;
        System.out.println(sumaLiczb(liczba1, liczba2));
        System.out.println();
        System.out.println(sumaLiczb(liczba2, liczba3));
        System.out.println();

        //Napisz metode ktora przyjmuje jako parametr Stringa, jesli String zaczyna sie na z zwroc napis zzz, jesli konczy sie na y zwroc napis yyy
        // jesli zaczyna sie na z i konczy na y zwroc zzyy, w kazdym innym przypadku zwroc stringa niezmienionego
        // metoda startsWith() i endsWith() <- sprawdzenie czy string konczy/zaczyna sie na dany literał łancuchowy
        // zddy -> zzyy
        // zasd -> zzz
        // asdy -> yyy
        // pusty string -> pusty string
        // z -> zzz
        // y -> yyy
        // zy -> zzyy
        // a -> a
        // bb -> bb
        System.out.println("Zadanie nr4:");
        String nr1 = "zddy";
        String nr2 = "zasd";
        String nr3 = "asdy";
        String nr4 = "pusty string";
        String nr5 = "z";
        String nr6 = "y";
        String nr7 = "zy";
        String nr8 = "zddy";
        String nr9 = "bb";
        String nr10 = "aa";
        System.out.println(slowoZiY(nr1));
        System.out.println(slowoZiY(nr2));
        System.out.println(slowoZiY(nr3));
        System.out.println(slowoZiY(nr4));
        System.out.println(slowoZiY(nr5));
        System.out.println(slowoZiY(nr6));
        System.out.println(slowoZiY(nr7));
        System.out.println(slowoZiY(nr8));
        System.out.println(slowoZiY(nr9));
        System.out.println(slowoZiY(nr10));
        System.out.println();

        //Sprawdz czy podany String jako parametr zaczynajac od 0 lub 1 indeksu ma w sobie slowo bad
        //xbadxxx - true
        //badxxx - true
        //xxbadxx - false
        System.out.println("Zadanie nr5:");
        String slowoNR1 = "xbadxxx";
        String slowoNR2 = "badxxx";
        String slowoNR3 = "xxbadxx";
        System.out.println(sprawdzanieSlowa(slowoNR1));
        System.out.println(sprawdzanieSlowa(slowoNR2));
        System.out.println(sprawdzanieSlowa(slowoNR3));
        System.out.println();

        // Napisz metode ktora liczy ile razy podany znak wystepuje w podanym Stringu.
        System.out.println("Zadanie nr6:");
        System.out.println(liczWystapieniaZnakuWSlowie("Radek", 'a'));
        System.out.println(liczWystapieniaZnakuWSlowie("Ala", 'a'));

    }

    public static List<String> literkaXWieszkaOdPozostalych(List<String> listaStringow, char x) {
        List<String> nowaListaStringow = new ArrayList<>();
        for (String slowo : listaStringow) {
            int iloscLiterekA = 0;
            int iloscPozostalychLitererk = 0;
            for (char a : slowo.toCharArray()) {
                if (a == x) {
                    iloscLiterekA++;
                } else {
                    iloscPozostalychLitererk++;
                }
            }
            if (iloscLiterekA >= iloscPozostalychLitererk) {
                nowaListaStringow.add(slowo);
            }
        }
        return nowaListaStringow;
    }

    public static boolean czyLiczbaJestParzysta(int liczba) {
        return liczba % 2 == 0;
    }

    public static int sumaLiczb(int liczbaNR1, int liczbaNR2) {
        if ((liczbaNR1 >= 13 && liczbaNR1 <= 19) || (liczbaNR2 >= 13 && liczbaNR2 <= 19)) {
            return 19;
        }
        return liczbaNR1 + liczbaNR2;
    }

    public static String slowoZiY(String slowo) {
        if (slowo == null || slowo.isEmpty()) {
            return slowo;
        } else if (slowo.startsWith("z") && slowo.endsWith("y")) {
            return "zzyy";
        } else if (slowo.startsWith("z")) {
            return "zzz";
        } else if (slowo.endsWith("y")) {
            return "yyy";
        }
        return slowo;
    }

    //nie chcemy sprawdzac 1 i 2 litery tylko ostatnia i przed ostatnia
    public static boolean sprawdzanieSlowa(String sprawdzaneSlowo) {
        return sprawdzaneSlowo.startsWith("bad") || sprawdzaneSlowo.startsWith("bad", 1);
    }
    public static boolean sprawdzanieSlowa1(String sprawdzaneSlowo) {
        return sprawdzaneSlowo.startsWith("bad", sprawdzaneSlowo.length() - 1) || sprawdzaneSlowo.startsWith("bad", sprawdzaneSlowo.length() - 2);

    }
    public static int liczWystapieniaZnakuWSlowie(String tekst, char znak) {
        int licznik = 0;
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == znak) {
                licznik++;
            }
        }
        return licznik;
    }
}
