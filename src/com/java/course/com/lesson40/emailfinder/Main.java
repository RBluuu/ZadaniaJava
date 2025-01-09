package com.java.course.com.lesson40.emailfinder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*
        1. Stworzyc poprawny regex
        2. przejsc text linijka po linijce
        3. sprawdzicz czy w linijce jest cos co pasuje do regexa
        4. wyciagnac i zapisac
         */
        /*String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern emailPattern = Pattern.compile(emailRegex);

        try (
                BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Radek\\JavaPodstawy\\src\\com\\java\\course\\com\\lesson40\\emailfinder\\message.txt")))
        ) {

            String line;
            while ((line=reader.readLine()) != null){
                Matcher matcher = emailPattern.matcher(line);
                while (matcher.find()){
                    String emailFound = matcher.group();
                    System.out.println(emailFound);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */

        //Zadanie nr1:
        //stwórz pattern na imie
        // stwórz pattern na imie i nazwisko

        String regexForFirstName = "^[A-Z][a-z]*$";
        Pattern firstNamePattern = Pattern.compile(regexForFirstName);

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Radek\\JavaPodstawy\\src\\com\\java\\course\\com\\lesson40\\emailfinder\\message.txt"))) {
            String line;
            while ((line=reader.readLine()) != null){
                Matcher matcher = firstNamePattern.matcher(line);
                while (matcher.find()){
                    String firstNameFound = matcher.group();
                    System.out.println(firstNameFound);
                }
            }
            System.out.println("koniec zadania imie");
            System.out.println();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String regexForFirstNameAndLastName = "^[A-Z][a-z]* [A-Z][a-z]*$";
        Pattern firstNameAndLastNamePattern = Pattern.compile(regexForFirstNameAndLastName);
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Radek\\JavaPodstawy\\src\\com\\java\\course\\com\\lesson40\\emailfinder\\message.txt")))) {
            String line;
            while ((line=reader.readLine()) != null){
                Matcher matcher = firstNameAndLastNamePattern.matcher(line);
                while (matcher.find()){
                    String firstNameAndLastNamePatternFound = matcher.group();
                    System.out.println(firstNameAndLastNamePatternFound);
                }
            }
            System.out.println("koniec zadania imie i nazwisko");
            System.out.println();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Zadanie nr2:
        //napisz pattern na datę w postaci xx-xx-xxxx uzyj grup i nazw
        String regexForDate = "^(?<day>0[1-9]|[12][0-9]|3[01])-(?<month>0[1-9]|1[0-2])-(?<year>\\d{4})$";
        Pattern patternForDate = Pattern.compile(regexForDate);
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Radek\\JavaPodstawy\\src\\com\\java\\course\\com\\lesson40\\emailfinder\\message.txt")))) {
            String line;
            while ((line=reader.readLine()) != null){
                Matcher matcher = patternForDate.matcher(line);
                while (matcher.find()){
                    String dateFound = matcher.group();
                    System.out.println(dateFound);
                }
            }
            System.out.println("koniec zadania z datami");
            System.out.println();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Zadanie nr6.
        //napisz pattern na miasto np Warszawa, Bielsko-Biala, Zielona Gora
        String regexForCity = "^[A-Z][a-z]*(?: [A-Z][a-z]*)*(?:-[A-Z][a-z]*)*$";
        Pattern patternCity = Pattern.compile(regexForCity);
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Radek\\JavaPodstawy\\src\\com\\java\\course\\com\\lesson40\\emailfinder\\message.txt")))) {
            String line;
            while ((line=reader.readLine()) != null){
                Matcher matcher = patternCity.matcher(line);
                while (matcher.find()){
                    String cityFound = matcher.group();
                    System.out.println(cityFound);
                }
            }
            System.out.println("koniec zadania z miastami");
            System.out.println();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();


        //Zadanie z nr domu
        //* sprawdz czy numer domu jest w formacie numer\numer.
        //* Poprawnym numerem jest 123\2A, 24B\3 czy 12\5, ale już numer abc\cba nie,
        String regexForNumberOfHome = "^\\d+[A-Za-z]?(\\\\d+[A-Za-z]?)?$";
        Pattern patternForNumberOfHome = Pattern.compile(regexForNumberOfHome);
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Radek\\JavaPodstawy\\src\\com\\java\\course\\com\\lesson40\\emailfinder\\message.txt")))) {
            String line;
            while ((line=reader.readLine()) != null){
                Matcher matcher = patternForNumberOfHome.matcher(line);
                while (matcher.find()){
                    String foundNumber = matcher.group();
                    System.out.println(foundNumber);
                }
            }
            System.out.println("koniec zadania z numerem domu");
            System.out.println();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();


        //Zadanie z kodem pocztowym
        //Stworz jakis plik txt z ChatGPT i z niego wyciagnij wszystkie poprawne kody pocztowe (XX-XXX)
        String regexForZipCode = "\\d{2}-\\d{3}";
        Pattern patternForZipCode = Pattern.compile(regexForZipCode);
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Radek\\JavaPodstawy\\src\\com\\java\\course\\com\\lesson40\\emailfinder\\message.txt")))) {
            String line;
            while ((line=reader.readLine()) != null){
                Matcher matcher = patternForZipCode.matcher(line);
                while (matcher.find()){
                    String foundZipCode = matcher.group();
                    System.out.println(foundZipCode);
                }
            }
            System.out.println("koniec zadania z numerem kodem pocztowym");
            System.out.println();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        //Zadanie z kursem walut
        String kursy = "{\"rates\":{\"CAD\":1.5563,\"HKD\":9.1212,\"ISK\":162.6,\"PHP\":57.324,\"DKK\":7.4441,\"HUF\":350.68,\"CZK\":26.083,\"AUD\":1.6442,"
                + "\"RON\":4.8405,\"SEK\":10.363,\"IDR\":17383.99,\"INR\":88.198,\"BRL\":6.5908,\"RUB\":87.735,\"HRK\":7.5243,\"JPY\":124.53,\"THB\":37.161,"
                + "\"CHF\":1.0744,\"SGD\":1.6131,\"PLN\":4.3979,\"BGN\":1.9558,\"TRY\":8.5925,\"CNY\":8.1483,\"NOK\":10.5913,\"NZD\":1.8045,\"ZAR\":20.2977,"
                + "\"USD\":1.1769,\"MXN\":26.066,\"ILS\":4.0029,\"GBP\":0.89755,\"KRW\":1403.15,\"MYR\":4.9194},\"base\":\"EUR\",\"date\":\"2020-08-21\"}";
        System.out.println("Podaj kwote jaka chcesz wymienić:");
        Scanner scannerIlosci = new Scanner(System.in);
        System.out.println("Podaj walute jaka chcesz wymienić");
        Scanner scannerWaluty = new Scanner(System.in);



    }

    /*public static String kator(Integer ilosc, String waluta) {
    String regexKantor = ""[A-Z]{3}":\d+\.\d{4}";
    Pattern patternKantor = Pattern.compile(regexKantor);
    if

    }

     */
}


    // stwórz pattern na imie - zrobione
    // stwórz pattern na imie i nazwisko - zrobione

    //napisz pattern na datę w postaci xx-xx-xxxx uzyj grup i nazw - zrobione

    //napisz pattern na maila - zrobione

    /*
     * Sprawdz czy liczba  podana przez użytkownika ma poprawny format. Na przykład liczba 123,2341515132135 czy
     * -10 są poprawne ale 18-12 czy 123, już nie, - nie wiem o co chodzi
     */

    /*
     * sprawdz czy numer domu jest w formacie numer\numer.
     * Poprawnym numerem jest 123\2A, 24B\3 czy 12\5, ale już numer abc\cba nie, -zrobione
     */

    //napisz pattern na miasto np Warszawa, Bielsko-Biala, Zielona Gora - cos jest zle

    /*
     * Stworz klase Osoba(imie,nazwisko, pesel, plec)
     *
     * 1) Sprawdz czy pesel jest poprawny - czy sklada sie z 11 znakow, samych cyfr itp - zrobione
     *
     * 2) Sprawdz czy pesel odpowiada podanej płci -zrobione
     *
     * 3) Napisz metody które zwracaja z peselu date urodzenia (LocalDAte) -cos jest zle
     */
/*

    //napisz metode zamien(int ilosc, String waluta) ktora działa jak kantor, pokazuje ile mozesz kupic danej waluty za podana liczbe euro
    //czyli np zamien(100, "PLN") powinno wypluc 439,79
    String kursy = "{\"rates\":{\"CAD\":1.5563,\"HKD\":9.1212,\"ISK\":162.6,\"PHP\":57.324,\"DKK\":7.4441,\"HUF\":350.68,\"CZK\":26.083,\"AUD\":1.6442,"
            + "\"RON\":4.8405,\"SEK\":10.363,\"IDR\":17383.99,\"INR\":88.198,\"BRL\":6.5908,\"RUB\":87.735,\"HRK\":7.5243,\"JPY\":124.53,\"THB\":37.161,"
            + "\"CHF\":1.0744,\"SGD\":1.6131,\"PLN\":4.3979,\"BGN\":1.9558,\"TRY\":8.5925,\"CNY\":8.1483,\"NOK\":10.5913,\"NZD\":1.8045,\"ZAR\":20.2977,"
            + "\"USD\":1.1769,\"MXN\":26.066,\"ILS\":4.0029,\"GBP\":0.89755,\"KRW\":1403.15,\"MYR\":4.9194},\"base\":\"EUR\",\"date\":\"2020-08-21\"}";
    */

/*
Stworz jakis plik txt z ChatGPT i z niego wyciagnij wszystkie poprawne kody pocztowe (XX-XXX) - cos nie dziala
 */