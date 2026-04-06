package Lesson_5.comparator;

import java.util.Comparator;
class AdultSortingComparator implements Comparator<Adult> 
{ 
	public int compare(Adult customer1, Adult customer2) 
	{ 
		// for comparison 
		int nameCompare = customer1.getName().compareTo(customer2.getName()); 
		int ageCompare = customer1.getAge().compareTo(customer2.getAge()); 
        // 2-level comparison using if-else block 
        if (nameCompare == 0) 
        { 
        	return ((ageCompare == 0) ? nameCompare : ageCompare); //ternary operator
        } 
        else 
        { 
        	return nameCompare; 
        } 
    } 
} 