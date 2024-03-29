import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;


/**
 * Created by Ramkumar on 22/04/2017.
 */
public class Js_Alert {

    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.gecko.driver",".\\src\\resources\\geckodriver.exe");

        WebDriver dr = new FirefoxDriver();
        dr.manage().window().maximize();

        dr.get("bbc.co.uk");

//        dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
        dr.findElement(By.name("proceed")).click();
        WebDriverWait wait = new WebDriverWait(dr, 20);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert al = dr.switchTo().alert();
        System.out.println(al.getText());
        al.accept();

        dr.switchTo().defaultContent();
Robot rb=new Robot();
dr.get("https://bbc.co.uk");
//rb.keyPress(KeyEvent,VK_LEFT);
    }
}
