/**
 * Created by Ramkumar on 19/04/2017.
 */

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {
    static WebDriver dr = new ChromeDriver();

    public static void main(String[] args) {
        String test = "Hathway Cable & Data";
    System.setProperty(
        "webdriver.chrome.driver",
        "D:\\Personal Ones\\Sample\\Ten10\\src\\resources\\chromedriver.exe");
        WebDriver dr = new ChromeDriver();
    System.setProperty(
        "webdriver.gecko.driver",
        "D:\\Personal Ones\\Sample\\Ten10\\src\\resources\\geckodriver.exe");

//        WebDriver dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dr.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        dr.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
        //dr.get("http://money.rediff.com/gainers/bse/daily/groupall");
        //dr.findElement(By.xpath("//*[@id='leftcontainer']/div[4]/a[1]")).click();

        List<WebElement> compname = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
        List<WebElement> curprice = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
        List<WebElement> percent = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[5]"));

        System.out.println("compname" + compname.size());
        System.out.println("curprice" + curprice.size());
//		Iterator<WebElement> itr = compname.iterator();
//		Iterator<WebElement> itr2 = curprice.iterator();


        for (int i = 0; i < compname.size();i++) {

            if (test.equals(compname.get(i).getText())) {

                System.out.println(compname.get(i).getText() + "-------" + curprice.get(i).getText() + "Change in percent---" + percent.get(i).getText());
                break;
            }
// else {
//                System.out.println("script not found");
//                break;
//            }


        }

        int row;
        row = getRowWithCellData("99.45");
        System.out.println("Present row number--"+row);

    }

    private static int getRowWithCellData(String s) {
        dr.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
        int rows = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
        int cols = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
        System.out.println("total rows----" + rows);
        System.out.println("total columns----" + cols);

        for (int rNum = 1; rNum <= rows; rNum++) {

            List<WebElement> rowcells = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[" + rNum + "]/td"));
            System.out.println("row number-->" + rNum);
        for (int cNum=0;cNum<rowcells.size();cNum++){

            String text=rowcells.get(cNum).getText();
            System.out.print(text+"------");
            if (text.equals(s)){
                return rNum;
            }

        }
            System.out.println("-------");
        }


        return 0;


    }


}

