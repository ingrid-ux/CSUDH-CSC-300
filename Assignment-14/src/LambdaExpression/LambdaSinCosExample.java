package LambdaExpression;

import java.util.function.BiFunction;

public class LambdaSinCosExample {
    public static void main(String[] args) {

        BiFunction<Double, Double, Double> trigProduct = (Double x1, Double x2) -> {
            return Math.sin(x1) * Math.cos(x2);
        };

        double result = trigProduct.apply(Math.PI / 2, 0.0);
        System.out.println(result);  // Expected: ~1.0
    }




    // (Double x1, Double x2)->{return (Math.sin(x1) * Math.cos(x2));)
    // That error comes from a subtle Java rule: you can’t mix primitive
    // types (double) with generic type parameters
    // (Double) in a lambda target like BiFunction.
}
