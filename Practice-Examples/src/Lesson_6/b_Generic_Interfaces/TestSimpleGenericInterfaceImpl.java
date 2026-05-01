package Lesson_6.b_Generic_Interfaces;/*
  Test our SimpleGenericClass class that accepts any object
*/
import java.util.Random;
public class TestSimpleGenericInterfaceImpl 
{

    public static void main(String args[]) 
    {
        // Test the SimpleGenericInterfaceImpl using a String object
        SimpleGenericInterfaceImpl<String> genStringObj = new SimpleGenericInterfaceImpl<String>("ab");
        genStringObj.showObjectType();
        // Test the SimpleGenericInterfaceImpl using an Integer object
        SimpleGenericInterfaceImpl<Integer> genIntegerObj = new SimpleGenericInterfaceImpl<Integer>(1);
        genIntegerObj.showObjectType();
        // Test the SimpleGenericInterfaceImpl using a Double object
        SimpleGenericInterfaceImpl<Double> genDoubleObj = new SimpleGenericInterfaceImpl<Double>(1.2);
        genDoubleObj.showObjectType();
        
        SimpleGenericInterfaceImpl<Random> genRandomObj = new SimpleGenericInterfaceImpl<Random>(new Random());
        genRandomObj.showObjectType();
    }
}