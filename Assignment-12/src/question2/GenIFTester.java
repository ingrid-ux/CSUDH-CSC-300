package question2;

import java.util.Scanner;

public class GenIFTester {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        //Create a lambda function called reverse that implements GenericInterface
        GenericInterface<String> reverse = (String s)->{
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        };

        for(int i = 0; i < 3; i++){
            System.out.printf("Enter a string to be reversed:%n");
            String strRev = keyboard.nextLine();
            String reversed = reverse.func(strRev);
            System.out.printf("The entry %s reversed is %s%n", strRev, reversed);
        }

        //Create a lambda function called factorial that implements GenericInterface
        GenericInterface<Integer> factorial = (Integer n)->{
            int value = 1;
            for (int i = 1; i <= n; i++){
                value *= i;
            }
            return value;
        };

        for(int i = 0; i < 3; i++){
            System.out.printf("Enter an integer to be factorialised:%n");
            int intVal = keyboard.nextInt();
            int fact = factorial.func(intVal);
            System.out.printf("factorial of %d = %d%n", intVal, fact);
        }



    }
}
