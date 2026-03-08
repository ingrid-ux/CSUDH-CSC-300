package question2;

import java.io.IOException;
import java.util.Scanner;

public class ModelSupermarket {
  public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of the Supermarket: ");
        String superName = input.nextLine();

        Supermarket market = new Supermarket(superName);

        System.out.printf("Please enter the name of the output file for Supermarket results: ");
        String outputFileName = input.next();

        System.out.printf("Please enter the number of minutes to operate the Supermarket: ");
        int minutes = input.nextInt();


        market.openSupermarket();
        market.operateSupermarket(minutes);
        market.generateSupermarketResults(outputFileName);

        input.close();

  }

}

