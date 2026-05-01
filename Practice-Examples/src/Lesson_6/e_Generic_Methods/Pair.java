package Lesson_6.e_Generic_Methods;

public class Pair<K, V>
{

    private K key;
    private V value;

    public Pair(K keyV, V valueV) 
    {
        setKey(keyV);
        setValue(valueV);
    }

    public void setKey(K keyV) 
    { 
    	key = keyV; 
    }
    public void setValue(V value) 
    { 
    	this.value = value; 
    }
    public K getKey()   
    { 
    	return key; 
    }
    public V getValue() 
    { 
    	return value; 
    }
    public String toString()
    {
    	String str1 = String.format("This pair has key %s and value %s\n", key,value);
    	return str1;
    }
}