package question2;

import java.util.Comparator;

public class ComparatorMultiSort implements Comparator<Contractor> {
    @Override
    public int compare(Contractor c1, Contractor c2) {
        int compareName = c1.getName().compareTo(c2.getName());
        if (compareName != 0) {
            return compareName;
        }
        int compareLocation = c1.getLocation().compareTo(c2.getLocation());
        if (compareLocation != 0) {
            return compareLocation;
        }
        return c1.getOwnerID() - c2.getOwnerID();
    }
}

