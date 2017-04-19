/**
 * Created by Ramkumar on 19/04/2017.
 */
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

    public static void main(String[] args) {
        String test="Hathway Cable & Data";
        // TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver","D://Selenium//geckodriver.exe");

        WebDriver dr=new FirefoxDriver();
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dr.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        dr.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
        //dr.get("http://money.rediff.com/gainers/bse/daily/groupall");
        //dr.findElement(By.xpath("//*[@id='leftcontainer']/div[4]/a[1]")).click();

        List<WebElement> compname=dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
        List<WebElement> curprice=dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
        List<WebElement> percent=dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[5]"));

        System.out.println("compname"+compname.size());
        System.out.println("curprice"+curprice.size());
//		Iterator<WebElement> itr = compname.iterator();
//		Iterator<WebElement> itr2 = curprice.iterator();


        String S=new String();
        S="12";


        System.out.println("value of String"+S);

        for (int i=0;i<compname.size();){

            if(test.contains(compname.get(i).getText()))
            {

                System.out.println(compname.get(i).getText()+"-------"+curprice.get(i).getText()+"Change in percent---"+percent.get(i).getText());
                break;
            }
            else{System.out.println("script not found");
                break;
            }


        }

    }

}
