import org.junit.Assert;
import org.junit.Test;

public class SwichTest {

    SwitchStatment switchStatment = new SwitchStatment();

    @Test
    public void testReturnStatement() {

        String x = switchStatment.switchCollector("test");
        System.out.println(x);
    }

    @Test

    public void addAndSubTest() {

        //with break and default statments


        {
            int x = switchStatment.swichExecutor(4, 8, "add");
            Assert.assertEquals(12, x);
        }

    }

    @Test
    public void addAndSubTest1() {

        int x = switchStatment.swichExecutor(4, 8, "sub");
        Assert.assertEquals(4, x);

    }

    @Test
    public void addAndSubTest2() {


        int x = switchStatment.swichExecutor(4, 8, "test");
        Assert.assertEquals(13, x);
        for (int i = 1; i < 8; i++) {
            System.out.println(java.time.DayOfWeek.of(i));

        }
        System.out.println(java.time.DayOfWeek.valueOf("SUNDAY"));
    }

    @Test
    public void wileStatment(){
        double x = 12;
        do{
            System.out.println("do while loop");
            x++;
        }
        while (x==123);

        String y= String.valueOf(x);
        System.out.println(y);
    }
}


