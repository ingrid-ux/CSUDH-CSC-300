package Lesson_4.Abstract_Classes_Ex.b_ExtendingAbstractClassShape;

class Circle extends Shape
{
	private double radius;
    // * constructor for Circle class
	public Circle(double radius)
	{
		setRadius(radius);
	}

    // ** getter and setters for circle
	public void setRadius(double rad)
    {
  	   radius = rad;
    }
	public double getRadius()
	{
	   return radius;
	}

    //** Abstract Methods inherited by Shape abstract class **/
	public double perimeter()
	{
		return 2*PI*radius;
	}
	public  double area()
	{
		return PI*radius*radius;
	}

    /*
    **
    * *Circle has one additional attribute, its radius of type double.

     */
}