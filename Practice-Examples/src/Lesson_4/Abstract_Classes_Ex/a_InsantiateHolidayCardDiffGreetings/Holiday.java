package Lesson_4.Abstract_Classes_Ex.a_InsantiateHolidayCardDiffGreetings;

/*
 * Holiday is not an abstract class
 */

class Holiday extends Card
{
  public Holiday( String recep )
  {
    setRecipent(recep); //from Card; remember super() inserted in first line
  }

  public void greeting()
  {
    System.out.printf("Dear %s,\n", getRecipent());
    System.out.printf("Season's Greetings!\n\n");
  }
}