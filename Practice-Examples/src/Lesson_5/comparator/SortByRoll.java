package Lesson_5.comparator;

import java.util.*;
class SortByRoll implements Comparator<PersonX> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(PersonX a, PersonX b) 
    { 
        return a.getRollno() - b.getRollno(); 
    } 
} 