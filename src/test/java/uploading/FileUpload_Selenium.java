package uploading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ramkumar on 21/04/2017.
 */
public class FileUpload_Selenium {

    static WebDriver driver;

    public static void main(String[] args) throws ParseException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.get("http://qtpselenium.com/test/uploadform/contactform.php");

        driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\Ramkumar\\Desktop\\index.jpg");


    }
}
