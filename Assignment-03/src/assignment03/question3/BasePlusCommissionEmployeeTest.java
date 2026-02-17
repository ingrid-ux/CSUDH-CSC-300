package assignment03.question3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) throws IOException {
        ArrayList<CommissionEmployee> commOnlyEmp = new ArrayList<CommissionEmployee>();
        ArrayList<BasePlusCommissionEmployee> basePlusCommEmp = new ArrayList<BasePlusCommissionEmployee>();

        //System.out.printf("Please enter the name of the input file with Commission Only Salespersons Data: ");
        Scanner keyboard = new Scanner(System.in);
        String inputFileName = "data/commemp.txt";
        //String inputFileName = keyboard.next();
        File inputFile = new File(inputFileName);
        if(!inputFile.exists()){
            System.out.printf("Error: %s not found.\n", inputFileName);
            System.exit(0);
        }
        Scanner inputReader = new Scanner(inputFile);

        //String firstName, String lastName, double grossSales, double commissionPercent
        while (inputReader.hasNextLine()) {
            String[] values = inputReader.nextLine().split(" ");
            //System.out.printf("\n"+value);
            if (values.length == 4){
                String firstName = values[0];
                String lastName = values[1];
                double grossSales = Double.parseDouble(values[2]);
                double commissionPercent = Double.parseDouble(values[3]);

                commOnlyEmp.add(new CommissionEmployee(firstName, lastName, grossSales, commissionPercent));
            }

        } inputReader.close();


        //System.out.printf("Please enter the name of the input file with Base Plus Commission Salespersons: ");
        keyboard = new Scanner(System.in);
        //inputFileName = keyboard.next();
        inputFileName = "data/baseplusemp.txt";
        inputFile = new File(inputFileName);
        if(!inputFile.exists()){
            System.out.printf("Error: %s not found.\n", inputFileName);
            System.exit(0);
        }
        inputReader = new Scanner(inputFile);

        while (inputReader.hasNextLine()) {
            String[] values = inputReader.nextLine().split(" ");

            //System.out.printf("\n"+value);
            if (values.length == 5){
                String firstName = values[0];
                String lastName = values[1];
                double grossSales = Double.parseDouble(values[2]);
                double commissionPercent = Double.parseDouble(values[3]);
                double baseSalary = Double.parseDouble(values[4]);
                //BasePlusCommissionEmployee(String firstName, String lastName, double grossSales, double commissionPercent,double baseSalary) {

                basePlusCommEmp.add(new BasePlusCommissionEmployee(firstName, lastName, grossSales, commissionPercent, baseSalary));
            }

        } inputReader.close();


       // System.out.printf("Please enter the name of the output file: "); // ** output file should be named salarystats.txt
        //String outputFileName = keyboard.next();
        //File outputFile = new File(outputFileName);
        File outputFile = new File("yip");
        PrintWriter outputWriter = new PrintWriter(outputFile);


        //% [flags] [width] conversion
        outputWriter.printf("\nStatistics On Commission Only Employees\n");
        outputWriter.printf("%-15s%-20s%15s\n", "FNAME", "LNAME", "Total Compensation");
        double comOnlytotal = 0.0;
        for(CommissionEmployee employee : commOnlyEmp)
        {
            outputWriter.printf("%-15s%-20s$%,-15.2f\n", employee.getFirstName(), employee.getLastName(), employee.earnings());
            comOnlytotal += employee.earnings();
        }

        outputWriter.printf("Total Compensation For Commission Only Employees Is: $%.2f", comOnlytotal);

        outputWriter.printf("\n");



        double basePlusTotal = 0.0;

        outputWriter.printf("\nStatistics On Base Pay Plus Commission Employees\n");
        outputWriter.printf("%-15s%-20s%15s\n", "FNAME", "LNAME", "Total Compensation");
        for(BasePlusCommissionEmployee employee : basePlusCommEmp)
        {
            outputWriter.printf("%-15s%-20s$%,-15.2f\n", employee.getFirstName(), employee.getLastName(), employee.earnings());
            basePlusTotal += employee.earnings();
        }
        outputWriter.printf("Total Compensation For Commission Only Employees Is: $%.2f", basePlusTotal);
        outputWriter.printf("\n\n");
        double totalComAllEmployees = basePlusTotal + comOnlytotal;

        outputWriter.printf("Total Compensation For All Employees Is: $%.2f", totalComAllEmployees);

        //Remember to close your PrintWriter
        outputWriter.close();
        keyboard.close();



    }
}
  /*
        * BasePlusCommissionEmployeeTest (50) – Note: as a part of Scanner creation must check
        * for existence of the input file
        * This class includes the main method.
        * You will need to create a number of local variables as a part of this program.
        * Create two ArrayList objects, one for the CommissionEmployees called commOnlyEmp, and
        * one for the BasePlusCommissionEmployees called basePlusCommEmp.
        * Request and read in the name of the file with CommissionEmployee data.
        * (This file includes on each line values for the 4 constructor parameters in order.) (use my
        * commemp.txt as the input file
        * Create a Scanner for this file
        * For each line
        * Read in the four values
        * Create a CommissionEmployee based on those variables and add to the commOnlyEmp
        * ArrayList

        * Request and read in the name of the file with BasePlusCommissionEmployee data.
        * (This file includes on each line the values for the 5 constructor parameters in the same order as in
        * the constructor.) (use my baseplusemp.txt as the input file)
        * Create a Scanner for this file
        * For each line
        * Read in the five values
        * Create a BasePlusCommissionEmployee based on those variables and add to the
        * basePlusCommEmp ArrayList
        * Request the name of an output file
        * Create a PrintWriter for that output file
        * Create an output file formatted equivalent to that found in salarystats.txt found in the Lesson 3
        * Homework file on Canvas and shown below.
        * Use an enhanced loop through each ArrayList
        * Don’t forget to close the output file.
     */