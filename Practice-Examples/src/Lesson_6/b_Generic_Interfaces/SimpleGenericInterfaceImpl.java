package Lesson_6.b_Generic_Interfaces;

/*
  Simple generic class that implements SimpleGenericInterface
*/
public class SimpleGenericInterfaceImpl<T> implements SimpleGenericInterface<T> 
{

    // Generic object declaration
    T genericObj;

    // Pass reference to object of type T to our constructor
    SimpleGenericInterfaceImpl(T genObj) 
    {
        setGenericObj(genObj);
    }
    
    public void setGenericObj(T genObj)
    {
    	genericObj= genObj;
    }
    
    public T getGenericObj()
    {
    	return genericObj;
    }

    // Output object type of T to console - This implements the abstract method of the implemented interface
    public void showObjectType() 
    {
        System.out.printf("Object type of T is %s\n", genericObj.getClass().getName());
        System.out.printf("Actual value is %s\n", genericObj);
    }
}
