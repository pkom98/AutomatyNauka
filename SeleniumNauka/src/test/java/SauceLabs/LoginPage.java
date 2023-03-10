package SauceLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private ChromeDriver driver;
    private WebDriverWait wait;

    public String loginPageName = "login";
    public LoginPage(ChromeDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void setUsername(String username) {
        WebElement Username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        Username.click();
        Username.sendKeys(username);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]")));
    }

    public void login() {
        this.setUsername("standard_user");

        WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        Password.click();
        Password.sendKeys("secret_sauce");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-button\"]")));

        WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        LoginButton.click();
    }

}
