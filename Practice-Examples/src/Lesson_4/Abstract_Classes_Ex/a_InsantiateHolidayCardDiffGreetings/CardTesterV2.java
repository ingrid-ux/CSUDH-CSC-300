package Lesson_4.Abstract_Classes_Ex.a_InsantiateHolidayCardDiffGreetings;

public class CardTesterV2
{
  public static void main ( String[] args )
  {
    Holiday card01 = new Holiday("Santa");
    card01.greeting();
    
    Holiday card02 = new Holiday("Tinkerbell");
    card02.greeting();
    
    Holiday card03 = new Holiday("Elvis");
    card03.greeting();
  }
}