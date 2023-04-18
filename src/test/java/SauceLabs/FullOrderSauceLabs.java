package SauceLabs;

//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FullOrderSauceLabs {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); // <---------------- WYWOLANIE KONSTRUKTOR
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver, wait); // <---------------- WYWOLANIE KONSTRUKTOR (ZAWSZE Z OPERATOREM NEW)
        BasketPage basketPage = new BasketPage(driver, wait); // <---------------- WYWOLANIE KONSTRUKTOR
        OrderPage orderPage = new OrderPage(driver, wait); // <---------------- WYWOLANIE KONSTRUKTOR

        loginPage.login(); // <----- WYWOLANIE METODY
        basketPage.basketProcess();
        orderPage.OrderProcess("TestName", "TestSurname", "00-000");


//        WebElement BackpackButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
//        BackpackButton.click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")));
//
//        WebElement BikeLightButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
//        BikeLightButton.click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")));
//
//        WebElement BlackTShirtButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
//        BlackTShirtButton.click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")));
//
//        WebElement FleeceJacketButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
//        FleeceJacketButton.click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")));
//
//        WebElement OnesieButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]"));
//        OnesieButton.click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")));
//
//        WebElement RedTShirtButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"));
//        RedTShirtButton.click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"shopping_cart_container\"]/a")));
////
//        WebElement ShoppingCartButton = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
//        ShoppingCartButton.click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkout\"]")));
////
//        WebElement CheckoutButton = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
//            CheckoutButton.click();
////
////
//        WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
//            FirstName.sendKeys("First Name");
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"last-name\"]")));
////
//        WebElement LastName = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
//            LastName.sendKeys("Last Name");
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"postal-code\"]")));
////
//        WebElement PostCode = driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
//            PostCode.sendKeys("00-000");
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"continue\"]")));
////
//        WebElement CheckoutContinueButton = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
//            CheckoutContinueButton.click();
////
//        JavascriptExecutor j = (JavascriptExecutor) driver;
//            j.executeScript("window.scrollBy(0,500)");
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"finish\"]")));
////
//        WebElement CheckoutFinishButton = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
//            CheckoutFinishButton.click();







    }
}


// true && true => true
// true && false => false
// true || false => true
// false || false => false