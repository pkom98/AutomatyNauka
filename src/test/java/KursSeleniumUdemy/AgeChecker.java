package KursSeleniumUdemy;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {

        Scanner wiek = new Scanner(System.in);

        System.out.println("Zamierzasz kupić alkohol, ile masz lat?");
        int ileLat = wiek.nextInt();

        if (ileLat >=18){
            System.out.println("Jestes pelnoletni, mozesz kupic alkohol");
        } else {
        System.out.println("Nie masz 18 lat, nie mozesz kupic alkoholu");
        }

    }
}
