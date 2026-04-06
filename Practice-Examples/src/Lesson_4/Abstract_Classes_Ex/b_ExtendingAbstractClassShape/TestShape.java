package Lesson_4.Abstract_Classes_Ex.b_ExtendingAbstractClassShape;

import java.util.Scanner;
public class TestShape
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double length, width, radius;
		System.out.printf("Please enter the length and width of a rectangle as type double:\n");
		length = keyboard.nextDouble();
		width = keyboard.nextDouble();
		RectangleX rect = new RectangleX(length, width);
		System.out.printf("The perimeter of the rectangle is %.2f\n", rect.perimeter());
		System.out.printf("The area of the rectangle is %.2f\n", rect.area());
		
		System.out.printf("Please enter the radius of a circle as type double:\n");
		radius = keyboard.nextDouble();
		Circle cirky = new Circle(radius);
		System.out.printf("The circumference of the circle is %.2f\n", cirky.perimeter());
		System.out.printf("The area of the circle is %.2f\n", cirky.area());


        // **
        // *Write a TestShape class with a main method that tests out the above.
        // *Read in the length and width of a rectangle and print out the perimeter and area.
        // * Read in the radius of a rectangle and print out the perimeter (circumference) and area.
	}
}