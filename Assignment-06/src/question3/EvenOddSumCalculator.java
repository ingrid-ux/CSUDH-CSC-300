package question3;

import java.util.ArrayList;
import java.util.Random;

public class EvenOddSumCalculator {

    public static <T extends Number> void calculateNumberSum(ArrayList<T> list) {
        double evenSum = 0.0;
        double oddSum = 0.0;

        System.out.printf("Original list of numbers is%n");
        for (T num : list) {
            int tNum = num.intValue(); // truncate integer value
            double tDouble = num.doubleValue();

            System.out.printf("%.2f ", tDouble);

            if (tNum % 2 == 0) {
                evenSum += tDouble;
            } else {
                oddSum += tDouble;
            }
        }
        System.out.printf("%n");
        System.out.printf("Sum of even numbers is: %.2f%n", evenSum);
        System.out.printf("Sum of odd numbers is: %.2f%n", oddSum);
        System.out.printf("Sum of all the numbers is: %.2f%n", oddSum + evenSum);
        System.out.printf("%n");


    }

    public static void main(String[] args) {
        Random randy = new Random(6);

        // ** Int Array List **
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            intList.add(randy.nextInt(3, 41));
        }
        calculateNumberSum(intList);

        // ** Double Array List **
        ArrayList<Double> doubleList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            doubleList.add(randy.nextDouble() * 84);
        }
        calculateNumberSum(doubleList);

    }
}
