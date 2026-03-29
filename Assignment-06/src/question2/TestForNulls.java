package question2;

import java.util.ArrayList;
import java.util.Random;

public class TestForNulls {

    public static boolean hasNoNulls(ArrayList<?> list){
        for(Object e: list){
            if (e == null){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Random randy = new Random(5);
        ArrayList<Integer> intArrayL = new ArrayList<>();
        ArrayList<String> stringArrayL = new ArrayList<>();


        for (int i = 0; i < 9; i++){
            intArrayL.add(randy.nextInt(5,16));

        }

        System.out.printf("It is %s that intArrayL has no null value%n", hasNoNulls(intArrayL));

        intArrayL.add(null); // adding null value

        System.out.printf("It is %s that intArrayL has no null value%n", hasNoNulls(intArrayL));

        System.out.printf("%s%n",String.valueOf(intArrayL));

        for (int i = 0; i < 6; i++){
            int num = randy.nextInt(9,28);
            stringArrayL.add("wxy" + num);
        }

        System.out.printf("It is %s that stringArrayL has no null value%n", hasNoNulls(stringArrayL));

        stringArrayL.add(3,null);

        System.out.printf("It is %s that stringArrayL has no null value%n", hasNoNulls(stringArrayL));
        System.out.printf("%s%n",String.valueOf(stringArrayL));

    }







    }
