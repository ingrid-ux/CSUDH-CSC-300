import java.util.*;
import java.io.*;

public class PopulationData {
    public static void main(String[] args) throws IOException {
        //In main:
        // Set the following 2 values:
        final int YEAR_START = 1950;
        final int YEAR_END = 1990;

        ArrayList<Integer> numList = new ArrayList<>();

        System.out.printf("Please enter the name of the file to read in data from: ");
        Scanner keyboard = new Scanner(System.in);
        String inputFileName = keyboard.next();
        getDataFromFile(numList, inputFileName);

        double averageChange = getAverageChange(numList);

        int highestIndex = getHighestIndex(numList);
        int greatestPopulationChange = highestIndex + YEAR_START;

        int lowestIndex = getLowestIndex(numList);
        int lowestPopulationChange = lowestIndex + YEAR_START;

        System.out.printf("The average annual change in population from %d through %d was 2,443.88\n",YEAR_START, YEAR_END, averageChange);
        System.out.printf("The year with the greatest increase in population from %d through %d was %d\n",YEAR_START, YEAR_END, greatestPopulationChange);
        System.out.printf("The year with the smallest increase in population from %d through %d was %d",YEAR_START, YEAR_END, lowestPopulationChange);

        /*
        for(Integer n : numList){
            System.out.printf("%s\n", n);
        }
        */



    }

    public static void getDataFromFile(ArrayList<Integer> arr, String inputFileName) throws IOException {

        File inputFile = new File(inputFileName);
        if(!inputFile.exists()){
            System.out.printf("Error: %s not found.\n", inputFileName);
            System.exit(0);
        }
        Scanner inputReader = new Scanner(inputFile);

        while (inputReader.hasNext()) {
            arr.add(inputReader.nextInt());
        } inputReader.close();
        /*
        for(Integer n : arr){
            System.out.printf("%s\n", n);
        }
         */


    }

    static double getAverageChange(ArrayList<Integer> arr){
        int sumChange = 0;
        for (int i = 1; i < arr.size(); i++)
            sumChange += (arr.get(i) - arr.get(i-1));
        return (double) sumChange / (arr.size() - 1);
    }

    static int getHighestIndex(ArrayList<Integer> arr){
        int highestIndex = -1;
        int maxChange = arr.get(1) - arr.get(0);
        int change;
        for(int i = 2; i < arr.size(); i++){
            change = arr.get(i) - arr.get(i-1);
            if(change > maxChange){
                maxChange = change;
                highestIndex = i;
            }

        }
        return highestIndex;
    }

    static int getLowestIndex(ArrayList<Integer> arr) {
        int lowestIndex = -1;
        int minChange = arr.get(1) - arr.get(0);
        int change;
        for (int i = 2; i < arr.size(); i++) {
            change = arr.get(i) - arr.get(i - 1);
            if (change < minChange) {
                minChange = change;
                lowestIndex = i;
            }

        }
        return lowestIndex;
    }

}