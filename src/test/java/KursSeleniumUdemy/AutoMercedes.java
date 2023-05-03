package KursSeleniumUdemy;

public class AutoMercedes {
    public static void main(String[] args) {

        Auto mercedes = new Auto();

        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa C";
        mercedes.rok = 2020;
        mercedes.przebieg = 14050;

        mercedes.information();
        mercedes.jedz();
    }
}
