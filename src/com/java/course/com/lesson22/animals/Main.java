package com.java.course.com.lesson22.animals;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.makeSound();
        bird.fly();
        System.out.println();

        Animal bird2 = new Bird();

        bird2.makeSound();
        //bird2.fly();

        List<Animal> animals = List.of(new Bird(), new Dog(), new Cat());
        System.out.println();
        makeSounsd(animals);
    }
    //napisz funkcje ktora przyjmie liste zwierzat i niech kazdy wyda glos

    public static void makeSounsd(List<Animal> animals){
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
/*
Napisz klase Koszyk(produkty,ilosc,cena)
w ktorej mozna wybrac rozne metody platnosci
przy platnosci karta - dolicz prowizje 2%
przy platnosci przelewem - daj rabat 3%
przy platnosci za pobraniem - dolicz 10zl
zaimplementuj metody
- total()
- pay()
- addProduct()
- removeProduct()
- changeQuantity()
 */
/*
Utwórz klasę ShapeFactory wraz z funkcjami createSquare(), createTriangle(), createCircle().
Te funkcje mają działać w taki sposób, że po podaniu wymiarów,
wszystkie stworzone figury powinny być przechowywane w pamięci podręcznej (cache),
co oznacza, że będą zapamiętywane przez program.
Podczas tworzenia każdej nowej figury,
należy najpierw sprawdzić, czy figura o takich samych wymiarach już istnieje w pamięci podręcznej.
Jeśli nie, należy utworzyć nową figurę i dodać ją do pamięci podręcznej.
Jeśli tak, nowa figura nie jest tworzona, a zamiast tego zwracana jest istniejąca figura z pamięci podręcznej.

Na przykład:
1. createCircle(4)
2. Sprawdź, czy już istnieje koło o takim rozmiarze.
3. Jeśli nie, utwórz je i zapisz w pamięci podręcznej.
4. Jeśli tak, nie twórz nowego koła, tylko zwróć istniejące.

* Wymyśl mechanizm optymalizacji i czyszczenia pamięci podręcznej,
na przykład: co dziesiątą figurę pamięć podręczna jest czyszczona.
Chcemy zachować najczęściej używane figury,
a te rzadziej używane usunąć.

Dodatkowo, dla kazdej figury stworzonej przez ShapeFactory, powinien byc nadaany unikalny identyfikator, sekewencyjny.
czyli pierwsza figura ma id 1, druga 2, trzecia 3 itd.
Kazda figura stworzona normalnym konstruktorem ma id 0.ó
*/
