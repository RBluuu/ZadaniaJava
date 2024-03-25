package com.java.course.com.lesson7;

public class ExampleFor2 {
    public static void main(String[] args) {
      //  1. Oblicz sume elementow z tablicy
        System.out.println("Zadanie 1:");
        int[] tablica8 = {234, 34234, 123, 1, 3, 5, 6};
        int suma8 = 0;
        for ( int i = 0; i < tablica8.length; i++) {
            suma8 += tablica8[i];
        }
        System.out.println("Suma tablicy8 = " + suma8);

      //  2. Oblicz srednia elementow z tablicy
        System.out.println("Zadanie 2:");
        int[] tablica5 = {1, 2, 3, 4, 5, 6, 7, 8};
        int suma5 = 0;
        for (int i = 0; i < tablica5.length; i++) {
            suma5 += tablica5[i];
        }
        System.out.println("Srednia tablicy = " + (double)suma5/tablica5.length);

      //  3. Oblicz sume dlugosci Stringow z tablicy
        System.out.println("Zadanie 3:");
        String[] tablica17 = {"Rasdfsdfdek", "OoLsdfsA", "ADFsdfFSDF", "SDFSDF", "SDFSDFN", "gsdfsdgsd", "sdfsdfjsd"};
        int suma17 = 0;
        for ( int i = 0; i < tablica17.length; i++) {
            suma5 += tablica17[i].length();
        }
        System.out.println("Suma Stringow z tablica5 = " + suma5);

      //  4. Znajdz maks i min z tablicy doubli
        System.out.println("Zadanie 4:");
        double[] tablica22 = { 0, 1.34, 2.23 , 3, 4, 5.44, 6.99};
        double max22 = tablica22[0];
        for (int i = 0; i < tablica22.length; i++) {
            if ( tablica22[i] > max22) {
                max22 = tablica22[i];
            }
        }
        System.out.println("Max tablicy = " + (int)max22);


        double[] tablica2 = { 11111.234, 2222.4234, 33333.999, 4.1, 235.99, 6.4234, 2237, 8, 9};
        double min2 = tablica2[0];
        for ( int i = 0; i < tablica2.length; i++) {
            if ( tablica2[i] < min2) {
                min2 = tablica2[i];
            }
        }
        System.out.println("Min tablicy2 = " + (int)min2);


      //  5* oblicz sume dzielnikow liczb z tablicy
        System.out.println("Zadania 5:");
        int[] liczby = {10};
        int sumaLicznikow = 0;
        for (int i = 0; i < liczby.length; i++) {
            for (int j = 1; j <= liczby[i]; j++) {
                if (liczby[i] % j == 0) {
                    sumaLicznikow += j;
                }
            }
        }
        System.out.println(sumaLicznikow);

      //  6* dla dowolnej liczy oblicz sume ich cyfr
        System.out.println("Zadanie 6");
        int liczba66 = 123;
        int suma66 = 0;
        while (liczba66 > 0) {
            suma66 = suma66 + liczba66 % 10;
            liczba66 = liczba66 / 10;
        }
        System.out.println(suma66);

        //  1. Oblicz sume elementow z tablicy
        int[] tablica10 = {10, 15, 20, 25, 30};
        int suma10 = 0;
        for (int i = 0; i < tablica10.length; i++) {
            suma10 += tablica10[i];
        }
        System.out.println("Suma elementow z tablicy10 = " + suma10);

        //  2. Oblicz srednia elementow z tablicy
        int[] tablica11 = {10, 15, 20, 25, 30};
        int suma11 = 0;
        for (int i = 0; i < tablica11.length; i++) {
            suma11 += tablica11[i];
        }
        System.out.println("Suma elementow z tablicy10 = " + (double)suma11/tablica11.length);

        //  3. Oblicz sume dlugosci Stringow z tablicy
        String[] tablica12 = {"Radek", "Ola"};
        int suma12 = 0;
        for (int i = 0; i < tablica12.length; i++) {
            suma12 += tablica12[i].length();
        }
        System.out.println("Suma długosci stringow z tablicy = " + suma12);
        //  4. Znajdz maks i min z tablicy doubli
        double[] tablica13 = {10.123, 15.23, 20.23, 66.45, 30.99};
        double max13 = tablica13[0];
        for ( int i = 0; i < tablica13.length; i++) {
            if (tablica13[i] > max13)
            max13 = tablica13[i];
        }
        System.out.println("Max z tablicy13 = " + max13);

        double[] tablica14 = {10.123, 15.23, 20.23, 66.45, 30.99};
        double min14 = tablica14[0];
        for ( int i = 0; i < tablica13.length; i++) {
            if (tablica13[i] < min14)
                min14 = tablica13[i];
        }
        System.out.println("Min z tablicy13 = " + min14);


        //  5* oblicz sume dzielnikow liczb z tablicy
        int[] tablica15 = {10};
        int sumaLicznikowTablicy15 = 0;
        for ( int i = 0; i < tablica15.length; i++) {
            for ( int k = 1; k <= tablica15[i]; k++) {
                if ( tablica15[i] % k == 0) {
                    sumaLicznikowTablicy15 += k;
                }
            }
        }
        System.out.println("Suma dzielnikow liczby " + sumaLicznikowTablicy15);


        //  6* dla dowolnej liczy oblicz sume ich cyfr
        int liczba16 = 234;
        int sumaLiczby16 = 0;
        while (liczba16 > 0) {
            sumaLiczby16 = sumaLiczby16 + liczba16 % 10;
            liczba16 = liczba16 / 10;
        }
        System.out.println("Suma cyfr liczby16 = " + sumaLiczby16);



        //  1. Oblicz sume elementow z tablicy
        int[] tablica18 = {234, 34, 23, 52, 566, 66, 99};
        int suma18 = 0;
        for (int i = 0; i < tablica18.length; i++) {
            suma18 += tablica18[i];
        }
        System.out.println("SUMA tablicy 18 = " + suma18);

        //  2. Oblicz srednia elementow z tablicy
        int[] tablica19 = {234, 34, 23, 52, 566, 66, 99};
        int suma19 = 0;
        for (int i = 0; i < tablica19.length; i++) {
            suma19 += tablica19[i];
        }
        System.out.println("SUMA tablicy 19 = " + suma19/tablica19.length);

        //  3. Oblicz sume dlugosci Stringow z tablicy
        String[] tablica20 = {"Radek", "Ola", "Michał"};
        int suma20 = 0;
        for (int i = 0; i < tablica20.length; i++) {
            suma20 += tablica20[i].length();
        }
        System.out.println("Długosc stringow z tablicy = " + suma20);

        //  4. Znajdz maks i min z tablicy doubli
        int[] tablica21 = {234, 34, 23, 52, 566, 66, 99};
        int max21 = tablica21[0];
        for ( int i = 0; i < tablica21.length; i++) {
            if (tablica21[i] > max21) {
                max21 = tablica21[i];
            }
        }
        System.out.println("Max z tbalicy21 = " + max21);

        int[] tablica23 = {234, 34, 23, 52, 566, 66, 99};
        int min22 = tablica21[0];
        for ( int i = 0; i < tablica21.length; i++) {
            if (tablica21[i] < min22) {
                min22 = tablica21[i];
            }
        }
        System.out.println("Max z tbalicy21 = " + min22);


        //  5* oblicz sume dzielnikow liczb z tablicy
        int[] tablica24 = {55, 2};
        int suma24 = 0;
        for ( int i = 0; i < tablica24.length; i++) {
            for (int d = 1; d < tablica23[i]; d++) {
                if (tablica24[i] % d == 0) {
                    suma24 += d;
                }
            }
        }
        System.out.println("Suma dzienikow 55 = " + suma24);

        //  6* dla dowolnej liczy oblicz sume ich cyfr
        int liczba25 = 66546;
        int suma25 = 0;
        while (liczba25 > 0) {
            suma25 = suma25 + liczba25 % 10;
            liczba25 = liczba25 / 10;
        }
        System.out.println("Suma czyfr liczby 199 = " + suma25);


































    }
}
