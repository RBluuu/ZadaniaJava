package com.java.course.com.lesson37_38_39.wielkieliczby;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Wielkie liczby
        /*
        byte
        short
        int
        long
         */

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        //int number = 2147483647 + 10;
        long longNumber = 2147483647L + 2147483647L;
        //System.out.println(number);
        System.out.println(longNumber);

        long longLongNumber = 9223372036854775807L + 9223372036854775807L;

        //https://www.jasss.org/9/4/4/fig1.jpg

        double doubleValue = 0.1;
        for (int i = 0; i < 1000; i++) {
            doubleValue += 0.1; //100.1
        }
        System.out.println(doubleValue);


        //BigInteger
        //BigDecimal

        BigInteger fromLong = BigInteger.valueOf(9223372036854775807L);
        BigInteger fromString1 = new BigInteger("9223372036854775808");
        BigInteger fromString2 = new BigInteger("9223372036854775808");

        System.out.println(fromString1);
        System.out.println(fromString1.multiply(fromString2));
        //System.out.println(fromString1 * fromString2);
        System.out.println(fromString1.add(fromString2));
        System.out.println(fromString1.multiply(fromString2));
        System.out.println(fromString1.subtract(fromString2));
        System.out.println(fromString1.divide(fromString2));

        //0101110101110011

        BigInteger five = BigInteger.valueOf(-5);
        BigInteger ten = BigInteger.valueOf(10);
        BigInteger zero = BigInteger.valueOf(0);
        BigInteger zeroConst = BigInteger.ZERO;

        System.out.println(five.abs());

        BigInteger bigger = five.max(ten);
        // five > ten
        System.out.println(bigger);
        BigInteger gcd = ten.gcd(five);


        int normalInt = 10;
        BigInteger someBigInteger = new BigInteger("41241241241243213122");

        BigInteger fromInt = BigInteger.valueOf(normalInt);
        int fromBigINtger = someBigInteger.intValue();
        System.out.println();
        BigInteger result = fromString1.multiply(fromString2);
        System.out.println(fromString1);
        System.out.println(result);


        //five
        //ten

        BigInteger bigger1 = five.max(ten);

        if (ten.compareTo(five) > 0) {
            System.out.println("ten is bigger than five");
        } else {
            System.out.println("five is bigger than 10");
        }

        BigInteger probablePrime = BigInteger.probablePrime(10, new Random());
        System.out.println(probablePrime);

        BigDecimal bigDecimal1 = new BigDecimal("32112421421.3213213213213213213123");
        BigDecimal bigDecimal2 = new BigDecimal("555555.22222222");

        //System.out.println(bigDecimal1.divide(bigDecimal2));
        //1/3 0.33333333333333(3)...........

        System.out.println(bigDecimal1.divide(bigDecimal2, 20, RoundingMode.CEILING));
        System.out.println(bigDecimal1.divide(bigDecimal2, 100, RoundingMode.CEILING));
        System.out.println(bigDecimal1.divide(bigDecimal2, 1000, RoundingMode.CEILING));

        System.out.println(bigDecimal1.scale());
        System.out.println(bigDecimal1.precision());

        System.out.println();
        List<BigInteger> newList = new ArrayList<>(List.of(new BigInteger("1342334234234"), new BigInteger("2342542432834234")));
        //System.out.println(sumaWszystkichLiczb(newList));

        //1. Napisz program, ktory bedzie wczytywal od uzytkownika liczbe calkowita i wypisywal jej silnie
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą, aby obliczyć jej silnię:");
        while (true) {
            BigInteger liczba = scanner.nextBigInteger();
            if (liczba.compareTo(BigInteger.ZERO) < 0) {
                System.out.println("Silnia dla liczb ujemnych nie istnieje.");
                break;
            }
            BigInteger silnia = BigInteger.ONE;
            for (BigInteger i = BigInteger.TWO; i.compareTo(liczba.add(BigInteger.ONE)) < 0; i = i.add(BigInteger.ONE)) {
                silnia = silnia.multiply(i);
            }
            System.out.println("Wynik: " + silnia);
        }

        //3. Napisz program ktory bedzie wczytywal liczby od uzytkowinka i je caly czas mnozyl i wyswietlal aktualny wynik
        //dopoki uzytkownik nie wpisze -1
        Scanner scanner1 = new Scanner(System.in);
        BigInteger wynik = BigInteger.ONE;
        System.out.println("Podaj liczbe do mnożenia. Wpisz -1, aby zakonczyc liczenie:");
        while (true) {
            System.out.print("Podaj liczbę: ");
            BigInteger liczba = scanner1.nextBigInteger();
            if (liczba.equals(BigInteger.valueOf(-1))) {
                break;
            }
            wynik = wynik.multiply(liczba);
            System.out.println("Aktualny wynik: " + wynik);
        }
        System.out.println("Ostatni wynik: " + wynik);
        scanner1.close();

        //4. Napisz program ktory wygeneruje 100 losowych 100 cyfrowych liczb, zapisze je do pliku liczby.txy , a nastepnie obliczy ich iloczyn i zapisze do pliku wynik.txt
        int randomNumber = 100;
        int digits = 100;
        String filePathNumbers = "src/com/java/course/com/lesson37_38_39/wielkieliczby/liczby.txt";
        String filePathResult = "src/com/java/course/com/lesson37_38_39/wielkieliczby/wynik.txt";

        try {
            generateRandomBigNumbers(randomNumber, digits, filePathNumbers);
            BigInteger number = resultOfNumber(filePathNumbers);
            writeResultToFile(number, filePathResult);
            System.out.println("Zadanie zakończone pomyślnie.");
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas operacji na plikach: " + e.getMessage());
        }

    //5. Napisz program, który generuje losową liczbę całkowitą o określonej liczbie cyfr (np. 50 cyfr), a następnie sprawdza, czy jest to liczba pierwsza, korzystając z klasy BigInteger
        System.out.println();
        System.out.println(randomPrimeNumber(50));

    }

    public static BigInteger randomPrimeNumber(int howLongNumber) {
        BigInteger randomNumber = generateRandomBigIntegerV2(howLongNumber);
        System.out.println("Wygenerowana liczba: ");
        if (isPrime(randomNumber)) {
            System.out.println("Liczba jest pierwsza.");
        } else {
            System.out.println("Liczba nie jest pierwsza.");
        }
        return randomNumber;
    }

    public static BigInteger generateRandomBigIntegerV2(int numberLength) {
        Random random = new Random();
        StringBuilder number = new StringBuilder();
        number.append(random.nextInt(9) + 1);
        for (int i = 1; i < numberLength; i++) {
                number.append(random.nextInt(10));
            }
        return new BigInteger(number.toString());
    }

    public static boolean isPrime(BigInteger number)  {
        return number.isProbablePrime(100);
    }

    public static void generateRandomBigNumbers(int count, int digits, String fileName) throws IOException {
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < count; i++) {
                BigInteger randomNumber = generateRandomBigIntegerV2(digits, random);
                writer.write(randomNumber.toString());
                writer.newLine();
            }
        }
    }

    private static BigInteger generateRandomBigIntegerV2(int digits, Random random) {
        StringBuilder number = new StringBuilder();
        number.append(random.nextInt(9) + 1);
        for (int i = 1; i < digits; i++) {
            number.append(random.nextInt(10));
        }
        return new BigInteger(number.toString());
    }

    public static BigInteger resultOfNumber(String fileName) throws IOException {
        BigInteger result = BigInteger.ONE;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                BigInteger number = new BigInteger(line);
                result = result.multiply(number);
            }
        }
        return result;
    }

    public static void writeResultToFile(BigInteger result, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(result.toString());
        }
    }
}
//Zadania:
//1. Napisz program, ktory bedzie wczytywal od uzytkownika liczbe calkowita i wypisywal jej silnie - zrobione
//2. Napisz program ktory obliczy sume wszystkich wielkich liczb z listy i obliczy ich kwadrat - zrobione
//3. Napisz program ktory bedzie wczytywal liczby od uzytkowinka i je caly czas mnozyl i wyswietlal aktualny wynik - zrobione
//dopoki uzytkownik nie wpisze -1
//4. Napisz program ktory wygeneruje 100 losowych 100 cyfrowych liczb, zapisze je do pliku liczby.txy , a nastepnie obliczy ich iloczyn i zapisze do pliku wynik.txt - zrobione
//5. Napisz program, który generuje losową liczbę całkowitą o określonej liczbie cyfr (np. 50 cyfr), a następnie sprawdza, czy jest to liczba pierwsza, korzystając z klasy BigInteger - zrobione


//1.
//Klient(imie, nazwisko, pesel) moze posiadac wiele Kont(nazwa,data założenia, saldo, waluta)
//Korzystajac z Wielkich Liczb zaimplementuj metody
//wplac- dodaje do konta kwote w danej walucie
//wyplac - odejmuje z konta kwote w danej walucie
//transfer - przenosi kwote w danej walucie na inne konto
//- kto zrobil najwiecej przelewow?
//- czyje przelewy byly na najwieksze kwowy
//- oblicz srednia wartos z listy przelewow
//- jaki byl maksymalny przelew