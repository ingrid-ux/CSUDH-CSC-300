package question2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class OperateAirline {
    public static void main(String[] args) throws IOException{
        ArrayList<Flight> flightList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.printf("Please enter the Flight Name:%n");
            String name = keyboard.nextLine();

            System.out.printf("Please enter an integer seed from 1 to 50:%n");
            int seed = Integer.parseInt(keyboard.nextLine());

            flightList.add(new Flight(name,seed));
        }
        System.out.printf("Please enter the name of the output file:%n");
        String fileName = keyboard.nextLine();

        PrintWriter output = new PrintWriter(fileName);
        for(Flight f:flightList){
            f.sellSeats();
            f.lineUpCall();
            f.boarding(output);
            output.printf("%n");
            output.printf("%n");
        }

        output.close();
        keyboard.close();










    }
}
