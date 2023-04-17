package MPK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private ChromeDriver driver;
    private WebDriverWait wait;



    public HomePage(ChromeDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void fetchHomePage(){
        driver.get("https://www.mpk.lublin.pl");
        driver.manage().window().maximize();
    }

    public void acceptCookies(){
        WebElement acceptCookiesButton = driver.findElement(By.xpath("/html/body/div[3]/div/a"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/a")));
        acceptCookiesButton.click();
    }

    public void getHomePage(){
        this.fetchHomePage();
        this.acceptCookies();
    }

}
