package Lesson_4.Interfaces_Examples.interface_teststore;

import java.util.ArrayList;
public class TestStoreArrayList2
{

  public static void main ( String[] args )
  {
    ArrayList<Goods> inventoryList =  new ArrayList<Goods>();
    inventoryList.add(new Goods( "bubble bath", 1.40 ));
    inventoryList.add(new Food ( "ox tails", 4.45, 1500));
    inventoryList.add(new Book2 ( "Emma", 24.95, "Austen"));
    inventoryList.add(new Toy2  ( "Leggos", 54.45, 8));
    double tax = 0.0;

    //Since toString exists in goods it will use the toString method of the subclass
    
    for (int i = 0; i < inventoryList.size(); i++)
    {
		if (inventoryList.get(i) instanceof Book2 ) 
		{
			Book2 bk = (Book2)inventoryList.get(i);
			tax = bk.calculateTax() ;
			System.out.printf("The tax on the book is %.2f\n", tax);
		}
		else if (inventoryList.get(i) instanceof Toy2 ) 
		{
			Toy2 ty = (Toy2)inventoryList.get(i);
			tax = ty.calculateTax();
			System.out.printf("The tax on the toy is %.2f\n", tax);
		}
    }
  }
}