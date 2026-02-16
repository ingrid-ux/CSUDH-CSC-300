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
        int planetTons = randyPlanet.nextInt(10_000_000, 80_000_000);
        setPlanetTons(planetTons);
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

    void setPlanetTons(int planetTons){
        this.planetTons = planetTons;
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

    @Override
    public String toString(){
        return String.format("The planet named %s weighs %d tons\n", planetName, planetTons);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){ return true; } // checking if same reference
        if (obj == null){ return false; }
        if (!(obj instanceof Planet)){ return false; } // checking if same class Planet

        Planet other = (Planet) obj; // casting to planet
        return this.planetName.equals(other.planetName) && this.planetTons == other.planetTons;
    }

    boolean comparePlanets(Planet planet1, Planet planet2){
        if(planet1.equals(planet2)){
            return true;
        }
        else{
            return false;
        }
    }


}
