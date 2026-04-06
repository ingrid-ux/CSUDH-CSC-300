package Lesson_4.Polymorphism.ExtendingClassesAndPolymorphism;

class AdultBirthday  extends Birthday

{
  public  AdultBirthday ( String r, int years )
  {
    super ( r, years );
  }

  // additional method---does not override parent's method
  public void greeting(String  sender)
  {
    super.greeting();
    System.out.printf("You haven't changed at all!!\n");
    System.out.printf("Love, %s\n", sender);
  }
}