import org.junit.Assert;
import org.junit.Test;

import DataTypesAndLoops.ArithmeticOperator;

public class ArithmeticTest {
    ArithmeticOperator test=new ArithmeticOperator();

    @Test
    public void additionTest( ){
        int a; short b;
         a=5;  b=4;
        ArithmeticOperator test=new ArithmeticOperator();
        Assert.assertEquals(9,test.additonDifferentDataTypes(a,b));
    }

    @Test
    public void multiplicationTest(){
        int c; short d;
        c=10;d=2;

        Assert.assertEquals(20,test.multiplicationOfIntByShort(c,d));

    }
    @Test
    public void booleanValueInvertTest(){

        Assert.assertEquals(true,test.booleanValueInvert(false));
        String name = "Jacek";
        String str = "X";
        str = str.replaceAll("X", "XXXXXXXXXX");
        str = str.replaceAll("X", "XXXXXXXXXX");
        str = str.replaceAll("X", "XXXXXXXXXX");
        str = str.replaceAll("X", name + "\n");
        System.out.println(str);

    }

    @Test
    public void preIncrementTest(){
        Assert.assertEquals(5,test.preIncrement(0));
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
    @Test
    public void postIncrementTest(){
        Assert.assertEquals(2,test.preIncrement(1));
        int x = 10;
        int y = 5;
        y *=x;

        System.out.println(y);
        System.out.println("y==>"+(y=(x=x)));

    }

    @Test
    public void ternaryAritmeticTest(){
        int y = 1;
        int x = (y > 5) ? (2 * y) : (3 * y);

        System.out.println(x);
    }
}
