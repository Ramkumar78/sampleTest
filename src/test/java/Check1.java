import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

  @Test
  public void arrayTest(){
    String a[]={"a","b","c"};
    String b[]={"d","b","e"};
    for(int i = 0; i < a.length; i++){
String x= a[i];
      for(int j = 0; j < b.length; j++)
      {
        if(a[i]==b[j]){
          System.out.println(a[i]);
                }

      }
    }
  }

  @Test
    public void genericsTest(){
      Set<Integer> a= new HashSet<>();
      List<Integer> b=new ArrayList<>();

  }
}
