import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MovieSearchAutomation {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://momovies.netlify.app/movies");

        driver.manage().window().maximize();

        driver.findElement(By.name("query")).sendKeys( "Hard Kill");

        driver.findElement(By.xpath("//ul[@class=\"search-suggest list-group list-group-flush\"]/li[1]//a")).click();

        String MovieName=driver.findElement(By.xpath("//div[@class=\"col-md-8 px-0\"]/h1")).getText();
        System.out.println(MovieName);

        driver.findElement(By.xpath("//button[@class=\"ButtonLink open-model-link\"][1]")).click();


        Thread.sleep(3000);
    }
}
