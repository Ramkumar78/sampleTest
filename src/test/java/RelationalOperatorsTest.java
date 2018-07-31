import org.junit.Assert;
import org.junit.Test;

import DataTypesAndLoops.RelationalOperators;

public class RelationalOperatorsTest {

    @Test
    public void greatestOfTwoNumbers(){

        Assert.assertEquals("123","3 is greater than 2",
                RelationalOperators.compareTwoNumbers(3,2));


    }
    @Test
    public void greatestOfTwoNumbers1(){

        Assert.assertEquals("123","4 is greater than 2",
                RelationalOperators.compareTwoNumbers(2,4));


    }
}
