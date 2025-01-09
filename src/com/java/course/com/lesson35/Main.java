package com.java.course.com.lesson35;

public class Main {
    public static void main(String[] args) {

    }
}
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

/*
Autorzy(Imię,Nazwisko,data urodzenia,nickname)
Piszą Posty(Tytuł, Treść, Data dodania)
Posty można dodawać, jako anonimowe, wtedy po prostu nie maja autora.
Czytelnicy mogą Komentować Posty oraz na nie reagować(like,dislike,haha,grr)

Napisz funkcje które pozwolą na:
- znalezienie najbardziej like'owanego postu
- znalezienie autora z największą ilością postów
- znalezienie posta z najwieksza iloscia komentarzy
- znalezienie posta ktory zawiera dane slowo kluczowe (wyszukiwanie po tytule)
- znalezienie najbardziej aktywnego czytelnika (komentującego)
- wszystkie posty z czerwca 2024
- policzy ile postow zostalo dodanych w danym roku

* Spraw aby mozna bylo odpowiadac na komentarze (czyli komentarze zagniezdzone) ale maks do 3 poziomow zagniezdzenia ******
 */