package assignment03.question2;

public class Square extends Rectangle {
    Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    /*
        * class Square – a subclass of Rectangle (15)
        * Create a toString method which returns a String with the four coordinates pairs as well as the
        * width, height and area of the square in a printable form as shown in the sample output.
     */
    @Override
    public String toString(){
        return String.format("\nCoordinates of Rectangle are %s, %s, %s, %s\nSide is: %.2f Area is %.2f",getPoint1().toString(),getPoint2().toString(),getPoint3().toString(),getPoint4().toString(),getHeight(),getArea() );
    }
}
