package assignment03.question2;

public class Trapezoid extends Quadrilateral {
    Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    double height;
    /*
        * class Trapezoid – a subclass of Quadrilateral (20)
        * Has one additional variable height.
        * Has a single constructor with the 8 values (4 (x,y) pairs) that uses super(…) to create the
        * trapezoid. (Assume two of the sides are parallel to either the x-axis or y-axis.)
        * A method getHeight that calculates and returns the height.
        * A method getArea that returns the area of the trapezoid as a double.
        * A method getSumOfTwoSides that returns a double.
        * Here is this method:
        * // return the sum of the trapezoid's two sides
        * public double getSumOfTwoSides() {
        * if (getPoint1().getY() == getPoint2().getY()) {
        * return Math.abs(getPoint1().getX() - getPoint2().getX()) +
        * Math.abs(getPoint3().getX() - getPoint4().getX());
        * }
        * else {
        * return Math.abs(getPoint2().getX() - getPoint3().getX()) +
        * Math.abs(getPoint4().getX() - getPoint1().getX());
        * }
        * }
        * Create a toString method which returns a String with the four coordinates pairs as well as the
        * height and area of the trapezoid in a printable form as shown in the sample output.
     */
     double getHeight(){
         return Math.abs(getPoint3().getY() - getPoint1().getY());
     }

     double getArea(){ return (getSumOfTwoSides() / 2) * getHeight();}


    // ** return the sum of the trapezoid's two sides
    public double getSumOfTwoSides() {
        if (getPoint1().getY() == getPoint2().getY()) {
            return Math.abs(getPoint1().getX() - getPoint2().getX()) + Math.abs(getPoint3().getX() - getPoint4().getX());
        } else {
            return Math.abs(getPoint2().getX() - getPoint3().getX()) + Math.abs(getPoint4().getX() - getPoint1().getX());
        }
    }

    @Override
    public String toString(){
        //Coordinates of quadrilateral are (1.10, 1.20), (6.60, 2.80), (6.20, 9.90), (2.20, 7.40)
        return String.format("\nCoordinates of trapezoid are %s, %s, %s, %s\nHeight is: %.2f Area is %.2f",getPoint1().toString(),getPoint2().toString(),getPoint3().toString(),getPoint4().toString(),getHeight(),getArea() );
    }


}
