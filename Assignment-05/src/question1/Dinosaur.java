package question1;


public class Dinosaur implements Comparable<Dinosaur> {
    // ** Instance variables **
    private static int dinoCounter = 1;
    private String dinoName;
    private int dinoWeight;

    // ** Constructors ** //
    public Dinosaur(){
        setDinoName("Barney");
    }

    public Dinosaur(int dinoWeight){
        setDinoWeight(dinoWeight);
        setDinoName("DINO" + dinoCounter);
        dinoCounter++;
    }

    // ** Accessor & Mutator for dinoWeight ** //
    public void setDinoWeight(int dinoWeight) {
        this.dinoWeight = dinoWeight;
    }

    public int getDinoWeight() {
        return dinoWeight;
    }
    // ** Accessor & Mutator for dinoName ** //
    public void setDinoName(String dinoName) {
        this.dinoName = dinoName;
    }

    public String getDinoName() {
        return dinoName;
    }

    @Override
    public String toString() {
        return String.format("%-10s %,10d", dinoName, dinoWeight);
    }

    @Override
    public int compareTo(Dinosaur o) {
        return this.dinoWeight - o.dinoWeight;

    }
}
