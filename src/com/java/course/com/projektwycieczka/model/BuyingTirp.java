package com.java.course.com.projektwycieczka.model;

import java.time.LocalDate;
import java.util.Objects;

//Obsluga Wycieczki (KlientZarejerstrowany)
public class BuyingTirp {
    //Zarejerstreoawny,Obsluga,Wycieczka po jednym  egzemplarzu

    private LocalDate dateOfTripFrom;
    private LocalDate dateOfTripTo;
    private final Trip trip;
    private final Customer customer;
    private ServiceEmployee serviceEmployee;

    public BuyingTirp(LocalDate dateOfTripFrom, LocalDate dateOfTripTo, Customer customer, Trip trip, ServiceEmployee serviceEmployee, TourService tourService, ServiceEmployee serviceEmployee1) {
        this.dateOfTripFrom = dateOfTripFrom;
        this.dateOfTripTo = dateOfTripTo;
        this.customer = Objects.requireNonNull(customer, "Klient nie moze byc nigdy null");
        this.trip = Objects.requireNonNull(trip,"Wycieczka nie moze byc null");
        this.serviceEmployee = serviceEmployee1;
        this.serviceEmployee = Objects.requireNonNull(serviceEmployee,"Pracownik obslugi nie moze byc null");
        customer.getTrips().add(this);
        trip.getListOfBuyingTrips().add(this);
        //serviceEmployee.getWycieczki().add(this);
    }

    public LocalDate dateOfTripFrom() {
        return dateOfTripFrom;
    }

    public void dateOfTripTo(LocalDate dataWycieczkiOdKiedyDoKiedy) {
        this.dateOfTripFrom = dataWycieczkiOdKiedyDoKiedy;
    }

    public Trip getTrip() {
        return trip;
    }

    public LocalDate getDateOfTripFrom() {
        return dateOfTripFrom;
    }

    public void setDateOfTripFrom(LocalDate dateOfTripFrom) {
        this.dateOfTripFrom = dateOfTripFrom;
    }

    public LocalDate getDateOfTripTo() {
        return dateOfTripTo;
    }

    public void setDateOfTripTo(LocalDate dateOfTripTo) {
        this.dateOfTripTo = dateOfTripTo;
    }

    public Customer getKlient() {
        return customer;
    }

    public ServiceEmployee getServiceEmployee() {
        return serviceEmployee;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "BuyingTirp{" +
                "dateOfTripFrom=" + dateOfTripFrom +
                ", dateOfTripTo=" + dateOfTripTo +
                ", trip=" + trip +
                ", customer=" + customer +
                ", serviceEmployee=" + serviceEmployee +
                '}';
    }
}
