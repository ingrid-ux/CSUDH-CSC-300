package question1;

import java.util.*;

public class AsListWithWrapperClass {
    public static void main(String[] args){
        // Create an Integer array with 4 elements
        Integer[] arr = new Integer[4];
        // Populate it with four elements.
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;

        // Print the array
        System.out.printf("Printed Array: %s%n", Arrays.toString(arr));

        // Create a List of type Integer and populate it using the asList method.
        List<Integer> list = Arrays.asList(arr);

        // Print out the List
        System.out.printf("Printed List: %s%n", list);

        // Modify an element in the array.
        arr[2] = 25;

        // Reprint the elements in the List
        System.out.printf("Printed List After modifying: %s%n", list);


    }
}
