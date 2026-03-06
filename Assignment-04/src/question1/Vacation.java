package question1;

public abstract class Vacation {

    private String destination;
    private double budget;

    // ** ASTRACT METHODS **

    abstract double overBudget();

    Vacation(String destination, double budget){
        setDestination(destination);
        setBudget(budget);

    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        if(budget < 0){
            throw new IllegalArgumentException("Budget must be >= 0.0");
        }
        this.budget = budget;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    // SHORTCUT SELECT MORE THAN ONE LINE AND MOVE CURSOR TO
    // DOWN AND THEN ADD ANY NEW CHARACTER AT THE SAME TIME
    // ALT + MOUSE DOWN

    /*
        * The toString method returns a String with the Destination and Budget and moves to the next line
        * i.e.:
        * Destination: Orlando; Budget: $1000.00
     */

    @Override
    public String toString(){
        return String.format("Destination: %s; Budget: $%.2f", destination, budget);
    }

    /*
         * The equals(Object obj) is overridden with a value of true if the destinations are the same (ignore
         * the case) and the budgets are within 0.0001.
         * It has an abstract method overbudget returning a double.
     */

    @Override
    public boolean equals(Object obj) {
        if (obj == this){ return true; } // checking if same reference
        if (obj == null){ return false; }
        if (!(obj instanceof Vacation)){ return false; } // checking if same class Planet

        Vacation other = (Vacation) obj; // casting to planet
        return this.destination.equalsIgnoreCase(other.destination) && (this.budget - other.budget) <= 0.0001;
    }


}
