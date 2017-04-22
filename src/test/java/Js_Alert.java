import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Ramkumar on 22/04/2017.
 */
public class Js_Alert {

    public static void main(String[] args) {

        WebDriver dr = new FirefoxDriver();
        dr.manage().window().maximize();

        dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
        dr.findElement(By.name("proceed")).click();
        WebDriverWait wait = new WebDriverWait(dr, 20);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert al = dr.switchTo().alert();
        System.out.println(al.getText());
        al.accept();

        dr.switchTo().defaultContent();

    }
}
