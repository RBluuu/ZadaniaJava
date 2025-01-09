package com.java.course.com.lesson35.stringistringbuilder;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text; //Immutable - Niemodyfikowalna
        text = "Jade dzisiaj do Krakowa";

        System.out.println(text.length());

        text = "!!!!";

        System.out.println(text);
        System.out.println();

        String s = "Hello World!";
        s = s.toUpperCase();
        System.out.println(s);


        //String Pool

        String jan1 = "Jan";
        String jan2 = "Jan";
        String jan3 = new String("Jan");

        System.out.println(jan1 == jan2); // POROWNUJE REFERENCEJ!!!! (strzalka pokazuje w to samo miesjce)
        System.out.println(jan2.equals(jan1));// Porownuje zawartosc stringa

        System.out.println();
        System.out.println(jan1 == jan3);
        System.out.println(jan1.equals(jan3));

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";
        String s4 = new String("hello");
        System.out.println();


        System.out.println(s1 == s2); // true bo strzalki w tym samym kierunku
        System.out.println(s1.equals(s3)); // true bo porownuje zawartosc obiektu
        System.out.println(s1.equals(s2)); // true bo prownuje zawartosc obiektu
        System.out.println(s1 == s4); // false bo strzalki sa przypasowane do innych obiektow
        System.out.println(s1.equals(s4)); // true bo porowuje zawatosc obiektu

        String msg = "";
        for (int i = 0; i < 1000; i++) {
            msg += i;
        }
        System.out.println(msg);

        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        System.out.println();

        //Napisz funkcje ktora odwroci Stringa
        String newText = "Jade na rowerze.";
        System.out.println(newText);
        System.out.println();

        System.out.println(regresString(newText));
        System.out.println();

        System.out.println(addText(newText," rano", 4));
        System.out.println();

        System.out.println(nTime(newText,5));
        System.out.println();

        System.out.println(sumOfResult("-",5,2));

    }

    //Napisz funkcje ktora odwroci Stringa
    public static String regresString(String text) { //reverse
        String newText = "";
        for (int i = text.length() -1 ; i >= 0; i--) {
            newText = newText + text.charAt(i);
        }
        return newText;
    }

    //Napisz funckje ktora doda do stringa jakis tekst pomiedzy danymi indexami
    //(hello,!!!,1) -> h!!!ello
    public static StringBuilder addText(String text, String extraText, int index) {
        StringBuilder newText = new StringBuilder(text.substring(0, index) + extraText + text.substring(index, text.length() - 1));
        return newText;
    }

    //Napisz funkcje ktora zwroci nowy String ktory bedzie powtorzeniem danego stringa n razy
    //(hello,3) -> hellohellohello

    public static StringBuilder nTime(String text, int nTime) {
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < nTime; i++) {
            newText.append(text);
        }
        return newText;
    }

    public static Map<String,Integer> sumOfResult(String form, int numberOne, int numberTwo) {
        Map<String,Integer> newMap = new HashMap<>();
        if (form.equals("+")) {
            newMap.put(form, numberOne + numberTwo);
        } else if (form.equals("-")) {
            newMap.put(form, numberOne - numberTwo);
        } else if (form.equals("*")) {
            newMap.put(form, numberOne * numberTwo);
        } else if (form.equals("/")) {
            newMap.put(form, numberOne / numberTwo);
        }
        return newMap;
    }

}
/*
//2. Uzupelnij kod tak aby program dzialal poprawnie.
//Map<String,???> calculator = new HashMap<>();
//calculator.put("+",???);
//calculator.put("-",???);
//calculator.put("*",???);
//calculator.put("/",???);
//calculator.get("+").calculate(2,3);
//wynik: 5
//calculator.get("-").calculate(2,3);
//wynik: -1 itd.
 */

//Napisz funkcje ktora odwroci Stringa - OK
//Napisz funckje ktora doda do stringa jakis tekst pomiedzy danymi indexami
//(hello,!!!,1) -> h!!!ello - OK
//Napisz funkcje ktora zwroci nowy String ktory bedzie powtorzeniem danego stringa n razy
//(hello,3) -> hellohellohello - OK