package assignment03.question2;

public class Rectangle extends Parallelogram {
    Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    /*
        * class Rectangle – a subclass of Parallelogram (15)
        * Has a single constructor with the 8 values (4 (x,y) pairs) that uses super(…) to create the
        * rectangle. (Assume two of the sides are parallel to either the x-axis or y-axis.)
        * Create a toString method which returns a String with the four coordinates pairs as well as the
        * width, height and area of the rectangle in a printable form as shown in the sample output.
     */
    @Override
    public String toString(){
        return String.format("Coordinates of Rectangle are %s, %s, %s, %s\nWidth is: %.2f Height is: %.2f Area is %.2f",getPoint1().toString(),getPoint2().toString(),getPoint3().toString(),getPoint4().toString(),getWidth(),getHeight(),getArea() );
    }
}
