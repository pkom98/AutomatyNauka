package KursSeleniumUdemy;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        Scanner liczba = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = liczba.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = liczba.nextInt();
        int resultDodawania = firstNumber+secondNumber;
        int resultMnozenia = firstNumber*secondNumber;
        float resultDzielenia = (float) firstNumber /secondNumber;
        System.out.println("Dodawanie: " + resultDodawania);
        System.out.println("Mnozenie: " + resultMnozenia);
        System.out.println("Dzielenie: " + resultDzielenia);

    }
}
