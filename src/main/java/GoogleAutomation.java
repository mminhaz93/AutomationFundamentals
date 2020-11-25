import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class GoogleAutomation {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriverm");

        WebDriver driver = new ChromeDriver();

        //This maximizes the browser
        driver.manage().window().maximize();

//        //Navigate to the page
//        driver.get("http://www.google.com"); // 1. This waits for the entire page to load
//        driver.navigate().to("http://www.google.com"); //2. This doesn't wait for the entire page to load
//
//        driver.findElement(By.name("q")).sendKeys("Selenium");
//    	driver.findElement(By.name("q")).clear();
//		driver.findElement(By.name("q")).sendKeys("Java");


//        //Navigate to home page
        driver.get("https://momovies.netlify.app/movies");

//        //Click on contact us button
//        driver.findElement(By.linkText("Contact Us")).click();
//          driver.findElement(By.xpath("//a[contains(text(), 'Contact Us')]")).click();

          String movieName = "Spider-man";
//        //Enter John Doe as name
        driver.findElement(By.id("search-input")).sendKeys(movieName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//ul[@class=\"search-suggest list-group list-group-flush\"]/li[1]//a")).click();

        //Gets the title from website
        String actualMovieTitle = driver.findElement(By.xpath("//header/section//h1")).getText();

//        Assert.assertTrue("Text not found!", bodyText.contains(text));
//        Assert(actualMovieTitle, movieName);

//        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        //Check to see if the movie title matches with what the user searched for
        //Assert.assertEquals(actualMovieTitle.replace("-", " ").toLowerCase(),movieName.replace("-", " ").toLowerCase());
        Assert.assertEquals(handleMovieCase(actualMovieTitle),handleMovieCase(movieName));




//        driver.findElement(By.id("validationCustom02")).sendKeys("mminhaz@gmail.com");
        

//        String name = "\"Minhaz\"";
//        System.out.println(name);

		Thread.sleep(3000);

        //Closing browser
        driver.quit(); // This closes the entire browser
        // driver.close(); // This closes the active tab



    }

    private static String handleMovieCase(String str) {
        String title = str.replace("-", " ").toLowerCase();

        return title;
    }

}