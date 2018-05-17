import org.junit.Test;

public class TernaryOperatorTest {

    TernaryOperator ternaryOperator = new TernaryOperator();

    @Test
    public void ternaryTest() {

        String x1 = ternaryOperator.evaluateExpression("eyeSore") ? ternaryOperator.expressionIfUnwell() : ternaryOperator.expressionIfAlright();

        System.out.println(x1);


        int y = 1;
        int z = 1;
        final int x = y<10 ? y++ : z++;
        System.out.println(y+","+z);
    }
}
