package Lesson_6.c_ParamType_Generic_Interfaces;

public interface OrdPairInt<K, V>
{
    void setKey(K keyV);
    K getKey();
    void setValue(V valV);
    V getValue();
}
