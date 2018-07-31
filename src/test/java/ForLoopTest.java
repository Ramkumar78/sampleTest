import org.junit.Assert;
import org.junit.Test;

import DataTypesAndLoops.ForLoop;

public class ForLoopTest {

    ForLoop forLoopeg = new ForLoop();

    @Test
    public void forloopTest() {
//        forLoopeg.forLoop();
        String name = "Jacek";
        String str = "X";
        str = str.replaceAll("X", "XXXXXXXXXX");
        str = str.replaceAll("X", "XXXXXXXXXX");
        str = str.replaceAll("X", "XXXXXXXXXX");
//        str = str.replaceAll("X", name + "\n"+1  +1);
        System.out.println(str);
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
