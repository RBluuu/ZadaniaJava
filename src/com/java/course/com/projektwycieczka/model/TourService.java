package com.java.course.com.projektwycieczka.model;

public class TourService {
    private final RegisteredCustomer registeredCustomer;

    private final ServiceEmployee employee;

    public TourService(RegisteredCustomer registeredCustomer, ServiceEmployee employee) {
        this.registeredCustomer = registeredCustomer;
        this.employee = employee;
        employee.getTripService().add(this);
        registeredCustomer.getTripService().add(this);
        //info zwrotne
    }

    public RegisteredCustomer getRegisteredCustomer() {
        return registeredCustomer;
    }

    public ServiceEmployee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "TourService{" +
                "registeredCustomer=" + registeredCustomer +
                ", employee=" + employee +
                '}';
    }
}
