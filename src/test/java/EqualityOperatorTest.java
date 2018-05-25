import org.junit.Assert;
import org.junit.Test;

import DataTypesAndLoops.EqualityOperator;

public class EqualityOperatorTest {
    EqualityOperator eqOpt=new EqualityOperator();

    @Test
    public void eqOperatorTest() {

        boolean z=eqOpt.compareTwoNumberforEquality(7,10);
        Assert.assertEquals(false,z);
        boolean z1=eqOpt.compareTwoNumberforEquality(7,7);
        Assert.assertEquals(true,z1);

    }

}
