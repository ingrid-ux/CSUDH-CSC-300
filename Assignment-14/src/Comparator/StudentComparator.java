package Comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        // Step 1: compare credits (descending)
        if (s1.getCredits() != s2.getCredits()) {
            return s2.getCredits() - s1.getCredits();
        }

        // Step 2: compare names (ascending)
        return s1.getName().compareTo(s2.getName());
    }

}
