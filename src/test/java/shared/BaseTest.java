package shared;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseTest {

    protected ChromeDriver driver;
    protected WebDriverWait wait;

    public BaseTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pawel\\Desktop\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofMillis(10000));
    }

    public abstract void run();

    public ChromeDriver getDriver() {
        return this.driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
