package Lesson_4.Interfaces_Examples.interface_teststore;

public class TestStore
{

  public static void main ( String[] args )
  {
    Goods gd = new Goods( "bubble bath", 1.40 );
    Food  fd = new Food ( "ox tails", 4.45, 1500 );
    Goods fd2 = new Food ( "sushi", 4.45, 1500 );
    Book  bk = new Book ( "Emma", 24.95, "Austin" );
    Toy   ty = new Toy  ( "Legos", 54.45, 8 );

    System.out.printf("%s\n", gd );

    System.out.printf("%s\n", fd );
    System.out.printf("%s\n", fd2 );
    

    System.out.printf("%s\n", ty );
    System.out.printf("Tax is: %.2f\n", ty.calculateTax());

    System.out.printf("\n%s\n", bk );
    System.out.printf("Tax is: %.2f\n", bk.calculateTax());

  }
}