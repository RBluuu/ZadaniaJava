package com.java.course.com.lesson7;

public class SumaDlugosciStringow {
    public static void main(String[] args) {
        String[] imiona = {"Radek", "Ola", "Łukasz", "Marek", "Michal"};
        int sumaDlugosci = 0;
        for (int i = 0; i < imiona.length; i++) {
            sumaDlugosci += imiona[i].length();
        }
        System.out.println(sumaDlugosci);


        String[] tablica1 = { "Radek", "Ola", "Łukasz", "Mirek"};
        int suma1 = 0;
        for ( int i = 0; i < tablica1.length; i++) {
            suma1 += tablica1[i].length();
        }
        System.out.println("Suma STRINGOW = " + suma1);



        String[] tablica2 = { "Radek", "Marek", "DAREK", "BARTEK", "Marek"};
        int suma2 = 0;
        for ( int i = 0; i < tablica2.length; i++) {
            suma2 += tablica2[i].length();
        }
        System.out.println("Suma stringow tablic2 = " + suma2);


        String[] tablica3 = {"Radek", "OoLA", "ADFFSDF", "SDFSDF", "SDFSDFN"};
        int suma3 = 0;
        for (int i = 0; i < tablica3.length; i++) {
            suma3 += tablica3[i].length();
        }
        System.out.println("Suma stringow = " + suma3);


        String[] tablica4 = {"Radek", "OoLA", "ADFFSDF", "SDFSDF", "SDFSDFN", "gsdfsdgsd", "sdfsdfjsd"};
        int suma4 = 0;
        for (int i = 0; i < tablica4.length; i++) {
            suma4 += tablica4[i].length();
        }
        System.out.println("Suma Stringow w tablicy4 = " + suma4);

        String[] tablica5 = {"Rasdfsdfdek", "OoLsdfsA", "ADFsdfFSDF", "SDFSDF", "SDFSDFN", "gsdfsdgsd", "sdfsdfjsd"};
        int suma5 = 0;
        for ( int i = 0; i < tablica5.length; i++) {
            suma5 += tablica5[i].length();
        }
        System.out.println("Suma Stringow z tablica5 = " + suma5);

        String[] tablica6 = {"Tomek", "sdfsdf", "sdfsdf"};
        int suma6 = 0;
        for (int i = 0; i < tablica6.length; i++) {
            suma6 += tablica6[i].length();
        }
        System.out.println("Suma dlugosci stringow tablicy6 = " + suma6);


        String[] tablica7 = { "sdfsdf", "dsdfsdf", "sdfdsf"};
        int suma7 = 0;
        for ( int i = 0; i < tablica7.length; i++) {
            suma7 += tablica7[i].length();
        }
        System.out.println("Suma dlugosci stringow = " + suma7);

        String[] tablica8 = { "sdfsdf", "dsdfsdf", "sdfdsf"};
        int suma8 = 0;
        for (int i = 0; i < tablica8.length; i++) {
            suma8 += tablica8[i].length();
        }
        System.out.println("Suma dlugosci stringow = " + suma8);

        String[] tablica9 = { "sdfkkksdf", "dllsdfsdf", "sdfijdsf"};
        int suma9 = 0;
        for (int i = 0; i < tablica9.length; i++) {
            suma9 += tablica9[i].length();
        }
        System.out.println("Suma elementow tablicy9 = " + suma9);

        String[] tablica10 = { "sdfkkksdf", "dllsdfsdf", "sdfijdsf"};
        int suma10 = 0;
        for ( int i = 0; i < tablica10.length; i++) {
            suma10 += tablica10[i].length();
        }
        System.out.println("Suma stringow na tablicy = " + suma10);



        String[] tablica11 = { "sdfkkksdf", "dllsdfsdf", "sdfijdsf", "sdfsdfdsffsdfzcva"};
        int suma11 = 0;
        for (int i = 0; i < tablica11.length; i++) {
            suma11 += tablica11[i].length();
        }
        System.out.println("Suma dlugosci stringow wynosi = " + suma11);




















    }
}
