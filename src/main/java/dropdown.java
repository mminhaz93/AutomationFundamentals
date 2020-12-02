import com.sun.imageio.plugins.wbmp.WBMPImageReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class dropdown {

    public static void main(String[] args) throws InterruptedException {
        // create chrome driver object

        //once driver object is created we will strictly implement methods of webdriver

// invoke .exe file first before we create driver object class

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
//        driver.manage().window().maximize();

        WebElement drop_down = driver.findElement(By.id("dropdown"));
        drop_down.click();
        Select option = new Select(drop_down); //object name is "option here and it will select the dropdown id
        option.selectByIndex(1);       //indexing is not a good option cause if we later add a value it will not work.

        Thread.sleep(3000);
        //It will select Option 1
        option.selectByValue("2");

        Thread.sleep(3000);
        //THIS WILL SELECT OPTION 2
        option.selectByVisibleText("Option 2");     //this is a good option even if we change the value the visible text won't change.
                                                //interview question(What is it;s case sensitive??)



        //THIS IS A METHOD TO CAPTURE SELECTED DROPDOWN TEXT
        WebElement select_value = option.getFirstSelectedOption();

        System.out.println("After selection selected value is " + select_value.getText());

        option.selectByIndex(1);

        WebElement select_value2 = option.getFirstSelectedOption();
        System.out.println("After selection select the value is " + select_value2.getText());


    }
}




//Select tag dropdown---
//3 different ways to select the dropdowns