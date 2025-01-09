package com.java.course.com.lesson42;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Wyjatki

        //https://media.geeksforgeeks.org/wp-content/uploads/20230613122108/Exception-Handling-768.png


        //Unchecked Exceptions
        String username = null;
        //System.out.println(username.length()); //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "username" is null

        int[] someArr = new int[10];
        System.out.println(someArr[2]);
        //System.out.println(someArr[20]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 10


        try {
            int x = 10;
            int y = 0;
            System.out.println(x / y);   //Exception in thread "main" java.lang.ArithmeticException: / by zero
        } catch (ArithmeticException ex) {
            System.out.println("Don't divide by zero!!!");
        }


        //Checked Exceptions
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/com/java/course/com/lesson45/Main.java"));
        } catch (FileNotFoundException e) {
            System.out.println("Taki plik nie istnieje...");
        }

        readFileV1("123.txt");

        try {
            readFileV3("444.txt");
        } catch (IOException e) {
            System.out.println("Cosc poszlo nie tak...");
        }

        //Error
        //StackOverflowError
       // recurrence();

        //Person(firstname,lastname,age (birthdate))
        //znajdz osobe po iminiu i nazwisku
        //glosuj

        //Person.findPerson(List.of(),"Jan","Kowalski");


        //Stwórz liste i dodaj jej 3 eleemtny np Stringi. Losujemy liczbe z zakrezu 0-5
        // i do zmiennej typu String
        // przypisujemy wylosowany element listy, obsluz sytuacje gdy wylosowana wartosc
        // jest poza zakresem listy
        System.out.println("Zadanie z lista");
        List<String> newList = new ArrayList<>();
        newList.add("Radek");
        newList.add("Darek");
        newList.add("Marek");
        Random random = new Random();
        int randomNumber = random.nextInt(6);
        String selectedElement;
        if (randomNumber >= 0 && randomNumber < newList.size()) {
            selectedElement = newList.get(randomNumber);
        } else {
            selectedElement = "Brak elementu";
        }
        System.out.println("Lista: " + newList);
        System.out.println("Wylosowany indeks: " + randomNumber);
        System.out.println("Wylosowany element: " + selectedElement);






    }
    public static void recurrence(){
        System.out.println("hello");
        recurrence();
    }

    public static void readFileV1(String filePath) {
        //try with resoruces
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("Plik nie istnieje... " + e.getMessage());
        }catch (IOException e){
            System.out.println("Cos poszlo nie tak..." + e.getMessage());
        }
    }
    public static void readFileV2(String filePath) {
        //try with resoruces
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Cos poszlo nie tak..." + e.getMessage());
        }
    }
    public static void readFileV3(String filePath) throws IOException {
        //try with resoruces
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
/*
        Wyjątki - zrobione, dokonczyc
        // Stwórz liste i dodaj jej 3 eleemtny np Stringi. Losujemy liczbe z zakrezu 0-5
		// i do zmiennej typu String
		// przypisujemy wylosowany element listy, obsluz sytuacje gdy wylosowana wartosc
		// jest poza zakresem listy



       // wczytauj cos z pliku uzywajac try with resources -- zrobione



		//Stworz asocjacje pomiedzy klientem i produktem 1-*. Obsluz sytuacje gdy produkt jest nullem, wtedy automatycznie ustwiamy
		//klientowi ze zamowil lamborghini za 10000000
		//zamow(Produkt) -> jezeli produk to null to dodajemy mu lamborghini
 */



		// Stworz klase Osoba (imie, nazwisko, miasto, wiek) oraz Sklep (nazwa, miasto)
		// - metoda co zwraca najstarsza kobiete lub NoWomenException jesli brak kobiet na liscie
		// - kobiety chodza do sklepow, mezczyzni nie, zatem powiazania ze sklepem moga miec tylko kobiety, w przypadku próby dodania powiazania mezyczyzna
		//   sklep rzuc wyjatkiem ShopsAreOnlyForWomenException()
		// - osoby moga sie umawiac na randki, ale jestesmy homofobami, nie akceptujemy par homo, dodaj osobie plec
		// przy probie umowienia sie na randke pary homo rzuc wyjatkiem NoHomoHereException()
		// - nasz system przechowuje tylko osoby pełnoletnie, zatem wiek > 18, pryz próbie tworzenia osoby która ma mniej niz 18 lat
		// progarm powinien to naprawic, ustawiajac danej osobie 18 lat

		/*
		 * Stworz krotki system do zarzadzania programistami i ich partnerkami
		 *
		 * Programista ma imie, nazwisko, pensje oraz lsite jezykow jakie zna
		 *
		 * Kobieta ma imie, nazwsiko, rozmiar biustu oraz IQ
		 *
		 * Napisz metode ktora znajduje top n programistow (jesli chodzi o zarobki)
		 * ktorzy kodza w javie. Jesli nie jestes w stanie tego zrobic rzuc wyjatkiem
		 * NoJavaPorgrammerHere
		 *
		 * Programista moze chodzic na Randke(nazwa, miejsce, kobieta). Napisz metode
		 * ktora wylicza % szanse na zaliczenie na randce. Algorytm zalezy odm iejsca np
		 * restuaracja +10%, kino +20% itd oraz od kobiety, rozmiar A + 10%, B+ 20% itd
		 * oraz od IQ wzor IQ/1000. Jesli szansa na zaliczenie wynosi over 100%
		 * programista jest zapewny siebie i jego szanse spdaja, zatem obslugujemy
		 * wyajtek i ustawiamy szanse na zaliczenie do 30%
		 *
		 * Dodaj kobiecie atrybut ulubione miejsce, ktore jest losowane z listy miejsc.
		 * Jesli wylosowane ulubione miejsce kobiety jest inne niz to w ktorym zabral je
		 * programista powstaje konflikt, BadPlaceForDateException z zastrzezeniem ze
		 * moze przyjac on wiadomosc dla programisty od kobiety albo zostac pusty
		 */

