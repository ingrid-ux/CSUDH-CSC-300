package Lesson_4.Interfaces_Examples.interface_teststore;

import java.util.Scanner;
public class TestStore5
{

  public static void main ( String[] args )
  {
  	Scanner keyboard = new Scanner(System.in);
  	
  	System.out.printf("Please enter book threshold as a double: ");
  	double toyThreshold = keyboard.nextDouble();
  	System.out.printf("Please enter toy threshold as a double: ");
  	double bookThreshold = keyboard.nextDouble();
  	
  	Book2 b1 = new Book2("Lord Of The Rings", 7.28, "Tolkein");
  	Book2 b2 = new Book2("Java Is fun", 29.99, "Nerdy");
  	
    System.out.printf("It is %b that the book %s is returnable\n", b1.canReturn(bookThreshold), b1);
    System.out.printf("It is %b that the book %s is returnable\n", b2.canReturn(bookThreshold), b2);
    
    Toy2 t1 = new Toy2("Monopoly", 19.99, 7);
  	Toy2 t2 = new Toy2("VideoChaos", 20.01, 17);
  	
    System.out.printf("It is %b that the toy %s is returnable\n",t1.canReturn(bookThreshold), t1);
    System.out.printf("It is %b that the toy %s is returnable\n", t2.canReturn(bookThreshold), t2);
    
  }
}