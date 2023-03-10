package SauceLabs;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginCorrectSauceLabs {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        WebElement Username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
            Username.click();
            Username.sendKeys("standard_user");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]")));

        WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
            Password.click();
            Password.sendKeys("secret_sauce");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-button\"]")));

        WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
            LoginButton.click();




    }

    //Podejscie nr 1 z metoda statyczna i parametrami do przekazania
    public static void login(ChromeDriver driver, WebDriverWait wait) {
        WebElement Username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        Username.click();
        Username.sendKeys("standard_user");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]")));

        WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        Password.click();
        Password.sendKeys("secret_sauce");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-button\"]")));

        WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        LoginButton.click();
    }

}
