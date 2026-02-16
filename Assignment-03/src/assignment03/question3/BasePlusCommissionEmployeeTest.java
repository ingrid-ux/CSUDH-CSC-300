package assignment03.question3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BasePlusCommissionEmployeeTest {
    /*
            BasePlusCommissionEmployeeTest (50) – Note: as a part of Scanner creation must check
        for existence of the input file
        This class includes the main method.
        You will need to create a number of local variables as a part of this program.
        Create two ArrayList objects, one for the CommissionEmployees called commOnlyEmp, and
        one for the BasePlusCommissionEmployees called basePlusCommEmp.
        Request and read in the name of the file with CommissionEmployee data.
        (This file includes on each line values for the 4 constructor parameters in order.) (use my
        commemp.txt as the input file
        Create a Scanner for this file
        For each line
        Read in the four values
        Create a CommissionEmployee based on those variables and add to the commOnlyEmp
        ArrayList
        10
        Request and read in the name of the file with BasePlusCommissionEmployee data.
        (This file includes on each line the values for the 5 constructor parameters in the same order as in
        the constructor.) (use my baseplusemp.txt as the input file)
        Create a Scanner for this file
        For each line
        Read in the five values
        Create a BasePlusCommissionEmployee based on those variables and add to the
        basePlusCommEmp ArrayList
        Request the name of an output file
        Create a PrintWriter for that output file
        Create an output file formatted equivalent to that found in salarystats.txt found in the Lesson 3
        Homework file on Canvas and shown below.
        Use an enhanced loop through each ArrayList
        Don’t forget to close the output file.
     */
    public static void main(String[] args) throws IOException {
        ArrayList<CommissionEmployee> commOnlyEmp = new ArrayList<CommissionEmployee>();
        ArrayList<BasePlusCommissionEmployee> basePlusCommEmp = new ArrayList<BasePlusCommissionEmployee>();

        System.out.printf("Please enter the name of the file to read in data from: ");
        Scanner keyboard = new Scanner(System.in);
        String inputFileName = keyboard.next();
        File inputFile = new File(inputFileName);
        if(!inputFile.exists()){
            System.out.printf("Error: %s not found.\n", inputFileName);
            System.exit(0);
        }
        Scanner inputReader = new Scanner(inputFile);

        while (inputReader.hasNext()) {
            arr.add(inputReader.nextInt());
        } inputReader.close();
    }
}