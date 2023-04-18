package SauceLabs;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddAllBasketSauceLabs {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
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

        WebElement BackpackButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
            BackpackButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")));

        WebElement BikeLightButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
            BikeLightButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")));

        WebElement BlackTShirtButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
            BlackTShirtButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")));

        WebElement FleeceJacketButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
            FleeceJacketButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")));

        WebElement OnesieButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]"));
            OnesieButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")));

        WebElement RedTShirtButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"));
            RedTShirtButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"shopping_cart_container\"]/a")));

        WebElement ShoppingCartButton = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
            ShoppingCartButton.click();

    }
}
