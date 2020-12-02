import com.sun.imageio.plugins.wbmp.WBMPImageReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class iframeTutorial {

    public static void main(String[] args) throws InterruptedException {
        // create chrome driver object

        //once driver object is created we will strictly implement methods of webdriver

// invoke .exe file first before we create driver object class

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.guru99.com/handling-iframes-selenium.html");
//        driver.manage().window().maximize();


    }
}
