package DataTypesAndLoops;

import java.util.Comparator;

public class LambdaExample {

    public static void main(String args[]) {
        Comparator<String> stringComporator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        };

        int comparison = stringComporator.compare("hello", "world");
        System.out.println(comparison);

 /*       Comparator<String> stringComparatorLambda =
                {
                        (String o1, String o2) -> {
                            return o1.compareTo(o2);
                        };*/


    }
}
