package com.java.course.com.lesson44and45.zadanienr1;

public class Main {
    public static void main(String[] args) {

    }
}
/*


 * Stwórz klase KoszOwocow ktora jako swoje pole przyjmuje Object. (konstruktor i getter)
 * Stworz klase Pomarancza i KoszPomaranczy która jako pole przyjmuje Pomarancze (konstruktor i getter)
 * Stworz klase Jablko i KoszJabłek ktora jako pole przyjmuje Jablko (konstruktor i getter)
 */

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