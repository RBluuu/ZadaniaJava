package com.java.course.com.lesson20;

import java.util.*;

public class Mapy {
    public static void main(String[] args) {
        // 1. Utwórz mapę (HashMap) do przechowywania imion studentów jako kluczy i ich ocen jako wartości.
        // Dodaj kilku studentów do mapy i wydrukuj wszystkie klucze i wartości.

        // 2. Sprawdź, czy mapa zawiera klucz "John".
        // Jeśli tak, wydrukuj jego ocenę, w przeciwnym razie wydrukuj komunikat "Student John nie został znaleziony".

        // 3. Usuń studenta o imieniu "Anna" z mapy. Wydrukuj mapę przed i po usunięciu.

        // 4. Zaktualizuj ocenę studenta o imieniu "Mark" na 95. Wydrukuj zaktualizowaną mapę.

        // 5. Utwórz metodę, która przyjmuje mapę studentów i zwraca średnią ocenę wszystkich studentów.

        // 6. Przepisz mapę, aby używać LinkedHashMap zamiast HashMap, i obserwuj różnicę w kolejności przechowywania elementów.

        // 7. Utwórz metodę, która przyjmuje mapę studentów i zwraca listę imion studentów, którzy mają ocenę powyżej 80.

        // 8. Przepisz mapę, aby używać TreeMap zamiast HashMap, i obserwuj różnicę w kolejności przechowywania elementów.

        // 9. Utwórz metodę, która przyjmuje mapę studentów i zwraca mapę z ocenami podniesionymi o 5 punktów (ale nie więcej niż 100).

        // 10. Utwórz mapę, w której kluczami będą numery indeksów studentów, a
        // wartościami obiekty reprezentujące studentów (klasa Student). Dodaj kilku studentów i wydrukuj mapę.


        // 1. Utwórz mapę (HashMap) do przechowywania imion studentów jako kluczy i ich ocen jako wartości.
        // Dodaj kilku studentów do mapy i wydrukuj wszystkie klucze i wartości.
        Map<String, Integer> studenci = new HashMap<>();
        studenci.put("Radek", 4);
        studenci.put("Marek", 3);
        studenci.put("Franek", 5);
        studenci.put("Łukasz", 6);
        studenci.put("Anna", 2);
        studenci.put("Darek", 1);
        studenci.put("Mark", 4);
        studenci.put("Jarosław", 4);

        System.out.println(studenci.get("Jarosław"));

        System.out.println("Zadanie nr1\n" + studenci);
        System.out.println();


        //
        // 2. Sprawdź, czy mapa zawiera klucz "John".
        // Jeśli tak, wydrukuj jego ocenę, w przeciwnym razie wydrukuj komunikat "Student John nie został znaleziony".
        System.out.println("Zadanie nr2: " + mapContains(studenci, "Darek"));
        System.out.println();

        // 3. Usuń studenta o imieniu "Anna" z mapy. Wydrukuj mapę przed i po usunięciu.
        System.out.println("Zadanie 3: ");
        usuwanie(studenci, "Anna");
        System.out.println();

        // 4. Zaktualizuj ocenę studenta o imieniu "Mark" na 95. Wydrukuj zaktualizowaną mapę.
        System.out.println("Zadanie nr4:");
        podmiana(studenci, "Mark");
        System.out.println("Podmiana" + podmianaV2(studenci, "Mark"));
        System.out.println();

        // 5. Utwórz metodę, która przyjmuje mapę studentów i zwraca średnią ocenę wszystkich studentów.
        System.out.println("Zadanie nr5" + "\nSrednia ocena to : " + srednia(studenci));
        System.out.println();

        // 6. Przepisz mapę, aby używać LinkedHashMap zamiast HashMap, i obserwuj różnicę w kolejności przechowywania elementów.
        System.out.println("Zadanie 6:");
        Map<String, Integer> studenci1 = new LinkedHashMap<>();
        studenci1.put("Radek", 4);
        studenci1.put("Marek", 3);
        studenci1.put("Franek", 5);
        studenci1.put("Łukasz", 6);
        studenci1.put("Anna", 2);
        studenci1.put("Darek", 1);
        studenci1.put("Mark", 4);
        studenci1.put("Jarosław", 4);
        System.out.println(studenci1);
        System.out.println();

        // 7. Utwórz metodę, która przyjmuje mapę studentów i zwraca listę imion studentów, którzy mają ocenę powyżej 80
        System.out.println("Zadanie nr7:");
        Map<String, Integer> studenci3 = new HashMap<>();
        studenci3.put("Radek", 40);
        studenci3.put("Marek", 30);
        studenci3.put("Franek", 50);
        studenci3.put("Łukasz", 50);
        studenci3.put("Anna", 80);
        studenci3.put("Darek", 90);
        studenci3.put("Mark", 70);
        studenci3.put("Jarosław", 100);
        System.out.println(studenci3);
        System.out.println();
        System.out.println("Lista studentow z wynikiem powyzej 80: \n" + listaStudentow(studenci3, 80));
        System.out.println();

        // 8. Przepisz mapę, aby używać TreeMap zamiast HashMap, i obserwuj różnicę w kolejności przechowywania elementów.
        System.out.println("Zadanie nr8:");
        Map<String, Integer> studenci4 = new TreeMap<>();
        studenci4.put("Radek", 40);
        studenci4.put("Marek", 30);
        studenci4.put("Franek", 50);
        studenci4.put("Łukasz", 50);
        studenci4.put("Anna", 80);
        studenci4.put("Darek", 90);
        studenci4.put("Mark", 99);
        studenci4.put("Jarosław", 100);
        System.out.println(studenci4);
        System.out.println();

        // 9. Utwórz metodę, która przyjmuje mapę studentów i zwraca mapę z ocenami podniesionymi o 5 punktów (ale nie więcej niż 100).
        System.out.println("Zadanie nr9\n" + podniesioneOceny(studenci4, 5));

        //Studenci
        Student student1 = new Student("Radek", 12355, "Wyższa Szkola Logistyki");
        Student student2 = new Student("Marek", 46587, "Politechnika Poznańska");
        Student student3 = new Student("Darek", 999952, "Wyższa Szkola Teatralna");
        Student student4 = new Student("Irek", 46534, "Politechnika Wrocławska");
        // 10. Utwórz mapę, w której kluczami będą numery indeksów studentów, a
        // wartościami obiekty reprezentujące studentów (klasa Student). Dodaj kilku studentów i wydrukuj mapę.

        System.out.println();
        System.out.println("Zadanie nr10:");
        Map<Integer, String> studenci5 = new HashMap<>();
        studenci5.put(student1.numerIndeksu, student1.uczelnia);
        studenci5.put(student2.numerIndeksu, student2.uczelnia);
        studenci5.put(student3.numerIndeksu, student3.uczelnia);
        studenci5.put(student4.numerIndeksu, student4.uczelnia);
        System.out.println(studenci5);


    }

    // 2. Sprawdź, czy mapa zawiera klucz "John".
    // Jeśli tak, wydrukuj jego ocenę, w przeciwnym razie wydrukuj komunikat "Student John nie został znaleziony".
    public static int mapContains(Map<String, Integer> map, String imie) {
        String zlaOdpowiedz = "Student " + imie + " nie został znaleziony";
        for (Map.Entry<String, Integer> imiona : map.entrySet()) {
            if (imiona.equals(imie)) {
                //Janek: 5
                return map.get(imie);
            }
        }
        System.out.println("Uczen nieznany");
        return 0;
    }

    // 3. Usuń studenta o imieniu "Anna" z mapy. Wydrukuj mapę przed i po usunięciu.
    public static void usuwanie(Map<String, Integer> map, String imie) {
        System.out.println("Mapa przed usunieciem:");
        System.out.println(map);
        map.remove(imie);
        System.out.println("Mapa po usunieciu:");
        System.out.println(map);
    }

    // 4. Zaktualizuj ocenę studenta o imieniu "Mark" na 95. Wydrukuj zaktualizowaną mapę.
    public static void podmiana(Map<String, Integer> map, String imie) {

        map.put(imie,95);

        for (String studenci : map.keySet()) {
            if (studenci.equals(imie)) {
                map.put(imie, 95);
            } else {
                return;
            }
        }
    }

    // 5. Utwórz metodę, która przyjmuje mapę studentów i zwraca średnią ocenę wszystkich studentów..
    public static double srednia(Map<String, Integer> map) {
        double suma = 0;
        for (int ocena : map.values()) {
            suma += ocena;
        }
        return suma / map.size();
    }

    // 7. Utwórz metodę, która przyjmuje mapę studentów i zwraca listę imion studentów, którzy mają ocenę powyżej 80
    public static List<String> listaStudentow(Map<String, Integer> map, int suma) {
        List<String> lista = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= suma) {
                lista.add(entry.getKey());
            }
        }
        return lista;
    }

    // 9. Utwórz metodę, która przyjmuje mapę studentów i zwraca mapę z ocenami podniesionymi o 5 punktów (ale nie więcej niż 100).
    public static Map<String, Integer> podniesioneOceny(Map<String, Integer> map, int liczba) {
        Map<String, Integer> nowaMapa = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 100) {
                nowaMapa.put(entry.getKey(), entry.getValue() + liczba);
            } else {
                nowaMapa.put(entry.getKey(), entry.getValue());
            }
        }
        return nowaMapa;
    }

    public static Map<String, Integer> podmianaV2(Map<String, Integer> map, String imie) {
        Map<String, Integer> nowaMapa = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(imie)) {
                nowaMapa.put(entry.getKey(), 95);
            } else {
                nowaMapa.put(entry.getKey(), entry.getValue());
            }
        }
        return nowaMapa;
    }


}
