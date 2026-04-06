package Lesson_5.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class TestAdultSort
{
	public static void main(String[] args) 
	{   
        // create ArrayList to store Adult 
        ArrayList<Adult> adultAL = new ArrayList<>();  
        // create customer objects using constructor initialization 
        Adult ad1 = new Adult("Juan", 27); 
        Adult ad2 = new Adult("Jose", 23); 
        Adult ad3 = new Adult("Carmen", 37); 
        Adult ad4 = new Adult("Juan", 22); 
        Adult ad5 = new Adult("Juan", 29); 
        Adult ad6 = new Adult("Jose", 22); 
  
        // add customer objects to ArrayList 
        adultAL.add(ad1); 
        adultAL.add(ad2); 
        adultAL.add(ad3); 
        adultAL.add(ad4); 
        adultAL.add(ad5); 
        adultAL.add(ad6); 
  
        // before Sorting arraylist: iterate using Iterator 
        Iterator<Adult> adultIterator = adultAL.iterator(); 
  
        System.out.printf("Before Sorting:\n"); 
        while (adultIterator.hasNext()) { 
            System.out.printf("%s", adultIterator.next()); 
        } 
  
        // sorting using Collections.sort(al, comparator); 
        Collections.sort(adultAL, new AdultSortingComparator()); //Note that you are using two variables
  
        // after Sorting arraylist: iterate using enhanced for-loop 
        System.out.printf("\n\nAfter Sorting:\n"); 
        for (Adult adlt : adultAL) 
        { 
            System.out.printf("%s", adlt); 
        } 
    } 
}