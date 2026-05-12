package GenericMethodWildcard;

import java.util.LinkedList;
import java.util.List;

public class LinkedListofSquaredRoots {

    public LinkedList<Double> linkListofSquareRoots(List<? extends Number> list){

    LinkedList<Double> myLL = new LinkedList<>();
    for(Number num: list){
        myLL.add(Math.sqrt(num.doubleValue()));
    }
    return myLL;

    }


}
