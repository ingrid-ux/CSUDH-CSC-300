package GenericMethodWildcard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreatePowerList {
    public List<Double> createPowerList(List<? extends Number> myList, double dPower){
        List<Double> powerList = new ArrayList<>();
        Iterator<? extends Number> iter = myList.iterator();

        while(iter.hasNext()){
            Number num = iter.next();
            powerList.add(Math.pow(num.doubleValue(), dPower));
        }
        return powerList;
    }
}
