package Lesson_5.comparator;

import java.util.*;
class SortByName implements Comparator<PersonX> 
{ 
    // Used for sorting in ascending order of roll name 
    public int compare(PersonX a, PersonX b) 
    { 
        return a.getName().compareTo(b.getName()); //Note: compareTo for String exists
    } 
}