package com.java.course.com.lesson54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Dziecko {
    private String imie;
    private List<Slodycz> slodycze = new ArrayList<>();

    public Dziecko(String imie) {
        this.imie = imie;
    }

    // znajdz pierwsze dziecko które ma przynajmniej 2 slodycze
    public static Dziecko pierwszeDzieckoZ3Slodyczami(List<Dziecko> dzieci) {
        Dziecko dzieckoZ3Slodyczami = null;
        for (Dziecko dziecko : dzieci) {
            if (dziecko.getSlodycze().size() >= 3) {
                dzieckoZ3Slodyczami = dziecko;
                break;
            }
        }
        return dzieckoZ3Slodyczami;
    }

    public static Optional<Dziecko> pierwszeDzieckoZ3SlodyczamiV2(List<Dziecko> dzieci) {
        return Optional.ofNullable(dzieci)
                .orElse(Collections.emptyList())
                .stream()
                .filter(dziecko -> dziecko.getSlodycze().size() >= 3)
                .findFirst();
    }

    // sprawdz czy ktorekolwiek dziecko ma gume
    public static boolean sprawdzCzyMaTenSlodycz(List<Dziecko> dzieci, Slodycz slodycz) {
        for (Dziecko dziecko : dzieci) {
            if (dziecko.getSlodycze().contains(slodycz)) {
                return true;
            }
        }
        return false;
    }

    public static boolean sprawdzCzyMaTenSlodyczV2(List<Dziecko> dzieci, Slodycz slodycz) {
        return dzieci.stream()
                .anyMatch(d -> d.getSlodycze().contains(slodycz));
    }

    public void dodajSlodycz(Slodycz slodycz) {
        slodycze.add(slodycz);
        slodycz.getDzieci().add(this);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public List<Slodycz> getSlodycze() {
        return slodycze;
    }

    public void setSlodycze(List<Slodycz> slodycze) {
        this.slodycze = slodycze;
    }

    @Override
    public String toString() {
        return "Dziecko{" +
                "imie='" + imie + '\'' +
                ", slodycze=" + slodycze +
                '}';
    }
}
