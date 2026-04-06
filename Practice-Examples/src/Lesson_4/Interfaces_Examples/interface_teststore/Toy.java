package Lesson_4.Interfaces_Examples.interface_teststore;

class Toy extends Goods implements Taxable
{
  private int minimumAge;

  public Toy( String descript, double price, int minAge)
  {
    super( descript, price );
    setMinimumAge(minAge);
  }
  
  public void setMinimumAge(int minAge)
  {
    minimumAge = minAge;
  }
  
  public int getMinimumAge()
  {
    return minimumAge;
  }
  
  public String toString()
  {
    return String.format("%s minimum age: %s\n", super.toString(), minimumAge) ;
  }
  
  public boolean equals( Object obj )
  {
	if ( ! ( obj instanceof Toy ) )
	   return false;
	else
	{
	  Toy ty = (Toy) obj;
      return ( super.equals(ty) && minimumAge == ty.minimumAge );
	}
  }

  public double calculateTax()
  {
    return getPrice() * taxRate ;
  }
}