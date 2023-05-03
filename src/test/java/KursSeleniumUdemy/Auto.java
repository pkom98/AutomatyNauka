package KursSeleniumUdemy;

public class Auto {

    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    public void information(){
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rok);
        System.out.println("Przebieg: " + przebieg + "km");
    }

    public void jedz(){
        System.out.println( marka + " jedzie!");
    }

}
