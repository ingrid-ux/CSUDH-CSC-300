package Lesson_5.comparator;

import java.util.*;
class PersonXComparatorTest 
{ 
    public static void main (String[] args) 
    { 
        ArrayList<PersonX> ar = new ArrayList<PersonX>(); 
        ar.add(new PersonX(111, "Cameron", "Inglewood")); 
        ar.add(new PersonX(131, "David", "Hawthorne")); 
        ar.add(new PersonX(121, "Juanita", "Carson")); 
  
        System.out.printf("Unsorted\n"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.printf("%s", ar.get(i)); 
  
        Collections.sort(ar, new SortByRoll()); 
  
        System.out.printf("\nSorted by rollno\n"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.printf("%s", ar.get(i)); 
        
        //SortByName mySRT = new SortByName();
        Collections.sort(ar, new SortByName()); 
  
        System.out.printf("\nSorted by name\n"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.printf("%s", ar.get(i)); 
    } 
} 