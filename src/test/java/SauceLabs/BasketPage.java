package SauceLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketPage {

    private ChromeDriver driver;
    private WebDriverWait wait;

    public BasketPage(ChromeDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void addItemsToBasket(){
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
    }

    public void clickShoppingCart(){
        WebElement ShoppingCartButton = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        ShoppingCartButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkout\"]")));
    }

    public void clickCheckout(){
        WebElement CheckoutButton = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        CheckoutButton.click();
    }

    public void basketProcess(){
        this.addItemsToBasket();
        this.clickShoppingCart();
        this.clickCheckout();
    }



}
