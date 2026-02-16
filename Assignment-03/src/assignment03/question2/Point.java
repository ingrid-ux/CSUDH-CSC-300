package assignment03.question2;

public class Point {
    /*
        * Includes x and y coordinates as type double instance variables, an accessor, mutator and toString
        * methods.
        * Includes a default constructor and a constructor with an x and y coordinate.
        * The toString method returns a String with the points in the format (x,y)
     */
    double x,y;

    void setX(double x){this.x = x;}
    void setY(double y){this.y = y;}

    double getX(){return this.x;}
    double getY(){return this.y;}

    // ** Default Constructor
    Point(){

    }
    // ** Constructor
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return String.format("(%.2f, %.2f)", this.x, this.y);
    }
}
