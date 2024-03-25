package com.java.course.com.lesson1;

import static com.java.course.com.lesson8.Zadanie.obliczSumeElementowZTablicy;

public class Main {
    public Main() {
        super();
    }

    //metoda main
    public static void main(String[] args) {
        //To jest komentarz na jedna linijke
        /*
        To jest
        komentarz
        na wiele
        linijek
         */


        //  NOWY KOMENTARZ
        /*
        nowy komenta
         */

        System.out.println("Hello World!");
        //System.out.println(Hello World!);

        //wypisz imie i nazwisko
        System.out.println("Radek Błauciak");

        System.out.println(123 + 3421);
        System.out.println(123 - 3421);
        System.out.println(10 / 2);
        System.out.println(10 * 10);
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);

        //sklejanie tekstu
        System.out.println("Wynik dodawania 2 i 2 wynosi " + 2 + 2);
        System.out.println("Wynik dodawania 2 i 2 wynosi " + (2 + 2));


        //sout
        System.out.println();
        System.out.println();
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println();
        System.out.print("hello");
        System.out.print("hello");
        System.out.print("hello");
        System.out.println();
        System.out.print("hello\n");
        System.out.print("hello\n");
        System.out.print("he\nllo\n");

        //zmienna - pudelko na jakas wartosc
        String imie = "Karolina";
        String nazwisko = "Kowalska";
        System.out.println("Czesc " + imie + "!!!");
        System.out.println("Czesc " + imie + "!!!");
        System.out.println("Czesc " + imie + "!!!");
        System.out.println("Czesc " + imie + "!!!");
        System.out.println("Czesc " + imie + "!!!");
        System.out.println("Czesc " + imie + "!!!");

        int wiek = 20;
        double wzrost = 1.8;
        boolean czyKursant = true;
        char plec = 'M';

        System.out.println("Cześć " + imie + " " + nazwisko + "!" +
                " Masz " + wiek + " lat i " + wzrost + "m wzrostu." +
                " Czy jesteś kursantem? " + czyKursant +
                " Twoja płeć to " + plec + ".");
        //ctrl _ alt

        //20
        //"Czerwony"
        //2.5

        int liczba = 20;
        String kolor = "Czerwony";
        double wzrost3 = 1.8;

        //czy uzytkownik jest zalogowany

        //camelCase

        boolean czyUzytkownikJestZalogowany = true;

        //Zmienne mogą przechowywać różne typy danych
        /*
        byte - liczba całkowita, 1 bajt, zakres od -128 do 127
        short - liczba całkowita, 2 bajty, zakres od -32768 do 32767
        int - liczba całkowita, 4 bajty, zakres od -2147483648 do 2147483647 !!!!
        long - liczba całkowita, 8 bajtów, zakres od -9223372036854775808 do 9223372036854775807 !!!
        float - liczba zmiennoprzecinkowa, 4 bajty, zakres od 1.4e-45 do 3.4e+38
        double - liczba zmiennoprzecinkowa, 8 bajtów, zakres od 4.9e-324 do 1.8e+308 !!!
        boolean - wartość logiczna, 1 bajt, true lub false !!!
        char - pojedynczy znak, 2 bajty, zakres od 0 do 65535 !!!
        String - ciąg znaków, nie jest to typ prymitywny a referencyjny !!!
         */

        boolean czyPadaDeszcz = true;
        boolean czyJestPromocja = false;

        //System.out.println(true + true);
        //System.out.println(true / false);

        //AND - (i, koniunkcja) - zwroci true tylko wtedy jezeli oba wyrazenia to true
        System.out.println("AND");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        //OR (lub, alternatywa) - zwroci true gdy przynajmniej jeden warunek jest true
        System.out.println("OR");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        //NOT (negacja)
        System.out.println("NOT");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(!(true && true) || (false && true)) || false && true); //Co wypisze???
        System.out.println();
        System.out.println(2 > 10);
        System.out.println(3 < 0);
        //% - reszta z dzielenia
        System.out.println(5 % 2);
        System.out.println(4 % 2);
        int liczba1 = 13;
        boolean czyParzysta = liczba1 % 2 == 0;
        System.out.println(czyParzysta);

        //char
        String tekst = "@";
        char malpa = '@';
        //https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/ASCII-Table.svg/2522px-ASCII-Table.svg.png
        //125

        System.out.println((char) 125);
        System.out.println((int) '}');

        System.out.println("A" + "W");
        System.out.println('A' + 'W');

        //rzutowanie czyli wymuszenie zmiany typu
        //niejawne(bezstratne) i jawne(stratne)
        byte b1 = 12;
        int i1 = b1;
        System.out.println(b1);
        System.out.println(i1);
        //jawne (stratne)
        int i2 = 13123123;
        byte b2 = (byte) i2;
        System.out.println(i2);
        System.out.println(b2);
        double suma = 412.213213123;
        int sumaCalkowita = (int) suma;
        System.out.println(sumaCalkowita);


        int x = 123321;
        System.out.println(x);
        x = 432;
        System.out.println(x);
        x = -1231;
        System.out.println(x);
        int y = x;
        System.out.println(y);

        final String pesel = "1311241";
        //pesel = "42141";


        //Math - -klasa pomocniczna do dzialan matemattycznych
        //napisz program ktory podniesie jakas liczbe a do jakiejs liczby b;

        int a = 10;
        int b = 5;

        double wynik = Math.pow(a, b);
        System.out.println(wynik);
        //Klasa Math - https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html
        //abs - wartość bezwzględna
        System.out.println(Math.abs(-10)); //Wypisze: 10
        //pow - potęga
        System.out.println(Math.pow(2, 3)); //Wypisze: 8.0
        //sqrt - pierwiastek kwadratowy
        System.out.println(Math.sqrt(9)); //Wypisze: 3.0
        //cbrt - pierwiastek sześcienny
        System.out.println(Math.cbrt(27)); //Wypisze: 3.0
        //ceil - zaokrąglenie w górę
        System.out.println(Math.ceil(2.1)); //Wypisze: 3.0
        //floor - zaokrąglenie w dół
        System.out.println(Math.floor(2.9)); //Wypisze: 2.0
        //round - zaokrąglenie do najbliższej liczby całkowitej
        System.out.println(Math.round(2.1)); //Wypisze: 2
        System.out.println(Math.round(2.9)); //Wypisze: 3
        //max - maksymalna wartość
        System.out.println(Math.max(2, 3)); //Wypisze: 3
        //min - minimalna wartość
        System.out.println(Math.min(2, 3)); //Wypisze: 2
        //random - losowa liczba z zakresu od 0 do 1
        System.out.println(Math.random()); //Wypisze: losowa liczba z zakresu od 0 do 1
        //random - losowa liczba z zakresu od 0 do 100
        System.out.println(Math.random() * 100); //Wypisze: losowa liczba z zakresu od 0 do 100
        System.out.println(Math.PI);
        System.out.println(Math.E);

        //print, println, printf*
        //wszystkie zmienne byte,short, int itd
        //operacje matematyczne dodawanie, odejmowanie, tez te z klasy Math

        ////7. Napisz program, ktory obliczy twoje bmi (wzor: waga/(wzrost*wzrost))\
        int waga = 85;
        double wzrost1 = 1.8;
        System.out.println(waga / (wzrost1 * wzrost1));

        //6. Napisz program, ktory obliczy pole koła o promieniu 5
        int promien1 = 5;
        double pole = Math.PI * Math.pow(promien1, 2);
        //pole = pi * r *r
        System.out.println(pole);

        int[] tab = {43,23,23,12,3,1,213,43};
        obliczSumeElementowZTablicy(tab);

    }

    //Zadania:
    //1. Napisz program, który wypisze na ekranie Twoje imię i nazwisko
    //2. Napisz program, który wypisze na ekranie Twoje imię i nazwisko oraz wiek
    //3. Napisz program, który wypisze na ekranie Twoje imie,nazwisko,wiek,wzrost,plec, i czy miales juz stycznosc z programowaniem
    //4. Zaprezentuj wszystkie operacje arytmetyczne (dodawanie, odejmowanie, mnożenie, dzielenie, modulo)
    //5. Napisz program, ktory obliczy pole prostokata o bokach 5 i 10
    //6. Napisz program, ktory obliczy pole koła o promieniu 5
    //7. Napisz program, ktory obliczy twoje bmi (wzor: waga/(wzrost*wzrost))
    //8* Napisz program ktory wylosuje dwie liczby z zakresu 1-100 i sprawdzi ile wynosi ich roznica oraz czy ta roznica jest parzysta
    //9. Powtorz zadanie nr 3 ale korzystajac z System.out.printf
    //10.Napisz dowolne slowo 3 razy w 3 rzedach korzystajac z System.out.print
    //11.Wyjustuj kod
    //12.Wymien wszystkie typy danych jakie znasz
    //13.Napisz prorgam ktory obliczy ile finalnie wyniesie cena auta w leasingu jesli:
    //    cena auta to 100 000
    //    leasing trwa 5 lat
    //    oprocentowanie wynosi 5%
    //    wplacasz 10% wartosci auta
    //14.Napisz program ktory obliczy ile lat zajmie Ci splacenie kredytu hipotecznego jesli:
    //    wartosc kredytu to 500 000
    //    oprocentowanie wynosi 3%
    //    splacasz 1000 zl miesiecznie
    //15. Napisz program ktory obliczy ilosc makroskladnikow w diecie jesli:
    // jemy 2500 kcal
    // 50% kcal to weglowodany
    // 30% kcal to bialko
    // 20% kcal to tluszcze
    //16. Zaprezentuj przyklad rzutowania jawnego i niejawnego
    //17.  , czyli
    //    System.out.println("a = " + a); // wypisze a = 10
    //    System.out.println("b = " + b); // wypisze b = 20
    //    po zamianie
    //    System.out.println("a = " + a); // wypisze a = 20
    //    System.out.println("b = " + b); // wypisze b = 10
    //18. Doczytac co to jest JRE,JDK, JVM
    //19. Co to jest bytecode?
    //20. co wypisze konsola !((true && !false || false && true) && (true || false && !true))
    //22. sprawdz czy liczba nalezy do  przedzialu <10,20>
    //23.sprawdz czy liczba nalezy do  przedzialu <10,20) lub (30,40)

    //Zadanie nr 16 Zaprezentuj przyklad rzutowania jawnego i niejawnego
    //niejawne


}


