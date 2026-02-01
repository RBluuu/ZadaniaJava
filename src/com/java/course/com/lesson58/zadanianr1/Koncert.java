package com.java.course.com.lesson58.zadanianr1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Koncert {
   private String nazwaWykonacy;
   private String gatunekMuzyki;
   private LocalDateTime godzinaRozpoczecia;
   private int time;
   private String scena;
   private int poziomPoularnosci;

   private Festiwal festiwal;

    public Koncert(String nazwaWykonacy, String gatunekMuzyki, LocalDateTime godzinaRozpoczecia, int time, String scena, int poziomPoularnosci) {
        this.nazwaWykonacy = nazwaWykonacy;
        this.gatunekMuzyki = gatunekMuzyki;
        this.godzinaRozpoczecia = godzinaRozpoczecia;
        this.time = time;
        this.scena = scena;
        this.poziomPoularnosci = poziomPoularnosci;
    }

    //wyszukiwanie koncertów konkretnego wykonawcy lub na wybranej scenie,
    public static List<Koncert> wykonawcaLubScena(List<Koncert> koncerty,String wykonwaca, String rodzajSceny) {
        List<Koncert> lista = new ArrayList<>();
        for (Koncert koncert : koncerty) {
            if (koncert.getNazwaWykonacy().equals(wykonwaca)) {
                lista.add(koncert);
            } else if (koncert.getScena().equals(rodzajSceny)){
                lista.add(koncert);
            }
        }
        return lista;
    }

    // Wyszukiwanie koncertów konkretnego wykonawcy lub na wybranej scenie
    public static List<Koncert> wykonawcaLubScenaV3(List<Koncert> koncerty, String wykonawca, String rodzajSceny) {
        List<Koncert> lista = new ArrayList<>();
        for (Koncert koncert : koncerty) {
            boolean pasujeWykonawca = wykonawca != null && koncert.getNazwaWykonacy().equalsIgnoreCase(wykonawca);
            boolean pasujeScena = rodzajSceny != null && koncert.getScena().equalsIgnoreCase(rodzajSceny);
            if (pasujeWykonawca || pasujeScena) {
                lista.add(koncert);
            }
        }
        return lista;
    }

    public static List<Koncert> wykonawcaLubScenaV2(List<Koncert> koncerty, String wykonawca, String rodzajSceny) {
        //sprawdzanie nulli
        /*
        Optional.ofNullable(people)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
         */
        return koncerty.stream()
                .filter(k -> k.getNazwaWykonacy().equals(wykonawca) || k.getScena().equals(rodzajSceny))
                .collect(Collectors.toList());
    }

    public static List<Koncert> sortowanieKoncetow(List<Koncert> koncerty, Integer minimalnaDlugosc, Integer minimalnaPopularnosc, LocalDateTime poGodzinie, String gatunek) {
        return koncerty.stream()
                .filter(k -> minimalnaDlugosc == null || k.getTime() >= minimalnaDlugosc)
                .filter(k -> minimalnaPopularnosc == null || k.getPoziomPoularnosci() >= minimalnaPopularnosc)
                .filter(k -> poGodzinie == null || k.getGodzinaRozpoczecia().isAfter(poGodzinie))
                .filter(k -> gatunek == null || k.getGatunekMuzyki().equalsIgnoreCase(gatunek))
                .collect(Collectors.toList());
    }

    public static Map<String, List<Koncert>> grupujWedlugSceny(List<Koncert> koncerty) {
        return koncerty.stream()
                .collect(Collectors.groupingBy(Koncert::getScena));
    }


    public static Map<String, List<Koncert>> grupujWedlugScenyV2(List<Koncert> koncerty) {
        Map<String, List<Koncert>> map = new HashMap<>();
        for (Koncert koncert : koncerty) {
            String scena = koncert.getScena();
            map.computeIfAbsent(scena, k -> new ArrayList<>()).add(koncert);
        }
        return map;
    }

    public static Map<String, List<Koncert>> grupujWedlugGatunku(List<Koncert> koncerty) {
        return koncerty.stream()
                .collect(Collectors.groupingBy(Koncert::getGatunekMuzyki));
    }

    public static Map<String, List<Koncert>> grupujWedlugGatunkuV2(List<Koncert> koncerty) {
        Map<String, List<Koncert>> map = new HashMap<>();
        for (Koncert koncert : koncerty) {
            String gatunek = koncert.getGatunekMuzyki();
            map.computeIfAbsent(gatunek, k -> new ArrayList<>()).add(koncert);
        }
        return map;

    }

    public static Map<LocalDate, List<Koncert>> grupujWedlugDnia(List<Koncert> koncerty) {
        return koncerty.stream()
                .collect(Collectors.groupingBy(k -> k.getGodzinaRozpoczecia().toLocalDate()));
    }

    public static Map<LocalDate, List<Koncert>> grupujWedlugDniaV2(List<Koncert> koncerty) {
        Map<LocalDate, List<Koncert>> map = new HashMap<>();
        for (Koncert koncert : koncerty) {
            LocalDate date = koncert.getGodzinaRozpoczecia().toLocalDate();
            map.computeIfAbsent(date, k -> new ArrayList<>()).add(koncert);
        }
        return map;
    }

    public static Optional<Koncert> znajdzNajdluzszyKoncert(List<Koncert> koncerty) {
        return koncerty.stream()
                .max(Comparator.comparingInt(Koncert::getTime));
    }

    public static Optional<Koncert> znajdzNajdluzszyKoncertV2(List<Koncert> koncerty) {
        Koncert najdluzszyKoncert = null;
        int czas = 0;
        for (Koncert koncert : koncerty) {
            int czasKoncertu = koncert.getTime();
            if (czasKoncertu > czas) {
                czas = czasKoncertu;
                najdluzszyKoncert = koncert;
            }
        }
        return Optional.ofNullable(najdluzszyKoncert);
    }

    public static Optional<Koncert> znajdzNajkrotszyKoncert(List<Koncert> koncerty) {
        return koncerty.stream()
                .min(Comparator.comparingInt(Koncert::getTime));
    }

    public static List<Koncert> sortujKoncerty(List<Koncert> koncerty, String kryterium) { //,Comparator<Koncert> comparator1
        Comparator<Koncert> comparator;

        switch (kryterium.toLowerCase()) {
            case "czas":
                comparator = Comparator.comparing(Koncert::getGodzinaRozpoczecia);
                break;
            case "nazwa":
                comparator = Comparator.comparing(Koncert::getNazwaWykonacy, String.CASE_INSENSITIVE_ORDER);
                break;
            case "popularnosc":
                comparator = Comparator.comparingInt(Koncert::getPoziomPoularnosci).reversed();
                break;
            default:
                throw new IllegalArgumentException("Nieznane kryterium sortowania: " + kryterium);
        }

        return koncerty.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    public String getNazwaWykonacy() {
        return nazwaWykonacy;
    }

    public void setNazwaWykonacy(String nazwaWykonacy) {
        this.nazwaWykonacy = nazwaWykonacy;
    }

    public String getGatunekMuzyki() {
        return gatunekMuzyki;
    }

    public void setGatunekMuzyki(String gatunekMuzyki) {
        this.gatunekMuzyki = gatunekMuzyki;
    }

    public LocalDateTime getGodzinaRozpoczecia() {
        return godzinaRozpoczecia;
    }

    public void setGodzinaRozpoczecia(LocalDateTime godzinaRozpoczecia) {
        this.godzinaRozpoczecia = godzinaRozpoczecia;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getScena() {
        return scena;
    }

    public void setScena(String scena) {
        this.scena = scena;
    }

    public int getPoziomPoularnosci() {
        return poziomPoularnosci;
    }

    public void setPoziomPoularnosci(int poziomPoularnosci) {
        this.poziomPoularnosci = poziomPoularnosci;
    }

    public Festiwal getFestiwal() {
        return festiwal;
    }

    public void setFestiwal(Festiwal festiwal) {
        this.festiwal = festiwal;
    }

    @Override
    public String toString() {
        return "Koncert{" +
                "nazwaWykonacy='" + nazwaWykonacy + '\'' +
                ", gatunekMuzyki='" + gatunekMuzyki + '\'' +
                ", godzinaRozpoczecia=" + godzinaRozpoczecia +
                ", time=" + time +
                ", scena='" + scena + '\'' +
                ", poziomPoularnosci=" + poziomPoularnosci +
                '}';
    }
}
