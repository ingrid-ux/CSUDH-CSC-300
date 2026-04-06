package Lesson_4.Interfaces_Examples.person_interface;

public interface Displayable
{
   default void display()
   {
      System.out.printf("This is the default display method.\n");
   }
}