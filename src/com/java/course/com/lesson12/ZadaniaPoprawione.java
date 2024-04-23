package com.java.course.com.lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZadaniaPoprawione {
    public static void main(String[] args) {
        //1. Napisz metode ktora policzy ile jest 10tek w liscie intow - zrobione
        //2. Napisz metode ktora sprawdzi czy lista intow zawiera podana liczbe - zrobione
        //3. Napisz metode ktora sprawdzi czy lista intow zawiera tylko parzyste liczby - chyba zle zrobione
        //4. Napisz metode ktora sprawdzi czy lista intow zawiera tylko liczby podzielne przez 3 - ZLE
        //5. Napisz metode ktora sprawdzi czy lista intow zawiera tylko liczby podzielne przez 3 i 5 - nie zrobione
        //6. Napisz metode ktora sprawdzi czy lista intow zawiera tylko liczby podzielne przez 3 lub 5 - nie zrobione
        //7. Napisz metode ktora zwroci posortowana liste liczb nie zmieniajac oryginalnej listy - zrobione
        //8. Napisz metode ktora zwroci liste liczb w odwrotnej kolejnosci nie zmieniajac oryginalnej listy - zrobione
        //9. Napisz metode ktora zwroci liste liczb bez duplikatow nie zmieniajac oryginalnej listy - zle
        //10. Napisz metode ktora przyjmie 3 listy intow, doda do siebie elementy  z pierwszek i drugiej listy i pomnozy przez elementy z trzeciej listy - zrobione
        //11. Napisz metode ktora obliczy ile jest slow dluzszych niz 5 znakow w liscie stringow - zrobione
        //12. Stwórz metodę, która zwraca najmniejszą liczbę z listy intów. - zrobione
        //13. Stwórz metodę, która znajduje największe słowo w liście stringów. - zle
        //14. Stwórz metodę, która sprawdza, czy wszystkie słowa w liście stringów zaczynają się od wielkiej litery. - do zrobienia
        //15. Stwórz metodę, która zwraca sumę wszystkich liczb w liście intów. - zrobione
        //16. Stwórz metodę, która przyjmuje listę stringów i zwraca te same stringi, ale z odwróconą kolejnością liter. - zle zrobione
        //17. Stwórz metodę, która znajduje średnią wartość liczb w liście intów. - zrobione
        //18. Stwórz metodę, która zwraca listę stringów bez słów krótszych niż 3 znaki. - zrobione
        //19. Stwórz metodę, która zwraca listę intów, gdzie każda liczba jest podniesiona do kwadratu. - zrobione
        //20. Stwórz metodę, która przyjmuje dwie listy stringów i zwraca listę tych stringów, które występują w obu listach. - zrobione
        //21. Stwórz metodę, która sprawdzi, czy dana lista intów jest posortowana rosnąco. - zle zrobione
        //22. Stworz metode, ktora przyjmie liste stringow i wypisze najdluzszy wspolny prefix - nie wiem
        //np. dla listy {"kot", "kotek", "kotlet"} wypisze "kot"
        //23. Stwórz metodę, która sprawdza, czy dana lista intów jest palindromem (tj. czy czytana od przodu i od tyłu jest taka sama).
        //25. Stwórz metodę, która znajdzie wszystkie pary liczb w liście intów, których suma jest równa podanej liczbie.
        //28. Stwórz metodę, która oblicza najkrótszą ścieżkę w labiryncie reprezentowanym jako macierz 2D.

        //1. Napisz metode ktora policzy ile jest 10tek w liscie intow
        System.out.println("Zadanie 1:");
        List<Integer> lista10tek = new ArrayList<>();
        lista10tek.add(10);
        lista10tek.add(100);
        lista10tek.add(20);
        lista10tek.add(30);
        lista10tek.add(1);
        lista10tek.add(7);
        lista10tek.add(5);
        lista10tek.add(11);
        lista10tek.add(12);
        System.out.println("Liczba dzisiatek w lisiecie = " + dziesiatki(lista10tek));
        System.out.println();


        //2. Napisz metode ktora sprawdzi czy lista intow zawiera podana liczbe
        System.out.println("Zadanie 2:");
        List<Integer> podanaLiczba = new ArrayList<>();
        podanaLiczba.add(10);
        podanaLiczba.add(1);
        podanaLiczba.add(7);
        podanaLiczba.add(5);
        podanaLiczba.add(11);
        podanaLiczba.add(12);
        System.out.println("Lista zawiera liczbe 2? Odpowiedz to: " + liczbaZListy(podanaLiczba, 2));
        System.out.println();

        //3. Napisz metode ktora sprawdzi czy lista intow zawiera tylko parzyste liczby
        System.out.println("Zadanie 3:");
        List<Integer> listaParzysta = new ArrayList<>();
        listaParzysta.add(10);
        listaParzysta.add(2);
        listaParzysta.add(4);
        listaParzysta.add(6);
        listaParzysta.add(8);
        listaParzysta.add(12);
        System.out.println("Czy lista zawiera tylko parzyste liczby? Odpowiedz: " + parzyste(listaParzysta));
        System.out.println();

        //4. Napisz metode ktora sprawdzi czy lista intow zawiera tylko liczby podzielne przez 3
        System.out.println("Zadanie 4:");
        List<Integer> podzielnePrzezTrzy = new ArrayList<>();
        podzielnePrzezTrzy.add(9);
        podzielnePrzezTrzy.add(3);
        podzielnePrzezTrzy.add(7);
        podzielnePrzezTrzy.add(5);
        podzielnePrzezTrzy.add(11);
        podzielnePrzezTrzy.add(4);
        System.out.println("Czy lista zawiera tylko liczby podzielne przez 3? Odpowiedz: ");//+ podzielnePrzez3(podzielnePrzezTrzy));
        System.out.println();

        //5. Napisz metode ktora sprawdzi czy lista intow zawiera tylko liczby podzielne przez 3 i 5

        //7. Napisz metode ktora zwroci posortowana liste liczb nie zmieniajac oryginalnej listy
        System.out.println("Zadanie 7:");
        List<Integer> posortowanaLista = new ArrayList<>();
        posortowanaLista.add(9);
        posortowanaLista.add(3);
        posortowanaLista.add(7);
        posortowanaLista.add(5);
        posortowanaLista.add(99);
        posortowanaLista.add(12);
        System.out.println("Oryginalna lista = " + posortowanaLista);
        System.out.println("Posortowana lista = " + sortowanieListy(posortowanaLista));
        System.out.println();

        //8. Napisz metode ktora zwroci liste liczb w odwrotnej kolejnosci nie zmieniajac oryginalnej listy
        System.out.println("Zadanie 8:");
        List<Integer> odwrotne = new ArrayList<>();
        odwrotne.add(9);
        odwrotne.add(3);
        odwrotne.add(7);
        odwrotne.add(5);
        odwrotne.add(99);
        odwrotne.add(12);
        System.out.println("Oryginalna lista = " + odwrotne);
        System.out.println("Odwrocona lista = " + odwrotnaLista(odwrotne));
        System.out.println();

        //9. Napisz metode ktora zwroci liste liczb bez duplikatow nie zmieniajac oryginalnej listy
        System.out.println("Zadanie 9:");
        List<Integer> duplikaty = new ArrayList<>();
        duplikaty.add(9);
        duplikaty.add(9);
        duplikaty.add(3);
        duplikaty.add(7);
        duplikaty.add(5);
        duplikaty.add(5);
        duplikaty.add(5);
        duplikaty.add(99);
        duplikaty.add(12);
        System.out.println("Oryginalna lista = " + duplikaty);
        System.out.println("Lista bez duplikatow = " + bezDuplikatow(duplikaty));
        System.out.println();

        //10. Napisz metode ktora przyjmie 3 listy intow, doda do siebie elementy  z pierwszek i drugiej listy i pomnozy przez elementy z trzeciej listy
        /*
        1,2,3
        1,2,3
        1,2,3

        [1+1*1,2+2*2..]
         */
        List<Integer> listaIntow1 = new ArrayList<>(List.of(123, 43, 23, 1, 43, 54, 3, 1));
        List<Integer> listaIntow2 = new ArrayList<>(List.of(12, 34, 3, 1, 403, 548, 2, 1));
        List<Integer> listaIntow3 = new ArrayList<>(List.of(10, 4, 5, 6, 7, 8));
        System.out.println("Pomozone elementy: " + dodawanieIMnozenie(listaIntow1, listaIntow2, listaIntow3));
        System.out.println();

        //11. Napisz metode ktora obliczy ile jest slow dluzszych niz 5 znakow w liscie stringow
        System.out.println("Zadanie 11:");
        List<String> listaStringow1 = new ArrayList<>();
        listaStringow1.add("Radek");
        listaStringow1.add("Aleksandra");
        listaStringow1.add("Bartłomiej");
        listaStringow1.add("Marek");
        System.out.println("Lista stringow" + listaStringow1);
        System.out.println("Ilosc slow dluzszych niz 5: " + slowaWiekszeNiz5(listaStringow1));
        System.out.println();


        //12. Stwórz metodę, która zwraca najmniejszą liczbę z listy intów.
        System.out.println("Zadanie 12:");
        List<Integer> najmniejszaLiczba = new ArrayList<>();
        najmniejszaLiczba.add(9);
        najmniejszaLiczba.add(15);
        najmniejszaLiczba.add(3);
        najmniejszaLiczba.add(7);
        najmniejszaLiczba.add(11);
        najmniejszaLiczba.add(12);
        najmniejszaLiczba.add(5);
        najmniejszaLiczba.add(99);
        najmniejszaLiczba.add(33);
        System.out.println("Lista" + najmniejszaLiczba);
        System.out.println("Najmniejszy element z listy = " + najmniejszaLiczba(najmniejszaLiczba));
        System.out.println();

        //13. Stwórz metodę, która znajduje największe słowo w liście stringów.
        System.out.println("Zadanie 13:");
        List<String> listaStringow2 = new ArrayList<>();
        listaStringow2.add("Radek");
        listaStringow2.add("Aleksandra");
        listaStringow2.add("Damian");
        listaStringow2.add("Marek");
        System.out.println("Lista stringow" + listaStringow2);
        System.out.println("Najwieksze slowo z listy = " + najwiekszeSlowo(listaStringow2));
        System.out.println();


        //14. Stwórz metodę, która sprawdza, czy wszystkie słowa w liście stringów zaczynają się od wielkiej litery.
        System.out.println("Zadanie 14:");
        List<String> listaStringow3 = new ArrayList<>();
        listaStringow3.add("Radek");
        listaStringow3.add("aleksandra");
        listaStringow3.add("damian");
        listaStringow3.add("marek");
        System.out.println("Lista stringow" + listaStringow3);
        System.out.println();

        //15. Stwórz metodę, która zwraca sumę wszystkich liczb w liście intów.
        System.out.println("Zadanie 15:");
        List<Integer> sumaLiczb = new ArrayList<>();
        sumaLiczb.add(9);
        sumaLiczb.add(15);
        sumaLiczb.add(3);
        sumaLiczb.add(7);
        sumaLiczb.add(11);
        sumaLiczb.add(12);
        sumaLiczb.add(5);
        sumaLiczb.add(99);
        sumaLiczb.add(33);
        System.out.println("Lista = " + sumaLiczb);
        System.out.println("Suma intow z listy = " + sumaIntow(sumaLiczb));
        System.out.println();

        //16. Stwórz metodę, która przyjmuje listę stringów i zwraca te same stringi, ale z odwróconą kolejnością liter.
        System.out.println("Zadanie 16:");
        List<String> listaStringow4 = new ArrayList<>();
        listaStringow4.add("Radek"); // kedar
        listaStringow4.add("aleksandra"); // ardnaskela
        listaStringow4.add("damian"); // naimad
        listaStringow4.add("marek"); // keram
        System.out.println("Lista stringow: " + listaStringow4);
        System.out.println("Odwroca lista stringow: " + odwroconeStringi(listaStringow4));
        System.out.println();

        //17. Stwórz metodę, która znajduje średnią wartość liczb w liście intów.
        System.out.println("Zadanie 17:");
        List<Integer> srednia = new ArrayList<>();
        srednia.add(9);
        srednia.add(15);
        srednia.add(3);
        srednia.add(7);
        srednia.add(11);
        srednia.add(12);
        srednia.add(5);
        srednia.add(99);
        srednia.add(33);
        System.out.println("Liczby z listy" + srednia + " Srednia liczb z listy = " + sredniaIntow(srednia));
        System.out.println();

        //18. Stwórz metodę, która zwraca listę stringów bez słów krótszych niż 3 znaki.
        System.out.println("Zadanie 18:");
        List<String> listaStringow5 = new ArrayList<>();
        listaStringow5.add("Ja");
        listaStringow5.add("Ola");
        listaStringow5.add("Ty");
        listaStringow5.add("Rower");
        listaStringow5.add("Kredki");
        System.out.println("Lista Stringow = " + listaStringow5);
        System.out.println("Lista Stringow bez slow krotszych niz 3 znaki = " + wyrazyWiekszeOd(listaStringow5));
        System.out.println();

        //19. Stwórz metodę, która zwraca listę intów, gdzie każda liczba jest podniesiona do kwadratu.
        System.out.println("Zadanie 19:");
        List<Integer> kwadratLiczby = new ArrayList<>();
        kwadratLiczby.add(9);
        kwadratLiczby.add(15);
        kwadratLiczby.add(3);
        kwadratLiczby.add(7);
        System.out.println("Liczby z listy = " + kwadratLiczby);
        System.out.println("Liczby z listy podniesione do kwadratu = " + doKwadratu(kwadratLiczby));
        System.out.println();

        //20. Stwórz metodę, która przyjmuje dwie listy stringów i zwraca listę tych stringów, które występują w obu listach.
        System.out.println("Zadanie 20:");
        List<String> listaStringow6 = new ArrayList<>(List.of("Radek", "Ola", "Rower", "Auto"));
        List<String> listaStringow7 = new ArrayList<>(List.of("Marek", "Michal", "Rower", "Auto"));
        System.out.println("Lista nr1: " + listaStringow6 + " i lista nr2: " + listaStringow7);
        System.out.println("Elementy wspolne dla obu list: " + wspolnyElement(listaStringow6, listaStringow7));
        System.out.println();

        //21. Stwórz metodę, która sprawdzi, czy dana lista intów jest posortowana rosnąco.
        System.out.println("Zadanie 20:");
        List<Integer> posortowaneRosnaco = new ArrayList<>();
        posortowaneRosnaco.add(3);
        posortowaneRosnaco.add(7);
        posortowaneRosnaco.add(9);
        posortowaneRosnaco.add(15);
        System.out.println("Lista intow = " + posortowaneRosnaco);
        System.out.println("Czy dana lista jest posortowana rosnaco? Odp. : " + sortowanie(posortowaneRosnaco));
        System.out.println();

        //22. Stworz metode, ktora przyjmie liste stringow i wypisze najdluzszy wspolny prefix
        //np. dla listy {"kot", "kotek", "kotlet"} wypisze "kot"
        System.out.println("Zadanie 22:");
        List<String> listaStringow8 = new ArrayList<>();
        listaStringow8.add("kot");
        listaStringow8.add("kotek");
        listaStringow8.add("kotlet");
        System.out.println("Lista :" + listaStringow8);
        System.out.println("Wspolna prefix dla stringow z listy to : ");
        System.out.println();

        //25. Stwórz metodę, która znajdzie wszystkie pary liczb w liście intów, których suma jest równa podanej liczbie.
        System.out.println("Zadanie 25:");
        List<Integer> suma2liczb = new ArrayList<>();
        suma2liczb.add(3);
        suma2liczb.add(7);
        suma2liczb.add(9);
        suma2liczb.add(15);
        suma2liczb.add(15);
        suma2liczb.add(15);
        suma2liczb.add(15);
        suma2liczb.add(15);
        System.out.println("Lista into do zadania 25: " + suma2liczb);
        System.out.println("Liczby z listy rowne liczbie 30: " + suma2liczb);
        System.out.println();


    }

    //Metoda do Zadania NR1: policzy ile jest 10tek w liscie intow
    public static int dziesiatki(List<Integer> dziesiatki) {
        int licznik10 = 0;
        for (int liczby : dziesiatki) {
            if (liczby == 10) {
                licznik10++;
            }
        }
        return licznik10;
    }

    public static int dziesiatki(List<Integer> dziesiatki, int n) {
        int licznik10 = 0;
        for (int liczby : dziesiatki) {
            if (liczby == n) {
                licznik10++;
            }
        }
        return licznik10;
    }

    //Metoda do Zadania NR2: czy lista intow zawiera podana liczbe
    public static boolean liczbaZListy(List<Integer> taLiczba, int n) {
        return taLiczba.contains(n);
    }

    //Metoda do Zadania NR3: zawiera tylko parzyste liczby
    public static boolean parzyste(List<Integer> liczby) {
        for (int i = 0; i < liczby.size(); i++) { ///2,4,5,10,7
            if (liczby.get(i) % 2 != 0) {
                return false;
            }
        }
        return true;
    }


    /*//Metoda do Zadania NR4: liczby podzielne przez 3
    public static boolean podzielnePrzez3(List<Integer> liczby) {
        boolean lista1;
        for (int i = 0; i < liczby.size(); i++) {
            if (liczby.get(i) / 3 == 0) {
                lista1 = true;
            } else {
                lista1 = false;
            }
        }
        return lista1;
    }

     */


    //Metoda do Zadania NR7: sortowanie liczb
    public static List<Integer> sortowanieListy(List<Integer> liczby) {
        List<Integer> kopia = new ArrayList<>(liczby);
        Collections.sort(kopia);
        return kopia;
    }

    //Metoda do Zadania NR8: odwrotnaLista
    public static List<Integer> odwrotnaLista(List<Integer> liczby) {
        List<Integer> kopia = new ArrayList<>(liczby);
        Collections.reverse(kopia);
        return kopia;
    }

    //Metoda do Zadania NR9: lista bez duplikatow
    public static List<Integer> bezDuplikatow(List<Integer> liczby) { //1,2,3,4
        List<Integer> nowaLista = new ArrayList<>();
        for (int i = 0; i < liczby.size(); i++) {
            if (liczby.get(i) == (liczby.get(i))) {
                liczby.remove(liczby.get(i));
            }
        }
        return liczby;
    }

    //Metoda do Zadania NR10: doda do siebie elementy  z pierwszek i drugiej listy i pomnozy przez elementy z trzeciej listy
    //
    public static List<Integer> dodawanieIMnozenie(List<Integer> liczby1, List<Integer> liczby2, List<Integer> liczby3) {
        List<Integer> lista = new ArrayList<>();
        double suma1 = 0;
        double suma2 = 0;
        for (int i = 0; i < liczby1.size(); i++) {
            suma1 += liczby1.get(i);
        }
        for (int i = 0; i < liczby2.size(); i++) {
            suma2 += liczby2.get(i);
        }
        double suma3 = suma1 + suma2;
        for (int i = 0; i < liczby3.size(); i++) {
            lista.add((int) (liczby3.get(i) * suma3));
        }
        return lista;
    }

    //Metoda do Zadania NR11: Napisz metode ktora obliczy ile jest slow dluzszych niz 5 znakow w liscie stringow
    public static int slowaWiekszeNiz5(List<String> slowa) {
        int licznikSlow = 0;
        int wiekszeOd = 5;
        for (int i = 0; i < slowa.size(); i++) {
            if (slowa.get(i).length() > wiekszeOd) {
                licznikSlow++;
            }
        }
        return licznikSlow;
    }

    //Metoda do Zadania NR12: zwraca najmniejszą liczbę z listy intów.
    public static int najmniejszaLiczba(List<Integer> najmniejsza) {
        //Collections.min()
        int min = najmniejsza.get(0);
        for (int i = 0; i < najmniejsza.size(); i++) {
            if (najmniejsza.get(i) < min) {
                min = najmniejsza.get(i);
            }
        }
        return min;
    }


    //Metoda do Zadania NR13: znajduje największe słowo w liście stringów.
    public static String najwiekszeSlowo(List<String> slowo) {
        String max = slowo.get(0);
        for (int i = 0; i < slowo.size(); i++) {
            if (slowo.get(i).length() > max.length()) {
                max = slowo.get(i);
            }
        }
        return max;
    }

    //Metoda do Zadania NR15: zwraca sumę wszystkich liczb w liście intów.
    public static int sumaIntow(List<Integer> liczby) {
        int suma = 0;
        for (int i = 0; i < liczby.size(); i++) {
            suma += liczby.get(i);
        }
        return suma;
    }

    //Metoda do Zadania NR16: przyjmuje listę stringów i zwraca te same stringi, ale z odwróconą kolejnością liter.
    public static List<String> odwroconeStringi(List<String> slowa) {
        List<String> nowa = new ArrayList<>();
        for (int i = slowa.size() - 1; i >= 0; i--) {
            nowa.add(slowa.get(i));
        }
        return nowa;
    }

    //Metoda do zadania NR17: średnia wartość liczb w liście intów.
    public static double sredniaIntow(List<Integer> liczby) {
        double suma = 0;
        for (int i = 0; i < liczby.size(); i++) {
            suma += liczby.get(i);
        }
        return suma / liczby.size();
    }

    //Metoda do zadania NR18: zwraca listę stringów bez słów krótszych niż 3 znaki
    public static List<String> wyrazyWiekszeOd(List<String> wyrazy) {
        List<String> nowaLista = new ArrayList<>();
        int min = 2;
        for (int i = 0; i < wyrazy.size(); i++) {
            if (wyrazy.get(i).length() > min) {
                nowaLista.add(wyrazy.get(i));
            }
        }
        return nowaLista;
    }

    //Metoda do zadania NR19: zwraca listę intów, gdzie każda liczba jest podniesiona do kwadratu.
    public static List<Integer> doKwadratu(List<Integer> liczby) {
        List<Integer> nowaLista = new ArrayList<>();
        for (int i = 0; i < liczby.size(); i++) {
            nowaLista.add(liczby.get(i) * 2);
        }
        return nowaLista;
    }

    //Metoda do zadania NR20: przyjmuje dwie listy stringów i zwraca listę tych stringów, które występują w obu listach.
    public static List<String> wspolnyElement(List<String> lista1, List<String> lista2) {
        List<String> nowaWspolneElementy = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            if (lista1.get(i).equals(lista2.get(i))) {
                nowaWspolneElementy.add(lista1.get(i));
            }
        }
        return nowaWspolneElementy;
    }

    //Metoda do zadania NR20: sprawdzi, czy dana lista intów jest posortowana rosnąco.
    public static boolean sortowanie(List<Integer> liczby) {
        for (int i = 0; i < liczby.size(); i++) {
            boolean posortowane = i++ > i;
            boolean niePosortowane = i++ < i;
            if (liczby.get(i) < liczby.get(i) + 1) {
                return posortowane;
            } else {
                return niePosortowane;
            }
        }
        return sortowanie(liczby);
    }

    /*//Metoda do Zadania NR21: przyjmie liste stringow i wypisze najdluzszy wspolny prefix
    //np. dla listy {"kot", "kotek", "kotlet"} wypisze "kot"
    public static List<String> prefixy(List<String> string) {
        for (int i = 0; i < string.size(); i++) {
            for (int a = 1; a < string.get(i).length(); a++) {
                if (string.get(i).toCharArray() == string.get(i).toCharArray());
            }
        }
        return prefixy(string);
    }
     */

    //Metoda do zadania NR25: wszystkie pary liczb w liście intów, których suma jest równa podanej liczbie.
    public static List<Integer> suma2liczb(List<Integer> liczby) {
        int suma = 30;
        List<Integer> nowaLista = new ArrayList<>();
        for (int i = 0; i < liczby.size(); i++) {
            if (liczby.get(i) + liczby.get(i) == suma) {
                nowaLista.add(liczby.get(i));
            }
        }
        return nowaLista;
    }


}






