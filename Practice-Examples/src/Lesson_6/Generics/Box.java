package Lesson_6.Generics;

//Modified from Copyright (c) 1995, 2008, Oracle
public class Box<T> 
{
    private T tObjRef;          
    public Box(){};
    public void setTObjRef(T tObjR) 
    {
        tObjRef = tObjR;
    }
    
    public T getTObjRef() 
    {
        return tObjRef;
    }
    public <U> void inspect(U uObjRef)
    {
        System.out.printf("T: %s\n",  tObjRef.getClass().getName());
        System.out.printf("U: %s\n", uObjRef.getClass().getName());
    }
    /*public <U> void add(U uObjRef)  Doesn't work since t+u doesn't work for all classes
    {
        System.out.printf("tObjRef+uObjRef: %s\n",  tObjRef+uObjRef);
    }*/
}