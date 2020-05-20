import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class checkTheGer {

  /*Given an unordered array of integers of length N > 0, calculate the length of the longest ordered (ascending from left [lower index] to right [higher index]) subsequence within the array.

  Example 1
  Input: [1,4,1,4,2,1,3,5,6,2,3,7]
  Expected Output: 4

  Example 2
  Input: [3,1,4,1,5,9,2,6,5,3,5]
  Expected Output: 3

  Example 3
  Input: [2,7,1,8,2,8,1]
  Expected Output: 2*/

  @Test
  public void arrayAscendingOrder() {
    int array1[] = {4, 1, 4, 2, 1, 3, 5, 6, 2, 3, 7};
    int j = 0;
      List<Integer> output=new ArrayList<>();
    for (int i = 0; i < array1.length; i++) {
      if (i == array1.length - 1) {
        j++;
        System.out.println(j);
      }
      if (array1[1] < array1[i + 1]) {
        j++;

      } else {
        j++;
        output.add(j);
      }
    }
  }
}
