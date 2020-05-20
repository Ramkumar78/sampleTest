import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class checkTheGer {

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
