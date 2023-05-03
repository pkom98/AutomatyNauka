package KursSeleniumUdemy;

public class AutoBMW {
    public static void main(String[] args) {

        Auto bmw = new Auto();

        bmw.marka = "BMW";
        bmw.model = "E91";
        bmw.rok = 2005;
        bmw.przebieg = 250000;


        bmw.information();
        bmw.jedz();

    }
}
