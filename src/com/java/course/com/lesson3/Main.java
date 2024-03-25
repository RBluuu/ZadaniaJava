package com.java.course.com.lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //for,while,do-while

        //DRY - dont repeat yourself
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println();

        //for - powtorzy kod okreslona ilosc razy np 10, 20, 100

        //for(iterator,warunek petli,manipulator)
        for (int i = 0; i < 6; i++) { //0,1,2,3,4,5
            System.out.println("Hello World!!!");
        }
        System.out.println();
        //for(iterator,warunek petli,manipulator)
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World!!!");
        }
        System.out.println();
        //for(iterator,warunek petli,manipulator)
        for (int i = 100; i < 200; i += 20) { //100,120,140,160,180
            System.out.println("Hello World!!!");
        }
        System.out.println();
        //wypisz liczby od 1 do 10

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //wypisz liczby od 543 do -123 w jednell linii ale tylko podzielne 3

        for (int i = 543; i >= -123; i -= 3) { // 543,  546  549  552
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

        //oblicz sume wszystkich liczb dwucyfrowych
        //10-99

        //10
        //10 + 11
        //21 + 12
        //33 + 14
        int number = 0;
        for (int i = 10; i <= 99; i++) { //
            number = number + i;
        }
        System.out.println(number);

        //while
        double pojemnosc = 50;
        double zawartosc = 20;
        double litrPerSec = 1.5;

        while (zawartosc < pojemnosc) {
            System.out.println("Tankujemy....");
            zawartosc += litrPerSec;
        }

        //wypisz liczby od 1 do 10;
        int x = 0;
        while (x < 10) {
            System.out.print(x + " ");
            x++;
        }
        //do-while
        System.out.println();
        int y = 0;
        do {
            System.out.print(y + " ");
            y++;
        } while (y < 10);

        System.out.println();
        int p = 100;
        while (p < 0) {
            System.out.println("HELLO");
        }

        do {
            System.out.println("HELLO");
        } while (p < 0);

        System.out.println();

        //10.fori
        //sout
        for (int i = 0; i < 10; i++) {

        }
        System.out.println();
        for (int i = 0; i > 10; i++) {
            System.out.println("!!!");
        }
        for (int i = 0; i < 10; i--) {
            System.out.println("!!!");
        }

        //break
        //contnue
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.printf("i=%d,j=%d,k=%d\n", i, j, k);
                    counter++;
                }
            }
        }
        System.out.println(counter);


        //1. Napisz program, który wypisze na ekranie Twoje imię i nazwisko 10 razy
        String imie1 = "Radek Błauciak";
        for (int i = 0; i < 10; i++) {
            System.out.println(imie1);
        }


        //2. Napisz program, ktory wypisze wszystkie liczby od 1 do 99
        for (int i = 1; i <= 99; i++) {
            System.out.print(i + " ");
        }


        //3. Napisz program, ktory wypisze wszystkie liczby od 99 do 1
        System.out.println(" ");
        for (int i = 99; i >= 1; i--) {
            System.out.print(i + " ");
        }


        //4. Napisz program, ktory wypisze wszystkie liczby parzyste od 1 do 100 ale w jednej linii oddzielone spacja
        System.out.println(" ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


        //5 Korzystajac z petli while wypisz wszystkie liczby nieparzyste od 1 do 100
        System.out.println(" ");
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0)
                System.out.print(i + " ");
            i++;
        }

        //6. Napisz program, który obliczy sumę wszystkich liczb od 1 do 100.
        System.out.println(" ");
        int suma = 0;
        for (i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.print(suma);


        //7. Napisz program, który obliczy silnię liczby 5.
        System.out.println(" ");
        int silna = 1;
        for (i = 1; i <= 5; i++) {
            silna *= i;
        }
        System.out.println(silna);


        //8.Napisz program, który wygeneruje i wypisze pierwsze 10 liczb ciągu Fibonacciego.
        System.out.println(" ");
        int suma1 = 0;
        for (i = 1; i <= 10; i++) {
            suma1 += i;
            System.out.print("Pierwsze 10 licz Fibonacciego to" + "=" + suma1);
            System.out.println(" ");
        }


        //9.Napisz program, który dla danej liczby n wypisze wszystkie liczby od n do 0 w kolejności malejącej.
        int n = 50;
        for (i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //10.Napisz program, który wypisze tabliczkę mnożenia dla liczb od 1 do 10.
        int liczba = 1;
        for (i = 1; i <= 10; i++) {
            System.out.println(liczba * i);
        }

        //11.Napisz program, który wypisze wszystkie liczby podzielne przez 3 w zakresie od 1 do 100.
        System.out.println(" ");
        for (i = 1; i <= 100; i++)
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }


        //12.Napisz program, który prosi użytkownika o wpisanie liczby, a następnie wypisze tę liczbę tyle razy, ile wynosi jej wartość.
        System.out.println("Zadanie 12");
        System.out.println("Podaj swoja liczbe:");
        Scanner scanner = new Scanner(System.in);
        int liczbaUzytkownika = scanner.nextInt();
        System.out.println("Twoja liczba to " + scanner);
        for (int l = 0; l < liczbaUzytkownika; l++) {
            System.out.println(liczbaUzytkownika);
        }

        //13.Napisz program, który wypisze "Hello World!" 100 razy, każde powitanie w nowej linii.
        System.out.println(" ");
        String text = "Hello World!";
        for (i = 0; i < 100; i++) {
            System.out.println(text);
        }

        //14.Napisz program, który wyświetli kwadraty liczb od 1 do 20.
        for (i = 1; i <= 20; i++) {
            System.out.println(i * i);
        }

        //15.Napisz program, który wyświetli litery alfabetu od 'a' do 'z'.
        for (i = 'a'; i <= 'z'; i++) {
            System.out.print((char) i + " ");
        }

        //16.Napisz program, który wyświetli litery alfabetu od 'z' do 'a'.
        System.out.println(" ");
        for (i = 'z'; i >= 'a'; i--) {
            System.out.print((char) i + " ");
        }

        //17.Napisz program ktory narysuje trojkat z gwiazdek '*' o wysokosci 5


        //18.Napisz program ktory wypisze sume cyfry jednosci i dziesiatek wszystkich liczb od 10 do 99
        System.out.println(" ");
        suma = 0;
        //10 - 1 + 0  =1
        //11 - 1 + 1 = 2
        //12 - 1 + 2 = 3
        //99 - 9 +9 - 18
        for (i = 10; i <= 99; i++) {
            suma += i;
        }
        System.out.println(suma);
        String sumaLiczb = "4905";
        System.out.println(sumaLiczb.length());
        System.out.println(sumaLiczb.charAt(3));


        //19.oblicz silnie dla liczby 5
        System.out.println(" ");
        int silna5 = 1;
        for (i = 1; i <= 10; i++) {
            silna5 *= i;
        }
        System.out.println(silna5);
    }
}


//Zadania:
//1. Napisz program, który wypisze na ekranie Twoje imię i nazwisko 10 razy
//2. Napisz program, ktory wypisze wszystkie liczby od 1 do 99
//3. Napisz program, ktory wypisze wszystkie liczby od 99 do 1
//4. Napisz program, ktory wypisze wszystkie liczby parzyste od 1 do 100 ale w jednej linii oddzielone spacja
//5 Korzystajac z petli while wypisz wszystkie liczby nieparzyste od 1 do 100
//6. Napisz program, który obliczy sumę wszystkich liczb od 1 do 100.
//7. Napisz program, który obliczy silnię liczby 5.
//8. Napisz program, który wygeneruje i wypisze pierwsze 10 liczb ciągu Fibonacciego.
//9. Napisz program, który dla danej liczby n wypisze wszystkie liczby od n do 0 w kolejności malejącej.
//10. Napisz program, który wypisze tabliczkę mnożenia dla liczb od 1 do 10.
//11. Napisz program, który wypisze wszystkie liczby podzielne przez 3 w zakresie od 1 do 100.
//12. Napisz program, który prosi użytkownika o wpisanie liczby, a następnie wypisze tę liczbę tyle razy, ile wynosi jej wartość.
//13. Napisz program, który wypisze "Hello World!" 100 razy, każde powitanie w nowej linii.
//14. Napisz program, który wyświetli kwadraty liczb od 1 do 20.
//15. Napisz program, który wyświetli litery alfabetu od 'a' do 'z'.
//16. Napisz program, który wyświetli litery alfabetu od 'z' do 'a'.
//17. Napisz program ktory narysuje trojkat z gwiazdek '*' o wysokosci 5
//18. Napisz program ktory wypisze sume cyfry jednosci i dziesiatek wszystkich liczb od 10 do 99
//https://www.youtube.com/watch?v=yJs1VMzOl_I&ab_channel=JavaStart
//19. oblicz silnie dla liczby 5

