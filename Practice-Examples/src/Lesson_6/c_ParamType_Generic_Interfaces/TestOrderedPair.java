package Lesson_6.c_ParamType_Generic_Interfaces;

public class TestOrderedPair
{
	public static void main(String [] args)
	{
		OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
		System.out.printf("%s", p1);
		OrderedPair<String, String>  p2 = new OrderedPair<>("hello","me");
		System.out.printf("%s", p2);
	}
}
