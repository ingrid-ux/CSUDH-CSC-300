package question3;
import java.util.Scanner;

public class TestPrintQueueSimulation {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter the number of printers: ");
        int printers = keyboard.nextInt();

        System.out.printf("Please enter the number of jobs: ");
        int jobs = keyboard.nextInt();

        System.out.printf("Please enter random seed: ");
        int seed = keyboard.nextInt();

        PrintQueueSimulation simulation = new PrintQueueSimulation(jobs, printers, seed);

        simulation.simulate();
        simulation.displayStatistics();






    }




}
