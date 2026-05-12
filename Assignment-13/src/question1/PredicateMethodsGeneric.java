package question1;
import java.util.function.*;

public class PredicateMethodsGeneric {

    // Turn to generic
    public static <T> void result(Predicate<T> p, T arg)
    {
        if (p.test(arg))
            System.out.printf("The Predicate is true for %s\n", arg);
        else
            System.out.printf("The Predicate is false for %s\n", arg);
    }
    public static void main(String [] args)
    {
        Predicate<Integer> p1 = x->x == 5;
        for (int x = 4; x < 7; x++)
        {
            result(p1,x);
            result(y->y%2== 0, x);
        }

        Predicate<String> p3 = s -> s.charAt(0) == 'G';
        result(p3,"Hello");
        result(p3, "Goodbye");
    }
}
