package Lesson_5.comparable;

import java.util.*;
public class TestStudentXSort
{  
	public static void main(String args[])
	{  
		ArrayList<StudentX> al=new ArrayList<StudentX>();
		al.add(new StudentX(101,"Jose",23));  
		al.add(new StudentX(106,"Maria",27));  
		al.add(new StudentX(105,"Alexandria",21));  
		  
		Collections.sort(al); //This is a method that can be used with any collection that has sortable objects
		for(StudentX stud:al)
		{  
			System.out.printf("%s", stud);  
		}  
	}  
}  