package com.java.course.com.lesson7;

public class Max {
    public static void main(String[] args) {
        int[] tablica = new int[3];
        tablica[0] = 12;
        tablica[1] = 432;
        tablica[2] = 31;

        int max =  tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if(tablica[i] > max) {
                max = tablica[i];
            }
        }
        System.out.println(max);



        int[] tablica1 = new int [5];
        tablica1[0] = 12332;
        tablica1[1] = 12342332;
        tablica1[2] = 123325;
        tablica1[3] = 12333;
        tablica1[4] = 12331;
        int max1 = tablica1[0];
        for ( int i =0; i < tablica1.length; i++) {
            if (tablica1[i] > max1) {
                max1 = tablica1[i];
            }
        }
        System.out.println("Max z tablica1 = " + max1);



        int[] tablica2 = {2, 3, 6, 1, 99, 9, 15, 52};
        int max2 = tablica2[0];
        for (int i = 0; i < tablica2.length; i++) {
            if (tablica2[i] > max2) {
                max2 = tablica2[i];
            }
        }
        System.out.println("Max z tablica2 = " + max2);


        int[] tablica3 = {23423, 3434, 11, 333, 99, 12345, 129, 19, 5};
        int max3 = tablica3[0];
        for (int i = 0; i < tablica3.length; i++) {
            if (tablica3[i] > max3) {
                max3 = tablica3[i];
            }
        }
        System.out.println("Max z tablicy3 = " + max3);

        int[] tablica4 = new int[3];
        tablica4[0] = 23234;
        tablica4[1] = 2334;
        tablica4[2] = 99999;
        int max4 = tablica4[0];
        for ( int i = 0; i < tablica4.length; i++) {
            if (tablica4[i] > max4) {
                max4 = tablica4[i];
            }
        }
        System.out.println("Max z tablicy4 = " + max4);


        int[] tablica5 = new int[6];
        tablica5[0] = 9994;
        tablica5[1] = 99334;
        tablica5[2] = 999114;
        tablica5[3] = 994;
        tablica5[4] = 4;
        tablica5[5] = 999334;

        int max5 = tablica5[0];
        for ( int i = 0; i < tablica5.length; i++) {
            if (tablica5[i] > max5) {
                max5 = tablica5[i];
            }
        }
        System.out.println("Max tablicy5 = " + max5);

        int[] tablica6 = new int[2];
        tablica6[0] = 5;
        tablica6[1] = 9;
        int max6 = tablica6[0];
        for ( int i = 0; i < tablica6.length; i++) {
            if ( tablica6[i] > max6) {
                max6 = tablica6[i];
            }
        }
        System.out.println("Max tablicy6 = " + max6);

        int[] tablica7 = {5, 12, 99, 1, 17, 22};
        int min = tablica[0];
        for ( int i = 0; i < tablica7.length; i++) {
            if ( tablica7[i] < min ) {
                min = tablica7[i];
            }
        }
        System.out.println("Min tablicy7 = " + min);

        int[] tablica8 = {999,666, 1000, 5555, 9991, 23323};
        int max8 = tablica8[0];
        for ( int i = 0; i < tablica8.length; i++ ) {
            if ( tablica8[i] > max8) {
                max8 = tablica8[i];
            }
        }
        System.out.println("Max tablicy8 = " + max8);


        int[] tablica9 = {2343423, 123, 4523, 52345, 1234};
        int suma9 = tablica9[0];
        for ( int i = 0; i < tablica.length; i++) {
            if ( tablica9[i] > suma9) {
                suma9 = tablica9[i];
            }
        }
        System.out.println("Max tablicy = " + suma9);

        int[] tablica10 = { 456, 888, 777, 666, 555, 3, 1};
        int suma10 = tablica10[0];
        for ( int i = 0; i < tablica10.length; i++) {
            if (suma10 < tablica10[i]) {
             suma10 = tablica10[i];
            }
        }
        System.out.println("Max tablicy10 = " + suma10);


        int[] tablica20 = { 34, 12, 43, 5, 3, 66, 99};
        int max20 = tablica20[0];
        for ( int i = 0; i < tablica20.length; i++) {
            if ( max20 < tablica20[i]) {
                max20 = tablica20[i];
            }
        }
        System.out.println("Max tablicy20 = " + max20);


        int[] tablica21 = {234, 2342, 244, 1, 3, 5};
        int min21 = tablica21[0];
        for ( int i = 0; i < tablica21.length; i++) {
            if (tablica21[i] > min21) {
                min21 = tablica21[i];
            }
        }
        System.out.println("Min tablicy21 = " + min21);

        int[] tablica22 = { 0, 1, 2, 3, 4, 5, 6};
        int max22 = tablica22[0];
        for (int i = 0; i < tablica22.length; i++) {
            if ( tablica22[i] > max22) {
                max22 = tablica22[i];
            }
        }
        System.out.println("Max tablicy = " + max22);


        int[] tablica23 = {0, 1, 2, 3, 4, 5, 6};
        int min23 = tablica23[0];
        for (int i = 0; i < tablica.length; i++) {
            if ( tablica23[i] < min23) {
                min23 = tablica23[i];
            }
        }
        System.out.println("Min tablicy23 = " + min23);

        int[] tablica24 = { 4, 1, 2, 5, 9, 1};
        int max24 = tablica24[0];
        for (int i = 0; i < tablica24.length; i++) {
            if (tablica24[i] > max24) {
                max24 = tablica24[i];
            }
        }
        System.out.println("Max z tablicy24 = " + max24);

        int[] tablica25 = {2, 3, 4, 4, 5, 6};
        int max99 = tablica25[0];
        for ( int i = 0; i < tablica25.length; i++) {
            if (tablica25[i] > max99) {
                max99 = tablica25[i];
            }
        }
        System.out.println("Max tablicy99 = " + max99);

        int[] tablica26 = {2, 3, 4, 4, 5, 6};
        int max26 = tablica26[0];
        for ( int i = 0; i < tablica.length; i++) {
            if (tablica26[i] > max26)
            max26 = tablica26[i];
        }
        System.out.println("Max tablicy26" + max26);

        int[] tablica27 = {12, 22, 44, 55, 66};
        int max27 = tablica27[0];
        for (int i = 0; i < tablica27.length; i++) {
            if (tablica27[i] > max27) {
                max27 = tablica27[i];
            }
        }
        System.out.println("Max tablicy 27 = " + max27);


        int[] tablica28 = {12, 22, 44, 55, 66};
        int maxx = tablica28[0];
        for (int i = 0; i < tablica28.length; i++) {
            if (tablica28[i] > maxx) {
                maxx = tablica28[i];
            }
        }
        System.out.println("Max tablicy28 = " + maxx);

        int[] tablica29 = {12, 22, 44, 55, 66, 99};
        int max29 = tablica[0];
        for (int i = 0; i < tablica29.length; i++) {
            if (tablica29[i] > max29) {
                max29 = tablica29[i];
            }
        }
        System.out.println("Max tablucy 29 = " + max29);

































    }
}
