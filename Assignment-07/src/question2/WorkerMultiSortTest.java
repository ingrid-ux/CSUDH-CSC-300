package question2;
import java.util.*;
import java.io.*;

public class WorkerMultiSortTest {

    public static void main(String[] args) throws IOException {
        ArrayList<Worker> wrks = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Please enter name of file to read workers from: %n ");
        String inputFileName = keyboard.next();
        File inputFile = new File(inputFileName);
        if (!inputFile.exists()) {
            System.out.printf("Error: %s not found.\n", inputFileName);
            System.exit(0);
        }

        Scanner inputReader = new Scanner(inputFile);
        while (inputReader.hasNext()) {

            int id = inputReader.nextInt();
            String name = inputReader.next();
            int salary = inputReader.nextInt();
            String jobTitle = inputReader.next();
            Worker w = new Worker(id, name, salary, jobTitle);
            wrks.add(w);
        }
        inputReader.close();
        Collections.sort(wrks, new WorkerMultiSortComparator());

        Iterator<Worker> it = wrks.iterator();

        while (it.hasNext()) {
            System.out.printf(String.valueOf(it.next()));
        }


    }
}