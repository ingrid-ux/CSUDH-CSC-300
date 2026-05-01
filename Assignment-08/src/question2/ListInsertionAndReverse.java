package question2;

import java.util.*;

public class ListInsertionAndReverse {
    // This class has a main method and a single method called listSorting

    // listSorting has two formal parameters a List of type Integer called list and a String str. It has no
    // return value.
    public static void listSorting(List<Integer> list, String str){
        // Set the start time
        // Get start time in millisecond
        long start = System.currentTimeMillis();

        // Use the appropriate Collections method to sort the list
        Collections.sort(list);

        // Calculate the total number of elements in the list
        int size = list.size();

        // Calculate the average of the numbers
        double sum = 0;
        for (int num: list){ sum += num;}
        double average = sum / size;

        // Use the appropriate Collections method to reverse the list
        Collections.reverse(list);

        // Set the end time
        // Get end time in millisecond
        long end = System.currentTimeMillis();
        // Calculate the total time
        long total = end - start;
        // Print out the three lines as described below
        System.out.printf("For %s the sum is: %.0f%n", str, sum);
        System.out.printf("For %s the average is: %.2f%n", str, average);
        System.out.printf("The total time for the averaging, sorting and reversing with %s is %d millisecs%n", str, total );
    }





    public static void main(String[] args) {
        // main does the following:
        // Create a LinkedList of type Integer called lList
        LinkedList<Integer> lList = new LinkedList<>();
        // Create a Random variable randy1 with a seed of 5
        Random randy1 = new Random(5);
        // Set the startL time for populating lList
        long startL = System.currentTimeMillis();
        // Use a loop to populate lList with 25000 elements between 0 and 1999
        // inclusive using randy1 to generate those elements
        for (int i = 0; i < 25000; i++){
            lList.add(randy1.nextInt(0, 2000));
        }
        // Set the end Time for populating the lList
        long endL = System.currentTimeMillis();

        long totalL = endL - startL;
        // Print out the populating line lList (see below
        System.out.printf("The time for populating the LinkedList is %d millisecs%n", totalL);
        // Call listSorting with lList and “LinkedList” as the actual parameters
        listSorting(lList, "LinkedList");


        //Create an ArrayList of type Integer called aList
        ArrayList<Integer> aList = new ArrayList<>();
        //Create a Random variable randy2 with a seed of 5
        Random randy2 = new Random(5);
        //Set the startL time for populating aList
        long startA = System.currentTimeMillis();
        //Use a loop to populate aList with 25000 elements between 0 and 1999 inclusive using randy2 to
        //generate those elements
        for (int i = 0; i < 25000; i++){
            aList.add(randy2.nextInt(0, 2000));
        }

        //Set the end Time for populating the aList
        long endA = System.currentTimeMillis();

        long totalA = endA - startA;
        //Print out the populating line aList (see below)
        System.out.printf("The time for populating the ArrayList is %d millisecs%n", totalA);

        //Call listSorting with aList and “ArrayList” as the actual parameters

        listSorting(aList, "ArrayList");

    }


}
