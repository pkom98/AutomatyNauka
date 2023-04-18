package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import shared.BaseTest;

public class HomePage {

    private ChromeDriver driver;
    private WebDriverWait wait;

    public HomePage(ChromeDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void findHomePage(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    public void fetchHomePage(){
        this.findHomePage();
    }

    public void enterUsername(String username){

        WebElement selectUsername = driver.findElement(By.cssSelector("input[name=\"username\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(selectUsername));
        selectUsername.sendKeys(username);
    }




    public void Username(String username){
        this.enterUsername(username);

    }
    public void enterPassword(String password){
        WebElement selectPassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        wait.until(ExpectedConditions.elementToBeClickable(selectPassword));
        selectPassword.click();
        selectPassword.sendKeys(password);
    }
    public void Password(String password){
        this.enterPassword(password);
    }

    }

