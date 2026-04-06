
package Lesson_6.Generics;

public class TestBox
{
	public static void main(String[] args) 
	{
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.setTObjRef(Integer.valueOf(10));
        //integerBox.set("ABCDEF"); This won't work
        integerBox.inspect("some text");//This is for a generic method to be explained shortly
        integerBox.inspect(Integer.valueOf(200));//This is for a generic method to be shown shortly


        Box<String> stringBox = new Box<>();
        stringBox.setTObjRef("ABCD");
        stringBox.inspect("some text");//This is for a generic method to be explained shortly
        stringBox.inspect(Integer.valueOf(200));//This is for a generic method to be shown shortly
        
    }
}