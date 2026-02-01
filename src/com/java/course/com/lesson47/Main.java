package com.java.course.com.lesson47;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ZADANIA MAPY:

// w tych dwoch metodach jedno wywolanie metody dodaje jedo slowo do mapy


        // Napisz metoda która dodaje słowa do mapy. Kluczem maja byc kolejen liczby
        // naturalne zaczynajac od 0
        System.out.println("Zadanie nr1");
        String[] test1 = {"Radek","Marek","Lukasz","Michal"};
        Map<Integer,String> wynik = mapaSlowILiczb(test1);
        System.out.println(wynik);
        String[] test2 = {"jabłko", "banan", "wiśnia", "gruszka"};
        Map<Integer,String> wynik2 = mapaSlowILiczb(test2);
        System.out.println(wynik2);
        System.out.println();




        // Napisz metode ktora pozwala dodawac do mapy kolejne wyrazy. Na koncu ma
        // wyswietlic ile razy jaki element byl dodany
        System.out.println("Zadanie nr2");
        String[] test3 = {"Radek","Marek","Lukasz","Michal","Radek","Radek"};
        Map<String,Integer> wynik3 = iloscPowtorzenSlowa(test3);
        System.out.println(wynik3);
        System.out.println();

        // Napisz program, ktory losuje liczby w duzym lotku bez powtorzen, zakres liczb 1-45
        System.out.println("Zadanie nr3");
        Map<Integer,Integer> duzyLotek = duzyLotek(1,45,6);
        System.out.println(duzyLotek);
        System.out.println();

        // napisz metode ktora przyjmuje Mape<Integer, String>, zamien wartosci ktorych
        // klucze sa parzystych wartosci
        // na słowo "parzyste"
        System.out.println("Zadanie nr4");
        List<Integer> nowaLista = List.of(1,2,3,5,6,7,8,10);
        Map<Integer,String> zmiennaWartosc = zmieniaWartoscNaSlowo(nowaLista,"parzysta");
        System.out.println(zmiennaWartosc);
        System.out.println();

        // Napisz program, ktory symuluje dzialanie slownika
        // polsko-angielskiego. Przykładowy program: Podaj slowko po Polsku: mama Slowko
        // po Angielsku to mother. Program dziala dopoki uzytkownik nie zrezygnuje
        // (cancel)
        System.out.println("Zadanie nr5");
        Map<String,String> slownik = new HashMap<>();
        slownik.put("mama", "mother");
        slownik.put("tata", "father");
        slownik.put("dom", "house");
        slownik.put("kot", "cat");
        slownik.put("pies", "dog");
        slownik(slownik);
        System.out.println(slownik);
        System.out.println();




        // Napisz program, ktory losuje liczby w duzym lotku bez powtorzen, zakres liczb 1-45
        // napisz metode ktora przyjmuje Mape<Integer, String>, zamien wartosci ktorych
        // klucze sa parzystych wartosci
        // na słowo "parzyste"


        // Napisz program, ktory symuluje dzialanie slownika
        // polsko-angielskiego. Przykładowy program: Podaj slowko po Polsku: mama Slowko
        // po Angielsku to mother. Program dziala dopoki uzytkownik nie zrezygnuje
        // (cancel)


        // W systemie przechowujemy nazwe klasy (szkolnej, np 1a, 2b) oraz listę osób
        // (same nazwiska jako Stringi) które uczeszczaja do klasy.
        // 1) Napisz metode ktora zwraca liste osob o najdluzszych nazwiskach z kazdej klasy
        // 2) Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas
        Uczen nowak = new Uczen("Nowak");
        Uczen kowalski = new Uczen("Kowalski");
        Uczen wisniewski = new Uczen("Wisniewski");
        Uczen wojcik = new Uczen("Wojcik");
        Uczen kowalczyk = new Uczen("Kowalczyk");
        Uczen kaminski = new Uczen("Kaminski");
        Uczen lewandowski = new Uczen("Lewandowski");
        Uczen zielinski = new Uczen("Zielinski");
        Uczen szymanski = new Uczen("Szymanski");
        Uczen wozniak = new Uczen("Wozniak");
        Uczen dabrowski = new Uczen("Dabrowski");
        Uczen kozlowski = new Uczen("Kozlowski");
        Uczen jankowski = new Uczen("Jankowski");
        Uczen mazur = new Uczen("Mazur");
        Uczen nowik = new Uczen("Nowik");

        Klasa klasa1a = new Klasa("Klasa 1a",List.of(nowik,nowak,kowalski,kowalczyk,mazur));
        Klasa klasa1b = new Klasa("Klasa 1b",List.of(wisniewski,wojcik,kaminski,lewandowski,zielinski));
        Klasa klasa1c = new Klasa("Klasa 1c",List.of(szymanski,wozniak,dabrowski,kozlowski,jankowski));

        System.out.println(Klasa.listaNajdluzszychNazwiskWKazdejKlasie(List.of(klasa1a,klasa1b,klasa1c)));
        System.out.println();

        System.out.println(Klasa.najdluzszeNazwisko(List.of(klasa1a,klasa1b,klasa1c)));
        System.out.println();

        //napisz funkcje ktora przyjmie mape<int,int> i obliczy sume wszystkich wartosci

        Map<Integer,Integer> newMap = new HashMap<>();
        newMap.put(2,2);
        newMap.put(1,3);
        newMap.put(3,3);
        newMap.put(4,3);
        newMap.put(5,3);
        System.out.println(suma(newMap));

    }

    public static int suma(Map<Integer,Integer> liczby) {
        int suma = 0;
        Map<Integer,Integer> newMap = new HashMap<>(liczby);
        for (Integer value : liczby.values()) {

        }

        for (Integer i : liczby.keySet()) {

        }
        for (Map.Entry<Integer, Integer> entry : newMap.entrySet()) {
                suma += entry.getValue();
        }
        return suma;
        }



    public static Map<Integer,String> mapaSlowILiczb(String[] podajSlowa) {
        Map<Integer,String> newMap = new HashMap<>();
        for(int i = 0; i < podajSlowa.length; i++) {
            newMap.put(i,podajSlowa[i]);
        }
        return newMap;
    }


    public static Map<String,Integer> iloscPowtorzenSlowa(String[] podajSlowa) {
        Map<String,Integer> newMap = new HashMap<>();
        for (String slowo : podajSlowa) {
            int iloscPowtorzen = newMap.getOrDefault(slowo, 0);
            newMap.put(slowo, iloscPowtorzen + 1);
        }
        return newMap;
    }


    public static Map<Integer,Integer> duzyLotek(Integer minWartosc, Integer maxWartos, Integer iloscWylosowanychLiczb) {
        List<Integer> liczbyWGrze = new ArrayList<>();
        for (int i = minWartosc; i <= maxWartos; i++) {
            liczbyWGrze.add(i);
        }
        Collections.shuffle(liczbyWGrze);
        Map<Integer,Integer> wylosowaneLiczby = new HashMap<>();
        for (int i = 0; i< iloscWylosowanychLiczb; i++) {
            wylosowaneLiczby.put(i + 1, liczbyWGrze.get(i));
        }
        return wylosowaneLiczby;
    }

    public static Map<Integer,String> zmieniaWartoscNaSlowo(List<Integer> liczby, String parzysteLubNieaprzyste) {
        Map<Integer,String> mapa = new HashMap<>();
        for (Integer liczba : liczby) {
            if (parzysteLubNieaprzyste.equals("parzysta") && liczba % 2 == 0) {
                mapa.put(liczba,"parzysta");
            } else if (parzysteLubNieaprzyste.equals("nieparzysta") && liczba % 2 != 0){
                mapa.put(liczba,"nieparzysta");
            }
        }
        return mapa;
    }

    public static void slownik(Map<String,String> mapa) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aby zakonczyc wpisz 'cancel");
        while (true) {
            System.out.println("Podaj slowo: ");
            String slowoUzytkownika = sc.nextLine();
            if (mapa.containsKey(slowoUzytkownika)) {
                System.out.println(mapa.get(slowoUzytkownika));
            } else if (slowoUzytkownika.equalsIgnoreCase("cancel")) {
                System.out.println("Koniec tlumaczenia");
                break;
            }
        }
        sc.close();
    }
}
