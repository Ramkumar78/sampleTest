import com.google.common.collect.ObjectArrays;

import java.util.*;

public class test2 {

    public static void main(String args[]){

        String [] one = {"2", "3", "4"};
        String [] two = {"2", "1"};

        String [] joined = ObjectArrays.concat(one, two, String.class);

        int arraylenght=joined.length;
        Arrays.sort(joined);


        System.out.println(arraylenght);

        System.out.println("Joined array : " + Arrays.toString(joined));

        List asList = Arrays.asList(joined);
        Set<String> mySet = new HashSet<String>(asList);
        for(String s: mySet){

            System.out.println(s + " " +Collections.frequency(asList,s));

        }



    }
}
