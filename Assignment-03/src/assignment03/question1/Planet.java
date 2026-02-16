package assignment03.question1;

import java.util.Random;

public class Planet {
    // - Has a static Random variable called randyPlanet with a seed of 11
    // - Has two instance variables:
    // - String planetName – the name of the Planet
    // - int planetTons – the weight of the planet in tons

    static Random randyPlanet = new Random(11);
    String planetName;
    int planetTons;

    // - A constructor with the Planet’s name as an input variable which:


    // ** Default Constructor **
    // - Default constructor sets the planetName to “unknown” by calling the mutator method for the variable

    Planet() {
        this.planetName = "unknown";
    }

    // ** Constructor **
    // - A constructor with the Planet’s name as an input variable which:
    //    - Calls a mutator to set the Planet’s name
    //    - Calls a mutator to set the Planet’s weight in tons with a randomly generated weight of between
    //    - ten million and eighty million tons, inclusively using randyPlanet.

    Planet(String planetName){
        setPlanetName(planetName);
        setPlanetTons();
    }

    /*
    // Methods:
    Mutators and accessors for the planetName and planetTons
    A toString method that returns the String as follows (name and tons will change):
    The planet named Nemesis weighs 72,018,542 tons
    An equals method that compares two Planets based on both name and weight in tons.
     */

    // ** Mutators **
    // - setPlanetName
    // - setPlanetTons


    void setPlanetName(String planetName){
        this.planetName = planetName;
    }

    void setPlanetTons(){
        this.planetTons = randyPlanet.nextInt(10_000_000, 80_000_000);

    }

    // ** Accessors **
    // - getPlanetName
    // - getPlanetTons

    String getPlanetName(){
        return this.planetName;
    }

    int getPlanetTons(){
        return this.planetTons;
    }


    public String toString(){
        return String.format("The planet named %s weighs %d tons", planetName, planetTons);
    }

    boolean comparePlanets(Planet one, Planet two){
        if(one == two){
            return true;
        }
        else{
            return false;
        }
    }


}
