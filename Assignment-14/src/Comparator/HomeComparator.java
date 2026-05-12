package Comparator;

import java.util.Comparator;

public class HomeComparator implements Comparator<Home> {
    public int compare(Home h1, Home h2){
        if (h1.getSqFeet() != h2.getSqFeet()){
            return  h2.getSqFeet() - h1.getSqFeet();
        }
        if(h1.getNumRooms() != h2.getNumRooms()){
            return h2.getNumRooms() - h1.getNumRooms();
        }
        return h1.getPrice() - h2.getPrice();
    }

}
/*
* * int compare(Home h1, Home h2)
* *
* * Return values:
* *
* * negative → h1 comes before h2
* * positive → h1 comes after h2
* * 0 → equal (move to next criterion)
* *
* * ex.)
* * 3. Convert each rule into comparison logic
* * (A) sqFeet (descending)
* *
* * Normally ascending is:
* *
* * h1.getSqFeet() - h2.getSqFeet()
* *
* * For descending, reverse it:
* *
* * h2.getSqFeet() - h1.getSqFeet()
* *
* * DESCENDING (LEAST TO GREATEST) -> h1 - h2
* * ASCENDING (GREATEST TO LEAST) -> h2 - h1



 */