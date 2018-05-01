import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayElementCountExample
{
    static void arrayElementCount(int inputArray[])
    {
        //Creating a HashMap object with elements of inputArray as keys and their count as values

        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();

        //checking every element of the inputArray

        for (int i : inputArray)
        {
            if(elementCountMap.containsKey(i))
            {
                //If element is present in elementCountMap, incrementing it's count by 1

                elementCountMap.put(i, elementCountMap.get(i)+1);
            }
            else
            {
                //If element is not present in elementCountMap, 
                //adding this element to elementCountMap with 1 as it's value

                elementCountMap.put(i, 1);
            }
        }
        System.out.println("Input Array : "+Arrays.toString(inputArray));
        System.out.println("Element Count : "+elementCountMap);
    }

    public static void main(String[] args)
    {
        int[] array1 = {1,2,1,5};
        int[] array2 = {1,3,3,4,5};
        int [] combined = ArrayUtils.addAll(array1, array2);
        Arrays.sort(combined);
        arrayElementCount(combined);
    }
}