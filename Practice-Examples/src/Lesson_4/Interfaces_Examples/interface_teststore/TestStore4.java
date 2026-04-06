package Lesson_4.Interfaces_Examples.interface_teststore;

public class TestStore4
{

  public static void main ( String[] args )
  {
    Goods   toy ;
    Taxable tax = new Toy ( "Building Blocks", 1.49, 6 );

    toy = (Toy)tax;
    //* CASTING
    System.out.printf( "Tax: %.2f\n", ((Taxable)toy).calculateTax() );
    //System.out.printf( "Tax: %.2f\n", toy.calculateTax() );
  }
}