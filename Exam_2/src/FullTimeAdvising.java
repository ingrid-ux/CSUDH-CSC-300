public class FullTimeAdvising extends AdvisingType {
    public static int fullTimeCounter = 0;
    private String advisingNumber;

    FullTimeAdvising(){
        super("Full Time");
        setAdvisingNumber();
    }


    @Override
    void setAdvisingNumber() {
        fullTimeCounter++;
        this.advisingNumber = "FullTime " + fullTimeCounter;
    }

    @Override
    String getAdvisingNumber() {
        return this.advisingNumber;
    }
}

/*
* * class FullTimeAdvising is a subclass of AdvisingType
* * Has a static int variable fullTimeCounter initialized to 0.
* * Has an instance variable String advisingNumber
* *
* * Has a single constructor with no parameters which
* * Calls super with the parameter value “FullTime ”
* * Calls setAdvisingNumber with no parameters
* *
* * Overrides the method setAdvisingNumber:
* * Increments fullTimeCounter by 1
* * Sets the advisingNumber equal to the concatenation of “FullTime ” and fullTimeCounter
* *
* * Overrides the method getAdvisingNumber
* * 	returns the reference to the String referred to by advisingNumber
 */
