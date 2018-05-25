import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

import DataTypesAndLoops.FindLengthOfString;

public class StringRelatedTest {

    FindLengthOfString flos = new FindLengthOfString();

    @Test
    public void lengthOfStringTest1() {
        int a = flos.lengthOfString("test123");
        String test = "123456";
        IntStream x = test.chars();

        System.out.println(x.count());

        Assert.assertEquals(7, a);
    }

}
