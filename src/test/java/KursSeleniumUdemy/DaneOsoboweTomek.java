package KursSeleniumUdemy;

import java.util.ArrayList;
import java.util.List;

public class DaneOsoboweTomek {
    public static void main(String[] args) {

        DaneOsobowe tomek = new DaneOsobowe();

        tomek.imie = "Tomek";
        tomek.nazwisko = "Kowalski";
        tomek.wiek = 24;
        tomek.email = "testingemail@gmail.com";
        tomek.miejsceZamieszkania = "Warszawa";

        tomek.daneUcznia();
    }
}
