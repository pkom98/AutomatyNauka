package KursSeleniumUdemy;

public class PetlaFor {
    public static void main(String[] args) throws InterruptedException {

        int number = 60;

        for (int i=0; i<=number; i++){
            System.out.println(i);
            Thread.sleep(100);
        }
    }
}
