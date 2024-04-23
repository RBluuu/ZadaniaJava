package com.java.course.com.lesson12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200811210521/Collection-Framework-1.png
        //Lista - przechowuje uporzadkowane elemenety i ma dynamiczny rozmiar
        //tablica na sterydach

        //List<double>
        //List<int>
        //List<Integer>;
        //List<Double>

        List<Integer> liczby = new ArrayList<>();
        System.out.println(liczby);
        liczby.add(123);
        liczby.add(542);
        liczby.add(-41);
        System.out.println(liczby);
        System.out.println(liczby.get(0));
        System.out.println(liczby.get(1));
        System.out.println(liczby.get(2));
        System.out.println(liczby.isEmpty());
        System.out.println(liczby.contains(542));
        System.out.println(liczby.contains(111));
        System.out.println(liczby.indexOf(-41));
        System.out.println(liczby.size());
        System.out.println(liczby.set(0, 999));
        System.out.println(liczby);
        System.out.println(liczby.subList(1, 3));

        //Stworz tablice String np imion i dodaj kilka imion
        List<String> imiona = new ArrayList<>();
        imiona.add("Radek");
        imiona.add("Marek");
        imiona.add("Olek");
        System.out.println(imiona);
        System.out.println(imiona.contains("Marek"));
        imiona.remove("Olek");
        System.out.println(imiona);
        System.out.println();

        List<Integer> liczbyPierwsze = new ArrayList<>();
        liczbyPierwsze = new LinkedList<>();

        liczbyPierwsze.add(1);
        liczbyPierwsze.add(1);
        liczbyPierwsze.add(1);
        liczbyPierwsze.add(1);
        liczbyPierwsze.add(2);
        liczbyPierwsze.add(3);
        liczbyPierwsze.add(5);
        liczbyPierwsze.add(7);

        System.out.println(liczbyPierwsze);
        //liczbyPierwsze.remove(1);
        liczbyPierwsze.remove(Integer.valueOf(1));
        liczbyPierwsze.removeAll(List.of(1));
        System.out.println(liczbyPierwsze);


        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10));

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(numbers.get(i));
                i--;
            }
        }

        System.out.println(numbers);

        //!!! POWIEDZIEC O CONCURRENCT MODIFICATION EXCEPTION

        //Set - zbiór  - przechwouje unikatowe elementy

        Set<Integer> zbiorLiczb = new HashSet<>();
        zbiorLiczb.addAll(List.of(1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 34, 4, 4, 4));
        System.out.println(zbiorLiczb);
        System.out.println(zbiorLiczb.equals(zbiorLiczb));

        //HashSet,TreeSet,LinkedHashSet
        System.out.println();
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(32);
        hashSet.add(12);
        hashSet.add(43);
        hashSet.add(76);
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(32);
        linkedHashSet.add(12);
        linkedHashSet.add(43);
        linkedHashSet.add(76);
        linkedHashSet.add(null);
        Set<Integer> treeSet = new TreeSet<>(Comparator.nullsFirst(Comparator.naturalOrder()));
        treeSet.add(32);
        treeSet.add(12);
        treeSet.add(43);
        treeSet.add(76);
        treeSet.add(null);

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);

        //https://www.bigocheatsheet.com/
        System.out.println();
        List<String> imiona3 = new ArrayList<>();
        imiona3.add("Radek");
        imiona3.add("Marek");
        imiona3.add("Radek");
        imiona3.add("Marek");
        imiona3.add("Radek");
        imiona3.add("Marek");
        System.out.println(imiona3);

        Set<String> imiona4 = new HashSet<>();
        imiona4.add("Radek");
        imiona4.add("Marek");
        imiona3.add("Radek");
        imiona3.add("Marek");
        imiona3.add("Radek");
        imiona3.add("Marek");
        System.out.println(imiona4);

        System.out.println();

        List<Integer> numbers3 = new ArrayList<>(List.of(123, 43, 23, 12, 12, 43, 12, 43, 45, 54));

        for (int i = 0; i < numbers3.size(); i++) {
            if (numbers3.get(i) % 2 == 0) {
                numbers3.remove(numbers3.get(i));
                i--;
            }
        }
        System.out.println(numbers3);

        numbers3 = new ArrayList<>(List.of(123, 43, 23, 12, 12, 43, 12, 43, 45, 54));
        /*for (Integer i : numbers3) {
            if (i % 2 == 0) {
                numbers3.remove(i);
            }
        }
        System.out.println(numbers3);*/

        System.out.println("Lista liczb");
        System.out.println(numbers3);
        numbers3 = new ArrayList(List.of(123, 43, 23, 12, 12, 43, 12, 43, 45, 54));
        Iterator<Integer> iterator = numbers3.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers3);

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(123);
        System.out.println(arrayList);
        List<Integer> asList = Arrays.asList(123, 43, 123); //lisa o stalym rozmiarze
        //asList.add(123); //java.lang.UnsupportedOperationException
        asList.set(0, 999);
        System.out.println(asList);
        List<Integer> listOf = List.of(123, 43, 123);//lista niemodyfikowalna
        //listOf.add(321);//java.lang.UnsupportedOperationException
        //listOf.set(0, 123);//java.lang.UnsupportedOperationException

        List<Integer> numbers5 = new ArrayList<>(List.of(123, 43, 23, 1, 43, 54, 453, 3, 1));
        numbers5.add(41);
        numbers5.add(43);
        System.out.println(numbers5);


        //FIFO - first in first out
        Queue<String> kolejkaDoKasy = new LinkedList<>();
        kolejkaDoKasy.add("Kasia");
        kolejkaDoKasy.add("Basia");
        kolejkaDoKasy.add("Ala");
        System.out.println(kolejkaDoKasy);
        System.out.println(kolejkaDoKasy.peek()); //podjerzy 1 element ale go nie usinie
        System.out.println(kolejkaDoKasy);
        String pierwszaOsoba = kolejkaDoKasy.poll();
        System.out.println(pierwszaOsoba); //zwroci 1 element i usunie go z kolejki
        System.out.println(kolejkaDoKasy);
        kolejkaDoKasy.remove(); // to samo co poll tylko rzuci wyjatkiem(bledem) gdy kolejka jest pusta
        kolejkaDoKasy.element();// to samo co peek tylko rzuci wyjatkiem(bledem) gdy kolejka jest pusta
        kolejkaDoKasy.offer("Zaneta"); //sprawdza czy element sie miesci w kolejce (czy mozemy go dodac)

        //LIFO - last in first out
        Stack<Integer> numbersStack = new Stack<>();
        numbersStack.push(123);
        numbersStack.push(555);
        numbersStack.push(356);
        System.out.println(numbersStack);
        System.out.println(numbersStack.get(1));
        System.out.println(numbersStack.peek());
        System.out.println(numbersStack.pop()); //to samo co poll w kolejce - zwroci 1 element i go usunie
        System.out.println(numbersStack.search(555));

        //https://www.bigocheatsheet.com/
    }
}
