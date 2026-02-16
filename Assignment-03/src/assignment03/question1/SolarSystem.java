package assignment03.question1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SolarSystem {

    /*
     * Has the following three instance variables:
     *   String solSystemName
     *   Sun sol
     *   An ArrayList containing references to Planet objects named planetList
    */

    String solSystemName;
    Sun sol;
    ArrayList<Planet> planetList = new ArrayList<Planet>();

    /*
     ** Default Constructor
     * Set the SolarSystem name to "unknown" by calling the mutator method for the variable
     * Calls the default Sun construct to create sol
     */

    SolarSystem(){
        setSolarSystemName("unknown");
        sol = new Sun();
    }

    /*
     ** Constructor
     * A constructor with two parameters for the SolarSystem name and it’s Sun’s name which:
     * Calls a mutator to set the SolarSystem’s name
     * Creates a Sun referred to by sol by calling a Sun constructor with the Sun’s name.
     * x Calls createPlanets (see below) to create the planets
     */

    SolarSystem(String solSystemName, String sunName) throws IOException  {
        setSolarSystemName(solSystemName);
        sol = new Sun(sunName);
        createPlanets();
    }



    /*
     ** Methods:
     * A mutator and accessor for the SolarSystem name.
     * A toString method that returns a String with output to produce the output (except for the equals
     * statements) as shown in Sample output. (Includes the Solar System name, Sun’s name and age,
     * and the name and weight for each planet.
    */

    // ** Mutator
    void setSolarSystemName(String solSystemName){
        this.solSystemName = solSystemName;
    }

    // ** Accessor
    String getSolSystemName(){ return solSystemName; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The name of this solar system is %s\n" + sol.toString(),getSolSystemName()));
        for(Planet planet:planetList){
            sb.append(planet.toString());
        }
        return sb.toString();
        //return String.format("The name of this solar system is %s\n" + sol.toString(),getSolSystemName());
    }

    /*
    * The createPlanets method with no parameters and a void return value which:
        * Creates a Scanner to read data from the keyboard.
        * Reads in a file name with the names of the planets. (you can use the planets.txt file in the Lesson
        * 3 Homework file on Canvas)
        * Creates a Scanner for the planet name’s file.
        * For each planet name in the file create a Planet and add it to the planetList.
    */
    void createPlanets() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter the name of the file to read in data from: ");
        String inputFileName = keyboard.next();
        File inputFile = new File(inputFileName);

        if(!inputFile.exists()){

            System.out.printf("Error: %s not found.\n", inputFileName);
            System.exit(0); // This will cause you to exit the program if there is no input file to read from

        }

        // **** Using an iterator
        Scanner inputReader = new Scanner(inputFile);

        // Create an iterator for the Planet list
        Iterator<Planet> iterOnPlanets = planetList.iterator();

        while (inputReader.hasNext() ) { //doesn't move the pointer
            Planet p = new Planet(inputReader.next());
            planetList.add(p);
        } inputReader.close();
    }

    /*
    * The getNumPlanets method with no parameters which return the size of the planetList.
    */

    int getNumPlanets(){ return planetList.size(); }

    /*
    * The getPlanet method which accepts an int index as a parameter and returns null or a reference to a Planet as follows:
        * If the index is out of range for the planetList print:
        * Planet doesn't exist
        * Return null
        * Otherwise return reference to the planet at the index.
    */

    Planet getPlanet(int index){
        if (index < 0 || index > getNumPlanets()){
            System.out.printf("Planet doesn't exist");
            return null;
        }
        return planetList.get(index);
    }


}
