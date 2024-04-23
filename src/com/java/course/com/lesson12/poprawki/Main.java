package com.java.course.com.lesson12.poprawki;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "";
        s += "H";
        s += "e";
        s += "l";
        s += "l";
        s += "o";
        System.out.println(s);
        List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(3);
        lista.add(3);
        lista.add(5);
        lista.add(5);
        lista.add(5);
        lista.add(5);
        System.out.println(bezDuplikatow(lista));
        System.out.println(lista);

        String slowo = "Radek";
        System.out.println(slowoOdwrocone(slowo));

        List<String> odwrocone = new ArrayList<>();
        String slowo1 = "Trofeum";
        odwrocone.add(slowoOdwrocone(slowo1));
        System.out.println(odwrocone);


        //https://codingbat.com/java/String-1
        String znak = "<<>>";
        String slowo3 = "word";
        System.out.println(makeOutWord(znak,slowo3));

        String slowo4 = "Woohoo";
        String slowo5 = "HelloThere";
        System.out.println(firstHalf(slowo4));
        System.out.println(firstHalf(slowo5));

        String slowo7 = "oddly";
        String slowo8 = "y";
        String slowo9 = "oddy";

        String slowo10 = "Radek";
        System.out.println(left2(slowo10));

        String slowo11 = "Hello";
        String slowo12 = "Chocolate";
        String slowo13 = "Chocolate";


        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));

        String slowo14 = "Radek";
        System.out.println();

        String slowo15 = "a";
        String slowo16 = "Hello";
        boolean slowo17 = false;
        System.out.println(theEnd(slowo16,slowo17));


    }

    //napisz fukncje ktora odwraca jednego stringa
    //Radek
    //[R,a,d,e,k]
    public static String slowoOdwrocone(String slowo) {
        String nowy = "";
        //kedaR
        for (int i = slowo.length() - 1; i >= 0; i--) {
            System.out.println(slowo.charAt(i));
            nowy += slowo.charAt(i);

        }
        return nowy;
    }


    //9. Napisz metode ktora zwroci liste liczb bez duplikatow nie zmieniajac oryginalnej listy - zle
    /*
    [1,1,2,3,4,4,5,6,10] -> [1,2,3,4,5,6,10]
     */
    public static List<Integer> bezDuplikatow(List<Integer> liczby) {
        for (int i = 0; i < liczby.size(); i++) {
            for (int j = 0; j < liczby.size(); j++) {
                if (liczby.get(i).equals(liczby.get(j))) {
                    liczby.remove(liczby.get(j));
                }
            }
        }
        return liczby;
    }

    //1
    public static void bezDuplikatowV2(List<Integer> liczby) {
        for (int i = 0; i < liczby.size(); i++) {
            for (int j = 0; j < liczby.size(); j++) {
                if (liczby.get(i).equals(liczby.get(j))) {
                    liczby.remove(liczby.get(j));
                }
            }
        }
    }

    //2
    public static List<Integer> bezDuplikatowV3(List<Integer> liczby) {
        List<Integer> unique = new ArrayList<>(liczby);
        for (int i = 0; i < unique.size(); i++) {
            for (int j = 0; j < unique.size(); j++) {
                if (unique.get(i).equals(unique.get(j))) {
                    unique.remove(unique.get(j));
                }
            }
        }
        return unique;
    }


    public static String makeOutWord(String out, String word) {
        String last = out.substring(0, 2);
        String NewWord = last + word + out.substring(3) + out.substring(3);
        return NewWord;

    }
    public static String firstHalf(String str) {
        String half = str.substring(0, str.length() / 2);
        return half;
    }

   /* public static boolean endsLy(String str) {
            if (str.substring((str.length() - 2)).equals("ly")) {
                return true;
            } else {
                return false;
            }
        }


    public static String lastChars(String a, String b) {
        String word1 = a.substring(a.length() - 1);
        String word2 = b.substring(b.length() - 1);
        String word = word1 + word2;
        return word;
    }

    */

    public static String left2(String str) {
        String word = str;
        word = str.substring(3) + str.substring(0, 2);
        return word;
    }

    public static String withouEnd2(String str) {
        String word = str;
        if(word.length() > 2) {
            word = str.substring(1, str.length()-1);
        } else {
            word = "";
        }
        return word;
    }
   /* public static String nTwice(String str, int n) {
        String word = str;
        if(n == 1) {
            word = str.substring(0, 1) + str.substring(str.length()-1);
        } else if (n == 2) {
            word = str.substring(0, 2) + str.substring(str.length()-2);
        } else if ( n == 3) {
            word = str.substring(0, 3) + str.substring(str.length()-3);
        }
        return nTwice(word, n);
    }

    */
   public static boolean frontAgain(String str) {
       boolean word;
       if(str.substring(0, 2).equals(str.substring(str.length()-2))) {
           word = true;
       } else {
           word = false;
       }
       return word;
   }

   /* public static String without2(String str) {
        String word = str;
        if(word.substring(word.length()-2).equals(word.substring(0, 2))) {
            word = word.substring(2);
        } else if (word.substring(word.length()-2).equals("Hi")) {
            word =  word;
        } else if(word.substring(word.length()-2) != (word.substring(0, 2))) {
            word = "";
        } else (word.length() <= 2) {
            word = "";
        }
        return word;
    }

    */

    public static int middleTwo(String str) {
        String word = str;
        int word1 = ((word.length() / 2) - 1);
        int word2 = ((word.length() / 2) + 1);
        int word3 = word1 + word2;
        return word3;
    }

    /*public static String lastTwo(String str) {
        String word1 = str.substring(0, str.length() - 2);
        String word2 = word1 + str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1); {
            if (str.length() < 1) {
                return "";
            }
        }
        return word2;
    }

     */

    public static String theEnd(String str, boolean front) {
        String word = str;
        if(front == true) {
            word = word.substring(0, 1);
        } else if (front == false){
            word = word.substring(str.length() -1);
        }
        return word;
    }

   /* public String startWord(String str, String word) {
        String word = str;
        if(str.length() > 3) {
            word1 = str.substring(0, 2);
        } else {
            word = "";
        }
        String word2 = word;
        if(word.length() >= 3) {
            word2 = word.substring(word.length()-1);
        } else {
            word2 = "";
        }
        return word1 + word2;
    }*/







}

