package MPK;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BusNumberPage {

    private ChromeDriver driver;
    private WebDriverWait wait;

    public BusNumberPage(ChromeDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void expandBusNumberList(){
        WebElement showBusNumberList = driver.findElement(By.id("lin_search"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("lin_search")));
        showBusNumberList.click();
    }
    public void BusNumberSelection(){
        this.expandBusNumberList();

    }
    public void chooseBusNumber(String busNumber){
        Select busNumberDropDown = new Select(driver.findElement(By.id("lin_search")));
        busNumberDropDown.selectByVisibleText(busNumber);
    }
    public void BusNumberChoice(String busNumber){
        this.chooseBusNumber(busNumber);
    }

    public void confirmBusNumberSelection(){
        WebElement clickSubmitButton = driver.findElement(By.cssSelector("#middle-area > form:nth-child(14) > input[type=submit]"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#middle-area > form:nth-child(14) > input[type=submit]")));
        clickSubmitButton.click();
    }

    public void SubmitBusNumber(){
        this.confirmBusNumberSelection();
    }

    public void enterBusStopName(String busStopName){
        WebElement busStopSearch = driver.findElement(By.id("nazwa_ulicy_q"));
        busStopSearch.click();
        busStopSearch.sendKeys(busStopName);
        busStopSearch.sendKeys(Keys.ENTER);
    }

    public void BusStopNameSearch(String busStopName) {
        this.enterBusStopName(busStopName);
    }

    public void selectBusStop(String busStopFinalName) {
        WebElement busStopFinalSelection = driver.findElement(By.linkText(busStopFinalName));
        busStopFinalSelection.click();
    }

    public void SubmitBusStopName(String busStopFinalName) {
        this.selectBusStop(busStopFinalName);
    }

    public void getAllBusLines(){
        WebElement AllBusLines = driver.findElement(By.id("lin_search"));
        Select selectAllBusLines = new Select(AllBusLines);
        List<WebElement> allBusLines = selectAllBusLines.getOptions();
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < allBusLines.size(); i++){
            String line = allBusLines.get(i).getText();
            lines.add(line);
        }
        System.out.println(lines);

    }

    public void ShowAllBusLines(){
        this.getAllBusLines();
    }


    }






