package SauceLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private ChromeDriver driver;
    private WebDriverWait wait;

    //STATIC OZNACZA ZE NIE TRZEBA TWORZYC INSTANCJI KLASY ZEBY SIE ODWOLAC DO ZMIENNEJ LUB METODY
    public static final String TEST_STRING = "TEST_STRING";
    public static void someMethod() {

    }

    //.GyAeWb  <---- cssSelector
    //#jakiesID  <---- cssSelector
    //GyAeWb className (bez kropki)

    private static final String USERNAME_XPATH = "//*[@id=\"user-name\"]";
    private static final String PASSWORD_XPATH = "//*[@id=\"password\"]";
    private static final String LOGIN_XPATH = "//*[@id=\"login-button\"]";

    public LoginPage(ChromeDriver driver, WebDriverWait wait) { // <---------------- KONSTRUKTOR
        this.driver = driver;
        this.wait = wait;
    }

    public LoginPage() {

    }

    public void setUsername(String username) {
        WebElement Username = driver.findElement(By.xpath(USERNAME_XPATH));
        Username.click();
        Username.sendKeys(username);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PASSWORD_XPATH)));
    }

    public void setPassword(String password){
        WebElement Password = driver.findElement(By.xpath(PASSWORD_XPATH));
        Password.click();
        Password.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LOGIN_XPATH)));
    }

    public void clickLoginButton(){
        WebElement LoginButton = driver.findElement(By.xpath(LOGIN_XPATH));
        LoginButton.click();
    }

    public void login() {
        this.setUsername("standard_user");
        this.setPassword("secret_sauce");
        this.clickLoginButton();

    }
    public void login(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
        this.clickLoginButton();

    }

}
