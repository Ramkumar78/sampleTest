import org.junit.Assert;
import org.junit.Test;

//import static java.lang.Math.PI;
import static java.lang.Math.*;

public class CalculateAreaTest {

    @Test
    public void areaCalc(){
        int areaOfCircle= (int) (PI*7.5*7.5);

        Assert.assertEquals(176,areaOfCircle);
        System.out.println(areaOfCircle);
    }
}
