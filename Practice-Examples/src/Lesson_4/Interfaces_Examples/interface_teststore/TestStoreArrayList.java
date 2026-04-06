package Lesson_4.Interfaces_Examples.interface_teststore;

import java.util.ArrayList;
public class TestStoreArrayList
{

  public static void main ( String[] args )
  {
      // * exhibit rules of polymorphism
      ArrayList<Goods> inventoryList =  new ArrayList<Goods>();
    inventoryList.add(new Goods( "bubble bath", 1.40 ));
    inventoryList.add(new Food ( "ox tails", 4.45, 1500));
    inventoryList.add(new Book ( "Emma", 24.95, "Austen"));
    inventoryList.add(new Toy  ( "Leggos", 54.45, 8));

    //Since toString exists in goods it will use the toString method of the subclass
    System.out.printf("%s\n", inventoryList.get(0) );
    System.out.printf("%s\n", inventoryList.get(1) ); 
    System.out.printf("%s\n", inventoryList.get(2) );
    System.out.printf("%s\n", inventoryList.get(3) );
    
    //the following line doesn't work for reasons described. inventoryList type is the superclass, doesn't recognize subclass unique methods
    //System.out.printf("Tax is: %.2f\n", inventoryList.get(3).calculateTax());
  }
}