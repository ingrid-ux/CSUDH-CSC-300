package Lesson_4.Polymorphism.superclass_vs_subclass;

/* Java program to illustrate xxx
   referring to a subclass 
   base class */
class Bicycle 
{ 
	// the Bicycle class has two fields 
	private int gear; 
	private int speed; 
		
	// the Bicycle class has one constructor 
	public Bicycle(int gear, int speed) 
	{ 
		setGear(gear); 
		setSpeed(speed); 
	} 
		
	public void setGear(int gear) 
	{ 
		this.gear = gear; 
	} 
		
	public void setSpeed(int speed) 
	{ 
		this.speed = speed; 
	}  
	
	public int getGear() 
	{ 
		return gear; 
	} 
		
	public int getSpeed() 
	{ 
		return speed; 
	}
	
	public void applyBrake(int decrement) 
	{ 
		speed -= decrement; 
	} 
		
	public void speedUp(int increment) 
	{ 
		speed += increment; 
	} 
	
	// toString() method to print info of Bicycle 
	public String toString() 
	{ 
		String str = String.format("No of gears are %d\nspeed of bicycle is %d\n", gear,speed);
		return str;
	} 
}