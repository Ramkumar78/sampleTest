import org.junit.Assert;
import org.junit.Test;

public class DateTimeTest {

    CurrentDate currentDate=new CurrentDate();

  @Test
  public void currentDateTest(){

      Assert.assertEquals("PM",currentDate.tellMeAMorPM());

    }

    @Test
    public void ifStatementTest(){
      if (4<3)
          System.out.println("if statment executed");
        int a=7+8;
        System.out.println(a);
    }
}
