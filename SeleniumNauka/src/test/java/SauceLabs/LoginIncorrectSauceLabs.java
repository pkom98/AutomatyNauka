package SauceLabs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginIncorrectSauceLabs {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.login("IncorrectUser", "IncorrectPassword");

    }
}
