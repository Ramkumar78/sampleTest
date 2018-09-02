package DataTypesAndLoops;

public class ArrayExample {

    static int[]
            intArrayTwo = {1, 2, 3, 4, 5, 6};
    static String[] tester;

    String[] test = new String[2];
    public static void test() {
        tester[0] = "1";
        tester[1] = "b";
    }
    public static void main(String args[]) {
        System.out.println(intArrayTwo.length);
        for (int i = 0; i < intArrayTwo.length; i++) {
            System.out.println(intArrayTwo[i]);
        }
        System.out.println("prints tester");
        for (int i = 0; i < intArrayTwo.length; i++) {
            System.out.println(tester[i]);
        }

        test();
        for (int i = 0; i < intArrayTwo.length; i++) {
            System.out.println(tester[i]);
        }


/*        for (intArrayTwo: int int1) {
            System.out.println(intArrayTwo[int1]);

        }*/
    }





}
