package MPK;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import shared.BaseTest;

import java.time.Duration;

public class MPKShowBusTimeMain extends BaseTest {
    public static void main(String[] args){
        MPKShowBusTimeMain main = new MPKShowBusTimeMain();
        main.run();
    }

    @Override
    public void run() {
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
