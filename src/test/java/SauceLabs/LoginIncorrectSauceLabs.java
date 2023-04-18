package SauceLabs;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import shared.BaseTest;

import java.time.Duration;

public class LoginIncorrectSauceLabs extends BaseTest {
    public static void main(String[] args) {
        LoginIncorrectSauceLabs labs = new LoginIncorrectSauceLabs();
        labs.run();
    }

    @Override
    public void run() {
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.login("IncorrectUser", "IncorrectPassword");
    }
}
