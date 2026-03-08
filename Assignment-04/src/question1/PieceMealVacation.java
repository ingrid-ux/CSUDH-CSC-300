package question1;
import java.util.*;

public class PieceMealVacation extends Vacation {
    PieceMealVacation(String destination, double budget, String[] items, double[] costs) {
        super(destination, budget);
        setItems(items);
        setCosts(costs);
    }

    private String[] items; // The list of items on the vacation
    private double[] costs; // the corresponding price of each item

    @Override
    double overBudget() {
        double sumTotalItems = 0;
        for (double cost : this.costs) {
            sumTotalItems += cost;
        }
        return sumTotalItems - super.getBudget();
    }
    /*
        *The setItems method accepts an array of items and uses it to create an object array items with the
        *same length, and then sets the items one by one.
     */
    public void setItems(String[] items) {
        if (items != null){
            this.items = new String[items.length];
            for(int i = 0; i < items.length; i++){
                this.items[i] = items[i];
            }
            // other method : System.arraycopy(items, 0, this.items, 0, items.length);
        } else {
            this.items = new String[0];
        }
    }

    /*
     *The setCosts method accepts an array of costs (I call it newCosts) create an object array costs
     *with a length equal to the length of the array items. It then sets the costs one by one.
     */

    public void setCosts(double[] newCosts){
        if(this.items == null){
            this.costs = new double[0];
            return;
        }
        this.costs = new double[this.items.length];
        for (int i = 0; i < this.items.length; i++){
            if (newCosts != null && i < newCosts.length){
                this.costs[i] = newCosts[i];
            } else{
                this.costs[i] = 0.0;
            }
        }
    }


    /*
        * The toString method returns a String with the Destination and Budget (using super()) and the line
        * by line itemization i.e.:
        * Destination: Miami; Budget: $1500.00
        * hotel: $750.00
        * meals: $250.00
        * airfare: $400.00
        * windsurfing: $0.0
     */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\n");

        for(int i = 0; i < this.costs.length; i++){
            sb.append(String.format("%s: $%.2f%n",this.items[i], this.costs[i]));
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this){ return true; } // checking if same reference
        if (obj == null){ return false; }
        if (!(obj instanceof PieceMealVacation)){ return false; } // checking if same class Planet
        if (!super.equals(obj)){ return false;};

        PieceMealVacation other = (PieceMealVacation) obj;

        if (this.items.length != other.items.length) return false;


        for(int i = 0; i < items.length; i++){
            if(!(Objects.equals(this.items[i], other.items[i]))) {
                return false;
            }
            if (Math.abs(this.costs[i] - other.costs[i]) >= 0.0001) {
                return false;
            }
        }
        return true;
    }

    }

