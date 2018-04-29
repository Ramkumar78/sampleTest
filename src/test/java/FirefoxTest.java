import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Git\\Ref\\sampleTest\\src\\resources\\chromedriver.exe");

/**        DesiredCapabilities capa = DesiredCapabilities.firefox();
       capa.setCapability("marionette", false);  **/

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String pageTitle=driver.getTitle();

        System.out.println("+++++++++++________________"+pageTitle);

//        driver.quit();

    }
}