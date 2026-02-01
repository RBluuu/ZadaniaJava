package com.java.course.com.lesson44and45.zadanienr2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static com.java.course.com.lesson44and45.zadanienr2.Mapper.zmiana;

public class Main {
    public static void main(String[] args) {
        /*


         * Stwórz klase KoszOwocow ktora jako swoje pole przyjmuje Object. (konstruktor i getter)
         * Stworz klase Pomarancza i KoszPomaranczy która jako pole przyjmuje Pomarancze (konstruktor i getter)
         * Stworz klase Jablko i KoszJabłek ktora jako pole przyjmuje Jablko (konstruktor i getter)

        //Napisz klase Osoba która ma 2 parametry ktore moga byc roznymi typami, np String int, String String.

        // https://sdkp.pjwstk.edu.pl/html/staskshtml/S_GENERICS/S_GENERICS.html

        //	napisz metode ktora jako argument pobiera liste obiektow typu A, jakis mapper(interfejs ktory zmienia liste) i zwraca liste obiektow typu B
        //	przykladowe uzycie:
        //
        //	List<LocalDate> dates = transform(Arrays.asList("2020-01-01", "2015-05-05"), tu jakis mapper/obiekt);
        //	albo
        //	List<Integer> numbers = transform(Arrays.asList(1,2,3),new SquareMapper()); -> 1,4,9


        //Stworz klase MinMax<T extends Comparable> ktora jako pola klasy pobiera instancje T max oraz T min
        //Nastepnie stworz klase MinMaxService ktora bedzie miala statyczna metode MinMax<cos tutaj> getMinAndMax(List<cos tutaj> elements) zadaniem tej metody jest
        // zwracanie mina i maxa z listy w tym jednym obiekcie wg naturalnego porządku jaki gwarantuje komparator, klasa MinMax powinna byc generyczna i metody getMin oraz
        // getMax powinny zwraca instancje tego co bedzie na liscie elements, czyli jak przekazemy liste stringow to getMax ma zwraca String, getMin tez stringa a jak damy
        // liste osob to ma getMax zwraca osobe, itp itd.


        /*
        Stworz klase ObjectContaiener<T> ktora moze przechowywac elemetny dowolnego typu
        zaimplementuj funkcje
        add()
        print()
        remove()
        find() - zwraca indeks peirwszego elementu o szukanej wartosci

        !!!! Nie mozesz skorzystac z: Array,List,Map,Set,Kolekcji, nie mozna tez zapisywac elementow w pliku

        //zastanów się/poszukaj  jak działa LinkedList w Javie
 */

/*//Stwórz klase KoszOwocow ktora jako swoje pole przyjmuje Object. (konstruktor i getter)
        KoszOwocow owocowe = new KoszOwocow("Banany i pomarancze");
        System.out.println(owocowe);
        System.out.println();

//Stworz klase Pomarancza i KoszPomaranczy która jako pole przyjmuje Pomarancze (konstruktor i getter)
        Pomarancze pomarancze = new Pomarancze("Slodkie", 10);
        KoszOwocow kosz = new KoszOwocow(pomarancze);
        System.out.println(pomarancze);
        System.out.println(kosz);
        System.out.println();

        //Stworz klase Jablko i KoszJabłek ktora jako pole przyjmuje Jablko (konstruktor i getter)
        Jablko jablka = new Jablko("Holenderskie", 55);
        KoszJablek koszyczek = new KoszJablek("Kosz jablek", jablka);
        System.out.println(jablka);
        System.out.println(koszyczek);
        System.out.println();

//Napisz klase Osoba która ma 2 parametry ktore moga byc roznymi typami, np String int, String String.
        Osoba<String, Integer> osoba1 = new Osoba<>("Jan Kowalski", 30);
        System.out.println(osoba1);

//	napisz metode ktora jako argument pobiera liste obiektow typu A, jakis mapper(interfejs ktory zmienia liste) i zwraca liste obiektow typu B
        //	przykladowe uzycie:
        //
        //	List<LocalDate> dates = transform(Arrays.asList("2020-01-01", "2015-05-05"), tu jakis mapper/obiekt);
        //	albo
        //	List<Integer> numbers = transform(Arrays.asList(1,2,3),new SquareMapper()); -> 1,4,9

        List<LocalDate> dates = zmiana(
                Arrays.asList("2020-01-01", "2015-05-05"),
                new Mapper.StringToLocalDateMapper()
        );
        System.out.println(dates); // [2020-01-01, 2015-05-05]

        // Test podnoszenia liczb do kwadratu
        List<Integer> numbers = zmiana(
                Arrays.asList(1, 2, 3),
                new Mapper.SquareMapper()
        );
        System.out.println(numbers); // [1, 4, 9, 16, 25]

        // Możemy też użyć wyrażeń lambda zamiast osobnych klas
        List<String> upperCaseWords = zmiana(
                Arrays.asList("hello", "world"),
                String::toUpperCase
        );
        System.out.println(upperCaseWords); // [HELLO, WORLD]
    }

 */

    }
}



