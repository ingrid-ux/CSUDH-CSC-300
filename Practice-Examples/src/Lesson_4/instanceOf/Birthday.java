package Lesson_4.instanceOf;


class Birthday extends Card
{
  private int age;

  public Birthday(String recep, int years )
  {
    setRecipent(recep);//from Card
    setAge(years);
  }
  public void setAge(int age)
  {
  	  this.age = age;
  }
  public int getAge()
  {
  	  return age;
  }

  public void greeting()
  {
    System.out.printf("Dear %s,\n", getRecipent());
    System.out.printf("Happy %dth Birthday\n\n", getAge());
  }
}