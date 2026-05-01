package Lesson_6.d_Generic_Methods;

import java.util.*;
public class TestGenericMethod
{  
   public static <E> void printArray(ArrayList<E> elements) 
   {  
   	   for ( E element : elements)
       {          
       	   System.out.printf("%s ", element );  
       }  
       System.out.printf("\n"); 
   }  
   public static void main( String args[] ) 
   {  
   	   ArrayList<Integer> intAL = new ArrayList<>();
   	   for (int i = 10; i< 60; i=i+10)
   	   	   intAL.add(i);
   	   System.out.printf( "Printing Integer ArrayList\n" );  
   	   printArray( intAL);
   	   Random randy = new Random();
   	   char ch;
   	   ArrayList<Character> charAL = new ArrayList<>();
   	   for (int i = 0; i <10; i++)
   	   {
   	   	   ch = (char)(randy.nextInt(65, 91));
   	   	   charAL.add(ch);
   	   }
       System.out.printf( "Printing Character ArrayList\n" );  
       printArray( charAL ); 
    }   
}  