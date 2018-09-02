import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsTest {
    @Test
    public void collectionTest1(){
        ArrayList<String> list=new ArrayList();
        list.add("a");
        list.add("b");
        System.out.println(list);
        list.remove("a");
        System.out.println(list.size()+"667"+list.isEmpty());
    }

    @Test
    public void iteratorTest(){
        ArrayList<String> list=new ArrayList();
        list.add("a");
        list.add("b");
        Iterator i=list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
