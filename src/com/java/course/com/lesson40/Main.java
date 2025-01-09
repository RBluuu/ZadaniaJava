package com.java.course.com.lesson40;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //https://regexr.com/

        String email = "popiolkas@gmail.com";
        System.out.println(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));

        System.out.println();
        Pattern pattern1 = Pattern.compile("A");
        System.out.println(pattern1.matcher("A").matches());
        System.out.println(pattern1.matcher("B").matches());
        System.out.println();
        Pattern pattern2 = Pattern.compile("AA");
        System.out.println(pattern2.matcher("A").matches());
        System.out.println(pattern2.matcher("B").matches());
        System.out.println();
        //charachter sety
        Pattern pattern3 = Pattern.compile("[a-fB-H1-5]");
        System.out.println(pattern3.matcher("a").matches());
        System.out.println(pattern3.matcher("D").matches());
        System.out.println(pattern3.matcher("3").matches());
        System.out.println(pattern3.matcher("z").matches());
        System.out.println(pattern3.matcher("X").matches());
        System.out.println(pattern3.matcher("9").matches());

        /*
        {3} - dokladnie 3 razy
        {1,5} - od 1 do 5
        {5,} - przynajmniej 5

        * - 0 lub wiele
        + - 1 lub wiele
         */
        System.out.println();
        Pattern pattern4 = Pattern.compile("[a-z]+");
        System.out.println(pattern4.matcher("agfragraga").matches());
        System.out.println(pattern4.matcher("").matches());
        System.out.println();
        Pattern pattern5 = Pattern.compile("Ala ma kota*");
        System.out.println(pattern5.matcher("Ala ma kot").matches());
        System.out.println(pattern5.matcher("Ala ma kotaaaaa").matches());

        /*
        ? - opcjonalnosc
        () - grupowanie
         */
        System.out.println();
        Pattern pattern6 = Pattern.compile("Ala (ma)? kota");
        System.out.println(pattern6.matcher("Ala ma kota").matches());
        System.out.println(pattern6.matcher("Ala  kota").matches());

        /*
        | - alternatywa
         */
        Pattern alaMaKota = Pattern.compile("A*l{3}a (ma)? (kota|psa)");
        System.out.println();
        System.out.println(alaMaKota.matcher("AAAAAAAAllla ma psa").matches());
        System.out.println(alaMaKota.matcher("AAAAAAAAllla  kota").matches());

        /*
        klasy regexowe
        \d: Matches any digit ([0-9]).
        \D: Matches any non-digit character ([^0-9]).
        \w: Matches any word character (alphanumeric + underscore: [a-zA-Z0-9_]).
        \W: Matches any non-word character ([^a-zA-Z0-9_]).
        \s: Matches any whitespace character (spaces, tabs, newlines).
        \S: Matches any non-whitespace character.
         */
        System.out.println();
        Pattern words = Pattern.compile("\\w+");
        Pattern notWords = Pattern.compile("\\W+");
        System.out.println(words.matcher("feafafa1231231dda____12312").matches());
        System.out.println(notWords.matcher("feafafa1231231dda____12312").matches());
        System.out.println(notWords.matcher("!!!@@@&&^^%$%^&((").matches());


        Pattern personalInfoRegex = Pattern.compile("(?<firstname>[A-Z][a-z]{2,}) (?<lastname>[A-Z][a-z]{2,})");
        String personalInfo = "Ala Nowak";

        Matcher matcher = personalInfoRegex.matcher(personalInfo);
        System.out.println();
        if (matcher.matches()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group("firstname"));
            System.out.println(matcher.group("lastname"));
        }

        Pattern pattern9 = Pattern.compile("Ala ma kot.");
        System.out.println(pattern9.matcher("Ala ma kota").matches());
        System.out.println(pattern9.matcher("Ala ma kotx").matches());
        Pattern pattern10 = Pattern.compile(".*"); // cokolwiek dowolna ilosc razy
        System.out.println();
        Pattern pattern11 = Pattern.compile("Ala ma kota\\.");
        System.out.println(pattern11.matcher("Ala ma kota.").matches());
        System.out.println(pattern11.matcher("Ala ma kota!").matches());
        System.out.println(pattern11.matcher("Ala ma kotaa").matches());

        Pattern slash = Pattern.compile("\\\\");
        System.out.println(slash.matcher("\\").matches());

        //zachlannosc regexow
        String htmlTag = "<p>To jest paragraf</p>";
        Pattern pattern12= Pattern.compile("<.+?>");
        Matcher matcher1 = pattern12.matcher(htmlTag);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
    }

}
