package program_segment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class thirdPowerList {

    public static List<Double> thirdPowerList(List<? extends Number> list){
           List<Double> thirdPowerAL = new ArrayList<>();

            Iterator<? extends Number> it = list.iterator();

            while(it.hasNext()){
                Number num = it.next();
                double val = num.doubleValue();
                thirdPowerAL.add(Math.pow(val,3));

            }
            return thirdPowerAL;
    }
    /*
        * Write a method thirdPowerList that accepts a List reference myList with a type that is a wildcard
        * with an upper bound of type Number and that has as a return type a List of type Double.
        * *
        * *The body will need to create an actual ArrayList with the variable name thirdPowerAL of type List.
        * It will also need to create an Iterator for myList which you will use as you populate
        * thirdPowerAL. thirdPowerAL will contain the cube of each element of myList. Once the
        * iteration is complete return the reference to thirdPowerAL.
        *
     */



}
