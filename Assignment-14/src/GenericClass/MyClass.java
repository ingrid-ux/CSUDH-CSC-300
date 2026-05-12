package GenericClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyClass<T> {
    LinkedList<T> myLL;

    public MyClass(ArrayList<T> inputList){
        setLinkedList(inputList);
    }

    public LinkedList<T> setLinkedList(List<T> xList){
        myLL = new LinkedList<>(xList);
        return myLL;
    }

}
