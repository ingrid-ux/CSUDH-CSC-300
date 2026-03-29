package question1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Iterator;


public class WeightyDinos {
    public static void main(String[] args) {
        Random randy = new Random(4);
        ArrayList<Dinosaur> dinoList = new ArrayList<Dinosaur>();

        for (int i = 0; i < 12; i++) {
            Dinosaur d = new Dinosaur(randy.nextInt(50000, 200001));
            dinoList.add(d);
        }

        Collections.sort(dinoList);

        System.out.printf("%-10s %10s\n", "Name", "Weight");

        Iterator<Dinosaur> it = dinoList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
    //dinoList.add(d);
