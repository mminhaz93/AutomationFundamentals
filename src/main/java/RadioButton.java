
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();

        List<WebElement> radio=driver.findElements(By.xpath("//input[@name='webform' and @type='radio']"));

        for(int i=0; i<radio.size();i++);
        {
            int i=0;
            WebElement local_radio=radio.get(i);
            String value=local_radio.getAttribute("value");
            System.out.println("Values from radio nuttons are======>>>>>" +value);

            if(value.equalsIgnoreCase("Option2"))
            {
                local_radio.click();

                Thread.sleep(5000);
            }
        }


    }
}
