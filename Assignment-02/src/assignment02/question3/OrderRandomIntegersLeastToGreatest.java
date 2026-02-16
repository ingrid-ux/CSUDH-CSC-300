package assignment02.question3;

import java.util.*;
import java.io.*;


public class OrderRandomIntegersLeastToGreatest{
    public static void main(String[] args) throws IOException {
        // Create two int variables, tempInt and counter
        int tempInt, counter;

        // Create a Scanner to read from screen.
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter the seed for the random generator: ");
        long seed = keyboard.nextLong();

        // Request and read in a seed and create an instance of Random called randy based on that seed.
        Random randy = new Random();
        randy.setSeed(seed);
        // Generate a Random number between 3 and 25 inclusively using randy // You must use the 2-param nextInt
        int randomNum = randy.nextInt(3, 26);

        // Create an ArrayList of type Integer called numberList
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(randomNum);
        // For each of 20 more numbers
        for(int i= 0; i<20; i++){
            // Set tempInt to a new int between 3 and 25 inclusively created using randy
            tempInt = randy.nextInt(3, 26);
            // Loop through the current members of numberList (counter from 0 to <numberList.size()
            for(counter = 0; counter < numberList.size(); counter++){
                //If tempInt is less than the numberList(counter)
                if (tempInt < numberList.get(counter)){
                    //Add tempInt at the index equal to counter in numberList
                    numberList.add(counter, tempInt);
                    break;
                }


            }
            // If counter equals numberList.size()
            if (counter == numberList.size()){
                //Add tempInt to the end of numberList
                numberList.add(numberList.size(), tempInt);
            }

        }

        //Request the name of an output file via the terminal and create a PrintWriter to that file
        System.out.printf("Please enter the name of the output file: "); // ** output file should be named randomintsordered.txt
        String outputFileName = keyboard.next();
        File outputFile = new File(outputFileName);
        PrintWriter outputWriter = new PrintWriter(outputFile);

        //Print numberList using the toString method (may use implied toString
        outputWriter.printf("Output Using ArrayList to String:\n");
        outputWriter.printf("%s\n", numberList);

        // Create an iterator for the list
        Iterator<Integer> iterOnNumbers = numberList.iterator();

        //Print out the list in order from least to greatest using the enhanced for.
        outputWriter.printf("\nUsing the Enhanced For loop:\n");
        for ( Integer nextNum : numberList )
            outputWriter.printf("%d ", nextNum);

        //Print out the list in order from least to greatest using an Iterator.
        outputWriter.printf("\nUsing the Iterator:\n");
        while ( iterOnNumbers.hasNext() ) //doesn't move the pointer
            outputWriter.printf("%d ", iterOnNumbers.next());
        //Remember to close your PrintWriter
        outputWriter.close();
        keyboard.close();

    }
}