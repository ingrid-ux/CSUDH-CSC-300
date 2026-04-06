package Lesson_4.Polymorphism.ExtendingClassesAndPolymorphism;

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
