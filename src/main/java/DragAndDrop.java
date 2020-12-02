import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32");

        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        Actions act=new Actions(driver);
        act.clickAndHold();

        //BoxA
        WebElement boxa = driver.findElement(By.id)

    }
}
