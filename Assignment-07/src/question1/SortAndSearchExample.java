package question1;

import java.util.ArrayList;
import java.util.Collections;

public class SortAndSearchExample {
    public static void main(String[] args) {

        ArrayList<String> fruitsPurchased = new ArrayList<>();
        fruitsPurchased.add("Banana");
        fruitsPurchased.add("Apple");
        fruitsPurchased.add("Orange");
        fruitsPurchased.add("Mango");
        fruitsPurchased.add("Grape");

        System.out.printf("Original List:%n");
        System.out.printf(String.valueOf(fruitsPurchased));

        Collections.sort(fruitsPurchased);
        System.out.printf("%nSorted List:%n");
        System.out.printf(String.valueOf(fruitsPurchased));

        ArrayList<String> fruitsDesired = new ArrayList<>();
        fruitsDesired.add("Orange");
        fruitsDesired.add("Pineapple");
        fruitsDesired.add("Banana");
        fruitsDesired.add("Kiwi");
        fruitsDesired.add("Guava");
        fruitsDesired.add("Tomato");

        System.out.printf("%n%nSearch Testing:%n");

        for (String fruit : fruitsDesired){
            int result = Collections.binarySearch(fruitsPurchased, fruit);
            if (result >= 0)
                System.out.printf("%s found at index %d%n", fruit, result);
            else
                System.out.printf("%s not found. Go back to the store.%n", fruit);

        }





    }
}
