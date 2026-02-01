package com.java.course.com.projektwycieczka.model;

import java.util.ArrayList;
import java.util.List;
//abstract
public abstract class Customer extends Person {
    private List<BuyingTirp> trips;

    public Customer(String firstName, String lastName, String email, int phoneNumber) {
        super(firstName, lastName, email, phoneNumber);
        this.trips = new ArrayList<>();
    }

    //Dodanie i usunięcie klienta zarejestrowanego
    public static List<RegisteredCustomer> dodawanieIUsuwanieKlientaZarejestrowanego(List<RegisteredCustomer> listaKlientow, RegisteredCustomer klient, String rodzajOperacji) {
        if (rodzajOperacji.equalsIgnoreCase("dodaj")) {
            if (listaKlientow.equals(klient)) {
                System.out.println("Klient już istnieje na liście.");
            } else {
                listaKlientow.add(klient);
                System.out.println("Klient został dodany.");
            }
        } else if (rodzajOperacji.equalsIgnoreCase("usun")) {
            if (listaKlientow.remove(klient)) {
                System.out.println("Klient został usunięty.");
            }
        }
        return listaKlientow;
    }

    public List<BuyingTirp> getTrips() {
        return trips;
    }

    public void setTrips(List<BuyingTirp> trips) {
        this.trips = trips;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "trips=" + trips +
                '}';
    }

}
