package com.java.course.com.lesson18;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Klasa Car
/*
- static vs obiektowe ATRYBUTY
 */
public class Car {
    String make;
    String model;
    double price;
    int productionYear;
    int distance;
    boolean engineStarted;
    String country;

    //Konstruktor - slzuy do stworzenia nowego obiektu i ustawienia jego parametrow
    public Car(String make, String newModel, double price, int productionYear, int distance, String country) {
        this.make = make;
        model = newModel;
        this.price = price;
        this.productionYear = productionYear;
        this.distance = distance;
        this.country = country;
    }

    //alt + insert


    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public Car() {

    }

    public void startEngine() {
        engineStarted = true;
        System.out.println("Wrooom...");
    }

    //Przeciazanie funkcji
    public void drive() {
        System.out.println("Driving...");
    }

    public void drive(int distance) {
        if (engineStarted) {
            System.out.println("Driving " + distance + " km");
            this.distance += distance;
        } else {
            System.out.println("Start engine first...");
        }
    }

    public void stopEngine() {
        engineStarted = false;
        System.out.println("Engine stop...");
    }

    public void printInfo() {
        System.out.println(this.make);
        System.out.println(this.model);
        System.out.println(this.price);
        System.out.println(this.productionYear);
    }

    public static Car findMostExpensiveCar(List<Car> cars) {
        Car mostExpensiveCar = null;
        double maxPrice = 0;
        for (Car car : cars) {
            if (car.price > maxPrice) {
                mostExpensiveCar = car;
                maxPrice = car.price;
            }
        }
        return mostExpensiveCar;
    }

    //policz ile jest aut marki ferrari


    public static int ilosc(List<Car> samochody, String make) {
        int liczba = 0;
        for (Car car : samochody) {
            if (car.make.equals(make)) {
                liczba++;
            }
        }
        return liczba;
    }


    //Zadanie nr1: znajdz najtansze auto
    public static Car najtanszeAuto(List<Car> cars) {
        Car minPrice = null;
        int najtansze = Integer.MAX_VALUE;
        for (Car car : cars) {
            if (car.price < najtansze) {
                minPrice = car;
                najtansze = (int) car.price;
            }
        }
        return minPrice;
    }


    //Zadanie nr2: znajdz srednia cene samochodow
    public static double sredniaCena(List<Car> cars) {
        double cenaAut = 0;
        for (Car car : cars) {
            cenaAut += car.price;
        }
        return cenaAut / cars.size();
    }


    //Zadanie nr3: jakiej marki jest najwiecej samochodow w liscie
    public static Car najwiecejAut(List<Car> cars) {
        Car model = null;
        int quantity = 0;
        for (Car car : cars) {
            if (car.make.equals(car.make)) {
                model = car;
                quantity++;
            }
        }
        return model;
    }

    public static Map<String, Integer> policzPoMarce(List<Car> cars) {
        Map<String, Integer> mapa = new HashMap<>();
        /*
        Mercedes: 4
        Ferrari : 2
         */
        int ilosc = 0;
        for (Car car : cars) {
            //sprawdz czy jest juz klucz w mapie (car.make)
            if (!mapa.containsKey(car.make)) {
                mapa.put(car.make, 1);
            } else {
                ilosc = mapa.get(car.make);
                //zwiekszyc wartos pod danym kluczem o ilosc +1
                mapa.put(car.make, ilosc + 1);
            }
        }
        return mapa;
    }

    //napisz funkcje ktora przyjmie Map<String,Integer> i znajdzie marke z maks licznikiem
     /*
        Mercedes: 4
        Ferrari : 2
         */
    public static String max(Map<String, Integer> mapa) {
        int maxValue = Integer.MIN_VALUE;
        String maxKey = null;

        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            //Czy value entry jest wieksze niz maxValue
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }


    public void printInfo3() {
        System.out.println(this.make + " " + this.model);
    }

    //Zadanie nr4: Oblicz srednia cene samochodow z niemiec
    public static double middelPrice(List<Car> cars) {
        double carPrice = 0;
        double middel = 0;
        int germany = 0;
        String country = "Germany";
        for (Car car : cars) {
            if (car.country.equals(country)) {
                germany++;
                carPrice += car.price;
                middel = carPrice / germany;
            }
        }
        return middel;
    }


   /* //Zadanie nr5: zwroc mape <String,List<Car>>  gdzie klucz to kraj pochodzenia a wartosc to lista samochodow z tego kraju
    public Map<String, List<Car>> Map(Map<String, List<Car>> cars) {
        Map<String, List<Car>> result = new HashMap<>();
        for (Map.Entry<String, List<Car>> entry : cars.entrySet()) {
            String con
            if (this.country.equals(country)) {
                keySet
            }
           result.put(this.country, this.)
        }
    }

    */


    //Zadanie nr6 napisz funkcje honk - zatrab, po prostu wypisz dzwiek trabienia
    public void Honk() {
        boolean honk = true;
        System.out.println("Bipppp...");
    }
}



/* Zadanie nr1.
- znajdz najtansze auto - zrobione
- znajdz srednia cene samochodow - zrobione
- jakiej marki jest najwiecej samochodow w liscie - zrobione
- Oblicz srednia cene samochodow z niemiec - zrobione
- zwroc mape <String,List<Car>>  gdzie klucz to kraj pochodzenia a wartosc to lista samochodow z tego kraju
- napisz funkcje honk - zatrab, po prostu wypisz dzwiek trabienia - zrobione
- napisz funkcje shiftGear(int gear) i zmieniy aktualny bieg na ten z parametru *dodaj zabezbieczenie, ze nie mozna skakac po biegach
czyli nie moge zmienic z 1 na 6 od razu 1->2->3 3->2->-1 (bez ifologii)
 */

//3. Stworz klase Wiadro, ktora bedzie miala pola: pojemnosc, wypelnienie
//oraz metody: wlejWode (powinno zwiekszyc wypelnienie) - zrobione, wylejWode (powinno zmniejszyc wypelnienie) - zrobione, przelejWode (powinno zmniejszyc wypelnienie w jednym obiekcie i zwiekszyc w drugim)
//dodatkowo w formie metod:
//znajdz wiadro o najwiekszej pojemnosci - zrobione
//znajdz wiadro o najmniejszej pojemnosci - zrobione
//znajdz wiadro o najwiekszym wypelnieniu - zrobione
//oblicz sume wszystkich wypelnien wiader - zrobione
//oblicz srednie wypelnienie wiader - zrobione

//4. Stworz klase Ksiazka, ktora bedzie miala pola: tytul, autor, liczbaStron, rokWydania
//oraz w postaci metod - zrobione
//znajdz najstarsza ksiazke - zrobione
//oblicz srednia ilosc stron dla wszystkich ksiazek - zrobione

//https://www.youtube.com/watch?v=6G19kFcVXTo&ab_channel=Jaknauczy%C4%87si%C4%99programowania
//https://www.youtube.com/watch?v=OvY0f-IWlos&t=4641s&ab_channel=Jaknauczy%C4%87si%C4%99programowania