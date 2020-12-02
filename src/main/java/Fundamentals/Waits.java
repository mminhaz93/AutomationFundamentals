package Fundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


//https://www.guru99.com/implicit-explicit-waits-selenium.html#4
public class Waits {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriverm");
        WebDriver driver = new ChromeDriver();

        //This maximizes the browser
        driver.manage().window().maximize();

        //Implicit Wait - The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws a "No Such Element Exception".
        //Syntax

        //TimeUnits can be - SECONDS, MINUTES, MILISECOND, MICROSECONDS, NANOSECONDS, DAYS, HOURS, etc.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Explicit Wait - waits for an element to load up or to its maximum time limit
//        WebDriverWait wait = new WebDriverWait(driver,10);

        WebElement input = driver.findElement(By.id("search-input"));;

        WebDriverWait wait = new WebDriverWait(driver,10);
//        WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("item")));

        WebElement textInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-input")));

        textInput.sendKeys("Spider man");



        //Fluent Wait-

/*        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){

            public WebElement apply(WebDriver driver ) {
                return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
            }
        });*/

//        public void waitForElement(WebElement item) {
//
//        }

        //("vfb-7-" + i).click();





    }

}
