package com.java.course.com.lesson7;

public class SumaElementowTablicy2D {
    public static void main(String[] args) {
        int[][] liczby2D = {{54, 43, 12}, {213, 32, 12}, {654, 342, 123}};
        int suma = 0;
        //nazwaTablicy.for
        //nazwaTablicy.foir
        for (int[] liczby : liczby2D) {
            for (int liczba : liczby) {
                suma += liczba;
            }
        }
        System.out.println(suma);


        int[][] tablica2D = {{54, 43, 12}, {213, 32, 12}, {654, 342, 123}};
        int suma1 = 0;
        for ( int[] tablica : tablica2D) {
            for ( int tablica1 : tablica) {
                suma1 += tablica1;
            }
        }
        System.out.println("Suma tablicy2D = " + suma1);












        int[][] tablica43D = {{54, 43, 12}, {213, 32, 12}, {654, 342, 123}};
        int suma43D = 0;
        for ( int[] tablica : tablica43D) {
            for ( int tablica2 : tablica) {
                suma43D += tablica2;
            }
        }
        System.out.println("Suma tablicy43D = " + suma43D);




        int[][] tablica41D = {{54, 43, 12}, {213, 32, 12}, {654, 342, 123}};
        int suma41D = 0;
        for ( int[] tablica : tablica41D) {
            for ( int tablica3 : tablica) {
                suma41D += tablica3;
            }
        }
        System.out.println(suma41D);


        int[][] tablica40D = {{54, 43, 12}, {213, 32, 12}, {654, 342, 123}};
        int suma40 = 0;
        for ( int[] tablica : tablica40D) {
            for ( int tablica1 : tablica) {
                suma40 += tablica1;
            }
        }
        System.out.println(suma40);





        int[][] tablica20D = {{3243, 4134, 123}, {3411, 43214, 44}};
        int suma20D = 0;
        for ( int[] tablica : tablica20D) {
           for ( int tablica2 : tablica) {
                suma20D += tablica2;
            }
        }
        System.out.println(suma20D);





        int[][] tablica21D = {{3243, 4134, 123}, {3411, 43214, 44}};
        int suma21 = 0;
        for ( int[] tablica : tablica21D) {
            for ( int tablica2 : tablica) {
                suma21 += tablica2;
            }
        }
        System.out.println("Tablica21 = " + suma21 );


        int[][] tablica19D = {{3243, 4134, 123}, {3411, 43214, 44}, {2341,345, 6455}};
        int suma19D = 0;
        for ( int[] tablica : tablica19D) {
            for ( int tablica3 : tablica) {
                suma19D += tablica3;
            }
        }
        System.out.println(suma19D);

        int[][] tablica3D = {{12, 32, 31}, {16, 22, 44}};
        int suma3d = 0;
        for (int[] tablica : tablica3D) {
            for (int tablica4 : tablica) {
                suma3d += tablica4;
            }
        }
        System.out.println("Suma tablicy 3d = " + suma3d);

        int[][] tablica4D = {{12, 32, 31}, {16, 22, 44}};
        int suma4d = 0;
        for ( int[] tablica : tablica4D) {
            for (int tablica4 : tablica) {
                suma4d += tablica4;
            }
        }
        System.out.println("Suma elementow tablicy4d = " + suma4d);

        int[][] tablica5D = {{12, 32, 31}, {16, 22, 44}, {18, 22, 33}};
        int suma5d = 0;
        for ( int[] tablica : tablica5D) {
            for ( int tablica1 : tablica) {
                suma5d += tablica1;
            }
        }
        System.out.println("Suma elementow tablicy5d = " + suma5d);

        int[][] tablica6D = {{12, 32, 31}, {16, 22, 44}, {18, 22, 33}, {55, 22, 11}};
        int suma6D = 0;
        for (int[] tablica2 : tablica6D) {
            for (int tablica1 : tablica2) {
                suma6D += tablica1;
            }
        }
        System.out.println("Suma tablicy6D = " + suma6D);












    }
}
