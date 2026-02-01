package com.java.course.com.lesson52.zadanie;

import java.util.*;
import java.util.stream.Collectors;

public class Apartment {
    /*
Stworz klase Apartment(metraz,cena za metr, pietro, ilosc pokoi) + liste udogodnien (balkon,patio,...)
napisz funkcje
- znajdz najdrozsze mieszaknie
- najtansze mieszkanie
- oblicz srednia cene za metr mieszkan
- zwroc wszystkie mieszakania dostepne za okreslona kwote np. 1 000 000
- zwroc mieszkania po podaenj liscie udogodnien
-pogrupuj mieszkania po pietrac
- *** pogrupuj mieszkania po cenie za metr od-do
[5000-7000] - mieszkania
[7001-1000] - mieszkania
 */
    private String nameOfApartment;
    private double size;
    private double price;
    private int floor;
    private int numbersOfRooms;
    private List<Facilities> facilitiesList;

    public Apartment(String nameOfApartment, double size, double price, int floor, int numbersOfRooms, List<Facilities> facilitiesList) {
        this.nameOfApartment = nameOfApartment;
        this.size = size;
        this.price = price;
        this.floor = floor;
        this.numbersOfRooms = numbersOfRooms;
        this.facilitiesList = facilitiesList;
    }

    //pricePerMSq
    public double pricePerMSq() {
        return this.getPrice() / this.getSize();
    }

    //znajdz najdrozsze mieszaknie
    public static Apartment findMoustExpensiveApartment(List<Apartment> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingDouble(Apartment::getPrice))
                .orElseThrow();
    }

    //znajdz najtansze mieszkanie
    public static Apartment findCheapestApartment(List<Apartment> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparingDouble(Apartment::getPrice))
                .orElse(null);
    }

    //oblicz srednia cene za metr mieszkan
    public static double calculateAveragePricePerMeter(List<Apartment> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .mapToDouble(Apartment::getPrice)
                .average()
                .orElse(0);
    }

    //zwroc wszystkie mieszakania dostepne za okreslona kwote np. 1 000 000
    public static List<Apartment> apartmentsSpecifiedPreis(List<Apartment> list, double preis) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(apartment -> apartment.getPrice() <= preis)
                .toList();
    }

    //zwroc mieszkania po podaenj liscie udogodnien
    public static List<Apartment> apartmentsWithFacilities(List<Apartment> apartments, List<Facilities> facilities) {
        return Optional.ofNullable(apartments)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(apartment -> apartment.getFacilitiesList().containsAll(facilities))
                .toList();
    }

    //pogrupuj mieszkania po pietrach
    public static Map<Integer, List<Apartment>> groupApartmentsByFloor(List<Apartment> apartments) {
        return Optional.ofNullable(apartments)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(
                        apartment -> apartment.getFloor()
                ));
    }

    //pogrupuj mieszkania po cenie za metr od-do
    //[5000-7000] - mieszkania
    //[7001-1000] - mieszkania
    public static Map<String, List<Apartment>> groupApartmentsByPricePerSquareMeter(List<Apartment> apartments) {
        return Optional.ofNullable(apartments)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(
                        apartment -> {
                            double pricePerSquareMeter = apartment.getPrice() / apartment.getSize();
                            if (pricePerSquareMeter >= 0 && pricePerSquareMeter <= 4999) {
                                return "[0-5000]";
                            } else if (pricePerSquareMeter >= 5000 && pricePerSquareMeter <= 7000) {
                                return "[5000-7000]";
                            } else if (pricePerSquareMeter >= 7001 && pricePerSquareMeter <= 10000) {
                                return "[7001-10000]";
                            } else {
                                return "[10001+]";
                            }
                        }));
    }

    //0,1000,1001,2000
    //-13131,3444,0,1222,4444,10000000,-55454454
    //[[0,1000],[1001,2000]]
    public static Map<PriceRange, List<Apartment>> groupApartmentsByPricePerSquareMeterV2(List<Apartment> apartments, List<PriceRange> priceRanges) {
        if (apartments == null || priceRanges == null) {
            return Collections.emptyMap();
        }
        return Optional.ofNullable(apartments)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(
                        apartment -> {
                            double pricePerSquareMeter = apartment.pricePerMSq();
                            //na podstawie priceRanges trzeba znalezc range ktoremu odpowiada cena danego apartamentu i go zwrocic
                            for (PriceRange priceRange : priceRanges) {
                                if (pricePerSquareMeter >= priceRange.getFrom() && pricePerSquareMeter <= priceRange.getTo()) {
                                    return priceRange;
                                }
                            }
                            return null;
                        }));
    }


    public String getNameOfApartment() {
        return nameOfApartment;
    }

    public void setNameOfApartment(String nameOfApartment) {
        this.nameOfApartment = nameOfApartment;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumbersOfRooms() {
        return numbersOfRooms;
    }

    public void setNumbersOfRooms(int numbersOfRooms) {
        this.numbersOfRooms = numbersOfRooms;
    }

    public List<Facilities> getFacilitiesList() {
        return facilitiesList;
    }

    public void setFacilitiesList(List<Facilities> facilitiesList) {
        this.facilitiesList = facilitiesList;
    }

    @Override
    public String toString() {
        return nameOfApartment + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", floor=" + floor +
                ", numbersOfRooms=" + numbersOfRooms +
                ", facilitiesList=" + facilitiesList +
                ", pricePerM2="+ pricePerMSq()+
                ';';
    }
}
