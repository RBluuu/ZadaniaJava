package com.java.course.com.lesson1;

public class Teoria {
    public static void main(String[] args) {

        //https://www.w3resource.com/java-exercises/
        //https://exercism.org/tracks/java
        //https://www.javastart.pl/kurs/java-podstawy/
        //https://codegym.cc/

        //Lekcja 1 - Komentarze, print, zmienne, typy danych, operacje arytmetyczne i logiczne

        //To jest komentarz jednolinijkowy, jest on ignorowany przez kompilator

        /*
        To jest komentarz wielolinijkowy
        Kompilator ignoruje wszystko co znajduje się pomiędzy tymi znakami
        ale może być to dowolna ilość linii
         */

        System.out.println("Hello World!");
        System.out.println("Witaj Świecie!");

        System.out.println("Cześć Jędrzej!");

        //Zmienna to miejsce w pamięci komputera, w którym możemy przechowywać dane
        String imie = "Jędrzej";

        System.out.println("Cześć " + imie + "!"); //Wypisze: Cześć Jędrzej!

        //Zmiennej możemy przypisać nową wartość
        imie = "Jan";
        System.out.println("Cześć " + imie + "!");// Wypisze: Cześć Jan!

        //Chyba że zadeklarujemy ją jako final
        final String nazwisko = "Kowalski";

        //Wtedy nie możemy jej zmienić

        //nazwisko = "Nowak"; //Błąd kompilacji

        System.out.println("Cześć " + nazwisko + "!"); //Wypisze: Cześć Kowalski!

        //Zmienne mogą przechowywać różne typy danych

        int wiek = 20;
        double wzrost = 1.8;
        boolean czyKursant = true;
        char plec = 'M';

        System.out.println("Cześć " + imie + " " + nazwisko + "!" +
                " Masz " + wiek + " lat i " + wzrost + "m wzrostu." +
                " Czy jesteś kursantem? " + czyKursant +
                " Twoja płeć to " + plec + ".");


        //Zmienne mogą przechowywać różne typy danych
        /*
        byte - liczba całkowita, 1 bajt, zakres od -128 do 127
        short - liczba całkowita, 2 bajty, zakres od -32768 do 32767
        int - liczba całkowita, 4 bajty, zakres od -2147483648 do 2147483647
        long - liczba całkowita, 8 bajtów, zakres od -9223372036854775808 do 9223372036854775807
        float - liczba zmiennoprzecinkowa, 4 bajty, zakres od 1.4e-45 do 3.4e+38
        double - liczba zmiennoprzecinkowa, 8 bajtów, zakres od 4.9e-324 do 1.8e+308
        boolean - wartość logiczna, 1 bajt, true lub false
        char - pojedynczy znak, 2 bajty, zakres od 0 do 65535
        String - ciąg znaków, nie jest to typ prymitywny a referencyjny
         */

        //Możemy wykonywac dzialania arytmetyczne
        System.out.println(2 + 2); //Wypisze: 4
        System.out.println(2 - 2); //Wypisze: 0
        System.out.println(2 * 2); //Wypisze: 4
        System.out.println(2 / 2); //Wypisze: 1
        System.out.println(2 % 2); //Wypisze: 0 - operator modulo zwraca resztę z dzielenia

        //!!!UWAGA!!!
        //W Javie operacja dzielenia na liczbach całkowitych zawsze zwraca liczbę całkowitą, nawet jeśli wynik jest ułamkiem
        //jezeli chcemy otrzymać wynik zmiennoprzecinkowy to musimy przynajmniej jeden z operandów rzutować na typ double
        System.out.println(5 / 2); //Wypisze: 2
        System.out.println(5.0 / 2); //Wypisze: 2.5
        //dodawanie Stringow to konkatenacja, czyli połączenie - wynikiem jest nowy String zawierający oba łańcuchy znaków
        System.out.println("Ala" + " ma " + "kota"); //Wypisze: Ala ma kota
        System.out.println("2" + "2"); //Wypisze: 22
        System.out.println(2 + "2"); //Wypisze: 22
        System.out.println(2 + 2);
        System.out.println(2 + 2 + "2"); //Wypisze: 42
        System.out.println("Suma 2 i 2 wynosi " + 2 + 2); //Wypisze: Suma 2 i 2 wynosi 22
        System.out.println("Suma 2 i 2 wynosi " + (2 + 2)); //Wypisze: Suma 2 i 2 wynosi 4

        //Mozemy oczywiscie wykorzystac zmienne
        int a = 2;
        int b = 2;
        System.out.println(a + b); //Wypisze: 4
        System.out.println(a - b); //Wypisze: 0
        System.out.println(a * b); //Wypisze: 4
        System.out.println(a / b); //Wypisze: 1

        //Mozemy rowniez wykonywac operacje logiczne ale tylko na wartosciach typu boolean (true lub false)
        //AND (i) - true tylko wtedy gdy oba operandy są true
        System.out.println(true && true); //Wypisze: true
        System.out.println(true && false); //Wypisze: false
        System.out.println(false && true); //Wypisze: false
        System.out.println(false && false); //Wypisze: false

        //OR (lub) - true gdy przynajmniej jeden z operandów jest true
        System.out.println(true || true); //Wypisze: true
        System.out.println(true || false); //Wypisze: true
        System.out.println(false || true); //Wypisze: true
        System.out.println(false || false); //Wypisze: false

        //NOT (negacja) - neguje wartość
        System.out.println(!true); //Wypisze: false
        System.out.println(!false); //Wypisze: true

        System.out.println("Czy 2 jest większe od 3? " + (2 > 3)); //Wypisze: Czy 2 jest większe od 3? false
        System.out.println("Czy 2 jest mniejsze od 3? " + (2 < 3)); //Wypisze: Czy 2 jest mniejsze od 3? true
        System.out.println("Czy 2 jest równe 3? " + (2 == 3)); //Wypisze: Czy 2 jest równe 3? false
        System.out.println("Czy 2 jest różne od 3? " + (2 != 3)); //Wypisze: Czy 2 jest różne od 3? true
        System.out.println("Czy 10 jest parzyste? " + (10 % 2 == 0)); //Wypisze: Czy 10 jest parzyste? true
        System.out.println("Czy 10 jest nieparzyste? " + (10 % 2 != 0)); //Wypisze: Czy 10 jest nieparzyste? false

        System.out.println(!(!(true && true) || (false && true)) || false && true); //Co wypisze???

        //println - wypisuje na ekranie tekst i przechodzi do nowej linii
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        //print - wypisuje na ekranie tekst i pozostaje w tej samej linii
        System.out.print("hello");
        System.out.print("hello");
        System.out.print("hello");
        //printf - wypisuje na ekranie tekst i pozwala na formatowanie tekstu
        System.out.printf("Cześć %s %s! Masz %d lat i %.2fm wzrostu. Czy jesteś kursantem? %b Twoja płeć to %c.\n",
                imie, nazwisko, wiek, wzrost, czyKursant, plec);
        //%s - String
        //%d - liczba całkowita
        //%f - liczba zmiennoprzecinkowa
        //%.2f - liczba zmiennoprzecinkowa z dokładnością do 2 miejsc po przecinku
        //%b - wartość logiczna
        //%c - pojedynczy znak

        // \n - znak nowej linii
        // \t - znak tabulacji
        System.out.print("hello\n");
        System.out.print("hello\n");
        System.out.print("hello\n");

        //char - pojedynczy znak
        char znak = 'a';
        System.out.println(znak);
        //char to tak naprawde liczba całkowita, która jest kodem znaku w ASCII - https://pl.wikipedia.org/wiki/ASCII
        System.out.println((int) znak);
        //mozemy wykonywac na niej operacje arytmetyczne
        System.out.println(znak + 1);
        //mozemy rowniez rzutowac liczbe na znak
        System.out.println((char) 98);


        //Rzutowanie - konwersja typów
        //wyrozniamy 2 rodzaje rzutowania: jawne i niejawne
        //rzutowanie niejawne - automatyczne, nie musimy go jawnie wykonywac
        //rzutowanie jawne - musimy je jawnie wykonywac

        //rzutowanie niejawne - gdy nie ma ryzyka utraty danych, czyli przechodzimy z mniejszego typu na wiekszy
        //byte -> short -> int -> long -> float -> double
        //char -> int
        byte b1 = 10;
        short s1 = b1;
        int i1 = s1;
        long l1 = i1;
        //rzutowanie jawne - gdy istnieje ryzyko utraty danych, czyli przechodzimy z wiekszego typu na mniejszy
        //double -> float -> long -> int -> short -> byte
        //int -> char
        double d1 = 10.5;
        float f1 = (float) d1;
        long l2 = (long) f1;
        int i2 = (int) l2;
        short s2 = (short) i2;
        byte b2 = (byte) s2;

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
        //17. Zamien zmienne miejscami, czyli
        //    System.out.println("a = " + a); // wypisze a = 10
        //    System.out.println("b = " + b); // wypisze b = 20
        //    po zamianie
        //    System.out.println("a = " + a); // wypisze a = 20
        //    System.out.println("b = " + b); // wypisze b = 10
        //18. Doczytac co to jest JRE,JDK, JVM
        //19. Co to jest bytecode?
        //20. co wypisze konsola !((true && !false || false && true) && (true || false && !true))
        //21. sprawdz czy liczba nalezy do  przedzialu <10,20>
        //22. sprawdz czy liczba nalezy do  przedzialu <10,20) lub (30,40)


        //Zadanie nr1 Napisz program, który wypisze na ekranie Twoje imię i nazwisko
        System.out.println("Radek Błauciak");

        //Zadanie nr2 Napisz program, który wypisze na ekranie Twoje imię i nazwisko oraz wiek
        System.out.println("Radek Błauciak 28 lat");

        //Zadanie nr3 Napisz program, który wypisze na ekranie Twoje imie,nazwisko,wiek,wzrost,plec, i czy miales
        //juz stycznosc z programowaniem

        String imie1 = "Radek ";
        String nazwisko1 = "Błauciak ";
        int wiek1 = 28;
        double wzrost1 = 1.78;
        char plec1 = 'M';
        String info1 = " Brak doświadczenia z programowaniem.";

        System.out.println(imie1 + nazwisko1 + wiek1 + " " + wzrost1 + " " + plec1 + info1);

        //Zadanie nr4 Zaprezentuj wszystkie operacje arytmetyczne (dodawanie, odejmowanie, mnożenie, dzielenie, modulo)
        int c = 5;
        int d = 5;
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c % d);

        //Zadanie nr5 Napisz program, ktory obliczy pole prostokata o bokach 5 i 10
        int a4 = 2;
        int b4 = 5;
        System.out.println("Wzór na pole prostokonta a*b=P, gdzie a=2 b=5");
        System.out.println("P = " + a4 * b4);

        //Zadanie nr6 Napisz program, ktory obliczy pole koła o promieniu 5
        int promien3 = 5;
        double pole = Math.PI * Math.pow(promien3, 2);
        System.out.println("Pole koła = " + pole);

        //Zadanie nr7 Napisz program, ktory obliczy twoje bmi (wzor: waga/(wzrost*wzrost))
        int waga3 = 95;
        double wzrost4 = 1.8;

        System.out.println("Moje BMI = " + waga3 / (wzrost4 * wzrost4));

        //Zadanie nr8 Napisz program ktory wylosuje dwie liczby z zakresu 1-100 i sprawdzi ile wynosi ich roznica oraz czy ta roznica jest parzysta
        System.out.println(Math.random() * 100);
        System.out.println(Math.random() * 100);
        double liczba99 = Math.random() * 100;
        double liczba89 = Math.random() * 100;
        System.out.println("Liczba " + (liczba99 - liczba89));
        //System.out.println(liczba99 % liczba89 != );
        System.out.println((liczba99 - liczba89) % 2 == 0);


        //Zadanie nr9 Powtorz zadanie nr 3 ale korzystajac z System.out.printf
        System.out.println("!!!!! ZAD 9");
        String imie2 = "Radek ";
        String nazwisko2 = "Błauciak ";
        int wiek2 = 28;
        double wzrost2 = 1.78;
        char plec2 = 'M';
        String info2 = " Brak doświadczenia z programowaniem.";

        System.out.printf("%s %s %d %.2f %c %s.", imie2, nazwisko2, wiek2, wzrost2, plec2, info2);
        //%s - String
        //%d - liczba całkowita
        //%f - liczba zmiennoprzecinkowa
        //%.2f - liczba zmiennoprzecinkowa z dokładnością do 2 miejsc po przecinku
        //%b - wartość logiczna
        //%c - pojedynczy znak

        //Zadanie nr10 Napisz dowolne slowo 3 razy w 3 rzedach korzystajac z System.out.print
        System.out.println();
        System.out.print("Radek\n");
        System.out.print("Radek\n");
        System.out.print("Radek\n");

        //Zadanie nr 11 Wyjustuj kod
        System.out.print("Radek\n ");
        // CTRL + ALT + L

        //Zadanie nr 12 Wymien wszystkie typy danych jakie znasz
        // byte, short, int, long, float, double, boolean, char, String

        /* Zadanie nr 13 Napisz prorgam ktory obliczy ile finalnie wyniesie cena auta w leasingu jesli:
        cena auta to 100 000
        leasing trwa 5 lat
        oprocentowanie wynosi 5%
        wplacasz 10% wartosci auta
         */

        int priceCar = 100000; //Cena samochodu
        int timeOfLeasing = 60; //Czas trwania leasingu w miesiącach
        double interst = 0.05; //Oprocentowanie w ciągu roku
        System.out.println(priceCar * 0.10);
        int ownPaymentAmount = 10000; //Wpłata własna


        System.out.println("Price to payment is " + (priceCar - ownPaymentAmount) + "zł.");
        System.out.println("Interst for 5 years ist " + ((priceCar - ownPaymentAmount) * interst) * timeOfLeasing / 12 + "zł.");


        double interst1 = 22500;

        System.out.println("Final car price is " + (priceCar + interst1) + "zł.");




        /*Zadanie nr 14 Napisz program ktory obliczy ile lat zajmie Ci splacenie kredytu hipotecznego jesli:
        wartosc kredytu to 500 000
        oprocentowanie wynosi 3%
        splacasz 1000 zl miesiecznie
         */

        int amountOfCredit = 500000; //Kwota kredytu
        double loanInterstRate = 0.03; //Oprocentowanie
        int mothlyPayment = 1000; //Mieszczna rata
        int timeOfPayment = 0; //Czas spłaty kredytu

        System.out.println("Loan interst rate for year = " + (amountOfCredit * loanInterstRate) + "zł.");
        System.out.println("Cost for 1 year" + (mothlyPayment * 12 + "zł."));
        System.out.println("");


        /*Zadanir nr 15 Napisz program ktory obliczy ilosc makroskladnikow w diecie jesli:
        50% kcal to weglowodany
        30% kcal to bialko
        20% kcal to tluszcze
         */

        int kcalForDay = 2000; //KCAL na jeden dzień
        double carbohydrates = 0.5; //węglowodany
        double protein = 0.3; //białko
        double fats = 0.2; //tłuszcze

        System.out.println(kcalForDay * carbohydrates);
        System.out.println(kcalForDay * protein);
        System.out.println(kcalForDay * fats);
        System.out.println("KCAL for one day is " + kcalForDay);
        System.out.println("Carbohydrates is " + kcalForDay * carbohydrates);
        System.out.println("Protein is " + kcalForDay * protein);
        System.out.println("Fats is " + kcalForDay * fats);


        //Zadanie nr 16 Zaprezentuj przyklad rzutowania jawnego i niejawnego
        //niejawne
        byte b5 = 20;
        short s5 = b5;
        int i5 = s5;
        long l5 = i5;
        float f5 = l5;
        double d5 = f5;
        System.out.println(b5);
        System.out.println(s5);
        System.out.println(i5);
        System.out.println(l5);
        System.out.println(f5);
        System.out.println(d5);

        //jawne
        double d7 = 20.1;
        float f7 = (float) d7;
        long l7 = (long) f7;
        int i7 = (int) l7;
        short s7 = (short) i7;
        byte b7 = (byte) s7;
        System.out.println(d7);
        System.out.println(f7);
        System.out.println(l7);
        System.out.println(i7);
        System.out.println(s7);
        System.out.println(b7);


        //Zadanie nr 17 Zamien zmienne miejscami, czyli
        int a6;
        int b6;
        a6 = 10;
        b6 = 20;
        System.out.println("a = " + a6);
        System.out.println("b = " + b6);
        //po zmianie
        System.out.println("a = " + b6);
        System.out.println("b = " + a6);

        ///
        System.out.println("ZAMIANA ZMIENNYCH");
        int x = 10;
        int y = 20;
        int z = x;
        x = y;
        y = z;

        //...
        System.out.println(x); //20
        System.out.println(y); //10




        /*Zadanie nr 18 Doczytac co to jest JRE,JDK, JVM
        JRE - Java Runtime Enviroment - srodowisko uruchomieniowe dla programistow napisanych w jezyku JAVA.
        Sklada sie z JVM, klas podstawowych oraz plikow pomocniczych.

        JDK - Java Development Kit - darmowe oprogramowanie firmy SUN MICROSYSTEMS udostepniajace srodowisko niezbede do
         programowania w jezyku Java. Dostepny na wiekszosci systemow

        JVM - Java Virtual Machine - wirtualna maszyna do wykonania kodu bajtowego Javy, dzieki ktoremu mozemy odczytac
        go na kazdym systemie
         */

        /*Zadanie nr 19 Co to jest bytecode?
        Jest to kod zrodlowy uzywany przez JVM do odczytu na roznych platformach.
         */

        //Zadanie nr 20 co wypisze konsola !((true && !false || false && true) && (true || false && !true))

        System.out.println((true && !false || false && true) && (true || false && !true));
        //Konsola wypisze true

        //Zadanie nr 21 sprawdz czy liczba nalezy do przedzialu <10,20>
        int liczba10 = 15;
        if (liczba10 >= 10 && liczba10 <= 20) ;
        System.out.println("Czy liczba należy do przedziału <10;20> " + (liczba10 >= 10 && liczba10 <= 20));


        //Zadanie nr 22 sprawdz czy liczba nalezy do przedzialu <10,20) lub (30,40)
        int liczba11 = 15;
        if (liczba11 >= 10 && liczba11 < 20 || liczba11 > 30 && liczba11 < 40) ;
        System.out.println("Czy liczba należy do przedziału <10;20>) " + (liczba10 >= 10 && liczba10 < 20) + " lub (30;40) " + (liczba11 > 30 && liczba11 < 40));


    }
}
