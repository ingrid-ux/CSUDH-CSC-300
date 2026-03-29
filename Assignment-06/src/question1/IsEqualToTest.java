package question1;

import java.util.*;

public class IsEqualToTest {
    public static <T> boolean isEqualTo(T a, T b){ return a.equals(b);}

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // ** Integer Test **
        System.out.printf("Enter two integer values: ");
        int integer1 = keyboard.nextInt();
        int integer2 = keyboard.nextInt();

        // ** Integer Test **
        if (isEqualTo(integer1, integer2)){
            System.out.printf("%d and %d are equal%n", integer1, integer2);
        }else{
            System.out.printf("%d and %d are not equal%n", integer1, integer2);
        }

        // ** Double Test **
        System.out.printf("Enter two double values: ");
        double double1 = keyboard.nextDouble();
        double double2 = keyboard.nextDouble();

        if (isEqualTo(double1, double2)){
            System.out.printf("%.1f and %.1f are equal%n", double1, double2);
        }else{
            System.out.printf("%.1f and %.1f are not equal%n", double1, double2);
        }

        keyboard.nextLine();

        // ** String Test **
        System.out.printf("Enter two string values: ");
        String string1 = keyboard.next();
        String string2 = keyboard.next();

        if (isEqualTo(string1, string2)){
            System.out.printf("%s and %s are equal%n", string1, string2);
        }else{
            System.out.printf("%s and %s are not equal%n", string1, string2);
        }

        // ** Object Test **
        Object object1 = new Object();
        Object object2 = new Object();

        if (isEqualTo(object1, object2)){
            System.out.printf("%s and %s are equal%n", object1, object2);
        }else{
            System.out.printf("%s and %s are not equal%n", object1, object2);
        }





    }


}
