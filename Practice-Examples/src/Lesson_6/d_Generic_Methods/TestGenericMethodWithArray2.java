package Lesson_6.d_Generic_Methods;

public class TestGenericMethodWithArray2
{  
  
   public static <E> void printArray(E[] elements) //missing the <E> so it won't work.
   {  
        for ( int i = 0; i < elements.length; i++)
        {          
            System.out.printf("%s ", elements[i] );  
         }  
         System.out.printf("\n"); 
    }  
    public static void main( String args[] ) 
    {  
        Integer[] intArray = { 10, 70, 30, 60, 50 };  
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
  
        System.out.printf( "Printing Integer Array\n" );  
        printArray(intArray);
  
       System.out.printf( "Printing Character Array\n" );  
       printArray(charArray);
    }   
}  