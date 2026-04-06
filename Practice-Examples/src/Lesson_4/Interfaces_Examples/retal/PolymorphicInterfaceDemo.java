package Lesson_4.Interfaces_Examples.retal;

/**
   This program demonstrates that an interface type may
   be used to create a polymorphic reference.
*/

public class PolymorphicInterfaceDemo
{
    /**
      The showPrice method displays the price
      of a RetailItem object.
      @param item A reference to a RetailItem object.
   */
   
	private static void showPrice(RetailItem item)
   {
      System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
   }
	
	public static void main(String[] args)

   {


      // Create a CompactDisc object.
      CompactDisc cd = new CompactDisc("Greatest Hits","Joe Looney Band", 18.95);
      // Create a DvdMovie object.
      DVDMovie movie =
              new DVDMovie("Wheels of Fury", 137, 12.95);
        //**
       //* When a class implements an interface, an inheritance relationship
       // * known as interface inheritance is established.
       // * Both a CompactDisc object is a RetailItem,
       // * and a DVDMovie object is a RetailItem.



      // Display the CD's title.                      
      System.out.printf("Item #1: %s\n",cd.getTitle());
                         
      // Display the CD's price.
      showPrice(cd);
      
      // Display the DVD's title.
      System.out.printf("Item #2: %s\n", movie.getTitle());
                         
      // Display the DVD's price.
      showPrice(movie);
   }


   
}
