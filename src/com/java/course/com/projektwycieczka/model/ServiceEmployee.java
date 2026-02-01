package com.java.course.com.projektwycieczka.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceEmployee extends Employee {
    private int employeeRanking; //1.Kowalski,2 Nowak ---> Map<Integer,Pracownik>
    private Map<TourGuide, Integer> ranking = new HashMap<>();
    private List<BuyingTirp> trips;
    private List<TourService> tripService;

    public ServiceEmployee(String firstName, String lastName, String email, int phoneNumber, int minimumWage, TypeOfContract typeOfContract, int totalHoursWorked, int employeeRanking) {
        super(firstName, lastName, email, phoneNumber, minimumWage, typeOfContract, totalHoursWorked);
        this.employeeRanking = employeeRanking;
        this.trips = new ArrayList<>();
        this.tripService = new ArrayList<>();
    }

    public Map<TourGuide, Integer> addToRanking(TourGuide tourGuide, int assessment) {
        if (assessment < 1 || assessment > 5) {
            throw new IllegalArgumentException("The rating must be between 1 and 5.");
        }
        ranking.put(tourGuide, assessment);
        return ranking;
    }

    public List<TourService> getTripService() {
        return tripService;
    }

    public void setTripService(List<TourService> tripService) {
        this.tripService = tripService;
    }

    public Map<TourGuide, Integer> getRanking() {
        return ranking;
    }

    public void setRanking(Map<TourGuide, Integer> ranking) {
        this.ranking = ranking;
    }

    public List<BuyingTirp> getTrips() {
        return trips;
    }

    public void setTrips(List<BuyingTirp> trips) {
        this.trips = trips;
    }

    public int getEmployeeRanking() {
        return employeeRanking;
    }

    public void setEmployeeRanking(int employeeRanking) {
        this.employeeRanking = employeeRanking;
    }

    @Override
    public String toString() {
        return "ServiceEmployee{" +
                "employeeRanking=" + employeeRanking +
                ", ranking=" + ranking +
                ", trips=" + trips +
                ", tripService=" + tripService +
                '}';
    }
}
