package question3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class GolfScores {
    public static void main(String[] args) throws IOException {


        // Create a Scanner to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        // Request the name of an output text file and create a PrintWriter for that file'
        System.out.printf("Please enter the name of the output file: ");
        String outputFileName = keyboard.next();
        File outputFile = new File(outputFileName); //Creating the file object
        PrintWriter output = new PrintWriter(outputFile); // output file is a reference variable for a new object of type printWriter

        // Create a LinkedList of type Hole
        LinkedList<Hole> lList = new LinkedList<>();
        // Create a Random variable randy1 with a seed of 5
        Random randy1 = new Random(5);
        // Set the startTime in milliseconds (remember to use long)
        long startTime = System.currentTimeMillis();

        // For each of 100 courses.
        for (int course = 0; course < 100; course++) {
            int totalPar = 0;
            int totalScore = 0;
            // For each of the 18 holes
            for (int hole = 0; hole < 18; hole++) {
                // Calculate par as a random int between 3 and 5, inclusive, using randy1
                int par = randy1.nextInt(3,6);
                // Calculate the score for the hole random integer from two below the par value to four above it
                // using randy1
                int score = randy1.nextInt(par - 2,par + 5); // (par-2) (par + 4) (inclusive?)
                // Add a new hole with the par and score to the LinkedList
                lList.add(new Hole(par,score));
                // Calculate the totalPar and totalScore for the Course and add to the LinkedList
                // For each of the 100 courses
                totalPar += par;
                totalScore += score;
            }
            lList.add(new Hole(totalPar, totalScore));
        }
        output.printf("Output for LinkedList%n");
        int index = 0;
        for (int course = 1; course <= 100; course++) {
            // COURSE TITLE
            output.printf("Course %d%n", course);
            // HOLE ROW
            output.printf("%-6s", "Hole");

            for (int i = 1; i <= 18; i++) {
                output.printf("%4d", i);
            }
            output.printf("%6s%n", "Total");
            // END OF HOLE ROW

            int totalPar = 0;
            int totalScore = 0;

            int[] pars = new int[18];
            int[] scores = new int[18];

            // GETTING TOTAL PAR AND TOTAL SCORE
            for (int i = 0; i < 18; i++) {
                Hole h = lList.get(index++);
                pars[i] = h.getPar();
                scores[i] = h.getScore();
                totalPar += pars[i];
                totalScore += scores[i];
            }

            index++;

            // PAR ROW
            output.printf("%-6s", "Par");
            for (int i = 0; i < 18; i++) {
                output.printf("%4d", pars[i]);
            }
            output.printf("%6d%n", totalPar);

            // SCORE ROW
            output.printf("%-6s", "Score");
            for (int i = 0; i < 18; i++) {
                output.printf("%4d", scores[i]);
            }
            output.printf("%6d%n%n", totalScore);
        }

        // Set the endTime in milliseconds (remember to use long)
        long endTime = System.currentTimeMillis();
        // Print out the totalTime to the Screen
        System.out.printf("The Total number of milliseconds using LinkedList is %d%n",(endTime - startTime));


        startTime = System.currentTimeMillis();

        ArrayList<Hole> arrayList = new ArrayList<>();
        Random randy2 = new Random(5);
        for (int course = 0; course < 100; course++){
            int totalPar = 0;
            int totalScore = 0;
            for (int hole = 0; hole < 18; hole++){
                int par = randy2.nextInt(3,6);
                int score = randy2.nextInt(par - 2,par + 5); // (par-2) (par + 4) (inclusive?)
                arrayList.add(new Hole(par,score));
                totalPar += par;
                totalScore += score;
            }
            arrayList.add(new Hole(totalPar, totalScore));
        }

        output.printf("Output for ArrayList%n");
        index = 0;
        for (int course = 1; course <= 100; course++) {
            // COURSE TITLE
            output.printf("Course %d%n", course);
            // HOLE ROW
            output.printf("%-6s", "Hole");

            for (int i = 1; i <= 18; i++) {
                output.printf("%4d", i);
            }
            output.printf("%6s%n", "Total");
            // END OF HOLE ROW

            int totalPar = 0;
            int totalScore = 0;

            int[] pars = new int[18];
            int[] scores = new int[18];

            // GETTING TOTAL PAR AND TOTAL SCORE
            for (int i = 0; i < 18; i++) {
                Hole h = arrayList.get(index++);
                pars[i] = h.getPar();
                scores[i] = h.getScore();
                totalPar += pars[i];
                totalScore += scores[i];
            }

            index++;

            // PAR ROW
            output.printf("%-6s", "Par");
            for (int i = 0; i < 18; i++) {
                output.printf("%4d", pars[i]);
            }
            output.printf("%6d%n", totalPar);

            // SCORE ROW
            output.printf("%-6s", "Score");
            for (int i = 0; i < 18; i++) {
                output.printf("%4d", scores[i]);
            }
            output.printf("%6d%n%n", totalScore);
        }

        endTime = System.currentTimeMillis();
        System.out.printf("The Total number of milliseconds using ArrayList is %d%n",(endTime - startTime));

        output.close();
        keyboard.close();

    }

}
