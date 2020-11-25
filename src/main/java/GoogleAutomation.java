import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class GoogleAutomation {

    public static void main(String[] args) throws InterruptedException {
        // create chrome driver object

        //once driver object is created we will strictly implement methods of webdriver

// invoke .exe file first before we create driver object class

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://momovies.netlify.app");

        driver.findElement(By.id("search-input")).sendKeys("Hard Kill");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//ul[@class=\"search-suggest list-group list-group-flush\"]/li[1]//a")).click();
        Thread.sleep(1000);

        String getTtitle = driver.findElement(By.xpath("//div[@class=\"col-md-8 px-0\"]/h1")).getText();
        System.out.println(getTtitle);

        String trailer = driver.findElement(By.xpath("//header[@class=\"jumbotron p-3 p-md-3 text-white rounded bg-dark\"]//h3[1]")).getText();
        System.out.println(trailer);


        WebElement firstActor = driver.findElement(By.xpath("(//button[@class=\"ButtonLink open-model-link\"])[3]"));

        String jesse = firstActor.getText();
        firstActor.click();
        System.out.println(jesse);

//        WebElement firstActor  driver.findElement(By.xpath("//button[@cl=ass=\"ButtonLink open-model-link\"][1]"));

//        driver.findElement(By.id("validationCustom02")).sendKeys("zunayed.lm@gmail.com");
//        driver.findElement(By.name("message")).sendKeys("Hi, this is a selenium homework. Test test test test");

//        driver.findElement(By.xpath("//input[@value='Submit']")).click();


//*[@id="basic-navbar-nav"]/form/span/div/ul/li[1]/div/div/a/p

                       /* input
                        attributes
                        value*/
//        driver.findElement(By.id("pass")).sendKeys("123456");
//        driver.findElement(By.linkText("Forgot Password?")).click();
//        driver.findElement(By.id("identify_email")).sendKeys("zunayed.lm@gmail.com");
//        driver.findElement(By.name("did_submit")).click();

//        driver.findElement(By.id("username")).sendKeys("zmahfuz");
//        driver.findElement(By.name("pw")).sendKeys("12345");
//
//        driver.findElement(By.xpath("//*[@id='Login']")).click();
//
//        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());



//        System.out.println(driver.getCurrentUrl()); //this helps to validate if the page title is correct
//        driver.get("https://www.google.com");
//        driver.navigate().to("https://www.yahoo.com");
//        driver.navigate().back();
//        driver.quit();

    }

}
