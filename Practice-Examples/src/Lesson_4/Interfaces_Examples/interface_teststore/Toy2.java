package Lesson_4.Interfaces_Examples.interface_teststore;

class Toy2 extends Goods implements Taxable, Returnable
{
  private int minimumAge;

  public Toy2( String descript, double price, int minAge)
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
	if ( ! ( obj instanceof Toy2 ) )
	   return false;
	else
	{
	  Toy2 ty = (Toy2) obj;
      return ( super.equals(ty) && minimumAge == ty.minimumAge );
	}
  }

  public double calculateTax()
  {
    return getPrice() * taxRate ;
  }
  public boolean canReturn(double threshold)
  {
  	  if(getPrice() - threshold > .0001)
  	  	  return true;
  	  else
  	  	  return
  	  false;
  }
}