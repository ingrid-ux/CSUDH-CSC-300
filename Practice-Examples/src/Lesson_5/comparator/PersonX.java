package Lesson_5.comparator;// Java program to demonstrate working of Comparator interface
import java.util.*; 
import java.io.*; 
  
// A class to represent a person. 
class PersonX 
{ 
    private int rollno; 
    private String name, address; 
  
    // Constructor 
    public PersonX(int rollno, String name, String address) 
    { 
        setRollno(rollno); 
        setName(name); 
        setAddress(address); 
    } 
  
    // Used to print student details in main() 
   public void setRollno(int rollno)
   {
   	   this.rollno = rollno;
   }
   public void setName(String name)
   {
   	   this.name = name;
   }
   public void setAddress(String address)
   {
   	   this.address = address;
   }
   
   public int getRollno()
   {
   	   return rollno;
   }
   public String getName()
   {
   	   return name;
   }
   public String getAddress()
   {
   	   return address;
   }
    
    public String toString() 
    { 
        
    	return String.format("%d %s %s\n", this.rollno, this.name, this.address);
    } 
} 