import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();

        WebElement element=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select sel=new Select(element);
        sel.selectByVisibleText("Option 1");

        WebElement firstEle = sel.getFirstSelectedOption();
        System.out.println("first element = "+firstEle.getText());

        List<WebElement> listOptions=sel.getOptions();
        for (WebElement webElement : listOptions) {
            System.out.println("options -"+webElement);

            Thread.sleep(5000);

        }
    }
}

