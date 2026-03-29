package question2;

public class Contractor {
    private String name = ""; // The Contractor Name. Note: A single word
    private String location = ""; // City Location
    private int ownerID; // The Owner Id

    public Contractor(){} // does nothing

    public Contractor(String name, String location, int ownerID){
        // calls three mutators
        setName(name);
        setLocation(location);
        setOwnerID(ownerID);
    }

    // ** Accessor & Mutators **
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getOwnerID() {
        return ownerID;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10d", name, location, ownerID);

    }
}
