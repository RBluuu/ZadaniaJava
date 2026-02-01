package com.java.course.com.projektwycieczka;

public class Main {
    public static void main(String[] args) {

        /*
        Dopracowac diagram klas w UML (uzupelnic atrybuty, asocjacdzie)
        Asocjacja miedzy Klientem a wycieczkami w kodzie...
        Na razie pominac dziedziczenie w Pracownikach....
         */

        //Klient zarejestrowany
        /*Klient klient1Zarejestrowany = new KlientZarejestrowany("Radek","Blauciak","r.blauciak@gmail.com",888666555,1);
        Klient klient125Zarejestrowany = new KlientZarejestrowany("Marek","Nowak","m.nowak@gmail.com",684554333,125);
        Klient klient1000Zarejestrowany = new KlientZarejestrowany("Wojtek","Kowalski","w.kowalski@gmail.com",99966655,1000);
        Klient klient666Zarejestrowany = new KlientZarejestrowany("Darek","Mrozek","d.mrozek@gmail.com",222333665,666);
        Klient klient13Zarejestrowany = new KlientZarejestrowany("Michal","Adamski","m.adamski@gmail.com",987654321,13);



        //Klient niezarejestrowany
        Customer customer1Niezarejestrowany = new UnregisteredCustomer("Lukasz","Nowik","l.nowik@gmail.com",987666444);
        Customer customer2Niezarejestrowany = new UnregisteredCustomer("Darek","Kruk","d,kruk@gmail.com",856453212);
        Customer customer3Niezarejestrowany = new UnregisteredCustomer("Piotr","Gora","p.gorak@gmail.com",725666123);
        Customer customer4Niezarejestrowany = new UnregisteredCustomer("Dawid","Bialy","d.bialy@gmail.com",775987656);
        Customer customer5Niezarejestrowany = new UnregisteredCustomer("Norbert","Pargorski","n.pagorski@gmail.com",798564654);

        //Pracownik - Menager
        Employee arek = new Manager("Arek","Gozdowski","a.gozdowski@gmail.com",665459687,10000, TypeOfContract.EMPLOYMENT_CONTRAT,160,1500);
        Employee sebastian = new Manager("Sebastian","Jaruzelski","s.jaruzelski@gmail.com",666564326,8000, TypeOfContract.WORK_CONTRACT,160,300);

        //Pracownik - Pracownik Obslugi
        Employee mariusz = new EmployeeObslugi("Mariusz","Bobr","m.bobr@gmail.com",956425321,5500, TypeOfContract.EMPLOYMENT_CONTRAT,160,1);
        Employee mikolaj = new EmployeeObslugi("Mikolaj","Las","m.lasr@gmail.com",456123265,5000, TypeOfContract.WORK_CONTRACT,160,2);
        Employee dominik = new EmployeeObslugi("Dominik","Niebo","d.niebo@gmail.com",555625321,4500, TypeOfContract.EMPLOYMENT_CONTRAT,160,3);
        Employee kamil = new EmployeeObslugi("Kamil","Jeziorak","k.jeziorak@gmail.com",848956652,4000, TypeOfContract.TEMPORARY_CONTRACT,160,4);


        //Karta informacyjna do wycieczek krajowych
        InformationCard informacyjnaOWycieczceDoZakopanego = new InformationCard("Wycieczka 7 dniowa","Tylko 1 bagaz do 30kg","Wycieczka powyzej 18 roku zycia");
        InformationCard informacyjnaOWycieczceDoGdanska = new InformationCard("Wycieczka 3 dniowa","Tylko 1 bagaz do 15kg","Wycieczka powyzej 18 roku zycia");
        InformationCard informacyjnaOWycieczceDowWarszawy = new InformationCard("Wycieczka 4 dniowa","Tylko 1 bagaz do 15kg","Wycieczka powyzej 15 roku zycia");

        //Karta informacyjna do wycieczek zagranicznych
        InformationCard informacyjnaOWycieczceDoGrecji = new InformationCard("Wycieczka 7 dniowa","Bagaz podreczny do samolotu i bagaz rejestrowany do 30kg","Hotele tylko +18");
        InformationCard informacyjnaOWycieczceDoWloch= new InformationCard("Wycieczka 10 dniowa","Bagaz podreczny do samolotu i bagaz rejestrowany do 30kg, prosimy zabrac swoje prawojazdy","Hotele tylko +18");
        InformationCard informacyjnaOWycieczceDoHiszpani = new InformationCard("Wycieczka 3 dniowa","Bagaz podreczny do samolotu i bagaz rejestrowany do 30kg","Hotele tylko dostepne dla kazdego przedzialu wiekowego");

        //Wycieczki krajowe
        Trip zakopane = new DomesticTrip(1,"Ty i Zakopane",2900, List.of(ThemeOfTrip.RELAXATION),10,informacyjnaOWycieczceDoZakopanego,"Zakopane");
        Trip gdansk = new DomesticTrip(2,"Gdanska aktywnosc",2200, List.of(ThemeOfTrip.ACTIVITY),9,informacyjnaOWycieczceDoGdanska,"Gdansk");
        Trip warszawa = new DomesticTrip(3,"Zwiedzamy wawe",2000, List.of(ThemeOfTrip.SIGHTSEEING),8,informacyjnaOWycieczceDowWarszawy,"Warszawa");

        //Wycieczka zagraniczna
        Trip grecja = new AbroadTrip(1,"Sloneczna Grecja",4999, List.of(ThemeOfTrip.RELAXATION),10,informacyjnaOWycieczceDoGrecji,"Grecja","Samolot");
        Trip wlochy = new AbroadTrip(1,"Wloskie przysmaki",7499, List.of(ThemeOfTrip.SIGHTSEEING),10,informacyjnaOWycieczceDoWloch,"Wlochy","Samolot i samochod");
        Trip hiszpania = new AbroadTrip(1,"Goraca Hiszpania",3499, List.of(ThemeOfTrip.ACTIVITY),8,informacyjnaOWycieczceDoHiszpani,"Hiszpania","Samolot i transport miejski");

        //Pracownik - Przewodnik
        Employee przemek = new TourGuide("Przemek","Nowak","p.nowak@gmail.com",756632895,5000, TypeOfContract.EMPLOYMENT_CONTRAT,120,List.of("Angielski","Niemiecki"));
        Employee irek = new TourGuide("Irek","Mis","i.mis@gmail.com",765846956,3500, TypeOfContract.TEMPORARY_CONTRACT,30,List.of("Czeski"));
        Employee mirek = new TourGuide("Mirek","Owczarek","m.owczarek@gmail.com",741231223,9000, TypeOfContract.WORK_CONTRACT,120,List.of("Hiszpanski","Wloski"));

        //1. Poprawic nazwy np. Zarejerstrowana, ale co zarejerestrowana? WycieczkaZarejerstrowana
        //2. Klient powinien byc abstract, wycieczka tez
        //3. Dodac Klase KupnoWycieczki i przechowywaac tam date wycieczki od i do
        //3.1 Relacje miedz Wycieczka, Klientem a Pracownikeim przerobic na wiele do wiele z atrybutem
        //4. Poprawic relacje Zarejerstrowany -> KupnoWycieczki  <- Obsługa ( dodac Wycieczke do Rezerwacji)


            List<RegisteredCustomer> klienci = new ArrayList<>( List.of(
                    new RegisteredCustomer("Radek","Blauciak","r.blauciak@gmail.com",888666555,1),
                    new RegisteredCustomer("Marek","Nowak","m.nowak@gmail.com",684554333,125),
                    new RegisteredCustomer("Wojtek","Kowalski","w.kowalski@gmail.com",99966655,1000),
                    new RegisteredCustomer("Darek","Mrozek","d.mrozek@gmail.com",222333665,666),
                    new RegisteredCustomer("Michal","Adamski","m.adamski@gmail.com",987654321,13)
            ));

            SwingUtilities.invokeLater(() -> {
                new ListaKlientowFrame(klienci).setVisible(true);
            });
        }
}
/*
Zadania domowe:
0.!!! przepisac to na angielski - nazwy klas
1. Dodaj przycisk ktory wyswietli informacje ktory klient wydal najwiecej
2. * ListaKlientowFrame i wydziel mniejsze metody
 */
    }
}