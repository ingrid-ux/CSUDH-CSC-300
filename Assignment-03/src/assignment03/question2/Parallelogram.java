package assignment03.question2;


public class Parallelogram extends Trapezoid {
    Parallelogram (double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    /*
     * class Parallelogram – a subclass of Trapezoid (20)
     * Has a single constructor with the 8 values (4 (x,y) pairs) that uses super(…) to create the
     * parallelogram.
     * Has a method getWidth that returns the width. Use this:
     * // return width of parallelogram
     * public double getWidth() {
     * if (getPoint1().getY() == getPoint2().getY()) {
     * return Math.abs(getPoint1().getX() - getPoint2().getX());
     * }
     * else {
     * return Math.abs(getPoint2().getX() - getPoint3().getX());
     * 8
     * }
     * }
     * Create a toString method which returns a String with the four coordinates pairs as well as the
     * width, height and area of the parallelogram in a printable form as shown in the sample output.
     */

    // return width of parallelogram
    public double getWidth() {
        if (getPoint1().getY() == getPoint2().getY()) {
            return Math.abs(getPoint1().getX() - getPoint2().getX());
        }
        else {
            return Math.abs(getPoint2().getX() - getPoint3().getX());
        }
    }

    @Override
    public String toString(){
        return String.format("Coordinates of parallelogram are %s, %s, %s, %s\nWidth is: %.2f Height is: %.2f Area is %.2f",getPoint1().toString(),getPoint2().toString(),getPoint3().toString(),getPoint4().toString(),getWidth(),getHeight(),getArea() );
    }

}
