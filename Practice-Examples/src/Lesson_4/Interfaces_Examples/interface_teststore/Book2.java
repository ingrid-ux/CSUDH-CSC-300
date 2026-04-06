package Lesson_4.Interfaces_Examples.interface_teststore;

class Book2  extends Goods implements Taxable,Returnable
{
  private String author;

  public Book2( String descript, double price, String auth)
  {
    super( descript, price );
    setAuthor(auth);
  }
  
  public void setAuthor(String auth)
  {
    author = auth;
  }
  public String getAuthor()
  {
    return author;
  }

  public String toString()
  {
    return String.format("%s author: %s\n", super.toString(), author) ;
  }


  public boolean equals( Object obj )
  {
	if ( ! ( obj instanceof Book2 ) )
	   return false;
	else
	{
	  Book2 bk = (Book2) obj;
      return ( super.equals(bk) && author.equalsIgnoreCase( bk.author ));
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