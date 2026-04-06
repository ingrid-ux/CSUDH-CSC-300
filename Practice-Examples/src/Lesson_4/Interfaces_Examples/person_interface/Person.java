package Lesson_4.Interfaces_Examples.person_interface;

/**
   This class implements the Displayable
   interface, but does not override the
   default display method.
*/

public class Person implements Displayable
{
   private String name;
   
   // Constructor
   public Person(String n)
   {
      setName(n);
   }
   public void setName(String name)
  {
  	  this.name = name;
  }
  public String getName()
  {
  	  return name;
  }
}
