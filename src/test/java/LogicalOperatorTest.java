import org.junit.Assert;
import org.junit.Test;

public class LogicalOperatorTest {

    LogicalOperator logOpt = new LogicalOperator();
    EqualityOperator eqOpt=new EqualityOperator();

    @Test
    public void logicalAndTest() {
        String y = logOpt.andOperator(true, false);
        System.out.println(y);
//      Assert.assertEquals(logOpt.andOperator(true,false),"test1");
    }

    @Test
    public void logicalInclusiveOrTest() {
        String y = logOpt.inclusiveOrOperator(false, false);
        Assert.assertEquals("fantastic", y);

    }

    @Test
    public void logicalExclusiveOrTest() {
        String y = logOpt.exclusiveOrOperator(true, false);
        Assert.assertEquals("fantastic", y);
    }

    @Test
    public void logicanAndORTest() {

        int y = logOpt.andOperatorAndLogical(true, false,7,8);
        Assert.assertEquals(7, ( y));

    }


}
