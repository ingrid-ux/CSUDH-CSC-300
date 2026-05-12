package Comparator;

import java.util.Comparator;

public class SkyscraperComparator implements Comparator<Skyscraper> {

    @Override
    public int compare(Skyscraper s1, Skyscraper s2) {
        if(s1.getHeight() != s2.getHeight()){
            // g to l
            return s2.getHeight() - s1.getHeight();
        }
        if(s1.getArea() != s2.getArea()){
            return s2.getArea() - s1.getArea();
        }
        return s1.getName().compareTo(s2.getName());


    }

    Comparator<Skyscraper> comp = (s1, s2) -> {
        if (s1.getHeight() != s2.getHeight())
            return s2.getHeight() - s1.getHeight();
        if (s1.getArea() != s2.getArea())
            return s2.getArea() - s1.getArea();
        return s1.getName().compareTo(s2.getName());
    };
}

/*
* * How this maps to the rules
* * s2 - s1 → reverses order → descending
* * s1.compareTo(s2) → natural string order → A → Z
* * Each comparison only happens if the previous one is equal
* *
* * return s2.getName().compareTo(s1.getName()); →  Z → A
* * or negate result -s2 - s1
* *
* *
 */
