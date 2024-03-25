package com.java.course.com.lesson2;

import java.util.Random;

public class Teoria {
    public static void main(String[] args) {

        //Lekcja 2 - String, operacje na Stringach, instrukcje warunkowe

        //Operacje na String
        String imie = "Jędrzej";
        String nazwisko = "Kowalski";

        //Łączenie Stringów
        String imieNazwisko = imie + " " + nazwisko;
        System.out.println(imieNazwisko); //Wypisze: Jędrzej Kowalski

        //Znaki specjalne
        System.out.println("Cześć Jędrzej!\nWitaj Świecie!"); //Wypisze:
        //Cześć Jędrzej!
        //Witaj Świecie!
        System.out.println("Cześć Jędrzej!\tWitaj Świecie!"); //Wypisze: Cześć Jędrzej!	Witaj Świecie!
        System.out.println("Cześć Jędrzej!\\Witaj Świecie!"); //Wypisze: Cześć Jędrzej!\Witaj Świecie!
        System.out.println("Cześć Jędrzej!\'Witaj Świecie!"); //Wypisze: Cześć Jędrzej!'Witaj Świecie!

        //Lista przydatnych metod klasy String
        //https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
        //charAt(int index) - zwraca znak na podanej pozycji
        System.out.println(imie.charAt(0)); //Wypisze: J
        System.out.println(imie.charAt(1)); //Wypisze: ę
        System.out.println(imie.charAt(2)); //Wypisze: d
        //length() - zwraca długość Stringa
        System.out.println(imie.length()); //Wypisze: 7
        //substring(int beginIndex) - zwraca podciąg od podanej pozycji do końca
        System.out.println(imie.substring(2)); //Wypisze: drzej
        //substring(int beginIndex, int endIndex) - zwraca podciąg od podanej pozycji do podanej pozycji
        System.out.println(imie.substring(2, 4)); //Wypisze: dr
        //toLowerCase() - zamienia wszystkie znaki na małe
        System.out.println(imie.toLowerCase()); //Wypisze: jędrzej
        //toUpperCase() - zamienia wszystkie znaki na duże
        System.out.println(imie.toUpperCase()); //Wypisze: JĘDRZEJ
        //trim() - usuwa białe znaki z początku i końca Stringa
        System.out.println("   Cześć Jędrzej!   ".trim()); //Wypisze: Cześć Jędrzej!
        //replace(char oldChar, char newChar) - zamienia wszystkie wystąpienia podanego znaku na inny
        System.out.println(imie.replace('ę', 'x')); //Wypisze: Jxdrzej
        //replace(CharSequence target, CharSequence replacement) - zamienia wszystkie wystąpienia podanego ciągu znaków na inny
        System.out.println(imie.replace("drz", "xxx")); //Wypisze: Jęxxxej
        //split(String regex) - dzieli Stringa na tablicę Stringów według podanego wyrażenia regularnego
        String[] imiona = "Jędrzej Jan Anna".split(" ");
        System.out.println(imiona[0]); //Wypisze: Jędrzej
        System.out.println(imiona[1]); //Wypisze: Jan
        System.out.println(imiona[2]); //Wypisze: Anna
        //contains(CharSequence s) - sprawdza czy String zawiera podany ciąg znaków
        System.out.println(imie.contains("drz")); //Wypisze: true
        System.out.println(imie.contains("xxx")); //Wypisze: false
        //startsWith(String prefix) - sprawdza czy String zaczyna się od podanego ciągu znaków
        System.out.println(imie.startsWith("Ję")); //Wypisze: true
        System.out.println(imie.startsWith("drz")); //Wypisze: false
        //endsWith(String suffix) - sprawdza czy String kończy się podanym ciągiem znaków
        System.out.println(imie.endsWith("ej")); //Wypisze: true
        System.out.println(imie.endsWith("drz")); //Wypisze: false
        //equals(Object anObject) - sprawdza czy String jest równy podanemu obiektowi
        System.out.println(imie.equals("Jędrzej")); //Wypisze: true
        System.out.println(imie.equals("Jędrzej ")); //Wypisze: false
        //equalsIgnoreCase(String anotherString) - sprawdza czy String jest równy podanemu Stringowi ignorując wielkość liter
        System.out.println(imie.equalsIgnoreCase("JĘDRZEJ")); //Wypisze: true


        //Instrukcje warunkowe - if, else if, else, switch

        //if - jeśli warunek jest spełniony to wykonaj kod w klamrach


        //jezeli liczba jest parzysta to wypisz "Liczba jest parzysta"
        int liczba = 4;
        if (liczba % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        }
        //jezeli masz 18 lat to możesz kupić piwo, jezeli nie to nie możesz
        int wiek = 20;
        if (wiek >= 18) {
            System.out.println("Możesz kupić piwo");
        } else {
            System.out.println("Nie możesz kupić piwa");
        }

        //albo jezeli przynajmniej 18 to mozesz kupic piwo, jezeli masz 17 lat to mozesz ale nie mow nikomu, jezeli masz mniej to nie mozesz
        wiek = 17;

        if (wiek >= 18) {
            System.out.println("Możesz kupić piwo");
        } else if (wiek == 17) {
            System.out.println("Możesz kupić piwo, ale nie mów nikomu");
        } else {
            System.out.println("Nie możesz kupić piwa");
        }

        /*
        if moze byc tylko jeden
        tak samo else
        else if moze byc wiele
         */
        int randomNumber = new Random().nextInt(1, 100);
        if (randomNumber < 10) {
            System.out.println("Liczba jest mniejsza od 10");
        } else if (randomNumber < 20) {
            System.out.println("Liczba jest mniejsza od 20");
        } else if (randomNumber < 30) {
            System.out.println("Liczba jest mniejsza od 30");
        } else if (randomNumber < 40) {
            System.out.println("Liczba jest mniejsza od 40");
        } else if (randomNumber < 50) {
            System.out.println("Liczba jest mniejsza od 50");
        } else {
            System.out.println("Liczba jest większa lub równa 50");
        }

        //switch - sprawdza czy zmienna jest równa jednej z podanych wartości
        int ocena = 5;
        switch (ocena) {
            case 1:
                System.out.println("Niedostateczny");
                break;
            case 2:
                System.out.println("Dopuszczający");
                break;
            case 3:
                System.out.println("Dostateczny");
                break;
            case 4:
                System.out.println("Dobry");
                break;
            case 5:
                System.out.println("Bardzo dobry");
                break;
            case 6:
                System.out.println("Celujący");
                break;
            default:
                System.out.println("Nie ma takiej oceny");
        }
        //jezeli nie ma break to wykona wszystkie instrukcje od znalezionego case do końca switch
        ocena = 3;
        switch (ocena) {
            case 1:
                System.out.println("Niedostateczny");
            case 2:
                System.out.println("Dopuszczający");
            case 3:
                System.out.println("Dostateczny");
            case 4:
                System.out.println("Dobry");
            case 5:
                System.out.println("Bardzo dobry");
            case 6:
                System.out.println("Celujący");
            default:
                System.out.println("Nie ma takiej oceny");
        }
        //enhanced switch - od Javy 12 - https://openjdk.java.net/jeps/325
        String ocenaSlowna = switch (ocena) {
            case 1, 2 -> "Słabo";
            case 3, 4 -> "Średnio";
            case 5, 6 -> "Dobrze";
            default -> "Nie ma takiej oceny";
        };
    }
}
