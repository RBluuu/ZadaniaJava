package com.java.course.com.lesson40.zadanie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String firstName;
    private String lastName;
    private String PIN;
    private String sex;

    public Person(String firstName, String lastName, String PIN, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PIN = PIN;
        this.sex = sex;
    }

    //1) Sprawdz czy pesel jest poprawny - czy sklada sie z 11 znakow, samych cyfr itp
    //public static boolean checkPESEL(Person person)
    public static List<Person> checkPersonPIN(List<Person> personList) {
        List<Person> newList = new ArrayList<>();
        String regexForPIN = "^\\d{11}$";
        Pattern patternForPIN = Pattern.compile(regexForPIN);
        for (Person person : personList) {
            if (patternForPIN.matcher(person.PIN).matches()) {
                newList.add(person);
            }
        }
        return newList;
    }

    //2)Sprawdz czy pesel odpowiada podanej płci
    public static Person checkPersonSex(Person person) {
        String regexForSex = "^\\d{8}(1|3|5|7|9)\\d{2}$" ;
        Pattern patternForSex = Pattern.compile(regexForSex);
        if (patternForSex.matcher(person.PIN).matches()) {
            System.out.println("Pesel odpowiada mezczyznie");
        } else {
            System.out.println("Pesel odpowiada kobiecie");
        }
        return person;
    }

    //3) Napisz metody które zwracaja z peselu date urodzenia (LocalDAte)
    public static LocalDate dateOfBirthday(Person person) {
        String regexDateOfBirthday = "^\\d{2}(\\d{2})(\\d{2})(\\d{2})$"; // 44444444
        //https://d-pt.ppstatic.pl/k/r/1/d2/5b/621405a25734e_p.jpg?1645479336
        Pattern patternDateOfBirthday = Pattern.compile(regexDateOfBirthday);
        Matcher matcher = patternDateOfBirthday.matcher(person.PIN);
        String year = person.getPIN().charAt(0) + (String.valueOf(person.getPIN().charAt(1))); //95
        if (matcher.matches()) {
            //String year = matcher.group(1);
            String month = matcher.group(2);
            String day = matcher.group(3);
            int yearInt = Integer.parseInt(year);
            if (yearInt >= 0 && yearInt <= 99) {
                year = (yearInt >= 20 ? "20" : "19") + year;
            }
            return LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        } else {
            throw new IllegalArgumentException("Invalid PIN.");
        }
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(PIN, person.PIN) && Objects.equals(sex, person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, PIN, sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", PIN='" + PIN + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
