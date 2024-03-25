package com.java.course.com.lesson7;

public class ExampleFor {
    public static void main(String[] args) {
        //Zadania:
//1. Napisz program, który wypisze na ekranie Twoje imię i nazwisko 10 razy

        String name = "Radek";
            for ( int i = 0; i < 10; i++) {
            System.out.print(name + " ");
        }
        System.out.println();

//2. Napisz program, ktory wypisze wszystkie liczby od 1 do 99
        for ( int i = 0; i < 99; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

//3. Napisz program, ktory wypisze wszystkie liczby od 99 do 1
        for ( int i = 99; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


//4. Napisz program, ktory wypisze wszystkie liczby parzyste od 1 do 100 ale w jednej linii oddzielone spacja
        for ( int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
//5 Korzystajac z petli while wypisz wszystkie liczby nieparzyste od 1 do 100
        int i = 1;
        while (i <= 100) {
            if ( i % 3 == 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();
//6. Napisz program, który obliczy sumę wszystkich liczb od 1 do 100.
        int suma = 0;
        for ( i = 1; i < 100; i++) {
            suma += i;
        }
        System.out.println("Suma = " + suma);
//7. Napisz program, który obliczy silnię liczby 5.
        int silna5 = 1;
        for ( i = 1; i <= 5; i++) {
            silna5 *= i;
        }
        System.out.println("Silna5 = " + silna5);
        System.out.println();

//8. Napisz program, który wygeneruje i wypisze pierwsze 10 liczb ciągu Fibonacciego.
//9. Napisz program, który dla danej liczby n wypisze wszystkie liczby od n do 0 w kolejności malejącej.
        int n = 10;
        for ( i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
//10. Napisz program, który wypisze tabliczkę mnożenia dla liczb od 1 do 10.
       // for ( int z = 1; z <= 10; z++) {
         //   for ( int j = 1; j <= 10; i++) {
           //     System.out.println(z * j);
            //}
       // }
//11. Napisz program, który wypisze wszystkie liczby podzielne przez 3 w zakresie od 1 do 100.
        for ( int d = 1; d <= 100; d++ ) {
            if ( d % 3 == 0) {
                System.out.print(d + " ");
            }
        }
//12. Napisz program, który prosi użytkownika o wpisanie liczby, a następnie wypisze tę liczbę tyle razy, ile wynosi jej wartość.

//13. Napisz program, który wypisze "Hello World!" 100 razy, każde powitanie w nowej linii.
        String zdanie = "Hello World";
        for ( i = 0; i <= 100; i++) {
            System.out.println(zdanie);
        }
//14. Napisz program, który wyświetli kwadraty liczb od 1 do 20.
        for ( int a = 1; a <= 20; a++) {
            System.out.println(a * a);
        }
//15. Napisz program, który wyświetli litery alfabetu od 'a' do 'z'.
        for ( i = 'a'; i <= 'z'; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
//16. Napisz program, który wyświetli litery alfabetu od 'z' do 'a'.
        for ( i = 'z'; i >= 'a'; i--) {
            System.out.print((char) i + " ");
        }
        System.out.println();
//17. Napisz program ktory narysuje trojkat z gwiazdek '*' o wysokosci 5
//18. Napisz program ktory wypisze sume cyfry jednosci i dziesiatek wszystkich liczb od 10 do 99
//https://www.youtube.com/watch?v=yJs1VMzOl_I&ab_channel=JavaStart
//19. oblicz silnie dla liczby 5
        int silna0 = 1;
        for ( int e = 1; e <= 5; e++) {
            silna0 *= e;
        }
        System.out.println("Silna 5 = " + silna0);




    }
}
