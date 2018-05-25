import org.junit.Assert;
import org.junit.Test;

import DataTypesAndLoops.ForLoop;

public class ForLoopTest {

    ForLoop forLoopeg = new ForLoop();

    @Test
    public void forloopTest() {
        forLoopeg.forLoop();
    }

    @Test
    public void sumofNnumberTest() {
        forLoopeg.sumOfNNumbers(10);
    }

    @Test
    public void sumOfNNumberFormulaTest() {
        Assert.assertEquals(forLoopeg.sumofNNumbersFormula(10), forLoopeg.sumOfNNumbers(10));
    }

    @Test
    public void enchancedForLoopTest(){

        forLoopeg.enchancedForLoop();
            }
}
