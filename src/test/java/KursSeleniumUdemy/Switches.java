package KursSeleniumUdemy;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {

        Scanner posilek = new Scanner(System.in);

        System.out.println("Co chcesz kupic? Do wyboru masz: pizza, frytki, kebab lub burger. Wpisz swoja odpowiedz!");
        String danie = posilek.next();
        switch (danie){
            case "pizza":
                System.out.println("Pizza kosztuje 35zl");
                break;
            case "frytki":
                System.out.println("Frytki kosztuja 10zl");
                break;
            case "kebab":
                System.out.println("Kebab kosztuje 25zl");
                break;
            case "burger":
                System.out.println("Burger kosztuje 43zl");
                break;
            default:
                System.out.println("Nie ma takiego dania w karcie");
        }
    }
}
