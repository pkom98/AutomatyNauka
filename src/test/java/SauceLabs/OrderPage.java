package SauceLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OrderPage {

    private ChromeDriver driver;
    private WebDriverWait wait;


    public OrderPage(ChromeDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;

    }

    public void setFirstName(String firstName){
        WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        FirstName.sendKeys(firstName);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"last-name\"]")));
    }

    public void setLastName(String lastName){
        WebElement LastName = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        LastName.sendKeys(lastName);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"postal-code\"]")));
    }

    public void setPostCode(String postCode){
        WebElement PostCode = driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
        PostCode.sendKeys(postCode);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"continue\"]")));
    }

    public void continueToCheckout(){
        WebElement CheckoutContinueButton = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        CheckoutContinueButton.click();
    }

    public void finishCheckout(){
        WebElement CheckoutFinishButton = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
        CheckoutFinishButton.click();
    }

    public void scrollDownOnCheckoutPage(){
        driver.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"finish\"]")));
    }
    public void OrderProcess(String firstName, String lastName, String postCode) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPostCode(postCode);
        this.continueToCheckout();
        this.scrollDownOnCheckoutPage();
        this.finishCheckout();
    }
}










