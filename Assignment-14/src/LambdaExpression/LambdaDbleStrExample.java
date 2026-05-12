package LambdaExpression;

import java.util.function.BiFunction;

public class LambdaDbleStrExample {
    public static void main(String[] args) {

        BiFunction<String, Double, String> concat = (String s1, Double d1) -> {
            return s1 + d1;
        };

        String result = concat.apply("Total: ", 12.5);
        System.out.println(result);  // Output: Total: 12.5
    }
    //(String s1, Double d1)->{return (s1+d1);}
}
