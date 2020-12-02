import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Navigate to google
        driver.get("http://www.google.com"); // will navigate and wait till the entire page is loaded
        //driver.navigate().to("http://www.google.com"); // Take you to the page and not wait

        //Find text box AND search for selenium
        //driver.findElement(By.name("q")).sendKeys("Selenium");
        // driver.findElement(By.name("q")).clear();
		//driver.findElement(By.name("q")).sendKeys("Java");


        //Navigate tp home page
        driver.get("https://momovies.netlify.app/movies");

        //Click on contact us button
        driver.findElement(By.linkText("Contact Us")).click();

        //Click on Name and type Chandrika Dey
        driver.findElement(By.name("name")).sendKeys( "Chandrika Dey");

        //Click on email and type abcd@gmail.com
        driver.findElement(By.name("email")).sendKeys( "abcd@gmail.com");

        //Click on message box and type your message
        driver.findElement(By.name("message")).sendKeys( "Hey I want to know detail about the movie");
        driver.findElement(By.linkText("Send")).click();


        //Optimized version
        var
        search_box = driver.findElement(By.name("q"));
        search_box.sendKeys("Selenium");
		//search_box.clear();
		//search_box.sendKeys("Java");

        //Find search button
        WebElement googleSearchButton = driver.findElement(By.xpath("//div[@class='tfB0Bf']//input[@name='btnK']"));

        //Click search button - click()
        googleSearchButton.click();


		// Not needed but forcing the browser to wait for 4 seconds
        Thread.sleep(4000);

        // Check if title is Google
        String actualTitle = driver.getTitle();

		//System.out.println("Page title: " + actualTitle);

		//Boolean result = actualTitle.equals("Google");
		//System.out.println("Page title is Google ?  " + result);

        if (actualTitle.contentEquals("Google")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }


        // close browser
        driver.close();



    }

}