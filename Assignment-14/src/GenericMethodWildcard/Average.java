package GenericMethodWildcard;

import java.util.List;

public class Average {
    public double average(List<? extends Number> list){

        double sumUp = 0.0;
        for(Number num:list){
            sumUp += num.doubleValue();

        }
        return sumUp/list.size();

    }
}
