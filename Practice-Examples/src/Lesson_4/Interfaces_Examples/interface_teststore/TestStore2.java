package Lesson_4.Interfaces_Examples.interface_teststore;

public class TestStore2
{
  public static void main ( String[] args )
  {
    Taxable item1 = new Book ( "Emma", 24.95, "Austen" );
    Taxable item2 = new Toy  ( "Leggos", 54.45, 8 );

    System.out.printf("Tax is: %.2f\n", item1.calculateTax());
    System.out.printf("Tax is: %.2f\n", item2.calculateTax());

  }
}