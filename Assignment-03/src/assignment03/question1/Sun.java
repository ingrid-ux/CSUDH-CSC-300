package assignment03.question1;

import java.util.Random;

public class Sun {
    // Has three instance variables
    private String sunName; // name of the sunName
    private int sunAge; // Age of the sunAge
    private Random randy = new Random(6);// A random variable called randy with a seed of 6


    // ** Default Constructor **
    //   - sets the sunName to “unknown” by calling the mutator method for the variable
    Sun() {
        setSunName("unknown");
        setSunAge(randy.nextInt(1_000_000_000, 2_000_000_000));
    }

    // ** Constructor **
    //   -  A constructor with the Sun’s name as an input variable which:
    //   -  Calls a mutator to set the Sun’s name
    //   -  Calls a mutator to set the Sun’s age with a randomly generated age of between one billion and
    //   -  two billion years, inclusively using randy
    Sun(String sunName) {
        setSunName(sunName);
        setSunAge(randy.nextInt(1_000_000_000, 2_000_000_000));
    }


    // ** Methods **
    //    - Mutators and accessors for the sunName and sunAge

    // Mutators
    // - setSunName
    // - setSunAge
    public void setSunName(String sunName) {
        this.sunName = sunName;
    }

    public void setSunAge(int sunAge) {
        this.sunAge = sunAge;
    }

    // Accessors
    // - getSunName
    // - getSunAge
    public String getSunName(){
        return this.sunName;
    }

    public int getSunAge(){
        return this.sunAge;
    }

    @Override
    public String toString(){
        return String.format("The sun named %s is %d years old\n", sunName, sunAge);
    }

}
