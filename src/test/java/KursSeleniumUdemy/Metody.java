package KursSeleniumUdemy;

import java.util.Scanner;

public class Metody {

    int firstNumber;
    int secondNumber;
    int numberPetla;
    int yourOption;

    public void komunikat() {
        System.out.println("Licze wynik...");
    }

    public void scannerAndWynik() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        this.firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        this.secondNumber = scanner.nextInt();
        int wynik = firstNumber + secondNumber;
        System.out.println("Wynik to: " + wynik);
    }


    public void negOrPos() {
        int wynik = firstNumber + secondNumber;
        if (wynik > 0) {
            System.out.println(wynik + " jest pozytywny");
        } else if (wynik < 0) {
            System.out.println("Wynik jest negatywny");
        } else {
            System.out.println("Wynik to 0");

        }
    }


    public int returnWynik() {

        System.out.println("Licze wynik");
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = result + 1;
            System.out.println("Wynik to " + result);
        }
        return result;
    }


    public void policzWynikParam(int number) {
        System.out.println("Petla bedzie biegla " + number + " razy");
        for (int i = 1; i <= number; i++){
            System.out.println("Lece " + i + " raz");
        }
    }

    public void policzWynikParamScanner() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile razy ma biec petla: ");
        this.firstNumber = scanner.nextInt();
        System.out.println("Petla bedzie biegla " + firstNumber + " razy");
        System.out.println("Daj mi chwile...");
        Thread.sleep(2000);
        for (int i = 1; i <= firstNumber; i++){
            System.out.println("Petla leci " + i + " raz");
            Thread.sleep(500);
            }
        }
    public void showNumber(int number) {
        System.out.println(number);
    }


    public void add(int no1, int no2) {
        System.out.println(no1 + no2);
    }




    public void welcomeToCalculator() throws InterruptedException {
        System.out.println("Witaj w kalkulatorze!");
        Thread.sleep(1000);
        System.out.println("Zaraz poprosze cie o liczby, zebym mogl zrobic dla ciebie kalkulacje.");
        Thread.sleep(1000);
        for (int i = 3; i>=0; i--){
            System.out.println(i + "...");
            Thread.sleep(500);
        }
    }
    public void giveNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        this.firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        this.secondNumber = scanner.nextInt();
    }

    public void yourNumbers(){
        System.out.println("Twoje liczby to: " + firstNumber + " i " + secondNumber);
    }

    public void options(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Co chcesz zrobic? \n");
        System.out.println("1. Dodawanie.");
        System.out.println("2. Mnozenie.");
        System.out.println("3. Dzielenie.");
        System.out.println("4. Odejmowanie.");
        System.out.println("Twoj wybor: ");

        int dodawanie = firstNumber + secondNumber;
        int mnozenie = firstNumber * secondNumber;
        int dzielenie = firstNumber / secondNumber;
        int odejmowanie = firstNumber - secondNumber;

        int yourOption = scanner1.nextInt();
        switch (yourOption){
            case 1:
                System.out.println("Wybrales dodawanie!");
                System.out.println("Wynik to: " + dodawanie);
                break;
            case 2:
                System.out.println("Wybrales mnozenie!");
                System.out.println("Wynik to: " + mnozenie);
                break;
            case 3:
                System.out.println("Wybrales dzielenie!");
                System.out.println("Wynik to: " + dzielenie);
                break;
            case 4:
                System.out.println("Wybrales odejmowanie!");
                System.out.println("Wynik to: " + odejmowanie);
                break;
            default:
                System.out.println("Nie ma takiej opcji, sprobuj ponownie!");
        }
    }

}
