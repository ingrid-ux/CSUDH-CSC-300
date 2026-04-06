package Lesson_4.Polymorphism.superclass_vs_subclass;

// driver class
public class TestBicycles 
{ 
	public static void main(String args[]) 
	{ 
		// using superclass reference 
		// first approach 
		Bicycle mb2 = new MountainBike(4, 200, 20);
        //**
        //*Advantage
        //*We can use superclass reference to hold any subclass object derived from it.
        //* ex bicycle mb = new MoutainBike(...);
        //*    bicycle b = new Bicycle(..);
        //*    bicycle tb = new TestBicycles();
        //*
        //*Disadvantage
        // * By using superclass reference, we will have access only to those parts(methods and variables) of the object defined by the superclass.
        // * For example, we cannot access seatHeight variable or call setHeight(int newValue) method using Bicycle reference in above first example.
        // * This is because they are defined in subclass not in the superclass.
        // * mb2.setSeatHeight(30); // COMPILE ERROR

        // using subclass reference( )
		// second approach 
		MountainBike mb1 = new MountainBike(3, 100, 25); 
		
		System.out.printf("seat height of first bicycle is %d\n", mb1.getSeatHeight()); 
			
		// In case of overridden methods 
		// always subclass 
		// method will be executed 
		System.out.printf("%s\n", mb1.toString()); 
		System.out.printf("%s\n", mb2.toString()); 

		/* The following statement is invalid because Bicycle 
		does not define a seatHeight. 
		System.out.printf("seat height of second bicycle is %d\n", mb2.getSeatHeight()); */
					
		/* The following statement is invalid because Bicycle 
		does not define setHeight() method. 
		mb2.setSeatHeight(21);*/

	} 
} 