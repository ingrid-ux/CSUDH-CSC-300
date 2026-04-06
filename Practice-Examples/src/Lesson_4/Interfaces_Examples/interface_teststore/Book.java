package Lesson_4.Interfaces_Examples.interface_teststore;

class Book  extends Goods implements Taxable
{
  private String author;

  public Book( String descript, double price, String auth)
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
	if ( ! ( obj instanceof Book ) )
	   return false;
	else
	{
	  Book bk = (Book) obj;
      return ( super.equals(bk) && author.equalsIgnoreCase( bk.author ));
	}
  }
  
  public double calculateTax()
  {
    return getPrice() * taxRate ;
  }
}