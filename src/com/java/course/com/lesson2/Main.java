package com.java.course.com.lesson2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //int, byte, short, double
        //String

        String imie = "Janek";
        System.out.println(imie.toUpperCase());
        System.out.println(imie.toLowerCase());
        System.out.println(imie.substring(2, 4));

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
        System.out.println();
        System.out.println("janek" == "malgosia"); //!!! TAK NIE ROBIC
        System.out.println("janek".equals("malgosia"));// TO JEST OKEJ

        //Instrukcje warunkowe - if, else if, else, switch

        //if - jeśli warunek jest spełniony to wykonaj kod w klamrach

        /*
        if(warunek){
            //kod ktory sie wykona jezeli warunek jest prawdziwy
        }else{
        //kod ktory ktory sie wykona jezeli if jest falszywy
       }*/

        //napisz program ktory stwierdzy czy brac czy parasol
        boolean czyPada = false;
        if (czyPada) {
            System.out.println("Wez parasol");
        } else {
            System.out.println("Nie bierz parasola");
        }
        System.out.println();

        //sprawdz czy liczba jest parzyta

        int liczba1 = 10;
        if (liczba1 % 2 == 0) {
            System.out.println("PARZYSTA");
        } else {
            System.out.println("NIEPARZYSTA");
        }
        System.out.println();

        //sprawdz czy liczba jest wieksza od 10
        int liczba2 = 5;
        if (liczba2 > 10) {
            System.out.println("Większa");
        } else if (liczba2 == 10) {
            System.out.println("Rowna");
        } else {
            System.out.println("Mniejsza");
        }


        int number3 = 100;
        if (number3 > 90) {
            System.out.println("Wieksza niz 90");
        } else if (number3 > 80) {
            System.out.println("Wieksza niz 80");
        } else if (number3 > 70) {
            System.out.println("Wieksza niz 70");
        } else if (number3 > 60) {
            System.out.println("Wieksza niz 60");
        } else if (number3 > 50) {
            System.out.println("Wieksza niz 50");
        }

        System.out.println();
        if (number3 > 90) {
            System.out.println("Wieksza niz 90");
        }
        if (number3 > 80) {
            System.out.println("Wieksza niz 80");
        }
        if (number3 > 70) {
            System.out.println("Wieksza niz 70");
        }
        if (number3 > 60) {
            System.out.println("Wieksza niz 60");
        }
        if (number3 > 50) {
            System.out.println("Wieksza niz 50");
        }
        //if zawsze tylko 1
        //else if moze byc wiele
        //else tez tylko 1

        //przyjmij jakies imie, sprawdz czy zaczyna sie na K
        //jezeli tak to sprawdz czy jest meskie czy zenskie
        //jezeli nie to sprawdz czy jest dluzsze niz 5

        String name = "Karolina";

        if (name.startsWith("K")) {
            if (name.endsWith("a")) {
                System.out.println("imie zenskie");
            } else {
                System.out.println("imie meskie");
            }
        } else if (name.length() > 5) {
            System.out.println("Imie dluzsze od 5");
        }

        //sprwadzz czy liczba nalezy do zakresu od 54 do 100
        int number = 2;
        if (number > 54 && number < 100) {
            System.out.println("Nalezy do przedzialu od 54 do 100");
        }


        //sprawdz czy osoba jest pelnoletnia jezeli tak to napisz ze jestes pelnoletnia
        //i wypisz ile lat jest juz pelnoletnia
        //jezeli nie jest pelnoletnia to wypisz ile lat jej brakuje do pelnoletnosci

        int wiek = 16;

        if (wiek > 18) {
            System.out.println("Jest pełnoletnia");
            System.out.println((wiek - 18) + " lat jest juz pelnoletnia");
        } else {
            System.out.println("Jest nie pełnoletnia");
            System.out.println(18 - wiek);
        }

        //1. Sprawdz czy dlugosc imienia jest wieksza od 5 i wypisz "Imię jest długie" lub "Imię jest krótkie"
        String name2 = "RadekB";
        System.out.println(name2.length());

        if (name2.length() > 5) {
            System.out.println("Imię jest długie");
        } else {
            System.out.println("Imię jest krótkie");
        }
        System.out.println();


        //Zadannie 2. Sprawdz czy dlugosc imienia podniesiona do kwadratu jest parzysta
        String name3 = "RadekB";
        System.out.println(name3.length());
        double longName = Math.pow(name3.length(), 2);
        System.out.println("Score " + longName);
        System.out.println(longName % 2 == 0);

        //Zadanie 3. Sprawdz czy imie zaczyna sie od litery "A" lub "J" i wypisz "Imię zaczyna się od A lub J" lub "Imię nie zaczyna się od A lub J"
        String name4 = "RadekB";
        System.out.println(name4.startsWith("K"));
        System.out.println(name4.startsWith("J"));

        if (name4.startsWith("K")) {
            System.out.println("Imię zaczyna się od K");
        } else if (name4.startsWith("J")) {
            System.out.println("Imię nie zaczyna się od J");
        }
        System.out.println();


        if (name4.startsWith("A") || name4.startsWith("J")) {
            System.out.println("Imie zaczyna sie na A lub J");
        }


        //Zadanie 4. Sprawdz czy imie jest równe "Jędrzej" lub "Jan" i wypisz "Imię jest równe Jędrzej lub Jan" lub "Imię nie jest równe Jędrzej lub Jan"
        String name5 = "Jędrzej";

        if (name5.equals("Jędrzej")) {
            System.out.println("Imię jest równe Jędrzej lub Jan");
        } else if (name5 == "Jan") { //!!!
            System.out.println("Imię nie jest równe Jędrzej lub Jan");
        }

        //Zadanie 5.Korzystajac z instrukcji switch, wypisz swoja opinie o roznych markach samochodow np. "Opel - nie lubie", "Fiat - lubie", "BMW - uwielbiam"
        int cars = 1;
        switch (cars) {
            case 1:
                System.out.println("Merces - like");
            case 2:
                System.out.println("BMW - like");
            case 3:
                System.out.println("Opel - don't like");
            case 4:
                System.out.println("Fiat - don't like");
        }
        String brand = "Audi";
        switch (brand) {
            case "Audi":
                System.out.println("OK");
                break;
            case "BMW":
                System.out.println("super");
        }

        // Zadanie 7. Wylosuj losowa liczbe z przedzialu od 1 do 30
        System.out.println(Math.random() * 30); //0,29
        System.out.println(1 + Math.random() * 31); //1,30
        System.out.println(new Random().nextInt(1, 31));

        //Zadanie 8. Sprawdź, czy podany wiek kwalifikuje się jako 'dziecko', 'nastolatek', 'dorosły' czy 'senior'.
        int age = 28;

        if (age <= 17) {
            System.out.println("Kid");
        } else if (age <= 24) {
            System.out.println("Teenager");
        } else if (age <= 50) {
            System.out.println("Grown");
        } else if (age >= 70) {
            System.out.println("Senior");
        }


        //Zadanie 9. Używając instrukcji switch, zdecyduj, co robić w zależności od pory dnia: 'rano', 'po południu', 'wieczorem', 'w nocy'.
        int rano = 1;
        switch (rano) {
            case 1:
                System.out.println("Go to work in the morning.");
                break;
            case 2:
                System.out.println("Eat a dninner");
                break;
            case 3:
                System.out.println("To learn something");
                break;
            case 4:
                System.out.println("Sleep");
                break;
        }

        //Zadanie 10. Napisz program, który sprawdza, czy podana temperatura jest 'zimna', 'umiarkowana', 'ciepła' czy 'gorąca'
        int temperature = 50;
        if (temperature < 5) {
            System.out.println("Cold");
        } else if (temperature <= 25) {
            System.out.println("Moderate");
        } else if (temperature <= 32) {
            System.out.println("Warm");
        } else if (temperature > 33) {
            System.out.println("Hot");
        }

        //Zadanie 11. Użyj instrukcji if, aby sprawdzić, czy liczba jest 'dodatnia', 'ujemna' czy 'zerowa'.
        System.out.println();
        int number9 = 0;
        if (number9 > 0) {
            System.out.println("Positive");
        } else if (number9 == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }

        //Zadanie 12. Zaimplementuj prosty program, który na podstawie miesiąca roku decyduje, czy jest to 'zima', 'wiosna', 'lato', czy 'jesień'.
        String month = "February";
        //pamietac o EQUALS!!!!!
        if (month == "Januray") {
            System.out.println("Winter");
        } else if (month == "February") {
            System.out.println("Winter");
        } else if (month == "March") {
            System.out.println("Winter");
        } else if (month == "April") {
            System.out.println("Spring");
        } else if (month == "May") {
            System.out.println("Spring");
        } else if (month == "June") {
            System.out.println("Spring");
        } else if (month == "July") {
            System.out.println("Summer");
        } else if (month == "August") {
            System.out.println("Summer");
        } else if (month == "September") {
            System.out.println("Summer");
        } else if (month == "October") {
            System.out.println("Autumn");
        } else if (month == "November") {
            System.out.println("Autumn");
        } else if (month == "December") {
            System.out.println("Autmun");
        }


        //Zadanie 13. Napisz program, który na podstawie dnia tygodnia (poniedziałek do niedzieli) wybiera odpowiedni rodzaj aktywności.
        String day = "Monday";
        if (day == "Monday") {
            System.out.println("Running");
        } else if (day == "Tuesday") {
            System.out.println("Yoga");
        } else if (day == "Wednesday") {
            System.out.println("Swimm");
        } else if (day == "Thursday") {
            System.out.println("Box");
        } else if (day == "Friday") {
            System.out.println("Party");
        } else if (day == "Saturday") {
            System.out.println("Reading");
        } else if (day == "Sunday") {
            System.out.println("Walk");
        }

        //Zadanie 14. Stwórz prosty kalkulator, który na podstawie wybranej operacji (dodawanie, odejmowanie, mnożenie, dzielenie) wykonuje obliczenia.
        String funkcja1 = "Dodawanie";
        String funkcja2 = "Odejmowanie";
        String funkacja3 = "Mnożenie";
        String funkacja4 = "Dzielenie";

        String dzialanie = "+";
        int a = 10, b = 20;
        switch (dzialanie) {
            case "+":
                System.out.println(a + b);
            case "-":
                System.out.println(a - b);
        }


        //Zadanie 15. Sprawdź, czy podany rok jest rokiem przestępnym.
        int daysInYear2023 = 365;
        if (daysInYear2023 == 366) {
            System.out.println("This year is leap year.");
        } else if (daysInYear2023 == 365) {
            System.out.println("This year is non-leap year.");
        }
        int year = 1996;


        //Zadanie 16. Stworz 3 zmienne typu int i wypisz najwieksza z nich
        int number1 = 10;
        int number2 = 5;
        number3 = 10000000;
        System.out.println("ZAD 16");
        if (number1 > number2 && number1 > number3) {
            System.out.println("Number 1 ist the biggest");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Number 2 ist the biggest");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Number 3 ist the biggest");
        }

        System.out.println();
        if (number1 >= number2) {
            System.out.println("The biggest number " + number1);
        } else if (number1 >= number3) {
            System.out.println("The biggest number " + number1);
        } else if (number2 >= number1) {
            System.out.println("The biggest number " + number2);
        } else if (number2 >= number3) {
            System.out.println("The biggest number " + number2);
        } else if (number3 >= number1) {
            System.out.println("The biggest number " + number3);
        } else if (number3 >= number2) {
            System.out.println("The biggest number " + number3);
        }

        //Zadanie nr 17. Stworz 3 zmienne typu int i wypisz najmniejsza z nich
        int number4of6 = 2;
        int number5of6 = 4;
        int number6of6 = 6;
        if (number4of6 <= number5of6) {
            System.out.println("The smallest number " + number4of6);
        } else if (number4of6 <= number6of6) {
            System.out.println("The smallest number " + number4of6);
        } else if (number5of6 <= number4of6) {
            System.out.println("The smallest number " + number5of6);
        } else if (number5of6 <= number6of6) {
            System.out.println("The smallest number " + number5of6);
        } else if (number6of6 <= number4of6) {
            System.out.println("The smallest number " + number6of6);
        } else if (number6of6 <= number5of6) {
            System.out.println("The smallest number " + number6of6);
        }


        //Zadanie nr 18. Jezeli liczba nalezy do przedzialu od 1 do 10 to wypisz "Liczba jest z przedzialu od 1 do 10", jezeli liczba
        //nalezy do przedzialu od 11 do 20 to wypisz "Liczba jest z przedzialu od 11 do 20", jezeli liczba nalezy do przedzialu od 21 do 30 to wypisz "Liczba jest z przedzialu od 21 do 30"
        //jezeli liczba nie nalezy do zadnego z tych przedzialow to wypisz "Liczba nie nalezy do zadnego z tych przedzialow"
        int randomNumberOne = new Random().nextInt(1, 40);
        if (randomNumberOne <= 10) {
            System.out.println("Liczba jest z przedziału od 1 do 10.");
        } else if (randomNumberOne >= 11 && randomNumberOne <= 20) {
            System.out.println("Liczba jest z przedziału od 11 do 20.");
        } else if (randomNumberOne >= 21 && randomNumberOne <= 30) {
            System.out.println("Liczba jest z przedzialu od 21 do 30");
        } else {
            System.out.println("Liczba nie nalezy do zadnego z tych przedzialow");
        }


        //Zadanie nr 19. Co wypisze program i dlaczego?
        int i = 10;
        if (i > 10 && ++i < 20) {
            System.out.println(i);
        }
        System.out.println(i);
        if (i > 10 || ++i < 20) {
            System.out.println(i);
        }
        System.out.println(i);
        //Pokaze 11 poniewaz jest to operator prefixowy, zwieksza wartos o 1 przed przypisaniem.

        //

        //Zadanie nr 21. Co to jest jump table?
        /*
        To tabela adresów kodowych, które mają być indeksowane przez wartość selektora.
        Program używa selektora do wyszukania adresu w tabeli, a następnie przeskakuje do tego adresu.
        */

        //Zadanie nr 22. Stworz liczbe int i sprawdz czy nalezy do przedzialow
        //(1,7] lub (10,20) lub [30,40) lub (50,100) lub czy nie nalezy do zadnego z nich
        int numberOne = new Random().nextInt(1, 100);
        if (numberOne > 1 && numberOne <= 7) {
            System.out.println("Nalezy do przedziału od 1 do 7");
        } else if (numberOne > 10 && numberOne < 20) {
            System.out.println("Nalezy do przedziału od 10 do 20");
        } else if (numberOne >= 30 && numberOne < 40) {
            System.out.println("Nalezy do przedziału od 10 do 20");
        } else if (numberOne > 50 && numberOne < 100) {
            System.out.println("Nalezy do przedzialu od 50 do 100");
        }else {
            System.out.println("Nie nalezy do zadnego z nich.");
        }


        //Zadanie nr 23. Stworz 3 zmienne typu boolean: czyPada, czySwieciSlonce, czyWiejeWiatr
        //jezeli pada deszcz i swieci slonce to wypisz "Tęcza"
        //jezeli pada deszcz i wieje wiatr to wypisz "Parasol"
        //jezeli swieci slonce i wieje wiatr to wypisz "Latawiec"
        //jezeli pada deszcz i swieci slonce i wieje wiatr to wypisz "Tęcza, parasol i latawiec"
        boolean czyPadaDeszcz = true;
        boolean czySwieciSlonce = true;
        boolean czyWiejeWiatr = true;
        if (czyPadaDeszcz && czySwieciSlonce) {
            System.out.println("Tęcza");
        }
        if (czyPadaDeszcz && czyWiejeWiatr) {
            System.out.println("Parsaol");
        }
        if (czySwieciSlonce && czyWiejeWiatr) {
            System.out.println("Latawiec");
        }
        if (czyPadaDeszcz && czySwieciSlonce && czyWiejeWiatr) {
            System.out.println("Tęcza, parasol i latawiec");
        }
    }
}


//Zadanania
//1. Sprawdz czy dlugosc imienia jest wieksza od 5 i wypisz "Imię jest długie" lub "Imię jest krótkie"
//2. Sprawdz czy dlugosc imienia podniesiona do kwadratu jest parzysta
//3. Sprawdz czy imie zaczyna sie od litery "A" lub "J" i wypisz "Imię zaczyna się od A lub J" lub "Imię nie zaczyna się od A lub J"
//4. Sprawdz czy imie jest równe "Jędrzej" lub "Jan" i wypisz "Imię jest równe Jędrzej lub Jan" lub "Imię nie jest równe Jędrzej lub Jan"
//5. Korzystajac z instrukcji switch, wypisz swoja opinie o roznych markach samochodow np. "Opel - nie lubie", "Fiat - lubie", "BMW - uwielbiam"
//7. Wylosuj losowa liczbe z przedzialu od 1 do 30:
//jezeli liczba jest mniejsza od 5 wypisz "haha ale maly"
//jezeli liczba jest wieksza od 5 ale mniejsza od 10 wypisz "sredniaczek"
//jezeli liczba jest wieksza od 10 ale mniejsza od 20 wypisz "duzy"
//jezeli liczba jest wieksza od 20 ale mniejsza  od 30 wypisz "ogromny"
//8. Sprawdź, czy podany wiek kwalifikuje się jako 'dziecko', 'nastolatek', 'dorosły' czy 'senior'.
//9. Używając instrukcji switch, zdecyduj, co robić w zależności od pory dnia: 'rano', 'po południu', 'wieczorem', 'w nocy'.
//10. Napisz program, który sprawdza, czy podana temperatura jest 'zimna', 'umiarkowana', 'ciepła' czy 'gorąca'.
//11. Użyj instrukcji if, aby sprawdzić, czy liczba jest 'dodatnia', 'ujemna' czy 'zerowa'.
//12. Zaimplementuj prosty program, który na podstawie miesiąca roku decyduje, czy jest to 'zima', 'wiosna', 'lato', czy 'jesień'.
//13. Napisz program, który na podstawie dnia tygodnia (poniedziałek do niedzieli) wybiera odpowiedni rodzaj aktywności.
//14. Stwórz prosty kalkulator, który na podstawie wybranej operacji (dodawanie, odejmowanie, mnożenie, dzielenie) wykonuje obliczenia.
//15. Sprawdź, czy podany rok jest rokiem przestępnym.
//16. Stworz 3 zmienne typu int i wypisz najwieksza z nich
//17. Stworz 3 zmienne typu int i wypisz najmniejsza z nich
//18. Jezeli liczba nalezy do przedzialu od 1 do 10 to wypisz "Liczba jest z przedzialu od 1 do 10", jezeli liczba
// nalezy do przedzialu od 11 do 20 to wypisz "Liczba jest z przedzialu od 11 do 20", jezeli liczba nalezy do przedzialu od 21 do 30 to wypisz "Liczba jest z przedzialu od 21 do 30"
// jezeli liczba nie nalezy do zadnego z tych przedzialow to wypisz "Liczba nie nalezy do zadnego z tych przedzialow"
//19. Co wypisze program i dlaczego?
//int i = 10;
//if (i > 10 && ++i < 20) {
//    System.out.println(i);
//}
//System.out.println(i);
//if(i > 10 || ++i < 20) {
//    System.out.println(i);
//}
//System.out.println(i);
//21. Co to jest jump table?
//22. Stworz liczbe int i sprawdz czy nalezy do przedzialow
//(1,7] lub (10,20) lub [30,40) lub (50,100) lub czy nie nalezy do zadnego z nich
//23. Stworz 3 zmienne typu boolean: czyPada, czySwieciSlonce, czyWiejeWiatr
//jezeli pada deszcz i swieci slonce to wypisz "Tęcza"
//jezeli pada deszcz i wieje wiatr to wypisz "Parasol"
//jezeli swieci slonce i wieje wiatr to wypisz "Latawiec"
//jezeli pada deszcz i swieci slonce i wieje wiatr to wypisz "Tęcza, parasol i latawiec"


