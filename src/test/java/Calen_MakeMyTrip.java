import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ramkumar on 20/04/2017.
 */
public class Calen_MakeMyTrip {
    static WebDriver driver;

    public static void main(String[] args) {


        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.get("http://makemytrip.com");

        driver.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();
        //selectDate("12/12/2017");

        }

        public void selectDate(String Date){



        }
}