package Lesson_4.Polymorphism.superclass_vs_subclass;

class MountainBike extends Bicycle
{ 
	
	// the MountainBike subclass adds one more field beyond Bicycle's
	private int seatHeight; 

	// the MountainBike subclass has one constructor 
	public MountainBike(int gear,int speed, int startHeight) 
	{ 
		// invoking base-class(Bicycle) constructor 
		super(gear, speed); 
		setSeatHeight(startHeight); 
	} 
	
	public void setSeatHeight(int seatHeight) 
	{ 
		this.seatHeight = seatHeight; 
	}  
	
	public int getSeatHeight() 
	{ 
		return seatHeight; 
	} 
	
	
	// the MountainBike subclass adds one more method 
	
	// overriding toString() method 
	// of Bicycle to print more info 
	@Override
	public String toString() 
	{ 
		
		return String.format("%s\nseat height is %d", super.toString(), seatHeight); 
	} 
	
} 