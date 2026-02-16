package assignment03.question3;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;
    BasePlusCommissionEmployee(String firstName, String lastName, double grossSales, double commissionPercent,double baseSalary) {
        super(firstName, lastName, grossSales, commissionPercent);
        setBaseSalary(baseSalary);
    }

    void setBaseSalary(double baseSalary) {
        if(baseSalary < 0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
    }

    double getBaseSalary(){
        return this.baseSalary;
    }

    @Override
    double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString(){
        return String.format("%s", earnings());
    }

    /*
       * BasePlusCommissionEmployee (25)
       * This class extends CommissionEmployee
       * Has an additional instance variable:
       * private double baseSalary
       * Has a constructor which accepts the values for the 4 instance variables of CommissionEmployee
       * and an additional parameter with a value for baseSalary.
       * The constructor calls super with appropriate values and then calls setBaseSalary.
       * The setBaseSalary mutator will throw new IllegalArgumentException("Base salary must be >=
       * 0.0") if the baseSalary is negative.
       * Has an earnings() method that overrides earning and calculates the earnings with as the sum of
       * the baseSalary and super.earnings()
       * An overridden to String() method that returns a String that includes the baseEarnings.
     */




}
