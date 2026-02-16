package assignment03.question1;

import java.util.Random;

public class Sun {
    // Has three instance variables
    String sunName; // name of the sunName
    int sunAge; // Age of the sunAge
    long seed = 6; // A random variable called randy with a seed of 6
    Random randy = new Random(seed);


    // ** Default Constructor **
    //   - sets the sunName to “unknown” by calling the mutator method for the variable
    Sun() {
        sunName = "unknown";
    }

    // ** Constructor **
    //   -  A constructor with the Sun’s name as an input variable which:
    //   -  Calls a mutator to set the Sun’s name
    //   -  Calls a mutator to set the Sun’s age with a randomly generated age of between one billion and
    //   -  two billion years, inclusively using randy
    Sun(String sunName) {
        setSunName(sunName);
        setSunAge();
    }


    // ** Methods **
    //    - Mutators and accessors for the sunName and sunAge

    // Mutators
    // - setSunName
    // - setSunAge
    void setSunName(String sunName) {
        this.sunName = sunName;
    }

    void setSunAge() {

        this.sunAge = randy.nextInt(1_000_000_000, 2_000_000_000);
    }

    // Accessors
    // - getSunName
    // - getSunAge
    String getSunName(){
        return this.sunName;
    }

    int getSunAge(){
        return this.sunAge;
    }

    @Override
    public String toString(){
        return String.format("The sun named %s is %d years old\n", sunName, sunAge);
    }

}
