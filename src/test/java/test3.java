import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class test3 {

    public static void main(String args[]){

        int[] array1 = {1,2,3};
        int[] array2 = {1,4,5,6};
        int [] combined = ArrayUtils.addAll(array1, array2);
        System.out.println(combined.length);

        int x=combined.length;
        Arrays.sort(combined);

        for(int j=1;j<combined.length;j++)
        {
            if(combined[j]==combined[j-1])
            {
                System.out.println(combined[j]);

            }
        }


//        for (int i=0; i<x;i++){
//
//            System.out.println(combined[i]);
//        }


    }

}
