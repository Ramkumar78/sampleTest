import org.junit.Assert;
import org.junit.Test;

public class StringConcatenationTest {

    StringConcatenation stringConcatenation = new StringConcatenation();

    @Test
    public void twoStringConcatTest() {

        String D = stringConcatenation.twoStringConcat("Well done,", "but dedicated effort required");

        Assert.assertEquals("Well done,but dedicated effort required", D);

    }

    @Test
    public void twoStringOneIntConcatTest() {

        String D = stringConcatenation.twoStringOneIntConcat("Well done,", "but dedicated effort required           ...", 1);

//        Assert.assertEquals("Well done,but dedicated effort required", D);

    }

    @Test
    public void threeIntConcatTest() {

        int D = stringConcatenation.twoIntConcat(1, 2, 3);

        Assert.assertEquals(6, D);
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four + D + D + 1 + 2);

        String s1 = "1";
        String s2 = s1.concat("2");
        System.out.println("S2---->" + s2);
        s1.concat("123123");
        System.out.println(s2.concat("3"));
        String an = "animal";

        int i = an.length();
        System.out.println(i);
    }

}
