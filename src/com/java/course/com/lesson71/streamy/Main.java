package com.java.course.com.lesson71.streamy;

import com.java.course.com.lesson71.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(43, 321, 43, 2132, 4, 43, 555, 11212));
        // filter – przepuszcza tylko elementy spełniające warunek (predicate)
        List<Integer> filterExample = numbers.stream()
                .filter(p -> p > 10)
                .toList();
        // map – przekształca każdy element na inny obiekt
        System.out.println(numbers.stream()
                .map(p -> p * 2)
                .toList());
        // mapToInt / mapToLong / mapToDouble – przekształca elementy na strumień prymitywów danego typu
        //oblicz srednia z powyzszej listy a jezeli nie ma wyniku to zwroc 123
        numbers.stream()
                .mapToDouble(n -> n)
                .average();

        double srednia = numbers.stream()
                .mapToDouble(n -> n)
                .average()
                .orElse(0);

        // flatMap – spłaszcza strumienie elementów do jednego strumienia
        List<List<Integer>> list2D = List.of(
                List.of(31, 3213, 213),
                List.of(22, 333213, 55),
                List.of(77, 44, 22),
                List.of(99, 10, 13)
        );

        System.out.println(list2D.stream()
                .flatMap(l -> l.stream())
                .mapToInt(n -> n)
                .sum());
        // flatMapToInt / flatMapToLong / flatMapToDouble – spłaszcza do strumienia prymitywów
        // mapMulti – odwzorowuje jeden element na wiele elementów w wydajny sposób
        List<Integer> numbers2 = List.of(1, 2, 3);
        numbers2.stream()
                .mapMulti(
                        (n, consumer) -> {
                            consumer.accept(n * n);
                            consumer.accept(n * 2);
                            consumer.accept(n * 10);
                        }
                ).forEach(n -> System.out.print(n + " "));
        System.out.println();
        // mapMultiToInt / mapMultiToLong / mapMultiToDouble – wersje dla strumieni prymitywów
        // distinct – usuwa duplikaty ze strumienia
        System.out.println(List.of(1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4)
                .stream().distinct()
                .collect(Collectors.toList()));
        // sorted – sortuje elementy w naturalnym porządku lub przy użyciu komparatora
        numbers = new ArrayList<>(List.of(43, 321, 43, 2132, 4, 43, 555, 11212));
        System.out.println(numbers.stream()
                .sorted((n1, n2) -> n2 - n1)
                .collect(Collectors.toList()));
        System.out.println(numbers.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList()));
        System.out.println(numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));


        Person p1 = new Person("Adam", 125);
        Person p2 = new Person("Ewa", 30);
        Person p3 = new Person("Marek", 30);
        Person p4 = new Person("Anna", 26);
        Person p5 = new Person("Paweł", 35);

        List<Person> listaLudzi = new ArrayList<>(List.of(p1,p2,p3,p4,p5));

        System.out.println(listaLudzi.stream()
                .sorted((per1,per2) -> per1.getAge() - per2.getAge())
                .collect(Collectors.toList()));
        System.out.println(listaLudzi.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList()));
        // peek – wykonuje dodatkową akcję na każdym elemencie (np. do debugowania)
        List<Integer> wieki = listaLudzi.stream()
                .map(Person::getAge)
                .peek(System.out::println) // wypisze po drodze
                .toList();

        // limit – ogranicza strumień do określonej liczby elementów
        System.out.println(listaLudzi.stream()
                .limit(2)
                .collect(Collectors.toList()));

        // skip – pomija określoną liczbę elementów
        System.out.println(listaLudzi.stream()
                .skip(2)
                .collect(Collectors.toList()));

        // takeWhile – pobiera elementy dopóki spełniają warunek
        List<Person> niepelnoletni = listaLudzi.stream()
                .takeWhile(p -> p.getAge() < 18)
                .collect(Collectors.toList());
        System.out.println(niepelnoletni);

        // dropWhile – pomija elementy dopóki spełniają warunek, resztę przepuszcza
        List<Person> pelnoletni = listaLudzi.stream()
                .dropWhile(p -> p.getAge() < 18)
                .collect(Collectors.toList());
        System.out.println(pelnoletni);

        // forEach – wykonuje akcję na każdym elemencie (kolejność niegwarantowana)
        listaLudzi.stream()
                .mapToInt(Person::getAge)
                .forEach(System.out::println);
        // forEachOrdered – wykonuje akcję na każdym elemencie w zachowanej kolejności
        listaLudzi.stream()
                .mapToInt(Person::getAge)
                .forEachOrdered(System.out::println);
        // toArray – zbiera elementy do tablicy
        String[] tablica = Stream.of("Ala", "ma", "kota")
                .toArray(String[]::new);
        System.out.println(Arrays.toString(tablica));
        // reduce – redukuje elementy do pojedynczej wartości przy pomocy akumulatora
        //tutaj podajesz wartość początkową (identity). Wynik nie jest Optional, bo zawsze zwraca wartość.
        int suma = numbers.stream()
                .reduce(0,(a,b) -> a + b);
        System.out.println(suma);

        // collect – zbiera elementy do kolekcji lub innego kontenera
        listaLudzi.stream()
                .collect(Collectors.toList());
        System.out.println();
        // toList – zbiera elementy do listy (skrótowa forma collect)
        listaLudzi.stream()
                .toList();
        System.out.println();
        // min – znajduje najmniejszy element wg komparatora
        int min = numbers.stream()
                .mapToInt(n -> n)
                .min()
                .orElse(0);
        System.out.println(min);
        // max – znajduje największy element wg komparatora
        int max = numbers.stream()
                .mapToInt(n -> n)
                .max()
                .orElse(0);
        System.out.println(max);
        // count – zwraca liczbę elementów w strumieniu
        int result = (int)numbers.stream()
                .count();
        System.out.println(result);
        // anyMatch – sprawdza, czy chociaż jeden element spełnia warunek
        boolean wynik = listaLudzi.stream()
                .anyMatch(person -> person.getAge() == 99);
        System.out.println(wynik);
        // allMatch – sprawdza, czy wszystkie elementy spełniają warunek
        boolean wynik2 = listaLudzi.stream()
                .allMatch(person -> person.getAge() == 99);
        System.out.println(wynik2);
        // noneMatch – sprawdza, czy żaden element nie spełnia warunku
        boolean wynik3 = listaLudzi.stream()
                .noneMatch(person -> person.getAge() == 99);
        System.out.println(wynik3);
        // findFirst – zwraca pierwszy element strumienia (jeśli istnieje)
        int wynik4 = numbers2.stream()
                .filter(n -> n % 2 == 0)
                .findFirst()
                .orElse(-1);
        System.out.println(wynik4);
        // findAny – zwraca dowolny element strumienia (często szybsze w strumieniach równoległych)
        int wynik5 = numbers2.stream()
                .filter(n -> n % 2 == 0)
                .findAny()
                .orElse(-1);
        System.out.println(wynik5);
        // builder – tworzy strumień krok po kroku za pomocą budowniczego
        Stream<String> stream = Stream.<String>builder()
                .add("Ala")
                .add("ma")
                .add("kota")
                .build();  // buduje strumień
        stream.forEach(System.out::println);
        // empty – zwraca pusty strumień
        //Można go używać w połączeniu z innymi strumieniami:
        Stream<String> stream1 = Stream.of("Ala", "ma");
        Stream<String> stream2 = Stream.empty();

        Stream<String> polaczony = Stream.concat(stream1, stream2);
        polaczony.forEach(System.out::println);
        // of – tworzy strumień z podanych elementów
        Stream<String> streamWithOf = Stream.of("Ala", "ma", "kota");
        streamWithOf.forEach(System.out::println);
        // ofNullable – tworzy strumień z pojedynczego elementu, jeśli nie jest nullem
        String imie = null;
        Stream<String> streamWithNull = Stream.ofNullable(imie);
        System.out.println(streamWithNull.count()); // 0
        // iterate – generuje nieskończony lub ograniczony strumień na podstawie funkcji iteracyjnej
        Stream<Integer> liczby = Stream.iterate(0, n -> n + 2); // 0, 2, 4, 6, ...
        liczby.limit(5) // ograniczamy do pierwszych 5 elementów
                .forEach(System.out::println); // 0 2 4 6 8
        // generate – tworzy nieskończony strumień elementów dostarczanych przez Supplier
        Stream<Double> losowe = Stream.generate(Math::random); // nieskończony strumień liczb losowych
        losowe.limit(5) // ograniczamy do 5 elementów
                .forEach(System.out::println);
        /*
        0.123456
        0.987654
        0.456789
        0.234567
        0.876543
         */


        // concat – łączy dwa strumienie w jeden
        Stream<String> linia1 = Stream.of("Ala", "ma");
        Stream<String> linia2 = Stream.of("kota", "i", "psa");

        Stream<String> polaczony1 = Stream.concat(linia1, linia2);

        polaczony1.forEach(System.out::println);

        /*
        Na podstwie sygnatury funkcji przekazdc do fucknji streama odpowiednia lambde
        dla kazdego interfejsu funkcyjnego powieniens byc w stanie napisac labmde
         */

        int sum = list2D.stream()
                .mapToInt(n -> 4)
                .sum();

    }
}
