import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Webtables {

        public static void main (String[]args) throws InterruptedException {
            // create chrome driver object

            //once driver object is created we will strictly implement methods of webdriver

            // invoke .exe file first before we create driver object class

            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.get("http://demo.guru99.com/test/web-table-element.php");

            int col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th")).size();
            //I am using x-path to locate the rows & columns
            System.out.println("No of columns are: " + col); //No of columns

        //Number of rows
        int rows = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]")).size();
            System.out.println("No of rows are: " + rows);


//fetching the data from the table
            for(int i = 1; i <= rows; i++) {
                for(int j = 1; j <= col; j++) {
                    System.out.println(driver.findElement(By.xpath(".//*[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]/*[" + j + "]")).getText() + " ");
                }
                System.out.println();  //TO GET A NEW LINE AFTER EVERY COLUMN WE NEED THIS
            }
        }
    }
