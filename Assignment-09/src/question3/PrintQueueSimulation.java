package question3;

import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class PrintQueueSimulation {
    private PriorityQueue<Job> waitQueue;
    private PriorityQueue<Job> finishedQueue;

    private int totalWaitTime = 0;
    private int currentTime = 0;

    private Printer[] printer;
    private Random randy;
    private int numberOfPrinters;
    private int numberOfPrintJobs;

    PrintQueueSimulation(int numberOfJobs, int numberOfPrinters, int seed) {
        this.numberOfPrintJobs = numberOfJobs;
        this.numberOfPrinters = numberOfPrinters;
        this.randy = new Random(seed);

        this.waitQueue = new PriorityQueue<>(numberOfJobs);
        this.finishedQueue = new PriorityQueue<>(numberOfJobs);

        this.printer = new Printer[numberOfPrinters];

        for (int i = 0; i < numberOfPrinters; i++) {
            printer[i] = new Printer("Printer" + i);
        }
    }

    public void simulate() {
        boolean flagDone = false;
        int jobsCreated = 0;
        while (!flagDone) {
            if (currentTime % 75 == 0 && jobsCreated < numberOfPrintJobs) {
                int jobTime = randy.nextInt(10, 1001);
                int priority = randy.nextInt(1, 12);
                Job job = new Job(currentTime, jobTime, priority);
                waitQueue.add(job);
                jobsCreated++;
            }

            for (Printer p : printer) {
                Job job = p.getJob();
                if (job != null) {
                    if (currentTime >= job.getStartTime() + job.getTimeForJob()) {
                        job.setEndTime(currentTime);
                        finishedQueue.add(job);
                        p.setJob(null);
                        p.setStartIdleTime(currentTime);
                    }
                }
            }

            for (Printer p : printer) {
                if (p.getJob() == null) {
                    if (!waitQueue.isEmpty()) {
                        Job job = waitQueue.poll();
                        job.setStartTime(currentTime);
                        p.setJob(job);
                        p.setStartInUseTime(currentTime);
                        totalWaitTime += job.getWaitTime();

                    }
                }
            }
            currentTime++;

            if (jobsCreated == numberOfPrintJobs && waitQueue.isEmpty()) {
                flagDone = true;
                for (Printer p : printer) {
                    if (p.getJob() != null) {
                        flagDone = false;
                        break;
                    }
                }
            }

        }
    }

    public void displayStatistics() throws Exception{
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter the name of your output file for the results: ");
        String outputName = keyboard.nextLine();

        PrintWriter output = new PrintWriter(outputName);

        output.printf("Simulation Results%n");
        output.printf("Simulation with %d printers lasted %d seconds and processed %d jobs%n",
                numberOfPrinters, currentTime, numberOfPrintJobs);
        double avg = (double) totalWaitTime /  numberOfPrintJobs;
        output.printf("The average time in the wait queue for a job is %.2f seconds%n%n",
                avg);

        output.printf("Printer Statistics%n");

        output.printf("%-10s %-15s %-10s %-10s%n", "Name", "Jobs Processed", "Time In Use", "Time Idle");

        for (Printer p: printer){
            output.printf("%-10s %-15s %-10s %-10s%n",
                    p.getPrinterName(),
                    p.getTotalJobsProcessed(),
                    p.getTotalInUseTime(),
                    p.getTotalIdleTime(currentTime));
        }


        output.printf("%nJob Statistics%n");
        output.printf("%-8s %-10s %-10s %-15s%n", "Job No.", "Priority", "Wait Time", "Length of Job");

        while (!finishedQueue.isEmpty()) {
            Job j = finishedQueue.poll();

            output.printf("%-8d %-10d %-10d %-15d%n",
                    j.getID(),
                    j.getPriority(),
                    j.getWaitTime(),
                    j.getTimeForJob());
        }

        output.close();
    }
}
