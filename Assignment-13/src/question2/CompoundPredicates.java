package question2;

import java.util.function.Predicate;

public class CompoundPredicates {

// Generic method
    //Use the result(Predicate<T> p1, T arg) method in the class programs to generate the output.
    public static <T> void result(Predicate<T> p, T arg){
        System.out.printf("The Predicate %b for value %s%n", p.test(arg), arg);
    }
    public static void main(String[] args){
        /*
        * Predicate pr1 of type Integer returns true if the input value
        * is greater than or equal to 60, otherwise false.
         */
        Predicate<Integer> pr1 = n -> n >= 60;
        Predicate<Integer> pr2 = n -> n % 2 == 0;
        Predicate<Integer> pr3 = n -> n < 130;

        Predicate<Integer> pr4 = pr1.or(pr2).negate().and(pr3);

        for (int i = 11; i <= 139; i += 7){
            result(pr4,i);
        }

    }

}
