package com.java.course.com.lesson12;

import java.util.*;

public class ZadaniaZArrayList {
    public static void main(String[] args) {
        //1. Stworz liste imion i wypisz jej zawartosc - zrobione
        List<String> imiona = new ArrayList<>();
        imiona.add("Radek");
        imiona.add("Marek");
        imiona.add("Ola");
        System.out.println(imiona);

        //2. Stworz zbior imion i wypisz jego zawartosc - zrobione
        Set<String> imiona2 = new HashSet<>();
        imiona2.add("Radek");
        imiona2.add("Michał");
        imiona2.add("Łukasz");
        System.out.println(imiona2);

        //3. Stworz mape imion i nazwisk i wypisz jej zawartosc - zrobione
        Map<String, String> imionaINazwiska = new HashMap<>();
        imionaINazwiska.put("Radek", "Błauciak");
        imionaINazwiska.put("Marek", "Kowalski");
        imionaINazwiska.put("Michał", "Nowak");
        System.out.println(imionaINazwiska);

        System.out.println();

        //1. Napisz metode ktora policzy ile jest 10tek w liscie intow - zle
        System.out.println("Zadnie 1:");
        List<Integer> liczby = new ArrayList<>();
        liczby.add(10);
        liczby.add(5);
        liczby.add(20);
        liczby.add(50);
        int licznik10 = 0;
        for (int i = 0; i < liczby.size(); i++) {
            if ((liczby.get(i) % 10) == 0) {
                licznik10++;
            }
            System.out.println(licznik10);
        }

        System.out.println();

        //2. Napisz metode ktora sprawdzi czy lista intow zawiera podana liczbe - zrobione
        System.out.println("Zadanie 2:");
        List<Integer> listaIntow = new ArrayList<>();
        listaIntow.add(15);
        listaIntow.add(169);
        listaIntow.add(45);
        listaIntow.add(33);
        listaIntow.add(12);
        System.out.println(listaIntow.contains(13) + " Lista Intow zawiera liczbe 13.");
        System.out.println(listaIntow.contains(12) + " Lista Intow zawiera liczbe 12.");

        System.out.println();

        //3. Napisz metode ktora sprawdzi czy lista intow zawiera tylko parzyste liczby - zle
        System.out.println("Zadnie 3:");
        List<Integer> listaIntow3 = new ArrayList<>();
        listaIntow3.add(15);
        listaIntow3.add(169);
        listaIntow3.add(45);
        listaIntow3.add(33);
        listaIntow3.add(12);
        System.out.println(listaIntow3);
        for (int i = 0; i < listaIntow3.size(); i++) {
            if (listaIntow3.get(i) % 3 == 0) {
                System.out.println("Lista zawiera tylko nieparzyste liczby");
            } else if (listaIntow3.get(i) % 2 == 0) {
                System.out.println("Lista zawiera tylko parzyste liczby");
            }
        }


        /*//4. Napisz metode ktora sprawdzi czy lista intow zawiera tylko liczby podzielne przez 3
        System.out.println("Zadnie 4:");
        List<Integer> listaIntow4 = new ArrayList<>();
        listaIntow4.add(15);
        listaIntow4.add(169);
        listaIntow4.add(45);
        listaIntow4.add(33);
        listaIntow4.add(12);
        for (int i = 0; i < listaIntow4.size(); i++) {
            if (listaIntow4.get(i) / 3 == 0) {
            }
            System.out.println(listaIntow4.get(i));
        }

         */

        //5. Napisz metode ktora sprawdzi czy lista intow zawiera tylko liczby podzielne przez 3 i 5

        //6. Napisz metode ktora sprawdzi czy lista intow zawiera tylko liczby podzielne przez 3 lub 5

        //7. Napisz metode ktora zwroci posortowana liste liczb nie zmieniajac oryginalnej listy - zrobione
        System.out.println("Zadanie 7:");
        List<Integer> losoweLiczby = new ArrayList<>();
        losoweLiczby.add(5);
        losoweLiczby.add(225);
        losoweLiczby.add(15);
        losoweLiczby.add(99);
        System.out.println(losoweLiczby);
        Collections.sort(losoweLiczby);
        System.out.println("Posortowana lista" + losoweLiczby);
        System.out.println();

        //8. Napisz metode ktora zwroci liste liczb w odwrotnej kolejnosci nie zmieniajac oryginalnej listy - zrobione
        System.out.println("Zadanie 8:");
        List<Integer> losoweLiczby2 = new ArrayList<>();
        losoweLiczby2.add(5);
        losoweLiczby2.add(225);
        losoweLiczby2.add(15);
        losoweLiczby2.add(99);
        System.out.println(losoweLiczby2);
        Collections.reverse(losoweLiczby2);
        System.out.println("Odworcona lista" + losoweLiczby2);
        System.out.println();

        //9. Napisz metode ktora zwroci liste liczb bez duplikatow nie zmieniajac oryginalnej listy - cos jest zle
        System.out.println("Zadanie 9:");
        List<Integer> bezDuplikatow = new ArrayList<>(List.of(123, 123, 44, 555, 666, 666, 77, 77, 7));
        System.out.println("Lista: " + bezDuplikatow);
        for (int i = 0; i < bezDuplikatow.size(); i++) {
            bezDuplikatow.remove(bezDuplikatow.get(i));
            i--;
        }
        System.out.println("Lista bez duplikatow: " + bezDuplikatow);
        System.out.println();



        //10. Napisz metode ktora przyjmie 3 listy intow, doda do siebie elementy z pierwszej i drugiej listy i pomnozy przez elementy z trzeciej listy
        System.out.println("Zadanie 10:");
        List<Integer> lista1 = new ArrayList<>(List.of(123, 43, 23, 1, 43, 54, 453, 3, 1));
        List<Integer> lista2 = new ArrayList<>(List.of(123, 43, 223, 13, 4233, 54, 453, 3, 1));
        List<Integer> lista3 = new ArrayList<>(List.of(2, 3, 4));
        int licznik1 = 0;
        int licznik2 = 0;
        for (int i = 0; i < lista1.size(); i++) {
            licznik1 += lista1.get(i);
        }
        System.out.println("Suma liczb listy 1 = " + licznik1);
        for (int i = 0; i < lista2.size(); i++) {
            licznik2 += lista2.get(i);
        }
        System.out.println("Suma liczb listy 2 = " + licznik2);
        System.out.println("Suma 2 list = " + (licznik1 + licznik2));
        int tablica3 = (licznik1 + licznik2);
        for (int i = 1; i < lista3.size(); i++) {
            tablica3 *= i;
        }
        System.out.println("suma 3 tablicy = " + tablica3);
        System.out.println();

        /*//11. Napisz metode ktora obliczy ile jest slow dluzszych niz 5 znakow w liscie stringow -sprawdzic
        System.out.println("Zadanie 11:");
        List<String> listaSlow = new ArrayList<>();
        listaSlow.add("Radek");
        listaSlow.add("Marek");
        listaSlow.add("Miłosz");
        listaSlow.add("Arkadiusz");
        listaSlow.add("Aleksandra");
        int licznikSlow = 0;
        for (int i = 0; i < listaSlow.size(); i++ ) {
            if (Integer.parseInt(listaSlow.get(i)) > 5) {
                licznikSlow++;
            }
        }
        System.out.println(licznikSlow);

         */




        //12. Stwórz metodę, która zwraca najmniejszą liczbę z listy intów. - zrobione
        System.out.println("Zadanie 12:");
        List<Integer> lista4 = new ArrayList<>(List.of(123, 43, 23, 1, 43, 54, 453, 3, 2));
        int min = lista4.get(0);
        for (int i = 0; i < lista4.size(); i++) {
            if (lista4.get(i) < min) {
                min = lista4.get(i);
            }
        }
        System.out.println("Najmniejsza liczba z lity intow to = " + min);
        System.out.println();

        /*//13. Stwórz metodę, która znajduje największe słowo w liście stringów. - sprawdzic
        System.out.println("Zadanie 13:");
        List<String> listaSlow2 = new ArrayList<>();
        listaSlow2.add("Radek");
        listaSlow2.add("Marek");
        listaSlow2.add("Miłosz");
        listaSlow2.add("Arkadiusz");
        listaSlow2.add("Aleksandra");
        System.out.println(listaSlow2);
        Integer najwiekszeSlowo = Integer.parseInt(listaSlow2.get(0));
        for (int i = 0; i < listaSlow2.size(); i++) {
            if (Integer.parseInt((listaSlow2.get(i))) > najwiekszeSlowo) {
                najwiekszeSlowo = Integer.parseInt((listaSlow2.get(i)));
            }
        }
        System.out.println("Najwieksze słowo to = " + najwiekszeSlowo);

         */





        //14. Stwórz metodę, która sprawdza, czy wszystkie słowa w liście stringów zaczynają się od wielkiej litery. - nie zrobione
        System.out.println("Zadanie 14:");
        List<String> listaSlow3 = new ArrayList<>();
        listaSlow3.add("Radek");
        listaSlow3.add("Marek");
        listaSlow3.add("miłosz");
        listaSlow3.add("arkadiusz");
        listaSlow3.add("Aleksandra");
        System.out.println(listaSlow3);
        for (int i = 0; i < listaSlow3.size(); i++) {
            if (listaSlow3.get(i).equals(listaSlow3.get(i))) ;
        }
        System.out.println(listaSlow3);

        //15. Stwórz metodę, która zwraca sumę wszystkich liczb w liście intów. - zrobione
        System.out.println("Zadanie 15:");
        List<Integer> listaLiczb = new ArrayList<>();
        listaLiczb.add(5);
        listaLiczb.add(10);
        listaLiczb.add(13);
        Integer suma = 0;
        for (int i = 0; i < listaLiczb.size(); i++) {
            suma += listaLiczb.get(i);
        }
        System.out.println("Suma liczb z listy intow to = " + suma);
        System.out.println();

        //16. Stwórz metodę, która przyjmuje listę stringów i zwraca te same stringi, ale z odwróconą kolejnością liter. - Zrobione
        System.out.println("Zadanie 16:");
        List<String> odwroconaLista= new ArrayList<>();
        odwroconaLista.add("Radek");
        odwroconaLista.add("Marek");
        odwroconaLista.add("miłosz");
        odwroconaLista.add("arkadiusz");
        odwroconaLista.add("Aleksandra");
        Collections.reverse(odwroconaLista);
        System.out.println("Odwrocona lista Stringow: " + odwroconaLista);
        System.out.println();

        //17. Stwórz metodę, która znajduje średnią wartość liczb w liście intów. - Zrobione
        System.out.println("Zadanie 17:");
        List<Integer> sredniaWartosc = new ArrayList<>();
        sredniaWartosc.add(5);
        sredniaWartosc.add(10);
        sredniaWartosc.add(4);
        sredniaWartosc.add(13);
        Integer srednia = 0;
        for (int i = 0; i < sredniaWartosc.size(); i++) {
            srednia += sredniaWartosc.get(i);
        }
        System.out.println("Srednia wartosc liczb z listy = " + (srednia / sredniaWartosc.size()));
        System.out.println();

        /*//18. Stwórz metodę, która zwraca listę stringów bez słów krótszych niż 3 znaki. - do sprawdzenia
        List<String> listaString2= new ArrayList<>();
        listaString2.add("Radek");
        listaString2.add("Marek");
        listaString2.add("Miłosz");
        listaString2.add("Ola");
        for (int i = 0; i < listaString2.size(); i++) {
            if (Integer.valueOf(listaString2.get(i)) > 3);
        }
        System.out.println("Lista Stringow wieksza niz 3 znaki" + listaString2);
         */

        /*//19. Stwórz metodę, która zwraca listę intów, gdzie każda liczba jest podniesiona do kwadratu. - sprawdzic
        System.out.println("Zadanie 19:");
        List<Integer> liczbyDoKwadratu = new ArrayList<>();
        liczbyDoKwadratu.add(5);
        liczbyDoKwadratu.add(10);
        liczbyDoKwadratu.add(4);
        liczbyDoKwadratu.add(13);
        for (int i = 0; i < liczbyDoKwadratu.size(); i++) {
            liczbyDoKwadratu.get(i) = (liczbyDoKwadratu.get(i) * 2);
        }
        System.out.println("Liczby do kwadratu to " + liczbyDoKwadratu);

         */

        //20. Stwórz metodę, która przyjmuje dwie listy stringów i zwraca listę tych stringów, które występują w obu listach.
        System.out.println("Zadanie 20:");
        List<String> listaString10= new ArrayList<>();
        listaString10.add("Radek");
        listaString10.add("Marek");
        listaString10.add("Miłosz");
        listaString10.add("Ola");

        List<String> listaString20= new ArrayList<>();
        listaString20.add("Radek");
        listaString20.add("Marek");
        listaString20.add("Michał");
        listaString20.add("Darek");



        //21. Stwórz metodę, która sprawdzi, czy dana lista intów jest posortowana rosnąco. - Zrobione
        System.out.println("Zadanie 21:");
        List<Integer> listaRosnaca = new ArrayList<>();
        listaRosnaca.add(5);
        listaRosnaca.add(10);
        listaRosnaca.add(4);
        listaRosnaca.add(13);
        Collections.sort(listaRosnaca);
        System.out.println("Posrtowana lista" + listaRosnaca);

        //22. Stworz metode, ktora przyjmie liste stringow i wypisze najdluzszy wspolny prefix - nie zrobione
        List<String> listaPrefixow = new ArrayList<>();
        listaPrefixow.add("kot");
        listaPrefixow.add("kotek");
        listaPrefixow.add("kotlet");

        /*//23. Stwórz metodę, która sprawdza, czy dana lista intów jest palindromem
        List<String> palidrom = new ArrayList<>();
        palidrom.add("kajak");
        Integer lewy = 0;
        Integer prawy = palidrom.size() - 1;
        while (lewy < prawy) {
            if (palidrom.wait(lewy) != palidrom.)
        }

         */


        //1. Napisz metode ktora sprawdzi czy zbior zawiera podana liczbe - zrobione
        System.out.println("Zadanie 1 z Set:");
        Set<Integer> podanaLiczba = new HashSet<>();
        podanaLiczba.add(2);
        podanaLiczba.add(6);
        podanaLiczba.add(89);
        podanaLiczba.add(22);
        System.out.println(podanaLiczba.contains(22));
        System.out.println();

        /*//2. Napisz metode ktora sprawdzi czy zbior zawiera tylko liczby parzyste
        System.out.println("Zadanie 2 z Set:");
        Set<Integer> parzyste = new HashSet<>();
        parzyste.add(2);
        parzyste.add(6);
        parzyste.add(11);
        parzyste.add(22);
        parzyste.add(13);
        parzyste.add(66);
        for (int i = 0; i < parzyste.size(); i++) {
            if (parzyste.get(i) % 2 == 0)
                System.out.println("Zawiera tylko liczby parzyste");
        } else if {
            System.out.println("Lista zawiera liczby nieparzyste.");
        }
         */

        /*//3. Oblicz sume wszystkich liczb w zbiorze
        System.out.println("Zadanie 3 z Set:");
        Set<Integer> sumaSet = new HashSet<>();
        sumaSet.add(2);
        sumaSet.add(6);
        sumaSet.add(11);
        sumaSet.add(22);
        sumaSet.add(13);
        sumaSet.add(66);
        Integer sumaLiczb3 = 0;
        for (int i = 0; i < sumaSet.size(); i++) {
            sumaLiczb3 += I;
        }
        System.out.println("Suma lity Set = " + sumaLiczb3);

         */

        //9. Z listy stringow zwroc liste tylko unikalnych stringow - zrobione
        System.out.println("Zadanie 9:");
        Set<String> uniaklne = new HashSet<>();
        uniaklne.add("Radek");
        uniaklne.add("Radek");
        uniaklne.add("Radek");
        uniaklne.add("Ola");
        uniaklne.add("Ola");
        uniaklne.add("Ola");
        uniaklne.add("Marek");
        uniaklne.add("Darek");
        uniaklne.add("Marek");
        uniaklne.add("Michal");
        uniaklne.add("Antoni");
        System.out.println(uniaklne);
        System.out.println();

        //1. Napisz metode ktora sprawdzi czy mapa zawiera podany klucz - zrobione
        System.out.println("Zadanie 1 Mapa:");
        Map<String, String> mapa = new HashMap<>();
        mapa.put("Radek", "Błauciak");
        mapa.put("Marek", "Kowalski");
        mapa.put("Michal", "Nowak");
        mapa.put("Darek", "Wiadro");
        mapa.put("Dominik", "Kowalczyk");
        System.out.println("Czy mapa zawiera klucz Radek - " + mapa.containsKey("Radek"));
        System.out.println();

        //2. Napisz metode ktora sprawdzi czy mapa zawiera podana wartosc
        System.out.println("Zadanie 2 Mapa:");
        Map<String, String> mapa2 = new HashMap<>();
        mapa2.put("Radek", "Błauciak");
        mapa2.put("Marek", "Kowalski");
        mapa2.put("Michal", "Nowak");
        mapa2.put("Darek", "Wiadro");
        mapa2.put("Dominik", "Kowalczyk");
        System.out.println("Czy mapa zawiera wartosc Kowalski - " + mapa2.containsValue("Kowalski"));
        System.out.println();

        /*//3. Napisz metode ktora sprawdzi czy mapa zawiera tylko klucze podzielne przez 3
        System.out.println("Zadanie 3 Mapa:");
        Map<Integer, Integer> map3 = new HashMap<>();
        map3.put(3, 2);
        map3.put(4, 5);
        map3.put(3, 6);
        map3.put(3, 1);
        for (int i = 0; i < map3.size(); i++) {
            if ( map3.get(i) / 3 == 0);
            System.out.println(map3.containsKey(i));
        }

         */

    }
}
