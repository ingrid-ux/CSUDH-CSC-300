package Lesson_4.Abstract_Classes_Ex.a_InsantiateHolidayCardDiffGreetings;

abstract class Card
{
  private String recipient; 
  public abstract void greeting();// An abstract method

  public void setRecipent(String recep)
  {
  	  recipient = recep;
  }
  public String getRecipent()
  {
  	  return recipient;
  }
}

    /*
    * POP
    * Look at Card.java, Holiday.java, CardTester.java, CardTesterV2.java to see
    * how we can instantiate a Holiday Card with different greetings
    *
    * *
     */