package question1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HiToLoTestPQTest {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter the name of the file to read in data from: ");
        String inputFileName = keyboard.next();

        File inputFile = new File(inputFileName);
        Scanner inputReader = new Scanner(inputFile);

        if (!inputFile.exists()) {

            System.out.printf("Error: %s not found.\n", inputFileName);
            System.exit(0); // This will cause you to exit the program if there is no input file to read from

        }

        System.out.printf("Please enter the name of the output file: "); // *** output file should be named as last_names_output.txt
        String outputFileName = keyboard.next();
        File outputFile = new File(outputFileName); // Creating the file object
        PrintWriter output = new PrintWriter(outputFile); // output file is a reference variable for a new object of type printWriter

        PriorityQueue<EmployeeZ> pq = new PriorityQueue<>();

        while (inputReader.hasNext()){
            String firstName = inputReader.next();
            double salary = inputReader.nextDouble();

            pq.add(new EmployeeZ(firstName, salary));
        }
        output.printf("%-10s %15s%n","NAME", "SALARY");
        while(!pq.isEmpty()){
            EmployeeZ emp = pq.remove();
            output.printf("%-10s %15.2f%n", emp.getFirstName(), emp.getSalary());

        }

        inputReader.close();
        output.close();
        keyboard.close();

    }

}
