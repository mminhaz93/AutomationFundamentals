import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoForm {
    public static void main(String[] args) throws InterruptedException {
        // create chrome driver object

        //once driver object is created we will strictly implement methods of webdriver

        // invoke .exe file first before we create driver object class

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();
      driver.get("http://demo.guru99.com/test/newtours/register.php");

        WebElement FirstName =  driver.findElement(By.name("firstName"));
        FirstName.sendKeys("Zunayed");
        Thread.sleep(1000);

        WebElement LastName =  driver.findElement(By.name("lastName"));
        LastName.sendKeys("Mahfuz");
        Thread.sleep(1000);

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("3162227653");
        Thread.sleep(1000);

        driver.findElement(By.xpath(".//*[@id=\"userName\"]")).sendKeys("admin@mztech.us");
        Thread.sleep(1000);

        driver.findElement(By.name("address1")).sendKeys("123 patterson avenue");
        Thread.sleep(1000);

        driver.findElement(By.name("city")).sendKeys("Jamaica");
        Thread.sleep(1000);

        driver.findElement(By.name("state")).sendKeys("New York");
        Thread.sleep(1000);

        driver.findElement(By.name("postalCode")).sendKeys("11435");
        Thread.sleep(1000);

        WebElement country = driver.findElement(By.xpath("//select[@name=\"country\"]"));
        country.click();
        Thread.sleep(1000);

        Select option = new Select(country);
        option.selectByValue("UNITED STATES");

        Thread.sleep(1000);


        driver.findElement(By.id("email")).sendKeys("zunayed.lm@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.name("password")).sendKeys("Zunayed123");
        Thread.sleep(1000);

        driver.findElement(By.name("confirmPassword")).sendKeys("Zunayed123");
        Thread.sleep(1000);


//        Submit
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        Thread.sleep(1000);





    }
}