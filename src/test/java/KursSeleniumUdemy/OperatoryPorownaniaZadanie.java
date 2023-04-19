package KursSeleniumUdemy;

import java.util.Scanner;

public class OperatoryPorownaniaZadanie {
    public static void main(String[] args) {

        Scanner liczba = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        int pierwszaLiczba = liczba.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int drugaLiczba = liczba.nextInt();

        boolean result = pierwszaLiczba > drugaLiczba;
        if (pierwszaLiczba > drugaLiczba) {
            System.out.println("Pierwsza liczba jest wieksza niz druga liczba, wiec: " + result);
        } else if (pierwszaLiczba == drugaLiczba) {
            System.out.println("Podane liczby są takie same!");
        } else {
            System.out.println("Pierwsza liczba jest mniejsza niz druga liczba, wiec: " + result);
        }

    }
}
