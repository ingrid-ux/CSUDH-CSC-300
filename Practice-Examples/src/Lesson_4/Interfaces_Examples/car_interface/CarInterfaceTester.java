package Lesson_4.Interfaces_Examples.car_interface;

/* Vehicle Class
   Anderson, Franceschi - modified Rosenthal
*/
public class CarInterfaceTester
{
	public static void main(String[] args) 
	{ 
		CarActions carX = new Car("BMW");
		System.out.printf("%s\n",carX.getBrand());
		System.out.printf("%s\n",carX.speedUp());
		System.out.printf("%s\n",carX.slowDown());
		System.out.printf("%s\n",carX.turnAlarmOn());
		System.out.printf("%s\n",carX.turnAlarmOff());
	}
}