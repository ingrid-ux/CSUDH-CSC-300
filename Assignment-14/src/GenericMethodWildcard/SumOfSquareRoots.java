package GenericMethodWildcard;

import java.util.List;

public class SumOfSquareRoots {

    public double sumofSquareRoots(List<? extends Number> list){
        double sum = 0.0;
        for(Number value: list){
            sum += Math.sqrt(value.doubleValue());
        }
        return sum;
    }
}
