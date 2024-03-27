package com.java.course.com.lesson12;

import java.util.*;

public class Kolekcje {
    public static void main(String[] args) {
        //https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200811210521/Collection-Framework-1.png
        //https://www.bigocheatsheet.com/

        //Lekcja 8 - Kolekcje, List, ArrayList, LinkedList, Set, HashSet, TreeSet, Map, HashMap, TreeMap

        //W Javie mamy kilka rodzajów kolekcji, ktore pozwalaja na przechowywanie wielu elementow
        //rozne kolekcje maja rozne cechy, np. szybkosc dodawania, usuwania, wyszukiwania elementow
        //musimy dobrac odpowiednia kolekcje do naszych potrzeb

        //List - kolekcja, ktora przechowuje elementy w kolejnosci dodawania
        //ArrayList - implementacja List, ktora przechowuje elementy w tablicy
        //LinkedList - implementacja List, ktora przechowuje elementy w liscie dwukierunkowej

        //Set - kolekcja, ktora przechowuje elementy w dowolnej kolejnosci
        //HashSet - implementacja Set, ktora przechowuje elementy w tablicy
        //TreeSet - implementacja Set, ktora przechowuje elementy w drzewie
        //LinkedHashSet - implementacja Set, ktora przechowuje elementy w liscie dwukierunkowej

        //Map - kolekcja, ktora przechowuje pary klucz-wartosc
        //HashMap - implementacja Map, ktora przechowuje pary klucz-wartosc w tablicy
        //TreeMap - implementacja Map, ktora przechowuje pary klucz-wartosc w drzewie
        //LinkedHashMap - implementacja Map, ktora przechowuje pary klucz-wartosc w liscie dwukierunkowej

        //Queue - kolekcja, ktora przechowuje elementy w kolejnosci dodawania
        //PriorityQueue - implementacja Queue, ktora przechowuje elementy w kopcu
        //ArrayDeque - implementacja Queue, ktora przechowuje elementy w tablicy
        //LinkedList - implementacja Queue, ktora przechowuje elementy w liscie dwukierunkowej


        //List - kolekcja, ktora przechowuje elementy w kolejnosci dodawania
        //ArrayList - implementacja List, ktora przechowuje elementy w tablicy

        //tworzenie listy
        List<String> kolory = new ArrayList<>();
        //dodawanie elementow do listy
        kolory.add("czerwony");
        kolory.add("zielony");
        kolory.add("niebieski");

        //wyswietlanie zawartosci listy
        System.out.println(kolory); //Wypisze: [czerwony, zielony, niebieski]

        //pobieranie elementu z listy
        System.out.println(kolory.get(0)); //Wypisze: czerwony
        System.out.println(kolory.get(1)); //Wypisze: zielony

        //usuwanie elementu z listy
        kolory.remove(0);

        //wyswietlanie zawartosci listy
        System.out.println(kolory); //Wypisze: [zielony, niebieski]

        //sprawdzanie czy lista zawiera element
        System.out.println(kolory.contains("zielony")); //Wypisze: true

        //sprawdzanie rozmiaru listy
        System.out.println(kolory.size()); //Wypisze: 2

        //sprawdzanie czy lista jest pusta
        System.out.println(kolory.isEmpty()); //Wypisze: false

        //sprawdzanie indeksu elementu
        System.out.println(kolory.indexOf("zielony")); //Wypisze: 0

        //sprawdzanie ostatniego indeksu elementu
        System.out.println(kolory.lastIndexOf("zielony")); //Wypisze: 0

        //usuwanie wszystkich elementow z listy
        kolory.clear();

        //wyswietlanie zawartosci listy
        System.out.println(kolory); //Wypisze: []


        //LinkedList - implementacja List, ktora przechowuje elementy w liscie dwukierunkowej

        //tworzenie listy
        List<String> imiona = new LinkedList<>();

        //ArrayLista bedzie szybsza przy pobieraniu elementow, LinkedList bedzie szybsza przy dodawaniu i usuwaniu elementow

        //Collections - klasa z metodami do operacji na kolekcjach
        //sort(List<T> list) - sortuje liste
        Collections.sort(imiona);
        //reverse(List<?> list) - odwraca liste
        Collections.reverse(imiona);
        //shuffle(List<?> list) - miesza liste
        Collections.shuffle(imiona);
        //rotate(List<?> list, int distance) - obraca liste o podana odleglosc
        Collections.rotate(imiona, 2);
        //swap(List<?> list, int i, int j) - zamienia elementy na podanych indeksach
        Collections.swap(imiona, 0, 1);
        //replaceAll(List<T> list, T oldVal, T newVal) - zamienia wszystkie wystapienia elementu na inny
        Collections.replaceAll(imiona, "Jędrzej", "Jędrzejjjjj");
        //fill(List<? super T> list, T obj) - wypelnia liste podanym elementem
        Collections.fill(imiona, "Jędrzej");
        //copy(List<? super T> dest, List<? extends T> src) - kopiuje liste do innej listy
        Collections.copy(imiona, kolory);
        //min(Collection<? extends T> coll, Comparator<? super T> comp) - zwraca najmniejszy element z kolekcji
        System.out.println(Collections.min(imiona));
        //max(Collection<? extends T> coll, Comparator<? super T> comp) - zwraca najwiekszy element z kolekcji
        System.out.println(Collections.max(imiona));
        //disjoint(Collection<?> c1, Collection<?> c2) - sprawdza czy kolekcje nie maja wspolnych elementow
        System.out.println(Collections.disjoint(imiona, kolory));
        //frequency(Collection<?> c, Object o) - zwraca liczbe wystapien elementu w kolekcji
        System.out.println(Collections.frequency(imiona, "Jędrzej"));
        //indexOfSubList(List<?> source, List<?> target) - zwraca indeks podlisty w liscie
        Collections.indexOfSubList(imiona, kolory);
        //lastIndexOfSubList(List<?> source, List<?> target) - zwraca ostatni indeks podlisty w liscie
        Collections.lastIndexOfSubList(imiona, kolory);

        //Set - kolekcja, ktora unikatowe przechowuje elementy w dowolnej kolejnosci
        //HashSet - implementacja Set, ktora przechowuje elementy w tablicy
        //TreeSet - implementacja Set, ktora przechowuje elementy w drzewie
        //LinkedHashSet - implementacja Set, ktora przechowuje elementy w liscie dwukierunkowej

        //tworzenie zbioru
        Set<String> auta = new HashSet<>();
        //dodawanie elementow do zbioru
        auta.add("BMW");
        auta.add("Audi");
        auta.add("Mercedes");

        //wyswietlanie zawartosci zbioru
        System.out.println(auta); //Wypisze: [BMW, Audi, Mercedes]

        //usuwanie elementu ze zbioru
        auta.remove("BMW");

        //wyswietlanie zawartosci zbioru
        System.out.println(auta); //Wypisze: [Audi, Mercedes]

        //sprawdzanie czy zbiór zawiera element
        System.out.println(auta.contains("Audi")); //Wypisze: true

        //sprawdzanie rozmiaru zbioru
        System.out.println(auta.size()); //Wypisze: 2

        //sprawdzanie czy zbiór jest pusty
        System.out.println(auta.isEmpty()); //Wypisze: false


        //Map - kolekcja, ktora przechowuje pary klucz-wartosc
        //HashMap - implementacja Map, ktora przechowuje pary klucz-wartosc w tablicy
        //TreeMap - implementacja Map, ktora przechowuje pary klucz-wartosc w drzewie
        //LinkedHashMap - implementacja Map, ktora przechowuje pary klucz-wartosc w liscie dwukierunkowej

        //tworzenie mapy
        Map<String, String> imionaNazwiska = new HashMap<>();
        //dodawanie elementow do mapy
        imionaNazwiska.put("Jędrzej", "Kowalski");
        imionaNazwiska.put("Jan", "Nowak");
        imionaNazwiska.put("Anna", "Kowalska");


        //wyswietlanie zawartosci mapy
        System.out.println(imionaNazwiska); //Wypisze: {Jędrzej=Kowalski, Jan=Nowak, Anna=Kowalska}

        //przydatne metody z mapy
        //get(Object key) - zwraca wartosc dla podanego klucza
        System.out.println(imionaNazwiska.get("Jędrzej")); //Wypisze: Kowalski
        //containsKey(Object key) - sprawdza czy mapa zawiera podany klucz
        System.out.println(imionaNazwiska.containsKey("Jędrzej")); //Wypisze: true
        //containsValue(Object value) - sprawdza czy mapa zawiera podana wartosc
        System.out.println(imionaNazwiska.containsValue("Kowalski")); //Wypisze: true
        //keySet() - zwraca zbior kluczy
        System.out.println(imionaNazwiska.keySet()); //Wypisze: [Jędrzej, Jan, Anna]
        //values() - zwraca kolekcje wartosci
        System.out.println(imionaNazwiska.values()); //Wypisze: [Kowalski, Nowak, Kowalska]
        //entrySet() - zwraca zbior par klucz-wartosc
        System.out.println(imionaNazwiska.entrySet()); //Wypisze: [Jędrzej=Kowalski, Jan=Nowak, Anna=Kowalska]
        //remove(Object key) - usuwa element o podanym kluczu
        imionaNazwiska.remove("Jędrzej");
        //clear() - usuwa wszystkie elementy z mapy
        imionaNazwiska.clear();
        //size() - zwraca rozmiar mapy
        System.out.println(imionaNazwiska.size()); //Wypisze: 0
        //isEmpty() - sprawdza czy mapa jest pusta
        System.out.println(imionaNazwiska.isEmpty()); //Wypisze: true
        //replace(K key, V value) - zamienia wartosc dla podanego klucza
        imionaNazwiska.replace("Jędrzej", "Kowalski");
        //putAll(Map<? extends K, ? extends V> m) - dodaje wszystkie elementy z innej mapy
        imionaNazwiska.putAll(imionaNazwiska);
        //putIfAbsent(K key, V value) - dodaje element do mapy jesli nie istnieje
        imionaNazwiska.putIfAbsent("Jędrzej", "Kowalski");


        //Queue - kolekcja, ktora przechowuje elementy w kolejnosci dodawania
        //PriorityQueue - implementacja Queue, ktora przechowuje elementy w kopcu
        //ArrayDeque - implementacja Queue, ktora przechowuje elementy w tablicy
        //LinkedList - implementacja Queue, ktora przechowuje elementy w liscie dwukierunkowej

        //tworzenie kolejki
        Queue<String> kolejka = new LinkedList<>();
        //dodawanie elementow do kolejki
        kolejka.add("Jędrzej");
        kolejka.add("Jan");
        kolejka.add("Anna");

        //wyswietlanie zawartosci kolejki
        System.out.println(kolejka); //Wypisze: [Jędrzej, Jan, Anna]

        //pobieranie elementu z kolejki
        System.out.println(kolejka.poll()); //Wypisze: Jędrzej
        System.out.println(kolejka.poll()); //Wypisze: Jan

        //wyswietlanie zawartosci kolejki
        System.out.println(kolejka); //Wypisze: [Anna]

        //sprawdzanie rozmiaru kolejki
        System.out.println(kolejka.size()); //Wypisze: 1

        //sprawdzanie czy kolejka jest pusta
        System.out.println(kolejka.isEmpty()); //Wypisze: false

        //sprawdzanie czy kolejka zawiera element
        System.out.println(kolejka.contains("Anna")); //Wypisze: true

        //usuwanie elementu z kolejki
        kolejka.remove("Anna");

        //wyswietlanie zawartosci kolejki
        System.out.println(kolejka); //Wypisze: []

        //sprawdzanie czy kolejka zawiera element
        System.out.println(kolejka.contains("Anna")); //Wypisze: false

        //poll vs remove vs peek vs element
        //poll() - pobiera i usuwa element z kolejki, zwraca null jesli kolejka jest pusta
        //remove() - pobiera i usuwa element z kolejki, rzuca wyjatek jesli kolejka jest pusta
        //peek() - pobiera element z kolejki, zwraca nul//Sl jesli kolejka jest pusta
        //element() - pobiera element z kolejki, rzuca wyjatek jesli kolejka jest pusta

    }

    //Zadania:
    //https://www.youtube.com/watch?v=8MmMm2-kJV8&t=2182s&ab_channel=Amigoscode
    //1. Stworz liste imion i wypisz jej zawartosc
    //2. Stworz zbior imion i wypisz jego zawartosc
    //3. Stworz mape imion i nazwisk i wypisz jej zawartosc
    //Listy:
    //1. Napisz metode ktora policzy ile jest 10tek w liscie intow
    //2. Napisz metode ktora sprawdzi czy lista intow zawiera podana liczbe
    //3. Napisz metode ktora sprawdzi czy lista intow zawiera tylko parzyste liczby
    //4. Napisz metode ktora sprawdzi czy lista intow zawiera tylko liczby podzielne przez 3
    //5. Napisz metode ktora sprawdzi czy lista intow zawiera tylko liczby podzielne przez 3 i 5
    //6. Napisz metode ktora sprawdzi czy lista intow zawiera tylko liczby podzielne przez 3 lub 5
    //7. Napisz metode ktora zwroci posortowana liste liczb nie zmieniajac oryginalnej listy
    //8. Napisz metode ktora zwroci liste liczb w odwrotnej kolejnosci nie zmieniajac oryginalnej listy
    //9. Napisz metode ktora zwroci liste liczb bez duplikatow nie zmieniajac oryginalnej listy
    //10. Napisz metode ktora przyjmie 3 listy intow, doda do siebie elementy  z pierwszek i drugiej listy i pomnozy przez elementy z trzeciej listy
    //11. Napisz metode ktora obliczy ile jest slow dluzszych niz 5 znakow w liscie stringow
    //12. Stwórz metodę, która zwraca najmniejszą liczbę z listy intów.
    //13. Stwórz metodę, która znajduje największe słowo w liście stringów.
    //14. Stwórz metodę, która sprawdza, czy wszystkie słowa w liście stringów zaczynają się od wielkiej litery.
    //15. Stwórz metodę, która zwraca sumę wszystkich liczb w liście intów.
    //16. Stwórz metodę, która przyjmuje listę stringów i zwraca te same stringi, ale z odwróconą kolejnością liter.
    //17. Stwórz metodę, która znajduje średnią wartość liczb w liście intów.
    //18. Stwórz metodę, która zwraca listę stringów bez słów krótszych niż 3 znaki.
    //19. Stwórz metodę, która zwraca listę intów, gdzie każda liczba jest podniesiona do kwadratu.
    //20. Stwórz metodę, która przyjmuje dwie listy stringów i zwraca listę tych stringów, które występują w obu listach.
    //21. Stwórz metodę, która sprawdzi, czy dana lista intów jest posortowana rosnąco.
    //22. Stworz metode, ktora przyjmie liste stringow i wypisze najdluzszy wspolny prefix
    //np. dla listy {"kot", "kotek", "kotlet"} wypisze "kot"
    //23. Stwórz metodę, która sprawdza, czy dana lista intów jest palindromem (tj. czy czytana od przodu i od tyłu jest taka sama).
    //25. Stwórz metodę, która znajdzie wszystkie pary liczb w liście intów, których suma jest równa podanej liczbie.
    //28. Stwórz metodę, która oblicza najkrótszą ścieżkę w labiryncie reprezentowanym jako macierz 2D.
    /*
    [0,32,5,3]
    [2,34,3,1]
    [43,12,3,0]
    i musisz znalezc najkrotsza sciezke z lewego gornego rogu do prawego dolnego, czyli najmniejsza sume liczb
    mozesz sie poruszac tylko w prawo i w dol
     */
    //29. Stworz metode ktora przyjmuje liste stringow i sprawdza czy wszystkie stringi w liscie sa palindromami lub anagramami
    //31. Przyjmij liste list list intow czyli List<List<List<Integer>>> i znajdz najwieksza liczne, najmniejsza liczbe, srednia, sume wszystkich liczb
    //Sety:
    //1. Napisz metode ktora sprawdzi czy zbior zawiera podana liczbe
    //2. Napisz metode ktora sprawdzi czy zbior zawiera tylko liczby parzyste
    //3. Oblicz sume wszystkich liczb w zbiorze
    //5. Zwroc zbior ktory jest roznica dwoch innych zbiorow
    //6. Zwroc zbior ktory jest suma dwoch innych zbiorow
    //7. Zwroc zbior ktory jest czescia wspolna dwoch innych zbiorow
    //8. Zwroc czesc rozlaczna dwoch innych zbiorow
    //9. Z listy stringow zwroc liste tylko unikalnych stringow
    //Mapy:
    //1. Napisz metode ktora sprawdzi czy mapa zawiera podany klucz
    //2. Napisz metode ktora sprawdzi czy mapa zawiera podana wartosc
    //3. Napisz metode ktora sprawdzi czy mapa zawiera tylko klucze podzielne przez 3
    //4. Napisz metode ktora sprawdzi czy mapa zawiera tylko wartosci podzielne przez 3
    //5. Stwórz metodę, która porównuje dwie mapy i zwraca true jeśli mają identyczne klucze, niezależnie od wartości.
    //7. Stwórz metodę, która zwraca mapę odwrotną, gdzie wartości stają się kluczami, a klucze wartościami. Zakładając, że wszystkie wartości są unikalne.
    //8. Stwórz metodę, która zwraca listę kluczy z mapy, których wartości są największe.
    //9. Stwórz metodę, która łączy dwie mapy. W przypadku powtarzających się kluScannczy, wartości powinny być sumowane.
    //10. Stwórz metodę, która oblicza sumę wartości dla danego zestawu kluczy w mapie.
    //11. Stwórz metodę, która zwraca mapę z wartościami jako lista słów, a kluczem długość tych słów.
    //12. Stwórz metodę, która sprawdza, czy mapa jest pusta lub czy wszystkie jej wartości są puste/null.
    //13. Stwórz metodę, która usuwa z mapy wszystkie pary, których wartości są mniejsze od podanej liczby.
    //14. Stwórz metodę, która zwraca zbiór wartości z mapy, które występują więcej niż raz.
    //15. Dla podanego Stringa wypisz ilosc wystapien kazdego znaku
    //np dla Stringa "Sokół zawsze może być fajnym zwierzem"
    //wypisze:
    //S - 1
    //o - 2
    //k - 1
    //itd...
    //16. Stwórz metodę, która zwraca mapę, w której kluczem jest długość słowa, a wartością lista słów o tej długości.
    //17. Stworz metode ktora przyjmie liste stringow i zwroci mape gdzie kluczem bedzie dlugosc slowa a wartoscia lista slow o tej dlugosci
    //18. Stworz metode ktora przyjmie liste stringow i zwroci mape gdzie kluczem bedzie litera a wartoscia lista slow zaczynajacych sie na ta litere
    //19. Stworz mape niemutowalna
    //LeetCode:
    //https://leetcode.com/problems/valid-parentheses/
    //https://leetcode.com/problems/contains-duplicate/
    //https://leetcode.com/problems/valid-palindrome/
}
