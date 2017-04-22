import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Calen_MakeMyTrip {
    static WebDriver driver;
    public static void main(String[] args) throws ParseException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.get("http://makemytrip.com");

        driver.findElement(By.xpath("//*[@id='start_date_sec']/span[2]")).click();
        selectDate("02/12/2015");
    }


    public static void selectDate(String date) throws ParseException{
        SimpleDateFormat df =  new SimpleDateFormat("dd/MM/yyyy");
        Date dateToBeSelected = df.parse(date);
        Date currentDate = new Date();
        String monthYearDisplayed=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div")).getText();
        System.out.println(monthYearDisplayed);
        String  month =  new SimpleDateFormat("MMMM").format(dateToBeSelected);
        String year = new SimpleDateFormat("yyyy").format(dateToBeSelected);
        String day = new SimpleDateFormat("d").format(dateToBeSelected);
        String monthYearToBeSelected=month+" "+year;
        System.out.println(monthYearToBeSelected);

        while(true){
            if(monthYearToBeSelected.equals(monthYearDisplayed)){
                //select date
                driver.findElement(By.xpath("//a[text()='"+day+"']")).click();;
                System.out.println("Found and selected");
                break;

            }else{ // navigate to correct month and year

                if(dateToBeSelected.after(currentDate)){
                    driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[3]/div/a/span")).click();
                }else{
                    driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
                }





            }

            monthYearDisplayed=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div")).getText();
        }

    }



}
