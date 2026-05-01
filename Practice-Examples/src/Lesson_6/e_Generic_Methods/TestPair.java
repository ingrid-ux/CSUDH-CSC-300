package Lesson_6.e_Generic_Methods;

public class TestPair
{
	public static void main(String [] args)
	{
		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(2, "pear");
		boolean same = Util.<Integer, String>compareX(p1, p2);
		System.out.printf("It is %b that p1 equals p2\n", same);
		System.out.printf("p1: %s\np2: %s\n", p1,p2);
		
		same = Util.compareX(p1, p2);
		System.out.printf("It is %b that p1 equals p2\n", same);
		same = Util.compareX(p1, p1);
		System.out.printf("It is %b that p1 equals p1\n", same);
		p2.setKey(p1.getKey());
		p2.setValue(p1.getValue());
		same = Util.compareX(p1, p2);
		System.out.printf("It is %b that p1 equals p2\n", same);
	}
}