package Lesson_4.Interfaces_Examples.interface_teststore;

class Goods
{
  private String description;
  private double price;

  public Goods( String descript, double price )
  {
    setDescription(descript);
    setPrice(price);
  }
  public String getDescription()
  {
    return description;
  }
  
  public double getPrice()
  {
    return price;
  }
  
  public void setDescription(String description)
  {
    this.description = description;
  }
  
  public void setPrice(double price)
  {
    this.price = price;
  }
  public String toString()
  {
    return String.format("item: %s price: %s\n",description, price) ;
  }
  public boolean equals( Object obj )
  {
	if ( ! ( obj instanceof Goods ) )
	   return false;
	else
	{
	  Goods gd = (Goods) obj;
      return ( description.equalsIgnoreCase( gd.description ));
	}
  }
}