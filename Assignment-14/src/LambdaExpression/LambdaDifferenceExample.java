package LambdaExpression;

import java.util.function.BiFunction;

public class LambdaDifferenceExample {

    // (Integer int1, Double db1) -> {return (int1 - db1);}
    public static void main(String[] args) {

        // Lambda with explicit types and return
        BiFunction<Integer, Double, Double> difference = (Integer int1, Double db1) -> {
            return int1 - db1;
        };

        // Test the lambda
        Double result = difference.apply(10, 3.5);
        System.out.println(result);  // Output: 6.5
    }
}
