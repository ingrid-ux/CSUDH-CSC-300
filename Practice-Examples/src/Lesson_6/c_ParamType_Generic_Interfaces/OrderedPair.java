package Lesson_6.c_ParamType_Generic_Interfaces;

public class OrderedPair<K, V>  implements OrdPairInt <K, V> //The K,V in the class are only  					               //needed because of the constructor
{
    private K key;
    private V value;

    public OrderedPair(K keyVal, V valueVal) // This is the constructor 
    {
        setKey(keyVal);
        setValue(valueVal);
    }
    public void setKey(K keyVar) 
    { 
       key = keyVar; 
    }
    public void setValue(V varValue) { 
        value = varValue; 
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
    	return String.format("Key = %s  Value = %s\n", key, value);
    }
}