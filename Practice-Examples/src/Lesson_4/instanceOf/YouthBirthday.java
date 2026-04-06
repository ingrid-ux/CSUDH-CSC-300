package Lesson_4.instanceOf;


class YouthBirthday extends Birthday

{
  public YouthBirthday(String r, int years )
  {
    super ( r, years );
  }

  // additional method---does not override parent's method
  public void greeting( String  sender )
  {
    super.greeting();
    System.out.printf("How you have grown!!\n");
    System.out.printf("Love, %s\n", sender);
  }
}