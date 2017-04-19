import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Rediff_Table {
    static WebDriver driver;
    public static void main(String[] args) {

        String companyName="Shipping Corpn.";
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

        List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
        List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));

        System.out.println("Total company names -> "+companyNames.size());
        System.out.println("Total current prices -> "+currentPrices.size());

        for(int i=0;i<companyNames.size();i++){
            if(companyName.equals(companyNames.get(i).getText())){
                System.out.println(companyNames.get(i).getText()+" ----- "+currentPrices.get(i).getText() );
                break;
            }
        }


        int row = getRowWithCellData("79.25");
        System.out.println("Present row num - "+ row);

    }

    public static int getRowWithCellData(String data){
        int rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
        int cols = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
        System.out.println("Total rows - "+ rows);
        System.out.println("Total cols - "+ cols);

        for(int rNum=1;rNum<=rows;rNum++){
            System.out.println("Row is-> "+rNum );
            List<WebElement> rowCells = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+rNum+"]/td"));
            //System.out.println("Total cells-> " +rowCells.size());

            for(int cNum=0;cNum<rowCells.size();cNum++){
                String text = rowCells.get(cNum).getText();
                System.out.print(text+"----");
                if(text.equals(data)){//found
                    return rNum;
                }
                //if(text.contains(data))

            }
            System.out.println();// new line - next row

        }

        return 0;

    }

}
