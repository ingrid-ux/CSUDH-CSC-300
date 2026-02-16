package assignment03.question1;

import java.io.IOException;
import java.util.Scanner;

public class CreateSolarSystem {
    /*
    * Has a main method only.
    * Creates a Scanner to read from the keyboard
    * Reads in the name of the SolarSystem and the name of the Sun
    * Create a new SolarSystem with the SolarSystem name and Sun name.
    * Print out the SolarSystem
    * *
    * If there is more than one planet
    * Compare each planet (except the first planet) to the first planet in the queue.
    * *
        * If any planet equals the first planet print it out otherwise print:
        * There is no planet that matches the first planet
        * Then set the name and tonnage of the last planet to the first planet
        * Then see if the two planets are equal and print as follows:
        * The planet named Mercury weighs 75,504,385 tons equals the first planet in the ArrayList
    * else
    * Print There are no planets to compare
     */
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter the name of the Solar System:  ");
        String solSystemName = keyboard.nextLine();
        System.out.printf("Please enter the name of the Sun:  ");
        String sunName = keyboard.nextLine();
        SolarSystem ss1 = new SolarSystem(solSystemName, sunName);
        System.out.printf(ss1.toString());
        boolean flag = false;
        if(ss1.getNumPlanets() > 1) {
            Planet firstPlanet = ss1.getPlanet(0);
            Planet lastPlanet = ss1.getPlanet(ss1.getNumPlanets() - 1);
            for(int i = 1; i < ss1.getNumPlanets(); i++){
            //for (Planet p : ss1.planetList) {
                if (ss1.getPlanet(i).equals(firstPlanet)) {
                    flag = true;
                    System.out.printf(ss1.getPlanet(i).toString());
                }
            }

            if (!flag) {
                System.out.printf("\nThere is no planet that matches the first planet\n");
            }


            lastPlanet.setPlanetName(firstPlanet.getPlanetName());
            lastPlanet.setPlanetTons(firstPlanet.getPlanetTons());

            if (lastPlanet.equals(firstPlanet)) {
                System.out.printf("%s\n and equals the first planet in the ArrayList", lastPlanet.toString());
            }

        }
        else{
            System.out.printf("There are no planets to compare");
        }

    }

}
