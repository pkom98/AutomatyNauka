package MPK;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import shared.BaseTest;

import java.time.Duration;

public class MPKShowAllBusLines extends BaseTest {
    public static void main(String[] args) {
        MPKShowAllBusLines mpkShowAllBusLines = new MPKShowAllBusLines();
        mpkShowAllBusLines.run();
    }

    @Override
    public void run() {
        HomePage homePage = new HomePage(driver, wait);
        BusNumberPage busNumberPage = new BusNumberPage(driver, wait);

        homePage.getHomePage();
        busNumberPage.ShowAllBusLines();
    }
}
