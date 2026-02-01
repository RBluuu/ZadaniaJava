package com.java.course.com.lesson58.asocjacje.manytomanyattribute;

import java.time.LocalDateTime;

public class Visit {
    private LocalDateTime visitDate;
    private double visitPrice;
    private Doctor doctor;
    private Patient patient;

    public Visit(LocalDateTime visitDate, double visitPrice, Doctor doctor, Patient patient) {
        if (doctor == null || patient == null) {
            throw new IllegalArgumentException();
        }
        this.visitDate = visitDate;
        this.visitPrice = visitPrice;
        this.doctor = doctor;
        this.patient = patient;
        doctor.getVisits().add(this);
        patient.getVisits().add(this);
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }

    public double getVisitPrice() {
        return visitPrice;
    }

    public void setVisitPrice(double visitPrice) {
        this.visitPrice = visitPrice;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "visitDate=" + visitDate +
                ", visitPrice=" + visitPrice +
                ", doctor=" + doctor +
                ", patient=" + patient +
                '}';
    }
}
