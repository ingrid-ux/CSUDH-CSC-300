package Lesson_6.e_Generic_Methods;

public class Util
{
    public static <K, V> boolean compareX(Pair<K, V> p1, Pair<K, V> p2) 
    {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }
}