package assignment03.question1;

import java.util.ArrayList;

public class SolarSystem {
    // Has the following three instance variables:
    // String solSystemName
    // Sun sol
    // An ArrayList containing references to Planet objects named planetList

    String solSystemName;
    Sun sol;
    ArrayList<Planet> planetList = new ArrayList<Planet>();

    SolarSystem(){
        setSolarSystemName();
        sol = new Sun();
    }

    SolarSystem(String solSystemName, String sunName){
        setSolarSystemName();
    }


    void setSolarSystemName(){
        this.solSystemName = "unknown";
    }
}
