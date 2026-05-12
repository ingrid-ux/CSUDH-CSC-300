import java.io.IOException;
import java.util.Scanner;

public class ModelAdvisingCenter{
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Please enter the name of department name at the Advising Center at CSUDH:%n");
        String departmentName = keyboard.nextLine();

        System.out.printf("Please enter a seed value as an int:%n");
        int seed = keyboard.nextInt();

        System.out.printf("Please enter the number of advisors as an int:%n");
        int numAdvisors = keyboard.nextInt();

        AdvisingCenter advisingCenter = new AdvisingCenter(departmentName, seed, numAdvisors);
        advisingCenter.openAdvisingCenter();

        System.out.printf("Please enter the number of minutes to keep the Advising Center open:%n");
        int numMinutes = keyboard.nextInt();

        advisingCenter.operateAdvisingCenter(numMinutes);

        System.out.printf("Please enter the name of the output file for Advising Center results: ");
        keyboard.nextLine();
        String outputFileName = keyboard.nextLine();

        advisingCenter.generateAdvisingCenterResults(outputFileName);

        keyboard.close();

    }
}
