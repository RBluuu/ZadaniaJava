package com.java.course.com.lesson28_29_30.mechanics.zadanienr2;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
KocieMamy(id, imie, rasa, dataUrodzenia, waga, wysokosc) mogą rodzić Kociątka(id, imie, rasa, dataUrodzenia, waga, wysokosc)
W pliku kociemamy.txt znajduje się lista kocich rodziców podana w formacie: id, imie, rasa, dataUrodzenia, waga, wysokosc
np.
1, Lusia, Brytyjska, 2016-04-15, 4, 55
2, Puszek, Syjamska, 2017-05-22, 6, 40
3, Burek, Maine Coon, 2016-03-11, 10, 70
4, Misiek, Ragdoll, 2016-06-18, 8, 65

W pliku kociatka.txt znajduje się lista kociąt podana w formacie: id, imie, rasa, dataUrodzenia, waga, wysokosc, mamaId
np.
1, Maluszek, Brytyjska, 2018-03-21, 2, 35, 1
2, Kuleczka, Syjamska, 2019-04-25, 3, 25, 2
3, Płateczek, Maine Coon, 2018-02-19, 5, 45, 3
4, Kłębek, Ragdoll, 2019-07-23, 4, 40, 4
5, Burasek, Maine Coon, 2019-08-05, 5, 50, 3
6, Lisek, Brytyjska, 2019-01-20, 2, 30, 1
7, Puchatek, Ragdoll, 2019-09-15, 6, 42, 4

-- Znajdź kocie mamy, ktore urodzily bliźnięta. - zrobione
-- Ile jest maluchów ważących poniżej 3 kg? - zrobione
-- Znajdź kocia mame, ktora miała najwięcej potomstwa od stycznia 2018 do stycznia 2019. - zrobione
-- Podaj imię i wagę najciężej kociej mamy. - zrobione
-- Podaj średnią wagę kociąt urodzonych w lipcu 2019. - zrobione

!!!
Kociatko nie moze istniec bez mamy
Asocjacje zawsze przeprowadzamy po calych obiektach a nie identyfikatorach
Kociatko powinno miec "cala Mame" jako obiekt a nie tylko idMatki
 */
        String error = ("Sprawdz prosze jeszcze raz....");
        File mamaCats = new File("src/com/java/course/com/lesson28_29_30/mechanics/zadanienr2/mamacat.txt");
        File smallCats = new File("src/com/java/course/com/lesson28_29_30/mechanics/zadanienr2/smallcats.txt");

        try (BufferedWriter mamaCat = new BufferedWriter(new FileWriter(mamaCats))) {
            mamaCat.write("1" + "," + "Lusia" + "," + "Brytyjska" + "," + "2016-04-15" + "," +  "4" + "," + "55");
            mamaCat.newLine();
            mamaCat.write("2" + "," + "Puszek" + "," + "Syjamska" + "," + "2017-05-22" + "," +  "6" + "," + "40");
            mamaCat.newLine();
            mamaCat.write("3" + "," + "Burek" + "," + "Maine Coon" + "," + "2016-03-11" + "," +  "10" + "," + "70");
            mamaCat.newLine();
            mamaCat.write("4" + "," + "Misiek" + "," + "Ragdoll" + "," + "2016-06-18" + "," +  "8" + "," + "65");
            mamaCat.newLine();
        }
        catch (IOException e) {
            System.out.println(error);
        }

        try(BufferedReader mamaCat = new BufferedReader(new FileReader(mamaCats))) {
            String line = null;
            while ((line = mamaCat.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(error);
        }
        System.out.println();

        try (BufferedWriter cats = new BufferedWriter(new FileWriter(smallCats))) {
            cats.write("1" + "," + "Maluszek" + "," + "Brytyjska" + "," + "2018-03-21" + "," + "2" + "," + "35" + "," + "1");
            cats.newLine();
            cats.write("2" + "," + "Kuleczka" + "," + "Syjamska" + "," + "2019-04-25" + "," + "3" + "," + "25" + "," + "2");
            cats.newLine();
            cats.write("3" + "," + "Płateczek" + "," + "Maine Coon" + "," + "2018-02-19" + "," + "5" + "," + "45" + "," + "3");
            cats.newLine();
            cats.write("4" + "," + "Kłębek" + "," + "Ragdoll" + "," + "2019-07-23" + "," + "4" + "," + "40" + "," + "4");
            cats.newLine();
            cats.write("5" + "," + "Burasek" + "," + "Maine Coon" + "," + "2019-08-05" + "," + "5" + "," + "50" + "," + "3");
            cats.newLine();
            cats.write("6" + "," + "Lisek" + "," + "Brytyjska" + "," + "2019-01-20" + "," + "2" + "," + "30" + "," + "1");
            cats.newLine();
            cats.write("7" + "," + "Puchatek" + "," + "Ragdoll" + "," + "2019-09-15" + "," + "6" + "," + "42" + "," + "4");
            cats.newLine();
        }
        catch (IOException e) {
            System.out.println(error);
        }

        try(BufferedReader cats = new BufferedReader(new FileReader(smallCats))) {
            String line = null;
            while ((line = cats.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(error);
        }
        System.out.println();

        MamaCat lusia = new MamaCat(1,"Lusia","Brytyjska", LocalDate.of(2016, Month.APRIL,15),4,55);
        MamaCat puszek = new MamaCat(2,"Puszek","Syjamska",LocalDate.of(2017,Month.MAY,22),6,40);
        MamaCat burek = new MamaCat(3,"Burek","Maine Coon",LocalDate.of(2016,Month.MARCH,11),10,70);
        MamaCat misiek = new MamaCat(4,"Misiek","Ragdoll",LocalDate.of(2016,Month.JUNE,18),8,65);

        SmallCat maluszek = new SmallCat(1,"Maluszek","Brytyjska",LocalDate.of(2018,Month.MARCH,21),2,35, "1",lusia);
        SmallCat kuleczka = new SmallCat(2,"Kuleczka","Syjamska",LocalDate.of(2019,Month.APRIL,25),3,25, "2",puszek);
        SmallCat plateczek = new SmallCat(3,"Płateczek","Maine Coon",LocalDate.of(2018,Month.FEBRUARY,19),5,45, "3",burek);
        SmallCat klebek = new SmallCat(4,"Kłębek","Ragdoll",LocalDate.of(2019,Month.JULY,23),4,40,"4", misiek);
        SmallCat burasek = new SmallCat(5,"Burasek","Maine Coon",LocalDate.of(2019,Month.AUGUST,5),5,50,"3",burek);
        SmallCat lisek = new SmallCat(6,"Lisek","Brytyjska",LocalDate.of(2019,Month.JANUARY,10),2,30,"1",lusia);
        SmallCat puchatek = new SmallCat(7,"Puchatek","Ragdoll",LocalDate.of(2019,Month.SEPTEMBER,15),6,42,"4",misiek);

        lusia.addChild(maluszek);
        lusia.addChild(null);
        lusia.addChild(lisek);

        puszek.addChild(kuleczka);

        burek.addChild(plateczek);
        burek.addChild(burasek);

        misiek.addChild(klebek);
        misiek.addChild(puchatek);

        System.out.println("DZIECI LUSI: " + lusia.getSmallCats().size());


        System.out.println("Ile jest maluchów ważących poniżej 3 kg: " + SmallCat.smallCatsUnder3KG(List.of(maluszek,kuleczka,plateczek,klebek,burasek,lisek,puchatek),3));
        System.out.println();

        System.out.println("Podaj imię i wagę najciężej kociej mamy: " + MamaCat.heaviestMamaCat(List.of(lusia,puszek,burek,misiek)));
        System.out.println();

        System.out.println("Podaj średnią wagę kociąt urodzonych w lipcu 2019: " + SmallCat.meanWeightSmallCatsAfterYear(List.of(maluszek,kuleczka,plateczek,klebek,burasek,lisek,puchatek),LocalDate.of(2019,7,1)));
        System.out.println();

        System.out.println("Znajdź kocia mame, ktora miała najwięcej potomstwa od stycznia 2018 do stycznia 2019: " + MamaCat.mostChildrenFromTo(List.of(lusia,puszek,burek,misiek),LocalDate.of(2018,1,1),LocalDate.of(2019,1,1)));
    }
}
