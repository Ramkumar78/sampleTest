import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Check1 {

  @Test
  public void geranium() {
    int array[] = {1, 1, 2, 3, 4, 5, 1, 2, 3, 7, 6, 7, 8, 9};
    List<Integer> array1 = new ArrayList<Integer>();

    for (int i = 0; i < array.length; i++) {
      if (i == array.length-1) {
          array1.add(array[i]);

          System.out.println(array1);
      }
      if (array[i] < array[i + 1]) {
        array1.add(array[i]);
      } else {
        array1.add(array[i]);
        System.out.println(array1);
        array1.clear();
      }
    }
  }
}
