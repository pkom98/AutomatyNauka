package KursSeleniumUdemy;

import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {

        String[] summerMonths = new String[3];
        summerMonths[0] = "Maj";
        summerMonths[1] = "Czerwiec";
        summerMonths[2] = "Lipiec";

        System.out.println("Wybierz który miesiac wyświetlic: 0-Maj, 1-Czerwiec, 2-Lipiec");
        Scanner choice = new Scanner(System.in);
        int wybor = choice.nextInt();
        System.out.println(summerMonths[wybor]);
    }
}
