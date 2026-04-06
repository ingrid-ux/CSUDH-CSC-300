package Lesson_4.instanceOf;

class DemoInstanceOf
{
	public static void main(String [] args)
	{
		Object obj;
		YouthBirthday ybd = new YouthBirthday( "Ian", 4 );
        //ybd.greeting("hello!"); // still works
		String str = "Yertle";
		obj = ybd;
        //*If obj actually held a String, you'd get:
        // *obj = str;
        // *
        // *((YouthBirthday)obj).greeting(); // ClassCastException - dangerous
        // *instanceof = safety check before casting
        // *instanceof + casting restores specificity safely
        // *
        // *instanceof lets you safely determine what an object really is at runtime,
        // * and casting lets you access its specific behavior after that check
        // *
        // *
        // *The format of instance of is:
        //  * referenceVariable instanceof ClassName
        //  * returns true or false
        if ( obj instanceof YouthBirthday ) {
            ((YouthBirthday) obj).greeting(); //* casting
            System.out.printf("hehe");
        }
		else if ( obj instanceof String )
		  System.out.printf("%s\n", (String)obj);
	}
}