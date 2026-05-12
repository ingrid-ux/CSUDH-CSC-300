package Comparator;

import java.util.Comparator;

public class RocketComparator implements Comparator<Rocket> {

    public int compare(Rocket r1, Rocket r2){

        if(r1.getVolume() != r2.getVolume()){
            return r2.getVolume() - r1.getVolume();
        }
        if(r1.getWeight() != r1.getVolume()){
            return r2.getWeight() - r1.getWeight();
        }
        // natural ordering A->Z
        return r2.getCountry().compareTo(r1.getCountry());

    }

}
