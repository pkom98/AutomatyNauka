package MPK;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MPKShowAllBusLines {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));

        HomePage homePage = new HomePage(driver, wait);
        BusNumberPage busNumberPage = new BusNumberPage(driver, wait);

        homePage.getHomePage();
        busNumberPage.ShowAllBusLines();











    }
}
