import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class iFrame {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.guru99.com/handling-iframes-selenium.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElements(By.)
    }
}
