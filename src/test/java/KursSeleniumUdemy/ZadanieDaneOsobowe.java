package KursSeleniumUdemy;

import java.util.Scanner;

public class ZadanieDaneOsobowe {
    public static void main(String[] args) {

        String[] daneOsobowe = new String[3];

        DaneOsobowe tomek = new DaneOsobowe();
        Scanner nrUcznia = new Scanner(System.in);


        tomek.imie = "Tomek";
        tomek.nazwisko = "Kowalski";
        tomek.wiek = 24;
        tomek.email = "testingemail@gmail.com";
        tomek.miejsceZamieszkania = "Warszawa";

        daneOsobowe[0] = "Imie: " + tomek.imie + "\n" + "Nazwisko: "  + tomek.nazwisko + "\n" + "Wiek: " + tomek.wiek + "\n" + "Email: " + tomek.email + "\n" + "Miasto: " + tomek.miejsceZamieszkania;

        System.out.println("Podaj indeks ucznia -> 0, 1 ,2");
        int uczen0 = nrUcznia.nextInt();


        System.out.println(daneOsobowe[uczen0]);
    }
}
