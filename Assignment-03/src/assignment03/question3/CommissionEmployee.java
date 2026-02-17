package assignment03.question3;

public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private double grossSales;
    private double commissionPercent; // As a percentage

    CommissionEmployee(String firstName, String lastName, double grossSales, double commissionPercent){
        this.firstName = firstName;
        this.lastName = lastName;
        setGrossSales(grossSales);
        setCommissionPercent(commissionPercent);

    }

    void setGrossSales(double grossSales){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }
    void setCommissionPercent(double commissionPercent){
        if(commissionPercent < 0.0 || commissionPercent > 100.0){
            throw new IllegalArgumentException( "Commission rate must be >= 0.0 and <= 100.0");
        }
        this.commissionPercent = commissionPercent;
    }

    double getGrossSales(){
        return this.grossSales;
    }
    double getCommissionPercent(){
        return this.commissionPercent;
    }
    String getFirstName(){
        return this.firstName;
    }
    String getLastName(){
        return this.lastName;
    }

    double earnings(){
        return getGrossSales() * (getCommissionPercent() / 100.0);
    }

    @Override
    public String toString(){
        return String.format(
                "Commission Employee: %s %s  Gross Sales: $%,.2f  Commission: %.2f%%  Earnings: $%,.2f",
                getFirstName(),
                getLastName(),
                getGrossSales(),
                getCommissionPercent(),
                earnings()
        );
    }
}

    /*
        * CommissionEmployee (40)
        * Has the following instance variables:
        * private final String firstName;
        * private final String lastName;
        * private double grossSales;
        * private double commissionPercent; // As a percentage
        * Has a constructor which accepts values for the 4 instance variables in the order shown above.
        * Sets the first and last names within the constructor
        * Calls mutators for grossSales and commissionPercent. (5 extra points if you throw the exceptions
        * in the two mutators)
        * 9
        * The setGrossSales mutator will throw an IllegalArgumentException("Gross sales must be >=
        * 0.0") if the grossSales are less than 0.0
        * The setCommissionPercent mutator will throw IllegalArgumentException( "Commission rate
        * must be >= 0.0 and <= 100.0") if the commission rate as a percentage is less than 0.0 or greater
        * than 100.0
        * Has accessor methods for all four instance variables
        * Has an earnings() method that calculates the earnings as the product of grossSales and the rate
        * (commissionPercent/100.0).
        * A toString() method which returns a String with a description of the CommissionEmployee
        * based on the instance variables.
     */
