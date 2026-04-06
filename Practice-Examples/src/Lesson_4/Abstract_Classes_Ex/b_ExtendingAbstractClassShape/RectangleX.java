package Lesson_4.Abstract_Classes_Ex.b_ExtendingAbstractClassShape;

class RectangleX extends Shape
{
	private double length,width;

    // * rectanglex constructor
	public RectangleX(double length, double width)
	{
		setLength(length);
		setWidth(width);
	}
	// ** getter and setters for rectanglex
	public void setLength(double len)
    {
  	   length = len;
    }
	public double getLength()
	{
	   return length;
	}	
	public void setWidth(double wid)
    {
  	   width = wid;
    }
	public double getWidth()
	{
	   return width;
	}
	
	// ** abstract methods inherited from shape abstract class
	public double perimeter()
	{
		return 2*length + 2*width;
	}
	public  double area()
	{
		return length*width;
	}

    // * Rectangle has two additional attributes,
    // * length and width of type double.
}