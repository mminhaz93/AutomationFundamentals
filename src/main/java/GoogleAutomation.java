import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleAutomation {

    public static void main(String[] args) throws InterruptedException {
        // create chrome driver object

        //once driver object is created we will strictly implement methods of webdriver

// invoke .exe file first before we create driver object class

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");
//        driver.get("https://momovies.netlify.app");
//
//        driver.findElement(By.id("search-input")).sendKeys("Hard Kill");
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//ul[@class=\"search-suggest list-group list-group-flush\"]/li[1]//a")).click();
//        Thread.sleep(1000);
//
//        String getTtitle = driver.findElement(By.xpath("//div[@class=\"col-md-8 px-0\"]/h1")).getText();
//        System.out.println(getTtitle);
//
//        String trailer = driver.findElement(By.xpath("//header[@class=\"jumbotron p-3 p-md-3 text-white rounded bg-dark\"]//h3[1]")).getText();
//        System.out.println(trailer);
//
//
//        WebElement firstActor = driver.findElement(By.xpath("(//button[@class=\"ButtonLink open-model-link\"])[3]"));
//
//        String jesse = firstActor.getText();
//        firstActor.click();
//        System.out.println(jesse);


        List<WebElement> button = driver.findElements(By.xpath("//input[@name='webform' and @type='radio']"));
        // selecting the Radio buttons by id

        for (int i = 0; i < button.size(); i++) {
            WebElement radio = button.get(i);
            String value = radio.getAttribute("value");

            if (value.equalsIgnoreCase("Option 1")) {
                radio.click();
                Thread.sleep(1000);
            } else if (value.equalsIgnoreCase("Option 2")) {
                radio.click();
                Thread.sleep(1000);

            } else if (value.equalsIgnoreCase("Option 3")) {
                radio.click();
                Thread.sleep(1000);

            }
        }
        List<WebElement> checkbox = driver.findElements(By.xpath("//input[@name='webform' and @type='checkbox']"));

        for (int j = 0; j < checkbox.size(); j++) {
            WebElement element = checkbox.get(j);
            String val = element.getAttribute("value");

            if (val.equalsIgnoreCase("Checkbox1")) {
                element.click();
                Thread.sleep(1000);

            } else if (val.equalsIgnoreCase("Checkbox2")) {
                element.click();
                Thread.sleep(1000);

            } else if (val.equalsIgnoreCase("Checkbox3")) {
                element.click();
                Thread.sleep(1000);
                break;
            }

        }

    }
}