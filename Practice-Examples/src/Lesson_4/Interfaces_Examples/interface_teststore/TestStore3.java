
package Lesson_4.Interfaces_Examples.interface_teststore;

public class TestStore3
{
  public static void main ( String[] args )
  {
    Taxable item1 = new Book ( "Emma", 24.95, "Austen" );
    System.out.printf( "Tax on item 1 %.2f\n", item1.calculateTax() );

    // * System.out.printf( "Author: %s\n", item1.getAuthor() );// This won't work
    // * CASTING : You have to cast if you want the item to act like a book.
      System.out.printf( "Author: %s\n", ((Book)item1).getAuthor() );
    
    Book bk = (Book)item1;
    System.out.printf( "Author: %s\n", bk.getAuthor() );
    
  }
}