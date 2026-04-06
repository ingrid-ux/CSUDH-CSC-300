package Lesson_4.Interfaces_Examples.car_interface;

/* Vehicle Class
   Anderson, Franceschi - modified Rosenthal
*/
public class Car implements CarActions 
{
 
    private String brand;
     
    // constructors/getters
    public Car (String brand)
    {
    	setBrand(brand);
    }
    
    public void setBrand(String brd) 
    {
        brand = brd;
    }
    
    public String getBrand() 
    {
        return brand;
    }
     
    @Override
    public String speedUp() 
    {
        return "The car is speeding up.";
    }
     
    @Override
    public String slowDown() 
    {
        return "The car is slowing down.";
    }
}