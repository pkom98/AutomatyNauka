package MPK;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MPKShowBusTimeMain {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));


        HomePage homePage = new HomePage(driver, wait);
        BusNumberPage busNumberPage = new BusNumberPage(driver, wait);

        homePage.getHomePage();
        busNumberPage.BusNumberSelection();
        busNumberPage.BusNumberChoice("017");  // <------- Numer autobusu który Cię interesuje
        busNumberPage.SubmitBusNumber();
        busNumberPage.BusStopNameSearch("Podzamcze"); // <----------- Nazwa/ulica przystanku z którego chcesz sprawdzić
        busNumberPage.SubmitBusStopName("Walecznych 02"); // <---------- Nazwa konkretnego przystanku 01/02








    }
}