package assignment03.question2;

public class Quadrilateral {
    /*
     * Has four instance variables with the four end points(vertices).
     * Create one constructor that accepts eight numbers of type double (four x,y pairs) and creates 4 points.
     * Create a separate method to access each of the four points. (i.e. getPoint1(), getPoint2(),
     * getPoint3() getPoint4()
     * Create a returnCoordsAsString method which returns the four pair of coordinates
     * Create a toString method which returns a String with the four coordinates pairs in a printable
     * form as shown in the sample output.
     */
    Point Point1;
    Point Point2;
    Point Point3;
    Point Point4;

    Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        Point1 = new Point(x1, y1);
        Point2 = new Point(x2, y2);
        Point3 = new Point(x3, y3);
        Point4 = new Point(x4, y4);
    }

    Point getPoint1(){ return Point1; }
    Point getPoint2(){ return Point2; }
    Point getPoint3(){ return Point3; }
    Point getPoint4(){ return Point4; }

    String returnCoordsAsString(){
        return String.format("%s %s %s %s",getPoint1().toString(),getPoint2().toString(),getPoint3().toString(),getPoint4().toString() );
    }

    @Override
    public String toString(){
        //Coordinates of quadrilateral are (1.10, 1.20), (6.60, 2.80), (6.20, 9.90), (2.20, 7.40)
        return String.format("Coordinates of quadrilateral are %s, %s, %s, %s",getPoint1().toString(),getPoint2().toString(),getPoint3().toString(),getPoint4().toString() );
    }
}
