package LambdaExpression;

import java.util.function.BiFunction;

public class LambdaConcatExample {
    public static void main(String[] args) {
        // Lambda expression by itself
        //(String str1, String str2) -> {return (str1 + str2);}
        // Lambda with explicit parameter types and return statement
        BiFunction<String, String, String> concatenate = (String str1, String str2) -> {
            return str1 + str2;
        };
        /*
        BiFunction<T,U,R>
        BiFunction<T, U, R> always takes three type parameters because it models a function of:

        T → type of the first input
        U → type of the second input
        R → type of the result (return value)
        */
        // Test the lambda
        String result = concatenate.apply("Hello, ", "World!");
        System.out.println(result);

        /*
            ** Function<T, R> → 1 input, 1 output
            ** BiFunction<T, U, R> → 2 inputs, 1 output
            ** Consumer<T> → 1 input, no return
            ** Supplier<T> → no input, returns something
         */
    }
}
