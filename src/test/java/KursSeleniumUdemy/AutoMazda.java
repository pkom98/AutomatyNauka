package KursSeleniumUdemy;


public class AutoMazda {
    public static void main(String[] args) {

        Auto mazda = new Auto();

        mazda.marka = "Mazda";
        mazda.model = "2";
        mazda.rok = 2006;
        mazda.przebieg = 250000;

        mazda.information();
        mazda.jedz();
    }
}
