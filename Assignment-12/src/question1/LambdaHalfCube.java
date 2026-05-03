package question1;

import java.util.Scanner;

public class LambdaHalfCube {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // without return statement
        CalcValue e1 = b -> 0.5 * b * b * b;
        System.out.printf("Please enter the base as a type double to 2 decimal places: ");
        double e1Value = keyboard.nextDouble();
        double e1Result = e1.calculate(e1Value);
        System.out.printf("Without using return the value of half the cube power of %.2f is %.3f%n", e1Value, e1Result);

        // with return statement
        CalcValue e2 = (b) ->{
          return 0.5 * b * b * b;
        };
        System.out.printf("Please enter the base as a type double to 2 decimal places: ");
        double e2Value = keyboard.nextDouble();
        double e2Result = e2.calculate(e2Value);
        System.out.printf("Using return the return the value of half the cube power of %.2f is %.3f%n", e2Value, e2Result);

        keyboard.close();


    }
}
