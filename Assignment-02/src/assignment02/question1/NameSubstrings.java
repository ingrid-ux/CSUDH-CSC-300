package assignment02.question1;// Must invlude the following statement before the class statement

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class NameSubstrings {
    public static void main (String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter the name of the file to read in data from: ");
        String inputFileName = keyboard.next();
        File inputFile = new File(inputFileName);


        if(!inputFile.exists()){

            System.out.printf("Error: %s not found.\n", inputFileName);
            System.exit(0); // This will cause you to exit the program if there is no input file to read from

        }

        System.out.printf("Please enter the name of the output file: "); // *** output file should be named as last_names_output.txt
        String outputFileName = keyboard.next();
        File outputFile = new File(outputFileName); //Creating the file object
        PrintWriter output = new PrintWriter(outputFile); // output file is a reference variable for a new object of type printWriter

        String[] names = new String[100];

        Scanner inputReader = new Scanner(inputFile);
        int numofNames =0;
        while (inputReader.hasNext() && numofNames < names.length) {
            names[numofNames] = inputReader.next();
            numofNames++;
            //System.out.printf("%s\n", line);
        } inputReader.close();

        String[] noFirstNames = noFirst(names, numofNames);
        for(int i = 0; i < numofNames; i++){
            output.printf("%s %s\n", names[i], noFirstNames[i]);
        }
        output.close();
        keyboard.close();
        //last_names_input.txt
        //last_names_output.txt


    }

    public static String[] noFirst(String arr[], int numberofNames) {
        String[] newArr = new String[numberofNames];
        for(int i = 0; i < numberofNames; i++){
            newArr[i] = arr[i].substring(1);
        }
        return newArr;

    }

}