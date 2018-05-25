package DataTypesAndLoops;

import java.util.Arrays;

public class ForLoop {

    public void forLoop() {
        int a = 0;
        for (; ; ) {
            System.out.println((a++) + " .Kirti, how are you");
            if (a == 1000)
                break;
        }

    }

    public int sumOfNNumbers(int n) {
        int sum = 0;
        for (int m = 0; m <= n; m++) {
            sum = sum + m;
        }

        System.out.println(sum);
        return sum;
    }

    public int sumofNNumbersFormula(int n) {
        n = (n * (n + 1) / 2);
        System.out.println(n);
        return n;
    }

    public void enchancedForLoop() {

        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for (String name : names) {
            System.out.print(name + ", ");


            System.out.println("what does name matters");
        }

        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for (String value : values) {
            System.out.print(value + ", ");
        }


        String[] names1 = new String[3];
        for(String name : names1) { // DOES NOT COMPILE
            System.out.print(name + " ----->");
        }

        int[] x= new int[2];
        x[0]=1;

        x[1]=2;


        for(int y: x){
            System.out.println(y+"---");
        }

    }
}
