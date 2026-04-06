package Lesson_4.Interfaces_Examples.car_interface;

/* Vehicle Class
   Anderson, Franceschi - modified Rosenthal
*/
interface CarActions
{
     
    String getBrand();
    
    void setBrand(String brand);
     
    String speedUp();
     
    String slowDown();
     
    default String turnAlarmOn() 
    {
        return "Turning the vehicle alarm on.";
    }
     
    default String turnAlarmOff() 
    {
        return "Turning the vehicle alarm off.";
    }
}