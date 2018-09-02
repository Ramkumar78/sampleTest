import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void arrayIniTest() {
        int[] array = {1, 2, 3};
        int[] temp = array;
        array = new int[4];
        System.out.println(temp.length);
        System.arraycopy(temp, 0, array, 0, temp.length);
        temp = null;
//        System.out.println(temp.length);
        System.out.println(array.length);

        for (int x : array) {
            System.out.println(x);
        }

        String[][] array2 = new String[5][2];

        array2[0][1] = "Ram";


    }

    @Test
    public void sortArrayTest() {
        char[] test = {'a', 'd', 'f', 'c'};

        for (char c : test
                ) {
            System.out.println(test[c]);

        }
        Arrays.sort(test);
        for (char c : test
                ) {
            System.out.println(test[c]);

        }

    }

    @Test
    public void sortArrayTest1() {
        int[] test = {1, 3, 5, 2};

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
        Arrays.sort(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
       for (int c:test
             ) {
            System.out.println(test[c]);

        }
        /*
        Arrays.sort(test);
        for (int c:test
                ) {
            System.out.println(test[c]);

        }
*/
    }
}
