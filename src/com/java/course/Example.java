package com.java.course;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static com.java.course.com.lesson8.Zadanie.obliczSumeElementowZTablicy;

public class Example {
    public static void main(String[] args) {


        //Przykład nr1
        System.out.println(2 > 10);
        int liczba1 = 13;
        boolean czyParzysta = liczba1 % 2 == 0;
        System.out.println(czyParzysta);

        //Przyklad nr2
        String imie = "Radek";
        String nazwisko = "Błauciak";
        System.out.println(imie.equalsIgnoreCase("RADEK"));

        System.out.println("Cześć Radek!\nWitaj Świecie!"); //Wypisze:
        //Cześć Jędrzej!
        //Witaj Świecie!
        System.out.println("Cześć Radek!\tWitaj Świecie!"); //Wypisze: Cześć Jędrzej!	Witaj Świecie!
        System.out.println("Cześć Radek!\\Witaj Świecie!"); //Wypisze: Cześć Jędrzej!\Witaj Świecie!
        System.out.println("Cześć Radek!\'Witaj Świecie!"); //Wypisze: Cześć Jędrzej!'Witaj Świecie!

        System.out.println(imie.charAt(0));
        System.out.println(imie.charAt(1));
        System.out.println(imie.charAt(2));
        System.out.println(imie.charAt(3));
        System.out.println(imie.charAt(4));
        System.out.println(nazwisko.charAt(0));
        System.out.println(nazwisko.charAt(1));
        System.out.println(nazwisko.charAt(2));
        System.out.println(nazwisko.charAt(3));
        System.out.println(nazwisko.charAt(4));
        System.out.println(nazwisko.charAt(5));
        System.out.println(nazwisko.charAt(6));
        System.out.println(nazwisko.charAt(7));

        System.out.println(imie.length());
        System.out.println(nazwisko.length());

        System.out.println(imie.substring(1));
        System.out.println(nazwisko.substring(4));

        System.out.println(imie.substring(2, 4));
        System.out.println(nazwisko.substring(3, 6));

        System.out.println(imie.toLowerCase());
        System.out.println(nazwisko.toLowerCase());

        System.out.println(imie.toUpperCase());
        System.out.println(nazwisko.toUpperCase());

        System.out.println("   Cześć\nRadek!   ".trim());

        System.out.println(imie.replace('R', 'x'));
        System.out.println(nazwisko.replace('B', 'x'));

        System.out.println(imie.replace("ade", "xxx"));
        System.out.println(nazwisko.replace("Bła", "xxx"));

        String[] imiona = "Radek Ola Kuba".split(" ");
        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

        System.out.println(imie.contains("Rad"));
        System.out.println(nazwisko.contains("Rad"));

        System.out.println(imie.startsWith("Rad"));
        System.out.println(nazwisko.startsWith("Bł"));

        System.out.println(imie.endsWith("ek"));
        System.out.println(nazwisko.endsWith("ek"));

        System.out.println(imie.equals("Radek"));
        System.out.println(nazwisko.equals("Nowak"));

        System.out.println(imie.equalsIgnoreCase("Radek"));
        System.out.println(nazwisko.equalsIgnoreCase("Nowak"));

        //wypisz liczby od 89 do 99
        for (int i = 89; i <= 99; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //wypisz liczby od 69 do 99, które są podzielne przez 3
        for (int i = 69; i <= 99; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //wypisz liczby od 699 do 99, które są podzielne przez 2
        for (int i = 699; i >= 99; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //oblicz sume wszystkich liczb trzycyfrowych
        int suma = 0;
        for (int i = 100; i <= 999; i++) {
            suma = suma + 1;
        }
        System.out.println(suma);

        //wypisz liczby od 16 do 43
        int x = 16;
        while (x < 43) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();

        /*//wypisz liczby od 33 do 9
        int y = 33;
        while (y <= 9) {
            System.out.print(y + " ");
            y--;
        }
        */
        System.out.println();

        //wypisz liczby od 46 do 99, ale musza to byc liczby parzyste
        int z = 46;
        while (z < 99) {
            if (z % 2 == 0)
                System.out.print(z + " ");
            z++;
        }
        System.out.println();

        //10.Napisz program, który wypisze tabliczkę mnożenia dla liczb od 1 do 10.
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10; k++) {
                System.out.print(i * k + " ");
            }
        }
        System.out.println();

        //wypisz liczby od 46 do 99, ale musza to byc liczby parzyste
        int k = 99;
        while (k > 46) {
            if (k % 2 == 0)
                System.out.print(k + " ");
            k--;
        }
        System.out.println();


        //Wypisz tablice 5 samochodow niemieckiej marki, wypisz ostania marke z tablicy,sprawdz dlugosc tablicy
        String[] cars = {"Opel", "BMW", "Skoda", "VW", "Mercedes"};
        System.out.println(Arrays.toString(cars));
        System.out.println(cars[cars.length - 1]);
        System.out.println(cars.length);

        //tablice 2D
        int[][] numbers2D = new int[3][6];
        numbers2D[0][1] = 123;
        numbers2D[2][2] = 44;
        System.out.println(numbers2D.length);
        System.out.println(numbers2D[0].length);
        System.out.println(Arrays.deepToString(numbers2D));

        /*//tablica 2d.2
        int[][] noweLiczby2D = new int [5][10];
        for ( int i = 0; i <= noweLiczby2D.length; i++) {
            for (int b = 0; b <= noweLiczby2D.length[0]; b++) {
                noweLiczby2D[5][10] = i;
                noweLiczby2D[5][10] = b;
            }
        }
        System.out.println(Arrays.deepToString(noweLiczby2D));
        */

        //Zadannie 2. Sprawdz czy dlugosc imienia podniesiona do kwadratu jest parzysta
        String name5 = "Aleksandra";
        System.out.println(name5.length());
        double longName1 = Math.pow(name5.length(), 2);
        System.out.println("Score " + longName1);
        System.out.println(longName1 % 2 == 0);

        //Zadanie 3. Sprawdz czy imie zaczyna sie od litery "A" lub "D" i wypisz "Imię zaczyna się od A lub J" lub "Imię nie zaczyna się od A lub D"
        String name4 = "Aleksandra";
        System.out.println(name4.startsWith("K"));
        System.out.println(name4.startsWith("D"));
        if (name4.startsWith("A")) {
            System.out.println("Imię zaczyna sie od A");
        } else if (name4.startsWith("D")) {
            System.out.println("Imie nie zaczyna sie od D");
        }

        if (name4.startsWith("A") || name4.startsWith("D")) {
            System.out.println("Imię zaczya sie na A lub D");
        }

        //Zadanie 4. Sprawdz czy imie jest równe "Radek" lub "Jan" i wypisz "Imię jest równe Radek" lub "Imię jest równe Jan"
        String nameRadek = "Radek";
        if (nameRadek.equals("Radek")) {
            System.out.println("Imię jest rowne Radek");
        } else if (nameRadek == "Jan") {
            System.out.println("Imie jest rowne Jan");
        }

        //Zadanie 5.Korzystajac z instrukcji switch, wypisz swoja opinie o roznych markach samochodow np. "Opel - nie lubie", "Fiat - lubie", "BMW - uwielbiam"
        int car = 3;
        switch (car) {
            case 1:
                System.out.println("Mercedes - I like");
                break;
            case 2:
                System.out.println("BMW - I don't like");
                break;
            case 3:
                System.out.println("OPEL - I don't like");
                break;
            case 4:
                System.out.println("Hammer - I don't like");
                break;
            case 5:
                System.out.println("GMC - I like");
                break;
        }

        int noweImie = 1;
        switch (noweImie) {
            case 1:
                System.out.println("Aleksandra");
                break;
            case 2:
                System.out.println("Łukasz");
                break;
            case 3:
                System.out.println("Marcin");
                break;
            case 4:
                System.out.println("Miłosz");
                break;
            case 5:
                System.out.println("Darek");
                break;
        }

        String mojeImie = "Radek";
        switch (mojeImie) {
            case "Radek":
                System.out.println("Radek");
                break;
            case "Aleksandra":
                System.out.println("Aleksandra");
                break;
            case "Łukasz":
                System.out.println("Łukasz");
                break;
            case "Damian":
                System.out.println("Damian");
                break;
        }

        // Zadanie 7. Wylosuj losowa liczbe z przedzialu od 10 do 99
        System.out.println(Math.random() * 99);
        System.out.println(10 + Math.random() * 99);
        /*System.out.println(new Random().nextInt(origin: 10, bound:99);
         */

        //Zadanie 8. Sprawdź, czy podany wiek kwalifikuje się jako 'dziecko', 'nastolatek', 'dorosły' czy 'senior'.
        int newAge = 30;
        if (newAge < 30) {
            System.out.println("Jestem jeszcze młody");
        } else if (newAge == 30) {
            System.out.println("Jestem juz dorosły");
        } else if (newAge > 30) {
            System.out.println("Jestem juz stary");
        }

        //Zadanie 9. Używając instrukcji switch, zdecyduj, co robić w zależności od pory dnia: 'rano', 'po południu', 'wieczorem', 'w nocy'.
        String timeOfDay = "Rano";
        switch (timeOfDay) {
            case "Rano":
                System.out.println("I go to work every morning.");
                break;
            case "Po południu":
                System.out.println("I eat a dninner");
                break;
            case "Wieczorem":
                System.out.println("I learn something");
                break;
            case "W nocy":
                System.out.println("I sleep");
                break;
        }
        int starCounter = 1;
        int spaceCounter = 8;
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < spaceCounter; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCounter; j++) {
                System.out.print("*");
            }
            spaceCounter -= 1;
            starCounter += 2;
            System.out.println();

        }

        //albo jezeli przynajmniej 18 to mozesz kupic piwo, jezeli masz 17 lat to mozesz ale nie mow nikomu, jezeli masz mniej to nie mozesz
        int twojwiek = 17;

        if (twojwiek >= 18) {
            System.out.println("Możesz kupić piwo");
        } else if (twojwiek == 17) {
            System.out.println("Możesz kupić piwo, ale nie mów nikomu");
        } else {
            System.out.println("Nie możesz kupić piwa");
        }

        int randomNumber = new Random().nextInt(1, 65);
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

        int ocena = 2;
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

        ocena = 6;
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

        ////7. Napisz program, ktory obliczy twoje bmi (wzor: waga/(wzrost*wzrost))\
        int waga = 95;
        double wzrost1 = 1.79;
        System.out.println("Moje BMI to = " + waga / (wzrost1 * wzrost1));

        //tablice 2D
        int[][] numbersNew2D = new int[5][3];
        numbersNew2D[0][1] = 999;
        numbersNew2D[2][2] = 4684;
        System.out.println(numbersNew2D.length);
        System.out.println(numbersNew2D[0].length);
        System.out.println(Arrays.asList(numbersNew2D));
        System.out.println(Arrays.deepToString(numbersNew2D));

        //3.Użyj pętli do-while do napisania programu, który oblicza sumę kwadratów pierwszych 15 liczb naturalnych.
        int a = 1;
        int suma1 = 0;
        int suma2 = 0;
        do {
            suma1 = a * a;
            suma2 += suma1;
            a++;
            System.out.println(a + " suma = " + suma1);
        } while (a <= 15);
        System.out.println(suma2);

        //np. tankuj paliwo dopóki nie zatankujesz 65 litrów
        int zatankowane = 0;
        do {
            System.out.println("Tankowanie paliwa");
            zatankowane += 99;
        } while (zatankowane < 65);

        //np. wypisz wszystkie liczby od 1 do 100 ale jezeli liczba jest podzielna przez 7 to przerywamy działanie pętli
        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0)
                break;
            {
                System.out.println(i);
            }
        }

        //14.Napisz program, który wyświetli kwadraty liczb od 1 do 100.
        for (int i = 0; i <= 100; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();

        //15.Napisz program, który wyświetli litery alfabetu od 'e' do 'k'.
        for (char i = 'e'; i < 'k'; i++) {
            System.out.print((char) +i + " ");
        }
        System.out.println();

        //19.oblicz silnie dla liczby 10
        int silna10 = 1;
        for (int i = 1; i <= 10; i++) {
            silna10 *= i;
        }
        System.out.println(silna10);

        //19.oblicz silnie dla liczby 66
        int silna66 = 1;
        for (int t = 1; t <= 66; t++) {
            silna66 *= t;
        }
        System.out.println(silna66);

        //lub wypisz wszystkie liczby od 1 do 89
        int o = 1;
        while (o <= 89) {
            System.out.print(o + " ");
            o++;
        }
        System.out.println();

        //lub wypisz wszystkie liczby od 13 do 1
        int g = 13;
        while (g >= 1) {
            g--;
            System.out.print(g + " ");
        }

        //3. Napisz program, ktory wypisze wszystkie liczby od 99 do 1
        System.out.println(" ");
        for (int i = 99; i >= 1; i--) {
            System.out.print(i + " ");
        }

        //4. Napisz program, ktory wypisze wszystkie liczby parzyste od 13 do 989 ale w jednej linii oddzielone spacja
        for (int i = 13; i <= 989; i++) {
            if (i % 2 == 0) ;
            System.out.print(i + " ");
        }


        /*//2. Stwórz program z pętlą while, który oblicza silnię liczby 9.
        int w = 0;
        int silna9 = 1;
        while (w < 9) {
            w++;
            silna9 *= w;
            System.out.println(silna9 + " ");
        }

        /* try (Scanner sc = new Scanner(System.in)) {
            int losowanaliczba = (int) (Math.random() * 100);
            System.out.println("Podaj swoje liczbe:");
            String liczba = sc.nextLine();
            System.out.println("Wylosowana liczba to = " + losowanaliczba);
           if ( losowanaliczba > liczba ) {
                System.out.println("Za mała liczba");
            } else if ( losowanaliczba < liczba ) {
                System.out.println("Za duża liczba");
            } else ( losowanaliczba == liczba ) {
                System.out.println("Gratulacje! Zgadłeś liczbę!");
            }
            System.out.println("Dziękuję za grę!");
        }
        sc.close();


        Te zadania na nastepne zajecia rozwiazac na zywo
        1. Oblicz sume elementow z tablicy
        2. Oblicz srednia elementow z tablicy
        3. Oblicz sume dlugosci Stringow  z tablicy
        4. Znajdz maks i min z tablicy doubli
        5* oblicz sume dzielnikow liczb z tablicy
        6* dla dowolnej liczy oblicz sume ich cyfr

         */

        //Zadanie 1. Oblicz sume elementow z tablicy
        System.out.println();
        int[] numbers1 = new int[5];
        int suma111 = 0;
        System.out.println("Zadanie 1");
        for (int i = 0; i < numbers1.length; i++) {
            suma111 += i;
        }

        System.out.println(Arrays.toString(numbers1));
        System.out.println("Suma = " + suma111);

        //Zadanie 1. Oblicz sume 50elementowej z tablicy
        int[] tablica50 = new int[50];
        int suma50 = 0;
        {
            for (int i = 0; i < tablica50.length; i++) {
                tablica50[i] = i;
                suma50 += i;
            }
        }
        System.out.println(Arrays.toString(tablica50));
        System.out.println("Suma tablicy o 50 elemntach = " + suma50);

        //Zadanie 1. Oblicz sume elementowe z tablicy
        int[] tablica97 = new int[11];
        int sumatablicy97 = 0;
        {
            for (int i = 0; i < tablica97.length; i++) {
                tablica97[i] = i;
                sumatablicy97 += i;
            }
        }
        System.out.println(Arrays.toString(tablica97));
        System.out.println(sumatablicy97);


        int[] tablica78 = new int[43];
        int sumatablica78 = 0;
        {
            for (int i = 0; i < tablica78.length; i++) {
                tablica78[i] = i + 1;
                sumatablica78 += i;
            }
        }
        System.out.println(Arrays.toString(tablica78));
        System.out.println("Suma = " + sumatablica78);

        int[] tablica676 = new int[36];
        int sumatablica676 = 0;
        {
            for (int i = 0; i < tablica676.length; i++) {
                tablica676[i] = i;
                sumatablica676 += i;
            }
        }
        System.out.println(Arrays.toString(tablica676));
        System.out.println(sumatablica676);

        int[] liczba989 = new int[15];
        int sumaliczba989 = 0;
        {
            for (int i = 0; i < liczba989.length; i++) {
                liczba989[i] = i;
                sumaliczba989 += i;
            }
        }
        System.out.println(Arrays.toString(liczba989));
        System.out.println(sumaliczba989);

        int[] liczba778 = new int[75];
        int sumaliczba778 = 0;
        {
            for (int i = 0; i < liczba778.length; i++) {
                liczba778[i] = i;
                sumaliczba778 += i;
            }
        }
        System.out.println(Arrays.toString(liczba778));
        System.out.println(sumaliczba778);

        int[] liczba664 = new int[9];
        int sumaliczba664 = 0;
        {
            for (int i = 0; i < liczba664.length; i++) {
                liczba664[i] = i;
                sumaliczba664 += i;
            }
        }
        System.out.println(Arrays.toString(liczba664));
        System.out.println(sumaliczba664);


        System.out.println();

        //Zadanie 2. Oblicz srednia elementow z tablicy
        System.out.println("Zadanie 2");
        int[] sredniaTablica = new int[10];
        double srednia = 0;
        int sumaSredniaTablica = 0;
        {
            for (int i = 0; i < sredniaTablica.length; i++) {
                sredniaTablica[i] = i + 1;
                sumaSredniaTablica += i + 1;
                srednia = sumaSredniaTablica % sredniaTablica.length;
            }
        }
        System.out.println(Arrays.toString(sredniaTablica));
        System.out.println(srednia);

        //Zadanie 2. Oblicz srednia elementow z tablicy
        int[] tablica99 = new int[95];
        double suma99 = 0;
        double srednia99 = 0;
        {
            for (int i = 0; i < tablica99.length; i++) {
                tablica99[i] = i + 1;
                suma99 += i + 1;
                srednia99 = suma99 / tablica99.length;
            }
        }
        System.out.println(Arrays.toString(tablica99));
        System.out.println("Srednia tablicy99 to = " + srednia99);

        // Zadanie 3. Oblicz sume dlugosci Stringow z tablicy
        String[] tablica89 = {"Radek", "Ola", "Lukasz", "Michał"};
        {
            for (int i = 0; i < tablica89.length; i++) {


            }
        }
        System.out.println(Arrays.toString(tablica89));
        System.out.println(tablica89.length);

        // Zadanie 3. Oblicz sume dlugosci Stringow z tablicy
        String[] nazwy123 = {"Radek", "Ola", "Łukasz", "Marek", "Michal"};
        {

        }
        System.out.println(Arrays.toString(nazwy123));
        System.out.println(nazwy123.length);

        // Zadanie 3. Oblicz sume dlugosci Stringow z tablicy
        String[] auta = {"Opel", "Mercedes", "BMW", "Toyota", "Volvo", "Lada"};
        {
            for (int i = 0; i < auta.length; i++) ;
        }
        System.out.println(Arrays.toString(auta));
        System.out.println(auta.length);


        //Zadania 4. Znajdz maks i min z tablicy doubli
        double[] tablica15 = new double[15];
        {
            for (int i = 0; i < tablica15.length; i++) {
                tablica15[i] = i + 1;
            }
        }
        System.out.println(Arrays.stream(tablica15).min());
        System.out.println(Arrays.stream(tablica15).max());


        int[] liczba56 = new int[99];
        {
            for (int i = 0; i < liczba56.length; i++)
                liczba56[i] = i + 1;
        }
        System.out.println(Arrays.stream(liczba56).max());
        System.out.println(Arrays.stream(liczba56).min());

        int[] liczba67 = new int[56];
        {
            for (int i = 0; i < liczba67.length; i++)
                liczba67[i] = i + 1;
        }
        System.out.println(Arrays.stream(liczba67).min());
        System.out.println(Arrays.stream(liczba67).max());


        int[] sssdf = new int[96];
        for (int i = 0; i < sssdf.length; i++) {
            sssdf[i] = i + 1;
        }
        System.out.println(Arrays.stream(sssdf).min());
        System.out.println(Arrays.stream(sssdf).max());


        int[] radek234 = new int[666];
        for (int i = 0; i < radek234.length; i++) {
            radek234[i] = i + 2;
        }
        System.out.println(Arrays.stream(radek234).min());
        System.out.println(Arrays.stream(radek234).max());


        //5* oblicz sume dzielnikow liczb z tablicy
        /*int[] tablica14 = new int[5]; {
            for (int i = 0; i < 5; i++) {
                tablica14[i] = i + 1;
            }
        }
        System.out.println(Arrays.toString(tablica14));

         */


        //6* dla dowolnej liczy oblicz sume ich cyfr
        System.out.println("Zadanie 6");
        int liczba66 = 123;
        int suma66 = 0;
        while (liczba66 > 0) {
            suma66 = suma66 + liczba66 % 10;
            liczba66 = liczba66 / 10;
        }
        System.out.println(suma66);


        int liczba55 = 34263453;
        int suma55 = 0;
        while (liczba55 > 0) {
            suma55 = suma55 + liczba55 % 10;
            liczba55 = liczba55 / 10;
        }
        System.out.println(suma55);

        int liczba44 = 7394;
        int suma44 = 0;
        while (liczba44 > 0) {
            suma44 = suma44 + liczba44 % 10;
            liczba44 = liczba44 / 10;
        }
        System.out.println(suma44);

        int liczba33 = 23424;
        int suma33 = 0;
        while (liczba33 > 0) {
            suma33 = suma33 + liczba33 % 10;
            liczba33 = liczba33 / 10;
        }
        System.out.println(suma33);

        int liczba22 = 234662;
        int suma22 = 0;
        while (liczba22 > 0) {
            suma22 = suma22 + liczba22 % 10;
            liczba22 = liczba22 / 10;
        }
        System.out.println(suma22);

        int liczba123 = 34522;
        int suma123 = 0;
        while (liczba123 > 0) {
            suma123 = suma123 + liczba123 % 10;
            liczba123 = liczba123 / 10;
        }
        System.out.println("Suma = " + suma123);

        int liczby234 = 8452;
        int suma234 = 0;
        while (liczby234 > 0) {
            suma234 = suma234 + liczby234 % 10;
            liczby234 = liczby234 / 10;
        }
        System.out.println("Suma = " + suma234);

        int liczba2123 = 6735304;
        int suma2123 = 0;
        while (liczba2123 > 0) {
            suma2123 = suma2123 + liczba2123 % 10;
            liczba2123 = liczba2123 / 10;
        }
        System.out.println("Suma = " + suma2123);

        int fgsf123 = 234245;
        int suma3233 = 0;
        while (fgsf123 > 0) {
            suma3233 = suma3233 + fgsf123 % 10;
            fgsf123 = fgsf123 / 10;
        }
        System.out.println("Suma = " + suma3233);


        int liczba2113 = 2234;
        int suma2113 = 0;
        while (liczba2113 > 0) {
            suma2113 = suma2113 + liczba2113 % 10;
            liczba2113 = liczba2113 / 10;
        }
        System.out.println("Suma = " + suma2113);

        int[] tablica234 = { 42, 42, 123, 434, 44};
        obliczSumeElementowZTablicy(tablica234);




        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Podaj 5 cyfr 2 cyfrowych odzielonych spacja:");
            int liczby = sc.nextInt();
            int sumaLiczby = 0;
            for (int i = 0; i < sc.nextInt(); i++) {
            }
            System.out.println("Twoje liczby to = " + liczby);
        }






















    }
}

