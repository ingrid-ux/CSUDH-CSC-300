package Lesson_4.Interfaces_Examples.interface_teststore;

class Food extends Goods
{
  private double calories;

  Food( String des, double pr, double cal)
  {
    super( des, pr );
    setCalories(cal) ;
  }
  
  public void setCalories(double cal)
  {
    calories = cal;
  }
  
  public double getCalories()
  {
    return calories;
  }
  public String toString()
  {
    return String.format("%s calories: %s\n", super.toString(), calories);
  }
  public boolean equals( Object obj )
  {
	if ( ! ( obj instanceof Food ) )
	   return false;
	else
	{
	  Food fd = (Food) obj;
      return ( super.equals(fd) && calories == fd.calories);
	}
  }
}