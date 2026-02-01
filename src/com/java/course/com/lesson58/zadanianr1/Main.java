package com.java.course.com.lesson58.zadanianr1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Festiwal festiwal1 = new Festiwal("Open'er Festival", "Gdynia", LocalDate.of(2025, 7, 3));
        Festiwal festiwal2 = new Festiwal("OFF Festival", "Katowice", LocalDate.of(2025, 8, 2));
        Festiwal festiwal3 = new Festiwal("Audioriver", "Płock", LocalDate.of(2025, 7, 26));
        Festiwal festiwal4 = new Festiwal("Pol'and'Rock", "Czaplinek", LocalDate.of(2025, 8, 1));
        Festiwal festiwal5 = new Festiwal("Tauron Nowa Muzyka", "Katowice", LocalDate.of(2025, 6, 20));

        Koncert koncert1 = new Koncert("Dawid Podsiadło", "Pop", LocalDateTime.of(2025, 7, 3, 20, 0), 90, "Main Stage", 10);
        Koncert koncert2 = new Koncert("Sanah", "Pop", LocalDateTime.of(2025, 7, 3, 18, 30), 75, "Forest Stage", 9);
        Koncert koncert3 = new Koncert("Behemoth", "Metal", LocalDateTime.of(2025, 7, 4, 22, 0), 60, "Dark Stage", 8);
        Koncert koncert4 = new Koncert("Krzysztof Zalewski", "Rock", LocalDateTime.of(2025, 7, 4, 19, 0), 70, "Lake Stage", 7);
        Koncert koncert5 = new Koncert("Ralph Kaminski", "Alternative", LocalDateTime.of(2025, 7, 5, 21, 0), 80, "Main Stage", 9);
        Koncert koncert6 = new Koncert("Quebonafide", "Hip-Hop", LocalDateTime.of(2025, 7, 5, 23, 0), 60, "Rap Zone", 10);
        Koncert koncert7 = new Koncert("Męskie Granie Orkiestra", "Rock/Pop", LocalDateTime.of(2025, 7, 6, 20, 30), 100, "Main Stage", 10);
        Koncert koncert8 = new Koncert("Julia Wieniawa", "Pop", LocalDateTime.of(2025, 7, 6, 17, 0), 60, "Pop Arena", 6);
        Koncert koncert9 = new Koncert("Taco Hemingway", "Hip-Hop", LocalDateTime.of(2025, 7, 6, 22, 30), 75, "Rap Zone", 9);
        Koncert koncert10 = new Koncert("Brodka", "Pop", LocalDateTime.of(2025, 7, 7, 19, 30), 70, "Indie Stage", 8);


        festiwal1.addKoncert(koncert1);
        festiwal1.addKoncert(koncert2);
        festiwal1.addKoncert(koncert10);
        festiwal1.addKoncert(koncert8);

        festiwal2.addKoncert(koncert5);
        festiwal2.addKoncert(koncert1);

        festiwal3.addKoncert(koncert1);
        festiwal3.addKoncert(koncert3);
        festiwal3.addKoncert(koncert4);

        festiwal4.addKoncert(koncert6);
        festiwal4.addKoncert(koncert7);
        festiwal4.addKoncert(koncert9);

        festiwal5.addKoncert(koncert1);
        festiwal5.addKoncert(koncert3);
        festiwal5.addKoncert(koncert5);
        festiwal5.addKoncert(koncert7);
        festiwal5.addKoncert(koncert9);

        List<Festiwal> listaWszystkichFestiwali = new ArrayList<>(List.of(festiwal1,festiwal2,festiwal3,festiwal4,festiwal5));;
        List<Koncert> listaWszystkichKoncertow = new ArrayList<>(List.of(koncert1,koncert2,koncert3,koncert4,koncert5,koncert6,koncert7,koncert8,koncert9,koncert10));

        System.out.println(Koncert.wykonawcaLubScena(listaWszystkichKoncertow,"Dawid Podsiadło","Rap Zone"));
        System.out.println();

        System.out.println(Koncert.grupujWedlugSceny(listaWszystkichKoncertow));
        System.out.println();

        System.out.println("scena v2" + Koncert.grupujWedlugScenyV2(listaWszystkichKoncertow));
        System.out.println();

        System.out.println(Koncert.grupujWedlugDnia(listaWszystkichKoncertow));
        System.out.println();

        System.out.println("Wedlug dnia v2" + Koncert.grupujWedlugDniaV2(listaWszystkichKoncertow));
        System.out.println();

        System.out.println(Koncert.grupujWedlugGatunku(listaWszystkichKoncertow));
        System.out.println();

        System.out.println("Gatunek v2" + Koncert.grupujWedlugGatunkuV2(listaWszystkichKoncertow));
        System.out.println();

        System.out.println(Koncert.znajdzNajkrotszyKoncert(listaWszystkichKoncertow));
        System.out.println();

        System.out.println(Koncert.znajdzNajdluzszyKoncert(listaWszystkichKoncertow));
        System.out.println();

        System.out.println("Najdluzszy Koncert V2 " + Koncert.znajdzNajdluzszyKoncertV2(listaWszystkichKoncertow));
        System.out.println();

        System.out.println(Koncert.sortujKoncerty(listaWszystkichKoncertow,"czas"));
        System.out.println();
    }
}
