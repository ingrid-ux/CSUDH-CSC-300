package Lesson_4.Interfaces_Examples.interface_teststore;

public class TestStoreArray
{

  public static void main ( String[] args )
  {

      // * exhibit rules of polymorphism
    Goods[] inventory =  new Goods[10];
    inventory[0] = new Goods( "bubble bath", 1.40 );
    inventory[1] = new Food ( "ox tails", 4.45, 1500 );
    inventory[2] = new Book ( "Emma", 24.95, "Austen" );
    inventory[3] = new Toy  ( "Leggos", 54.45, 8 );

    //Since toString exists in goods it will use the toString method of the subclass
    System.out.printf("%s\n", inventory[0] );
    System.out.printf("%s\n", inventory[1] ); 
    System.out.printf("%s\n", inventory[2] );
    System.out.printf("%s\n", inventory[3] );
    
    //this line doesn't work for reasons described. inventory type is the superclass, doesn't recognize subclass unique methods
    //System.out.printf("Tax is: %.2f\n", inventory[3].calculateTax());

  }
}