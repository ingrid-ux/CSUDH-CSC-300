package question2;

import question1.Dinosaur;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;

public class ContractorSortTest {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter the name of the input file with Contractor Data:%n ");
        String inputFileName = keyboard.next();
        File inputFile = new File(inputFileName);
        if(!inputFile.exists()){
            System.out.printf("Error: %s not found.\n", inputFileName);
            System.exit(0);
        }

        Scanner inputReader = new Scanner(inputFile);
        ArrayList<Contractor> contractorsList = new ArrayList<Contractor>();
        while(inputReader.hasNext()){
            String name = inputReader.next();
            String location = inputReader.next();
            int ownerID = inputReader.nextInt();
            Contractor contractor = new Contractor(name,location,ownerID);
            contractorsList.add(contractor);
        }



        keyboard.close();
        System.out.printf("List Sorted By Contractor Name%n");
        Collections.sort(contractorsList, new ComparatorSortName());
        Iterator<Contractor> it = contractorsList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }



        System.out.printf("%nList Sorted By Location%n");
        Collections.sort(contractorsList, new ComparatorSortLocation());
        it = contractorsList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.printf("%nList Sorted By OwnerID%n");
        Collections.sort(contractorsList, new ComparatorSortOwnerID());
        it = contractorsList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.printf("%nList MultiSorted%n");
        Collections.sort(contractorsList, new ComparatorMultiSort());
        it = contractorsList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }




    }
}
