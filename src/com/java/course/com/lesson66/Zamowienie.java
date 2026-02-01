package com.java.course.com.lesson66;

import com.java.course.com.lesson66.poprawka.PrzedzialCenowy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zamowienie {
    private LocalDate data;
    private double cena;

    public Zamowienie(LocalDate data, double cena) {
        this.data = data;
        this.cena = cena;
    }

    public static List<Zamowienie> posegregowanaWPrzedziałachCenowychZamowien(List<Zamowienie> lista) {
        List<Zamowienie> male = new ArrayList<>();
        List<Zamowienie> srednie = new ArrayList<>();
        List<Zamowienie> duze = new ArrayList<>();
        for (Zamowienie zamowienie : lista) {
            if (zamowienie.getCena() <= 200) {
                male.add(zamowienie);
            } else if (zamowienie.getCena() < 500 ) {
                srednie.add(zamowienie);
            } else {
                duze.add(zamowienie);
            }
        }
        List<Zamowienie> wynik = new ArrayList<>();
        wynik.addAll(male);
        wynik.addAll(srednie);
        wynik.addAll(duze);

        return wynik;
    }

    //[0-200][z1,z2,z3,z4]  [201-500][z5,z6,z6]
    //zamowineie = 400zl
    //przedzial[200-500]
    public static Map<PrzedzialCenowy, List<Zamowienie>>posegregowanaWPrzedziałachCenowychZamowien2(List<Zamowienie> listaZamowien, List<PrzedzialCenowy> listaPrzedzialuCenowego) {
        Map<PrzedzialCenowy,List<Zamowienie>> mapa = new HashMap<>();
        for (PrzedzialCenowy cena : listaPrzedzialuCenowego) {
            for (Zamowienie zamowienie : listaZamowien) {
                if (zamowienie.getCena() >= cena.getCenaOd() && zamowienie.getCena() <= cena.getCenaDo()) {
                    List<Zamowienie> lista = mapa.get(cena);
                    //1. Czy ten przedzial cenowy ma juz liste zamowiein?
                    //2. jezeli tak to dodajez zamowienie do listy
                    //3. jezeli nie to tworzysz nowa liste i dodajesz do niej zamowienei
                    if (lista == null) {
                        lista = new ArrayList<>();
                        mapa.put(cena, lista);
                    }

                    lista.add(zamowienie);
                }
            }
        }
        return mapa;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "data=" + data +
                ", cena=" + cena +
                '}';
    }
}
