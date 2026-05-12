package question3;

import java.util.function.BiPredicate;

public class BiPredicateTest {

    // Generic method
    public static <T> void resultBi(BiPredicate<T,T> p, T x, T y){
        System.out.printf("The BiPredicate is %b for values %s and %s%n",
                p.test(x,y), x, y);
    }

    public static void main(String[] args){

        BiPredicate<Integer, Integer> biPred = (x,y) -> x > 3;
        BiPredicate<Integer, Integer> yGreaterThanX = (x,y)-> y > x;
        BiPredicate<Integer, Integer> combined = biPred.or(yGreaterThanX).negate();

    for (int x = 1; x <= 4; x++){
        for (int y = 1; y <= 4; y++){
            resultBi(combined, x, y);
        }
    }



    }


}
