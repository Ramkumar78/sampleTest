public class LogicalOperator {


    public String andOperator(boolean a, boolean b) {
        String x = "test";
        if (a & b) {
            x = "test1";
        } else {
            x = "test2";
        }
        return x;
    }

    public String inclusiveOrOperator(boolean b, boolean b1) {
        String z = "Good";
        if (b || b1) {
            z = "best";
        } else {
            z = "fantastic";
        }

        return z;
    }

    public String exclusiveOrOperator(boolean b, boolean b1) {
        String z = "Good";
        if (b ^ b1) {
            z = "best";
        } else {
            z = "fantastic";
        }

        return z;
    }

    public int andOperatorAndLogical(boolean b, boolean b1, int x, int y) {


        if (exclusiveOrOperator(b, b1) != null && x >= y) {

            y = y;
            System.out.println("y in if loop"+y);

        } else {
            y = x;
            System.out.println("y in else loop"+y);

        }


        return y;
    }
}
