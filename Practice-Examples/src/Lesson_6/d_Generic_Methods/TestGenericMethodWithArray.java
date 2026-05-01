
package Lesson_6.d_Generic_Methods;

import java.util.*;
public class TestGenericMethodWithArray
{  
  
   public static < E > void printArray(E[] elements) 
   {  
        for ( E element : elements)
        {          
            System.out.printf("%s ", element );  
         }  
         System.out.printf("\n"); 
         E [] myArray = elements;
         for ( E mae : myArray)
        {          
            System.out.printf("%s ", mae );  
         }  
         System.out.printf("\n");
         Arrays.sort(elements);
         for ( E element : elements)
        {          
            System.out.printf("%s ", element );  
         }  
         System.out.printf("\n"); 
        // E [] brandNew = new E[10]; This is creating a new generic array - illegal
    }  
    public static void main( String args[] ) 
    {  
        Integer[] intArray = { 10, 20, 30, 40, 50 };  
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
  
        System.out.printf( "Printing Integer Array\n" );  
        printArray( intArray  );   
  
       System.out.printf( "Printing Character Array\n" );  
       printArray( charArray ); 

    }   
}

