package DemoQA;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplicationFormDemoQA {

    public static void main(String[] args) throws InterruptedException {


//        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("TypicalFirstName");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("TypicalLastName");
        driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("tester123124222@gmail.com");

        WebElement RadioButton = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
        RadioButton.click();
        driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("7874544258");
        driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
        driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).click();

        WebElement ClickMonth = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[6]"));
        ClickMonth.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[98]")));

        WebElement ClickYear = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[98]"));
        ClickYear.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]")));

        WebElement ClickDay = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]"));
        ClickDay.click();

        WebElement Subjects = driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
        Subjects.sendKeys("Com");
        Thread.sleep(20);
        Subjects.sendKeys(Keys.ENTER);
        Thread.sleep(20);

        WebElement ClickHobbiesSports = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]"));
        ClickHobbiesSports.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]")));

        WebElement ClickHobbiesReading = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]"));
        ClickHobbiesReading.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]")));

        WebElement ClickHobbiesMusic = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]"));
        ClickHobbiesMusic.click();


        WebElement AddPicture = driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]"));
        AddPicture.sendKeys("C:\\Users\\Paweł\\Desktop\\cat.jpg");


        WebElement CurrentAddress = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
        CurrentAddress.sendKeys("Warszawska 15, Warszawa, 12-162");


        WebElement StateList = driver.findElement(By.xpath("//input[@id=\"react-select-3-input\"]"));
        StateList.sendKeys("Haryana");
        Thread.sleep(100);
        StateList.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(100);
        StateList.sendKeys(Keys.ENTER);
        System.out.println("Completed State Selection");

        WebElement CityList = driver.findElement(By.xpath("//input[@id=\"react-select-4-input\"]"));
        CityList.sendKeys("Panipat");
        Thread.sleep(100);
        CityList.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(100);
        CityList.sendKeys(Keys.ENTER);
        System.out.println("Completed City Selection");


        WebElement ClickSubmit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        ClickSubmit.click();
        Thread.sleep(3000);


    }

}

