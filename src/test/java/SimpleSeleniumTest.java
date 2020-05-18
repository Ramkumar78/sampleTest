import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleSeleniumTest {

  @Test
  public void openTheWeb() {
    System.setProperty(
        "webdriver.chrome.driver",
        "D:\\Personal Ones\\Sample\\Ten10\\src\\resources\\chromedriver.exe");
    WebDriver dr = new ChromeDriver();
    dr.get("https://google.com");
    dr.getTitle();
  }

  @Test
  public void SortArray() {
    int array[] = {1, 1, 1, 1, 1, 3, 3, 2, 4, 5,666,7,8,9,1,2,3,10,9,8,7,1,2,3};

    List<Integer> array1 = new ArrayList<Integer>();

    for (int i = 0; i < array.length; i++) {
      array1.add(array[i]);
      if (i == array.length - 1) {
        System.out.println(array1);
      } else if (array[i] > array[i + 1]) {
        System.out.println(array1);
        array1.clear();
      }
    }
  }
}
