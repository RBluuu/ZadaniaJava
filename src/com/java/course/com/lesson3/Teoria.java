package com.java.course.com.lesson3;

public class Teoria {
    public static void main(String[] args) {
        //Lekcja 3 - Pętle
        //Petle pozwalają na wielokrotne wykonanie tego samego kodu, dzieki czemu nie musimy powtarzać wielokrotnie tych samych instrukcji
        //np.
        System.out.println("Cześć Jędrzej!");
        System.out.println("Cześć Jędrzej!");
        System.out.println("Cześć Jędrzej!");
        System.out.println("Cześć Jędrzej!");
        System.out.println("Cześć Jędrzej!");
        //moze zostac zastapione petla for
        for (int i = 0; i < 5; i++) {
            System.out.println("Cześć Jędrzej!");
        }
        //lub wypisywanie wszystkich liczb od 1 do 1000 nie musi wygladac tak
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        //...
        System.out.println(1000);
        //moze zostac zastapione petla for
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }

        //for (iterator; warunek; krok) {
        //    kod do wykonania
        //}

        //iterator - zmienna, która będzie przechowywać aktualną wartość iteracji
        //warunek - warunek, który musi być spełniony aby pętla wykonała się
        //krok - kod, który zostanie wykonany po każdej iteracji

        //np. wypisz wszysktkie liczby od 1 do 100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        //lub wypisz wszystkie liczby od 100 do 1
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
        //oblicz sume wszystkich liczb od 1 do 100
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println(suma);

        //oblicz sume wszystkich liczb od 1231 do 4542 ale tylko parzystych
        suma = 0;
        for (int i = 1231; i <= 4542; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println(suma);


        //petla while - wykonuje kod dopóki warunek jest spełniony
        //np. tankuj paliwo dopóki nie zatankujesz 50 litrów

        int zatankowano = 0;
        while (zatankowano < 50) {
            System.out.println("Tankuje paliwo");
            zatankowano += 10;
        }
        //lub wypisz wszystkie liczby od 1 do 100
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        //petla do while - wykonuje kod dopóki warunek jest spełniony, ale zawsze wykona się przynajmniej raz
        //np. tankuj paliwo dopóki nie zatankujesz 50 litrów
        zatankowano = 0;
        do {
            System.out.println("Tankuje paliwo");
            zatankowano += 10;
        } while (zatankowano < 50);

        //np tutaj dla while kod nie wykona sie ani razu
        i = 100;
        while (i < 0) {
            System.out.println(i);
            i++;
        }
        //a tutaj wykona sie raz
        i = 100;
        do {
            System.out.println(i);
            i++;
        } while (i < 0);


        //break - przerywa działanie pętli
        //np. wypisz wszystkie liczby od 1 do 100 ale jezeli liczba jest podzielna przez 7 to przerywamy działanie pętli
        for (int j = 1; j < 100; j++) {
            if (j % 7 == 0) {
                break;
            }
            System.out.println(j);
        }

        //continue - przerywa aktualną iterację i przechodzi do kolejnej
        //np. wypisz wszystkie liczby od 1 do 100 ale jezeli liczba jest podzielna przez 7 to jej nie wypisujemy
        for (int j = 1; j < 100; j++) {
            if (j % 7 == 0) {
                continue;
            }
            System.out.println(j);
        }

        //break czy continue mozna tez uzyc w petli while i do while
        //mozna tez odniesc sie do labelki
        //np. wypisz wszystkie liczby od 1 do 100 ale jezeli liczba jest podzielna przez 7 to przerywamy działanie pętli

        // Label for the outer loop//ob
        outerLoop:
        for (int k = 0; k < 5; k++) {
            for (int j = 0; j < 5; j++) {
                // Check some condition
                if (k * j > 6) {
                    System.out.println("Breaking out of the outer loop when i * j = " + (k * j));
                    break outerLoop; // Break the outer loop
                }
                System.out.println(k + " * " + j + " = " + (k * j));
            }
        }
        System.out.println("Outside of the outer loop");


        //petle mozemy zagniezdzac
        int counter = 0;
        for (int i1 = 0; i1 < 10; i1++) {
            for (int i2 = 0; i2 < 10; i2++) {
                for (int i3 = 0; i3 < 10; i3++) {
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}
