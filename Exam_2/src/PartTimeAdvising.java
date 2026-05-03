public class PartTimeAdvising extends AdvisingType {

    public static int partTimeCounter = 0;
    private String advisingNumber;

    PartTimeAdvising() {
        super("PartTime");
        setAdvisingNumber();
    }


    @Override
    void setAdvisingNumber() {
        partTimeCounter++;
        this.advisingNumber = "PartTime " + "partTimeCounter";
    }

    @Override
    String getAdvisingNumber() {
        return this.advisingNumber;
    }
}
/*
* *
* * class PartTimeAdvising is a subclass of AdvisingType
* * Has a static int variable partTimeCounter initialized to 0.
* * Has an instance variable String advisingNumber
* *
* * Has a single constructor with no parameters which
* * Calls super with the parameter value “PartTime ”
* * Calls setAdvisingNumber with no parameters
* *
* * Overrides the method setAdvisingNumber:
* * Increments partTimeCounter by 1
* * Sets the advisingNumber equal to the concatenation of “PartTime ” and partTimeCounter
* *
* *
 */
