package com.java.course.com.lesson64;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        Napisz funkcje ktora przyjmie tablice i ją posortuje
        od najwiekszego do najmniejszego
        !!! nie mozesz uzyc wbudowanego sortowania w Javie
         */

        int[] lista = new int[5];
        lista[0] = 10;
        lista[1] = 1;
        lista[2] = 3;
        lista[3] = 13;
        lista[4] = 5;
        System.out.println(Arrays.toString(lista));
        System.out.println(Arrays.toString(listaOdNajwiekszegoDoNajmniejszego(lista)));

        String slowo = "kakao";
        System.out.println(czestotliwoscLiterWSlowie(slowo));

    }

    //[10,5,4,-1]
    //[5,10,4,-1]
    //[5,4,10,-1]
    //[5,4,-1,10]
    //[4,5,-1,10]
    //[4,-1,5,10]
    //[-1,4,5,10]
    //lista[0]
    //lista[1]
    //liczba[10] = 555

    //[10, 1, 3, 13, 5]
    //[1, 3, 13, 5, 10]
    //[1,3,13,5]
    public static int[] listaOdNajwiekszegoDoNajmniejszego(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                int liczba1 = lista[i];
                int liczbaNastepna = lista[j];
                if (liczba1 < liczbaNastepna) {
                    lista[i] = liczbaNastepna;
                    lista[j] = liczba1;
                }
            }
        }
        return lista;
    }

    //policz ilosc wystepowan liter w podanym slowie
    //napis zfunkcje ktora przyjmie jakies slowo i policzy ile liter w jakiej czestowtliwosci w nimm wystepuje
    //Kakao -> k-2 a-2 o-1
    public static Map<Character, Integer> czestotliwoscLiterWSlowie(String slowo) {
        Map<Character, Integer> mapa = new HashMap<>();
        for (char litera : slowo.toCharArray()) {
            if(mapa.get(litera) == null){
                mapa.put(litera,1);
            }else {
                int aktualnyLicznik = mapa.get(litera);
                mapa.put(litera, aktualnyLicznik + 1);
            }
        }
        return mapa;
    }


}
